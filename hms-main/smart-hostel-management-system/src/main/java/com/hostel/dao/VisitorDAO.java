package com.hostel.dao;

import com.hostel.model.Visitor;
import com.hostel.util.DBConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class VisitorDAO {

    public void addVisitor(Visitor visitor) {

        try {

            Connection conn = DBConnection.getConnection();

            String sql = "INSERT INTO visitors(student_id, visitor_name, visit_date) VALUES(?,?,?)";

            PreparedStatement ps = conn.prepareStatement(sql);

            ps.setInt(1, visitor.getStudentId());
            ps.setString(2, visitor.getVisitorName());
            ps.setDate(3, new java.sql.Date(visitor.getVisitDate().getTime()));

            ps.executeUpdate();

            System.out.println("Visitor Entry Recorded");

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public void viewVisitors() {

        try {

            Connection conn = DBConnection.getConnection();

            String sql = "SELECT * FROM visitors";

            PreparedStatement ps = conn.prepareStatement(sql);

            ResultSet rs = ps.executeQuery();

            while(rs.next()) {

                System.out.println("Visitor ID: " + rs.getInt("id"));
                System.out.println("Student ID: " + rs.getInt("student_id"));
                System.out.println("Visitor Name: " + rs.getString("visitor_name"));
                System.out.println("Visit Date: " + rs.getDate("visit_date"));
                System.out.println("-----------------------------");

            }

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}