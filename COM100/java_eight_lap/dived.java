import java.util.Scanner;
public class dived {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your number:");
        int n = in.nextInt();
        int i = 1;
        int cnt = 1;
        while(i<=n){
            if(i%5 == 0 ^ i%7 == 0){
                if(cnt%10 == 0){
                    System.out.println(i);
                }else{
                    System.out.print(i + " ");
                } 
                cnt++;
            }
            i++;
        } 
        System.out.println("End of the number");
        in.close();
    }    
}
