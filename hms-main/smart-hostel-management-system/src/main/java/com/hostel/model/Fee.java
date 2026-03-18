package com.hostel.model;

public class Fee {

    private int studentId;
    private double amount;
    private String status;

    public Fee() {}

    public Fee(int studentId, double amount, String status) {
        this.studentId = studentId;
        this.amount = amount;
        this.status = status;
    }

    public int getStudentId() {
        return studentId;
    }

    public double getAmount() {
        return amount;
    }

    public String getStatus() {
        return status;
    }
}