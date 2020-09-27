package com.company;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;
public class Main{
    private static final BufferedReader in = new BufferedReader(new InputStreamReader(System.in));


    public static void main(String[] args) throws IOException{

        try{
            int n = Integer.parseInt(in.readLine());
            System.out.println(n);
        }catch(NumberFormatException e){
            System.out.println(e.getMessage());
        }
    }


}



/*public class Main {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        CourseInfo c1 = new CourseInfo("953231","Obj Oriented Programming",3);
        CourseInfo c2 = new CourseInfo("953212","Database", 3);
        CourseInfo c3 = new CourseInfo("953101","Computers and Programming", 3);
        CourseInfo c4 = new CourseInfo("001101","Listening and Speaking in Engl", 3);
        CourseInfo c5 = new CourseInfo("206113","Cal for Software Engineering", 3);
        CourseInfo c6 = new CourseInfo("259109","Telecom in Thailand", 3);
        CourseInfo c7 = new CourseInfo("955100","Learning through Activities 1", 1);
        CourseInfo c8 = new CourseInfo("001102","Reading and Writing in Engl", 3);
        CourseInfo c9 = new CourseInfo("207110","PHYS SC that changed world", 3);
        CourseInfo c10 = new CourseInfo("951100","Modern life and Animation", 3);
        CourseInfo c11 = new CourseInfo("953102","ADT and Problem Solving", 3);
        CourseInfo c12 = new CourseInfo("955101","Learning through Activities 2", 1);
        CourseInfo c13 = new CourseInfo("751100","Economics for everyday life", 3);


        StudentInfo s1 = new StudentInfo();
        s1.setStudentId("492115001");
        s1.setStudentFirstname("Alex");
        s1.setStudentLastname("Anderson");

        StudentRegistrationInfo StuRegInfo = new StudentRegistrationInfo();
        StuRegInfo.s = s1;

        SemesterAcademicRecord sem1 = new SemesterAcademicRecord("01","2549","1");
        sem1.AddCourse(c4);
        sem1.AddCourse(c5);
        sem1.AddCourse(c6);
        sem1.AddCourse(c7);
        sem1.AddCourse(c3);
        sem1.AddCourse(c13);
        sem1.AddCourseGrade("001101","C");
        sem1.AddCourseGrade("206113", "B");
        sem1.AddCourseGrade("259109","D+");
        sem1.AddCourseGrade("751100","B+");
        sem1.AddCourseGrade("953101","C");
        sem1.AddCourseGrade("955100","C+");

        StuRegInfo.rec[0] = sem1;


        SemesterAcademicRecord sem2 = new SemesterAcademicRecord("02","2549","2");
        sem2.AddCourse(c8);
        sem2.AddCourse(c9);
        sem2.AddCourse(c10);
        sem2.AddCourse(c11);
        sem2.AddCourse(c12);
        sem2.AddCourse(c1);
        sem2.AddCourseGrade("953231","A");
        sem2.AddCourseGrade("207110", "C");
        sem2.AddCourseGrade("001102","B+");
        sem2.AddCourseGrade("955101","C+");
        sem2.AddCourseGrade("951100","C");
        sem2.AddCourseGrade("953102","D");

        StuRegInfo.rec[1] = sem2;
        PrintTranscriptInfo(StuRegInfo);
    }


    public static void PrintTranscriptInfo(StudentRegistrationInfo sinfo)
    {
        System.out.println("Transcript Information");
        System.out.println("Student Id: " + sinfo.s.getStudentId());
        System.out.println("Student Name : " + sinfo.s.getStudentFirstname() + sinfo.s.getStudentLastname());
        System.out.println(" ");
        double totalgval = 0.0;
        double totalcountcred = 0.0;
        for(int i = 0; i < sinfo.rec.length;i++)
        {

            if(sinfo.rec[i] != null){
                System.out.println(sinfo.rec[i].GetSemesterInfo());
                System.out.println("");
                for(CourseInfo c : sinfo.rec[i].getAllCourseRegis())
                {
                    System.out.println(c.getCourseFullInfo());
                }
                System.out.println("Semester Result ="+ sinfo.rec[i].GetSemesterCredits() +" credits with GPA = "+ sinfo.rec[i].GetSemesterGPA());
                totalcountcred = totalcountcred + sinfo.rec[i].GetSemesterCredits();
                totalgval = totalgval + sinfo.rec[i].GetTotalGval();
                System.out.println("Total Result ="+ totalcountcred +" credits with GPA = "+ totalgval/totalcountcred);
                System.out.println(" ");
            }
        }
    }
}
*/