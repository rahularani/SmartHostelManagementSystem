package com.hostel.model;

public class Complaint {

    private int studentId;
    private String description;
    private String status;

    public Complaint() {}

    public Complaint(int studentId, String description, String status) {
        this.studentId = studentId;
        this.description = description;
        this.status = status;
    }

    public int getStudentId() {
        return studentId;
    }

    public String getDescription() {
        return description;
    }

    public String getStatus() {
        return status;
    }
}