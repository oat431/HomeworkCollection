import java.util.Scanner;
public class Bit2 {
    public static void main(String[] args) {
        double init = System.currentTimeMillis();
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        
        int n = (int)Math.pow(2,t);
        for(int i=0;i<n;i++){
            String bi = binary(i,t);
            for(int j=bi.length()-1;j>=0;j--){
                System.out.print(bi.charAt(j) + " ");
            }
            System.out.println();
        }
        in.close();
        System.out.println(System.currentTimeMillis() - init);
    } 

    public static String binary(int i,int n){
        String bi = "";
        while(i > 0){
            bi += i%2;
            i /= 2;
        }
        while(bi.length() < n){
            bi += '0';
        } 
        return bi;
    }
}
