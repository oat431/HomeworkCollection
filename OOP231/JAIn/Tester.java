public class Tester extends Employee {
    public Tester(String name){
        super(name);
        this.salary = "22000";
    }

    @Override
    public void displayJobDescription(){
        System.out.println("My job is to verify the software to increase level of quality.");
    }

    public void test(){
        System.out.println("I am testing the software");
    }
}