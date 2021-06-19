import java.util.Scanner;
import java.util.ArrayList;
public class Bee{
    private static final Scanner in = new Scanner(System.in);
    private static ArrayList<Integer> beeEachYear(int n){
        ArrayList<Integer> pattern = new ArrayList<>();
        int init = 4; 
        int t1 = 3;
        int t2 = 5;
        pattern.add(init);
        while(n-- > 0){
            pattern.add(init += t1);
            int t3 = t1 + t2;
            t1 = t2;
            t2 = t3;
        } 
        return pattern;
    } 
    public static void main(String[] args) {
        int n = in.nextInt();
        System.out.println(beeEachYear(n).get(n-1));
    }
}