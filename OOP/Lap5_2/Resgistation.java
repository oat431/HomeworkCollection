package com.company;

import java.util.ArrayList;

public class Resgistation {
    private String studentName;
    private String studentID;
    private ArrayList<Semester> sem = new ArrayList<>();
    public Resgistation(String studentName, String studentID) {
        this.studentName = studentName;
        this.studentID = studentID;

        String[] semName = {"Semester 1/2559","Semester 2/2559","Semester 1/2560"};
        String[][] semlist = {{"1,001101,FUBDAMENTAL ENGLISH 1,3.00,B",
                               "2,206113,CAL FOR SOFTWARE ENGINEERING,3.00,B+",
                               "3,751100,ECONOMICS FOR EVERYDAY LIFE,3.00,D+",
                               "4,951100,MODERN LIFE AND ANIMATION,3.00,A",
                               "5,953103,PROGRAMMING LOGICAL THINKING,2.00,A",
                               "6,953211,COMPUTER ORGANIZATION,3.00,C+"}
                             ,{"1,001102,FUNDAMENTAL ENGLISH 2,3.00,B"
                                ,"2,011251,LOGIC,3.00,B"
                                ,"3,953102,ADT & PROBLEM SOLVING,3.00,C+"
                                ,"4,953104,WEB UI DESIGN & DEVELOP,2.00,C"
                                ,"5,953202,Intro to SE,3.00,C"
                                ,"6,953231,OBJECT ORIENTED PROGRAMMING,3.00,B"
                                ,"7,955100,LEARNING THROUGH ACTIVITIES 1,1.00,A"}
                             ,{"1,001201,CRIT READ AND EFFEC WRITE,3.00,W"
                                ,"2,206281,DISCRETE MATHEMATICS,3.00,B"
                                ,"3,206281,DB SYS & DB SYS DESIGN,3.00,C+"
                                ,"4,953233,PROGRAMMING METHODOLOGY,3.00,C+"
                                ,"5,953261,INTERACTIVE WEB DEVELOPMENT,2.00,C+"
                                ,"6,953361,COMP NETWORK & PROTOCOLS,3.00,D+ "}};
        for(int i=0;i<semName.length;i++){
            Semester se = new Semester(semlist[i].length,semName[i],semlist[i]);
            sem.add(se);
        }


    }

    public void showHistory(){
        System.out.println(this.studentName + " : " + this.studentID);
        int num = 0;
        double GPAX = 0;
        for(Semester i : sem){
            System.out.println("=============Start New Semester=============");
            i.summary();
            GPAX += i.getTotalCredit();
            num += i.getCE();
            System.out.println("GPAX:" +String.format("%.2f",GPAX/num));
            System.out.println("============================================");
        }

    }


}