package com.company;

import java.util.ArrayList;

public class Semester {
    private ArrayList<Course> cr = new ArrayList<>();
    private String semesterName;
    private double CA;
    private double CE;
    private double GPA;
    private double totalCredit;

    public Semester(int totalEnroll,String semesterName,String[] list){
        this.semesterName = semesterName;
        for(int i=0;i<totalEnroll;i++){
            String[] data = list[i].trim().split("[,]");
            Course csr = new Course( Integer.parseInt(data[0]),
                                     data[1],
                                     data[2],
                                     Double.parseDouble(data[3]),
                                     data[4] );

            cr.add(csr);
        }
        this.GPA = getGPA();
    }

    private double valueOfGrade(String grade){
        switch (grade){
            case "A":return 4.0;
            case "B+":return 3.5;
            case "B":return 3.0;
            case "C+":return 2.5;
            case "C":return 2.0;
            case "D+":return 1.5;
            case "D":return 1.0;
        }
        return 0.00;
    }

    public void allCredit(){
        for(Course i : cr){
            this.CA += i.getCredit();
        }
    }
    public double getGPA(){
        double credit = 0;
        double totalCredit = 0;
        for(Course i : cr){
            if(!i.getGrade().equals("W")){
                credit += i.getCredit();
                totalCredit += i.getCredit() * valueOfGrade(i.getGrade());
            }
        }
        this.CE = credit;
        this.totalCredit = totalCredit;
        allCredit();
        return totalCredit/credit;
    }

    public double getSemGPA(){
        return this.GPA;
    }

    public double getCE(){
        return this.CE;
    }
    public double getTotalCredit(){
        return this.totalCredit;
    }

    public void summary(){
        System.out.println(this.semesterName);
        System.out.println("Order  ID        Name        Credit     Grade");
        for(Course i : cr){
            System.out.println(i.toString());
        }
        System.out.print("CA:" + this.CA +" ");
        System.out.print("CE:" + this.CE +" ");
        System.out.print("GPA:"+String.format("%.2f ",this.GPA));

    }

}
