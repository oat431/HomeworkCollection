import java.util.Scanner;
public class Analynum{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        double[] num = new double[n];
        double sum = 0;

        for(int i=0;i<n;i++){
            num[i] = in.nextDouble(); 
            sum += num[i];
        }

        double avg = sum / n;

    }
}