package com.company;

public class Course {
    private int order;
    private String courseID;
    private String courseTitle;
    private double credit;
    private String grade;

    public Course(){}

    public Course(int order, String courseID, String courseTitle, double credit, String grade) {
        this.order = order;
        this.courseID = courseID;
        this.courseTitle = courseTitle;
        this.credit = credit;
        this.grade = grade;
    }

    public int getOrder() {
        return order;
    }

    public String getCourseID() {
        return courseID;
    }

    public String getCourseTitle() {
        return courseTitle;
    }

    public double getCredit() {
        return credit;
    }

    public String getGrade() {
        return grade;
    }

    @Override
    public String toString() {
        return this.order + " : " + this.courseID + " : " + this.courseTitle + " : " + this.credit + " : " + this.grade;

    }
}
