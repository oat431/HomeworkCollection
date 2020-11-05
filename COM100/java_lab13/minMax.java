import java.util.Scanner;
public class minMax {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in); 
        int n = in.nextInt();
        int[] num = new int[n];

        for(int i=0;i<n;i++){
            num[i] = in.nextInt();
        }

        int max = num[0];
        int min = num[0];

        for(int i : num){
            max = max < i ? i : max;
            min = min > i ? i : min;
        }

        System.out.println("max:" + max);
        System.out.println("min:" + min);
    } 
}
