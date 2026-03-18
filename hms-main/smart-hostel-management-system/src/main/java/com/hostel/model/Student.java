package com.hostel.model;

public class Student {

    private int id;
    private String name;
    private String department;
    private int roomNumber;

    public Student() {}

    public Student(String name, String department, int roomNumber) {
        this.name = name;
        this.department = department;
        this.roomNumber = roomNumber;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    public int getRoomNumber() {
        return roomNumber;
    }
}