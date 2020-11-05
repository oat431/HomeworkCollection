import java.util.Random;
public class randomGrade {
    public static void main(String[] args) {
        int[] stu = new int[100];
        Random rand = new Random(); 
        for(int i=0;i<100;i++){
            stu[i] = rand.nextInt(100)+1; 
        }

        int[] collect = new int[5];

        for(int i : stu){
            switch(grading(i)){
                case 'A':collect[0]++;break;
                case 'B':collect[1]++;break;
                case 'C':collect[2]++;break;
                case 'D':collect[3]++;break;
                case 'F':collect[4]++;break;
            }
        }

        System.out.println("Student got A >> " + collect[0]);
        System.out.println("Student got B >> " + collect[1]);
        System.out.println("Student got C >> " + collect[2]);
        System.out.println("Student got D >> " + collect[3]);
        System.out.println("Student got F >> " + collect[4]);
        System.out.println("Total Student >> 100");
    }

    public static char grading(int n){
        if(n >= 80 && n <= 100){
            return 'A';
        }else if(n >= 70 && n <= 79){
            return 'B';
        }else if(n >= 60 && n <= 69){
            return 'C';
        }else if(n >= 50 && n <= 59){
            return 'D';
        }
        return 'F';
    }

}
