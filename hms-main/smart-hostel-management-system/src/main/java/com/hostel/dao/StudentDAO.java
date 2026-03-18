package com.hostel.dao;

import com.hostel.model.Student;
import com.hostel.util.DBConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class StudentDAO {

    public void addStudent(Student student) {

        try {

            Connection conn = DBConnection.getConnection();

            String sql = "INSERT INTO students(name,department,room_number) VALUES(?,?,?)";

            PreparedStatement ps = conn.prepareStatement(sql);

            ps.setString(1, student.getName());
            ps.setString(2, student.getDepartment());
            ps.setInt(3, student.getRoomNumber());

            ps.executeUpdate();

            System.out.println("Student Added Successfully");

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}