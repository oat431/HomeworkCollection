import java.util.Scanner;
public class text {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number : ");
        String num = in.next();
        for(int i=0;i<num.length();i++){
            printNum(num.charAt(i));
            System.out.println();
        }
        in.close();
    }  
    
    public static void printNum(char n){
        switch(n){
            case '0':
                System.out.println("000000");
                System.out.println("0    0");
                System.out.println("0    0"); 
                System.out.println("0    0");
                System.out.println("000000"); 
                break;
            case '1':
                System.out.println("1111  ");
                System.out.println("  11  ");
                System.out.println("  11  "); 
                System.out.println("  11  ");
                System.out.println("  11  "); 
                break;
            case '2':
                System.out.println("222222");
                System.out.println("    22");
                System.out.println("   22 "); 
                System.out.println(" 22   ");
                System.out.println("222222"); 
                break;
            case '3':
                System.out.println("333333");
                System.out.println("    33");
                System.out.println("333333"); 
                System.out.println("    33");
                System.out.println("333333"); 
                break;
            case '4':
                System.out.println("44  44");
                System.out.println("44  44");
                System.out.println("444444"); 
                System.out.println("    44");
                System.out.println("    44"); 
                break;
            case '5':
                System.out.println("555555");
                System.out.println("55    ");
                System.out.println("555555"); 
                System.out.println("    55");
                System.out.println("555555");     
                break;
            case '6':
                System.out.println("666666");
                System.out.println("66    ");
                System.out.println("666666"); 
                System.out.println("66  66");
                System.out.println("666666");     
                break;
            case '7':
                System.out.println("777777");
                System.out.println("   77 ");
                System.out.println("  77  "); 
                System.out.println(" 77   ");
                System.out.println("77    "); 
                break;
            case '8':
                System.out.println("888888");
                System.out.println("8    8");
                System.out.println("888888"); 
                System.out.println("8    8");
                System.out.println("888888"); 
                break;
            case '9':
                System.out.println("999999");
                System.out.println("9    9");
                System.out.println("999999"); 
                System.out.println("     9");
                System.out.println("999999"); 
                break;
            default:
                System.out.println("******");
                System.out.println("******");
                System.out.println("******"); 
                System.out.println("******");
                System.out.println("******"); 
                break;
        }
    }
}
