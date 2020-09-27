package com.company;

public class Student {
    private String studentID;
    private String studentName;
    private String title;
    private String studentLastname;

    public Student(String studentID,String title,String studentName, String studentLastname) {
        this.studentID = studentID;
        this.studentName = studentName;
        this.title = title;
        this.studentLastname = studentLastname;
    }

    @Override
    public String toString() {
        return "Student{" +
                "ID='" + studentID + '\'' +
                ", title='" + title + '\'' +
                ", Name='" + studentName + '\'' +
                ", Lastname='" + studentLastname + '\'' +
                '}';
    }
}
