import java.util.Scanner;
public class Milisec {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long time = in.nextLong(); 
        System.out.println(convertMillis(time));         
        in.close(); 
    }   

    public static String convertMillis(long millis){
        return millis / 3600000 + ":" + (millis%3600000) / 60000 + ":" + millis%60;
    } 
}
