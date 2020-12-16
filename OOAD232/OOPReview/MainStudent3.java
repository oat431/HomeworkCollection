public class MainStudent3 {
    public static void main(String[] args) {
        Student[] studentData = new Student[3];
        
        for(int i=0;i<3;i++){
            studentData[i] = new Student();
        }

        studentData[0].name = "Apisit";
        studentData[0].studentId = "4921362";
        studentData[0].score = 10;

        studentData[1].name = "Thaksin";
        studentData[1].studentId = "402561";
        studentData[1].score = 56;

        studentData[2].name = "Samak";
        studentData[2].studentId = "489653";
        studentData[2].score = 28;

        System.out.println(studentData[0].whoGreater(studentData[1]));
        System.out.println(studentData[0].whoGreater(studentData[2]));
        System.out.println(studentData[1].whoGreater(studentData[2]));

    }
}
