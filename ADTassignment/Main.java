package com.company;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.File;
public class Main {

    public static void main(String[] args) throws FileNotFoundException {

        File file = new File("D:\\Work_and_Picture\\elearning cmu\\953\\ADT102\\ThirdAssignment\\src\\com\\company\\Studentdata.csv");
        Scanner in = new Scanner(file);
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
        System.out.println("=======================================Using stack data type=======================================");

        System.out.println("---------------------------------------:Create Stack:---------------------------------------");
        Stack stStudent = new Stack();

        System.out.println("---------------------------------------Normal Flow of Stack:---------------------------------------");
        for(Student i : students){
            System.out.println("push this "+ i.toString() +" which is Student object to Stack ");
            stStudent.push(i);
        }

        int n = stStudent.size();
        for(int i=0;i<n;i++){
            System.out.println("This is the top of the stack"+stStudent.peek());
            System.out.println("Then pop the top element out :");
            stStudent.pop();
        }

        System.out.println("---------------------------------------Using pop all:---------------------------------------");
        System.out.println("put every element in the stack again");
        for(Student i : students){
            stStudent.push(i);
        }
        System.out.println("call popAll() method");
        stStudent.popAll();

        System.out.println("====================================================================================================");
        System.out.println();
        System.out.println("=======================================Using stack data type=======================================");

        System.out.println("---------------------------------------:Create Queue:---------------------------------------");
        Queue qStudent = new Queue();

        System.out.println("---------------------------------------:Normal Flow of Queue:---------------------------------------");
        for(Student i : students){
            System.out.println("enqueue this "+ i.toString() +" which is Student object to Queue ");
            qStudent.enQueue(i);
        }

        for(int i=0;i<n;i++){
            System.out.println("This is the front of the queue "+qStudent.front());
            System.out.println("Then dequeue the front element of the queue");
            qStudent.deQueue();
        }

        System.out.println("---------------------------------------:Using dequeueAll:---------------------------------------");
        System.out.println("put every element in the queue again");
        for(Student i : students){
            qStudent.enQueue(i);
        }
        System.out.println("call deQueueAll() method");
        qStudent.deQueueAll();

        System.out.println("====================================================================================================");


    }
}
