package com.hostel.dao;

import com.hostel.model.Complaint;
import com.hostel.util.DBConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class ComplaintDAO {

    public void addComplaint(Complaint complaint) {

        try {

            Connection conn = DBConnection.getConnection();

            String sql = "INSERT INTO complaints(student_id, description, status) VALUES(?,?,?)";

            PreparedStatement ps = conn.prepareStatement(sql);

            ps.setInt(1, complaint.getStudentId());
            ps.setString(2, complaint.getDescription());
            ps.setString(3, complaint.getStatus());

            ps.executeUpdate();

            System.out.println("Complaint Registered Successfully");

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public void viewComplaints() {

        try {

            Connection conn = DBConnection.getConnection();

            String sql = "SELECT * FROM complaints";

            PreparedStatement ps = conn.prepareStatement(sql);

            ResultSet rs = ps.executeQuery();

            while(rs.next()) {

                System.out.println("Complaint ID: " + rs.getInt("id"));
                System.out.println("Student ID: " + rs.getInt("student_id"));
                System.out.println("Description: " + rs.getString("description"));
                System.out.println("Status: " + rs.getString("status"));
                System.out.println("-----------------------------");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public void updateComplaintStatus(int complaintId, String status) {

        try {

            Connection conn = DBConnection.getConnection();

            String sql = "UPDATE complaints SET status=? WHERE id=?";

            PreparedStatement ps = conn.prepareStatement(sql);

            ps.setString(1, status);
            ps.setInt(2, complaintId);

            int rows = ps.executeUpdate();

            if(rows > 0)
                System.out.println("Complaint Status Updated");

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}