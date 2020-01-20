package app;

public class Student{
    private String Id;
    private String Name;
    private double Grade;

    public Student(){}

    public Student(String Id , String Name, double Grade){
        this.Id = Id;
        this.Name = Name;
        this.Grade = Grade;
    }
    
    public String getId(){
        return this.Id;
    }
    
    public String getName(){
        return this.Name;
    }

    public double getGrade(){
        return this.Grade;
    }
}