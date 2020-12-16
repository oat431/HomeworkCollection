public class MainStudent2{
    public static void main(String[] args) {
        Student somsak = new Student();
        somsak.name = "Somsak";
        somsak.studentId = "444111";
        somsak.score = 33;
        
        Student somchai = new Student();
        somchai.name = "Somchai";
        somchai.studentId = "444555";
        somchai.score = 55;
        
        System.out.println(somsak.compareScore(somchai));
    }
}