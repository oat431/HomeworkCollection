public class Student{
    public String name;
    public String studentId;
    public int score;
    
    public void printSocre(){
        System.out.println("I received " + this.score);
    }

    public int compareScore(Student otherStudent){
        return otherStudent.score - this.score;
    }

    public String whoGreater(Student otherStudent){
        return this.score > otherStudent.score ? this.name : otherStudent.name;
    }
}