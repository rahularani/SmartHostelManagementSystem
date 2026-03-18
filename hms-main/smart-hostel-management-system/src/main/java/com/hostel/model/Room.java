package com.hostel.model;

public class Room {

    private int roomNumber;
    private int capacity;
    private int occupied;

    public Room() {}

    public Room(int roomNumber, int capacity, int occupied) {
        this.roomNumber = roomNumber;
        this.capacity = capacity;
        this.occupied = occupied;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getOccupied() {
        return occupied;
    }
}