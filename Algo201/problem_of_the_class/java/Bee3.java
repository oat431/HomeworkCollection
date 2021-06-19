import java.util.Scanner;
public class Bee3 {
    private static int BeeEachYear(int n){
        if(n == 1){
            return 4;
        }
        if(n == 0){
            return 2;
        }
        return BeeEachYear(n-2) + BeeEachYear(n-1) + 1;
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println(BeeEachYear(n));
    }
}
