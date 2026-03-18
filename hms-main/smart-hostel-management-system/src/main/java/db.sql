CREATE DATABASE hostel_db;
USE hostel_db;

CREATE TABLE students(
    id INT PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(100),
    department VARCHAR(100),
    room_number INT
);

CREATE TABLE rooms(
    room_number INT PRIMARY KEY,
    capacity INT,
    occupied INT
);

CREATE TABLE complaints(
    id INT PRIMARY KEY AUTO_INCREMENT,
    student_id INT,
    description TEXT,
    status VARCHAR(50)
);

CREATE TABLE visitors(
    id INT PRIMARY KEY AUTO_INCREMENT,
    student_id INT,
    visitor_name VARCHAR(100),
    visit_date DATE
);

CREATE TABLE fees(
    id INT PRIMARY KEY AUTO_INCREMENT,
    student_id INT,
    amount DOUBLE,
    status VARCHAR(20)
);