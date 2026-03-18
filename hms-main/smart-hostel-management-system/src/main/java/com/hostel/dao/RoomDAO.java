package com.hostel.dao;

import com.hostel.model.Room;
import com.hostel.util.DBConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class RoomDAO {

    public void addRoom(Room room) {

        try {

            Connection conn = DBConnection.getConnection();

            String sql = "INSERT INTO rooms(room_number, capacity, occupied) VALUES(?,?,?)";

            PreparedStatement ps = conn.prepareStatement(sql);

            ps.setInt(1, room.getRoomNumber());
            ps.setInt(2, room.getCapacity());
            ps.setInt(3, room.getOccupied());

            ps.executeUpdate();

            System.out.println("Room Added Successfully");

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public void viewRooms() {

        try {

            Connection conn = DBConnection.getConnection();

            String sql = "SELECT * FROM rooms";

            PreparedStatement ps = conn.prepareStatement(sql);

            ResultSet rs = ps.executeQuery();

            while(rs.next()) {

                System.out.println("Room Number: " + rs.getInt("room_number"));
                System.out.println("Capacity: " + rs.getInt("capacity"));
                System.out.println("Occupied: " + rs.getInt("occupied"));
                System.out.println("-----------------------------");

            }

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public void allocateRoom(int roomNumber) {

        try {

            Connection conn = DBConnection.getConnection();

            String sql = "UPDATE rooms SET occupied = occupied + 1 WHERE room_number=?";

            PreparedStatement ps = conn.prepareStatement(sql);

            ps.setInt(1, roomNumber);

            int rows = ps.executeUpdate();

            if(rows > 0)
                System.out.println("Room Allocated");

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}