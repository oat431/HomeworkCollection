import java.util.Scanner;
public class tem {
    private static final Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        while(true){
            String input = in.next().toLowerCase();
            if(input.equals("c")){
                break;
            }else{
                break;
            }
        }
        System.out.println("This program has ended"); 
    }   

    public static double celcius(double temp){
        System.out.println("please enter your farenheit");
        return (in.nextDouble()-32) * (5.0/9.0);
    }

    public static double farenheit(double temp){
        System.out.println("please enter your celcius");
        return ((in.nextDouble()*9)/5.0) + 32;
    }
}
