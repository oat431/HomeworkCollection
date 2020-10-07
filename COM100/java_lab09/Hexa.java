import java.util.Scanner;
public class Hexa {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        in.close();
        int temp = num;
        String res = "";
        while(num > 0){
            int digit = num%16;
            switch(digit){
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                case 0:
                    res += digit;
                    break;
                case 10:
                    res += "A";
                    break;
                case 11:
                    res += "B";
                    break;
                case 12:
                    res += "C";
                    break;
                case 13:
                    res += "D";
                    break;
                case 14:
                    res += "E";
                    break;
                case 15:
                    res += "F";
                    break;
            }
            num /= 16;
        } 
        String hexadecimal = "";
        for(int i=res.length()-1;i>=0;i--){
            hexadecimal += res.charAt(i);
        }
        System.out.println(temp + " in decimal is " + hexadecimal + " in hexadecimal");
    }    
}
