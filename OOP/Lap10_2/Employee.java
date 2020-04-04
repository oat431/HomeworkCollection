package app;
public class Employee extends Person{
    
    private double annSalary;
    private int yearOfWork;
    private String nationalID;

    public Employee(String name, double d, int y, String id){
        this.setName(name);
        this.annSalary = d;
        this.yearOfWork = y;
        this.nationalID = id;
    }

    public Employee(String name, String id){
        this.setName(name);
        this.nationalID = id;
        this.yearOfWork = 0;
        this.annSalary = 0.0;

    }

    public Employee(String name){
        this.setName(name);
        this.annSalary = 0;
        this.nationalID = null;
        this.yearOfWork = 0;
    }

    public double getAnnSalary() {
        return annSalary;
    }
    
    public void setAnnSalary(double annSalary) {
        this.annSalary = annSalary;
    }
    
    public int getYearOfWork() {
        return yearOfWork;
    }
    
    public void setYearOfWork(int yearOfWork) {
        this.yearOfWork = yearOfWork;
    }
    
    public String getNationalID() {
        return nationalID;
    }
    
    public void setNationalID(String nationalID) {
        this.nationalID = nationalID;
    }
    
    @Override
    public void print(){
        System.out.println("Name: " + this.getName());
        System.out.println("Salary" + this.annSalary);
        System.out.println("Year of work " + this.yearOfWork);
        System.out.println("ID :" + this.nationalID);
    }

    @Override
    public boolean equals(Employee p) {
        return nationalID.equals(p.nationalID);
    }

}