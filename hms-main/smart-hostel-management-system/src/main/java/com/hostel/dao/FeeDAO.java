package com.hostel.dao;

import com.hostel.model.Fee;
import com.hostel.util.DBConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class FeeDAO {

    public void payFee(Fee fee) {

        try {

            Connection conn = DBConnection.getConnection();

            String sql = "INSERT INTO fees(student_id, amount, status) VALUES(?,?,?)";

            PreparedStatement ps = conn.prepareStatement(sql);

            ps.setInt(1, fee.getStudentId());
            ps.setDouble(2, fee.getAmount());
            ps.setString(3, fee.getStatus());

            ps.executeUpdate();

            System.out.println("Fee Payment Recorded");

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public void viewFees() {

        try {

            Connection conn = DBConnection.getConnection();

            String sql = "SELECT * FROM fees";

            PreparedStatement ps = conn.prepareStatement(sql);

            ResultSet rs = ps.executeQuery();

            while(rs.next()) {

                System.out.println("Fee ID: " + rs.getInt("id"));
                System.out.println("Student ID: " + rs.getInt("student_id"));
                System.out.println("Amount: " + rs.getDouble("amount"));
                System.out.println("Status: " + rs.getString("status"));
                System.out.println("-----------------------------");

            }

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public void updateFeeStatus(int feeId, String status) {

        try {

            Connection conn = DBConnection.getConnection();

            String sql = "UPDATE fees SET status=? WHERE id=?";

            PreparedStatement ps = conn.prepareStatement(sql);

            ps.setString(1, status);
            ps.setInt(2, feeId);

            ps.executeUpdate();

            System.out.println("Fee Status Updated");

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}