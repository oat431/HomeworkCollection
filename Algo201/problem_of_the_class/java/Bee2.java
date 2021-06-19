import java.util.Scanner;
import java.util.ArrayList;
public class Bee2{
    private static final Scanner in = new Scanner(System.in);
    private static ArrayList<Integer> workerEachYear(int n){
        ArrayList<Integer> pattern = new ArrayList<>();
        int init = 1; 
        int t1 = 1;
        int t2 = 2;
        pattern.add(init);
        while(n-- > 0){
            pattern.add(init += t1);
            int t3 = t1 + t2;
            t1 = t2;
            t2 = t3;
        } 
        return pattern;
    }
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
        ArrayList<Integer> input = new ArrayList<>();
        int n = in.nextInt();
        while(n != -1){
            input.add(n);
            n = in.nextInt();
        }
        for(int i : input){
            System.out.println(workerEachYear(i).get(i) + " " + beeEachYear(i).get(i-1));
        }
    }
}