package com.hostel.model;

import java.util.Date;

public class Visitor {

    private int studentId;
    private String visitorName;
    private Date visitDate;

    public Visitor() {}

    public Visitor(int studentId, String visitorName, Date visitDate) {
        this.studentId = studentId;
        this.visitorName = visitorName;
        this.visitDate = visitDate;
    }

    public int getStudentId() {
        return studentId;
    }

    public String getVisitorName() {
        return visitorName;
    }

    public Date getVisitDate() {
        return visitDate;
    }
}