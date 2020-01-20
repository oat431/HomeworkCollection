package app;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class Course {
    public Student[] stu = new Student[12];
    
    public Course() throws FileNotFoundException{

        File data = new File("D:\\OatOOp\\oop2\\src\\app\\data.txt");
        Scanner in = new Scanner(data); 
        String[] studentData = new String[stu.length];
        for(int i=0;i<stu.length;i++){
            studentData[i] = in.nextLine();
        }
         
        for(int i=0;i<stu.length;i++){
            String[] rawData = studentData[i].trim().split("\\s+");
            stu[i] = new Student(rawData[0],rawData[1],Double.parseDouble(rawData[2]));
        }
        in.close();
    
    }

    public Course(Student[] stu){
        for(int i=0;i<stu.length;i++){
            this.stu[i] = stu[i];
        }
    }

    public void printDataAll(){
        
        System.out.println("This is a data of Student that enroll this course");
        for(Student i : stu){
            System.out.println(i.getId() + " " + i.getName());
        }
        System.out.println("=================================================");
    
    }

    public void printGrade(){
        
        System.out.println("This is a grade of each Student");
        for(Student i : stu){
            System.out.println(i.getGrade());
        }
        System.out.println("===============================");
    
    }

    public void printgetAvgGrade(){
        
        double grade = 0;
        for(Student i :stu ){
            grade += i.getGrade();
        }
        System.out.println("this is an average grade of all student that in the course " + String.format("%.2f", grade/12)) ;
    
    }
    
}