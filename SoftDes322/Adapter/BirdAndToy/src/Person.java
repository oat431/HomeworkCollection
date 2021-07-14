import Model.SEmajor;
import Model.University;
import Service.Student;

public class Person {
    public static void main(String[] args) throws Exception {
        System.out.println("Output:\n");
        System.out.println("undergrade student result:\n");
        Student undergradStudent = new SEmajor();
        undergradStudent.educate();

        System.out.println("\n==========================\n");

        System.out.println("graduate student result:\n");
        Student graduateStudent = new University(new SEmajor());
        graduateStudent.educate();
    }
}
