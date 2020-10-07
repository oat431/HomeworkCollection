import java.util.Scanner;
public class fac {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int mul = 1;
        for(int i=n;i>1;i--){
            mul *= i;
        } 
        System.out.println(mul);
        in.close(); 
    }    
}
