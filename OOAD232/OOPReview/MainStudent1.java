public class MainStudent1 {
    public static void main(String[] args) {
        Student a = new Student();
        a.name = "Somsri";
        a.studentId = "5212123";
        a.score = 23;
        System.out.println("name = " + a.name);
        System.out.println("student id = " + a.studentId);
        System.out.println("score = " + a.score);
        
        Student b = new Student();
        b.name = "Suree";
        b.studentId = "52111222";
        b.score = 55;
        b.printSocre();

        a = b;
        a.printSocre();
    }    
}
