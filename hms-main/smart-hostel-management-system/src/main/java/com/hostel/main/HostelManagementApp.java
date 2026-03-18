package com.hostel.main;

import com.hostel.service.HostelService;

import java.util.Scanner;

public class HostelManagementApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        HostelService service = new HostelService();

        while (true) {

            System.out.println("\n===== SMART HOSTEL MANAGEMENT SYSTEM =====");

            System.out.println("1. Add Room");
            System.out.println("2. View Rooms");
            System.out.println("3. Register Student");
            System.out.println("4. Register Complaint");
            System.out.println("5. View Complaints");
            System.out.println("6. Resolve Complaint");
            System.out.println("7. Add Visitor Entry");
            System.out.println("8. View Visitor Entries");
            System.out.println("9. Pay Hostel Fee");
            System.out.println("10. View Fee Records");
            System.out.println("11. Update Fee Status");
            System.out.println("12. Student Dashboard");
            System.out.println("13. Warden Dashboard");
            System.out.println("14. System Information");
            System.out.println("15. Exit");

            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            switch (choice) {

                case 1:

                    System.out.print("Enter Room Number: ");
                    int roomNo = sc.nextInt();

                    System.out.print("Enter Capacity: ");
                    int capacity = sc.nextInt();

                    service.addRoom(roomNo, capacity);

                    break;

                case 2:

                    service.viewRooms();

                    break;

                case 3:

                    sc.nextLine();

                    System.out.print("Enter Student Name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter Department: ");
                    String dept = sc.nextLine();

                    System.out.print("Enter Room Number: ");
                    int room = sc.nextInt();

                    service.registerStudent(name, dept, room);

                    break;

                case 4:

                    System.out.print("Enter Student ID: ");
                    int studentId = sc.nextInt();

                    sc.nextLine();

                    System.out.print("Enter Complaint Description: ");
                    String description = sc.nextLine();

                    service.registerComplaint(studentId, description);

                    break;

                case 5:

                    service.viewComplaints();

                    break;

                case 6:

                    System.out.print("Enter Complaint ID: ");
                    int complaintId = sc.nextInt();

                    service.resolveComplaint(complaintId);

                    break;

                case 7:

                    System.out.print("Enter Student ID: ");
                    int sId = sc.nextInt();

                    sc.nextLine();

                    System.out.print("Enter Visitor Name: ");
                    String visitorName = sc.nextLine();

                    service.addVisitorEntry(sId, visitorName);

                    break;

                case 8:

                    service.viewVisitorEntries();

                    break;

                case 9:

                    System.out.print("Enter Student ID: ");
                    int stuId = sc.nextInt();

                    System.out.print("Enter Amount: ");
                    double amount = sc.nextDouble();

                    service.payFee(stuId, amount);

                    break;

                case 10:

                    service.viewFees();

                    break;

                case 11:

                    System.out.print("Enter Fee ID: ");
                    int feeId = sc.nextInt();

                    sc.nextLine();

                    System.out.print("Enter Status (PAID / PENDING): ");
                    String status = sc.nextLine();

                    service.updateFeeStatus(feeId, status);

                    break;

                case 12:

                    System.out.println("\n===== STUDENT DASHBOARD =====");
                    System.out.println("• Register Complaint");
                    System.out.println("• Pay Hostel Fees");
                    System.out.println("• View Visitor Logs");

                    break;

                case 13:

                    System.out.println("\n===== WARDEN DASHBOARD =====");
                    System.out.println("• Allocate Rooms");
                    System.out.println("• View Complaints");
                    System.out.println("• Track Fees");
                    System.out.println("• Monitor Visitors");

                    break;

                case 14:

                    System.out.println("\nSmart Hostel Management System");
                    System.out.println("Technology Stack:");
                    System.out.println("Java + JDBC + MySQL + Maven");
                    System.out.println("Features:");
                    System.out.println("Room Allocation");
                    System.out.println("Complaint Management");
                    System.out.println("Visitor Tracking");
                    System.out.println("Hostel Fee Payment");

                    break;

                case 15:

                    System.out.println("Exiting System...");
                    System.exit(0);

                default:

                    System.out.println("Invalid Choice. Try Again.");

            }

        }

    }

}