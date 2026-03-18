package com.hostel.service;

import com.hostel.dao.ComplaintDAO;
import com.hostel.dao.FeeDAO;
import com.hostel.dao.RoomDAO;
import com.hostel.dao.StudentDAO;
import com.hostel.dao.VisitorDAO;

import com.hostel.model.Complaint;
import com.hostel.model.Fee;
import com.hostel.model.Room;
import com.hostel.model.Student;
import com.hostel.model.Visitor;

import java.util.Date;

public class HostelService {

    private StudentDAO studentDAO = new StudentDAO();
    private RoomDAO roomDAO = new RoomDAO();
    private ComplaintDAO complaintDAO = new ComplaintDAO();
    private VisitorDAO visitorDAO = new VisitorDAO();
    private FeeDAO feeDAO = new FeeDAO();

    /*
     ================================
            STUDENT OPERATIONS
     ================================
     */

    public void registerStudent(String name, String department, int roomNumber) {

        Student student = new Student(name, department, roomNumber);

        studentDAO.addStudent(student);

        roomDAO.allocateRoom(roomNumber);
    }

    /*
     ================================
            ROOM OPERATIONS
     ================================
     */

    public void addRoom(int roomNumber, int capacity) {

        Room room = new Room(roomNumber, capacity, 0);

        roomDAO.addRoom(room);
    }

    public void viewRooms() {

        roomDAO.viewRooms();
    }

    /*
     ================================
            COMPLAINT OPERATIONS
     ================================
     */

    public void registerComplaint(int studentId, String description) {

        Complaint complaint = new Complaint(studentId, description, "Pending");

        complaintDAO.addComplaint(complaint);
    }

    public void viewComplaints() {

        complaintDAO.viewComplaints();
    }

    public void resolveComplaint(int complaintId) {

        complaintDAO.updateComplaintStatus(complaintId, "Resolved");
    }

    /*
     ================================
            VISITOR OPERATIONS
     ================================
     */

    public void addVisitorEntry(int studentId, String visitorName) {

        Visitor visitor = new Visitor(studentId, visitorName, new Date());

        visitorDAO.addVisitor(visitor);
    }

    public void viewVisitorEntries() {

        visitorDAO.viewVisitors();
    }

    /*
     ================================
            FEE OPERATIONS
     ================================
     */

    public void payFee(int studentId, double amount) {

        Fee fee = new Fee(studentId, amount, "PAID");

        feeDAO.payFee(fee);
    }

    public void viewFees() {

        feeDAO.viewFees();
    }

    public void updateFeeStatus(int feeId, String status) {

        feeDAO.updateFeeStatus(feeId, status);
    }

}