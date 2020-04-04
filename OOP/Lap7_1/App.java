package app;

public class App {
    public static void main(String[] args) throws Exception {
        Student s1 = new Student();
        s1.setFirstName("Mark");
        s1.setLastName("Mark");
        System.out.println(s1.getFirstName() + " " + s1.getLastName());
        System.out.println(s1.getAge());
        if(s1.getFirstName().equals("Mark")){
            System.out.println("Mark founded");
        }
        s1.setAge(1000);
        s1.SetStudentId("001");
        s1.setGender("Mr.");
        System.out.println(s1.ShowStudentInfo());
        System.out.println();
        s1.SetStudentId("23434132478");
        s1.getStudentId();
        s1.SetStudentId("591912099");
        s1.getStudentId();
        s1.SetStudentId("592015001");
        s1.getStudentId();
        s1.SetStudentId("622115011");
        s1.getStudentId();
        s1.SetStudentId("601110001");
        s1.getStudentId();


        //After this line the code must not be modified
       /* StudentEncapsulationExample1 ex1 = new StudentEncapsulationExample1();
        ex1.GetAge();
        System.out.println();
        ex1.GetGender();
        System.out.println();
        ex1.GetFirstName();
        System.out.println();
        ex1.GetLastName();
        System.out.println();
        System.out.println();
        ex1.GetStudentEncapsulationExample1();
        System.out.println();
        ex1.SetGender("test");
        System.out.println("Set year of birth = 1000 or 3000");
        ex1.SetYearOfBirth(1000);
        ex1.SetYearOfBirth(2500);
        System.out.println();
        ex1.SetGender("Male");
        ex1.SetYearOfBirth(1999);
        System.out.println("After set calid input for gender and year of birth");
        System.out.println(ex1.GetStudentEncapsulationExample1());
        System.out.println();
        ex1.SetFirstName("David");
        ex1.SetLastName("Cunningham");
        System.out.println("After set name and lastname");
        System.out.println(ex1.GetStudentEncapsulationExample1());*/
    }
}