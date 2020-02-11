package com.company;



import java.util.Set;
import java.util.TreeSet;

public class Student{
    private Set<String> subject = new TreeSet<>();
    private String summary = "";
    public String Id;
    public String Name;
    public String Lastname;
    public String Register;

    public void AddSubject(String subject){
        this.subject.add(subject);
    }

    private void sort(){
        for(String i : this.subject){
            this.summary += " - " + i + "\n";
        }
        this.summary += "Total " + this.subject.size() + " Courses";
    }

    public String ShowStudentRegistration(){
        sort();
        return "Student" + this.Name + " " + this.Lastname
                + " Resgistration information\n"
                + "Student id: " + this.Id + " Name : "
                + this.Name + " " + this.Lastname + "\n"
                + "Registration for Semester " + this.Register + "\n"
                + this.summary;

    }

}