import java.util.Scanner;
public class PerfectNum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        System.out.println(num + " is " + (isPerfect(num)?"perfect number ":"not perfect number ")); 
        in.close();
    }

    public static boolean isPerfect(int number){
        int sum = 0; 
        for(int i=1;i<number;i++){
            if(number % i == 0){
                sum += i;
            }
        }
        return sum == number;
    }
}
