package app;

import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;
public class App {

    public static void main(String[] args) throws FileNotFoundException{

        File myfile = new File("D:\\Work_and_Picture\\elearning cmu\\953\\ADT102\\queue&stack\\assignment3\\953102701000.csv");
        
        Scanner in = new Scanner(myfile);

        in.nextLine();

        Student[] students = new Student[45];
        int index = 0;

        while(in.hasNextLine()) {
            String[] data = in.nextLine().trim().split("[,]");
            String id = data[0].replace('\"',' ').replace('\t',' ').trim();
            String title = data[1];
            String name = data[2];
            String lastname = data[3];
            students[index] = new Student(id,title,name,lastname);
            index++;
        }

        Stack sttack = new Stack(45);

        Queue queue = new Queue();

    }
}