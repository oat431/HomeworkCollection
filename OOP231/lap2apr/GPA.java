package com.company;

public interface GPA {
    void AddCourseGrade(String courseid, String grade);
    double GetSemesterCredits();
    double GetSemesterGPA();
    double GetTotalGval();
}
