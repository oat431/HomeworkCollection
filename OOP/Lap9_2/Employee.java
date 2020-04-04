package app;
public class Employee{
    protected String name;
    protected String salary;
    protected String jobdes;

    public Employee(String name){
        this.name = name;
    }

    public void displayGeneralInformation(){
        System.out.println("Name : " + this.name);
        System.out.println("Salary : " + this.salary);
    }

    public void displayJobDescription(){
        System.out.println("Job description");
    }

}