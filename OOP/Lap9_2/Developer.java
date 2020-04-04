package app;
public class Developer extends Employee {
    public Developer(String name){
        super(name);
        super.salary = "22500";
    }


    @Override
    public void displayJobDescription(){
        System.out.println("My job is to develop, maintain and provide enhancement for our software");
    }

    public void code(){
        System.out.println("I am producing code");
    }
}