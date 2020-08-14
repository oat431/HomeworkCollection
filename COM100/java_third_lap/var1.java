import java.util.Scanner;
public class var1{
	public static void main(String[] args){
        	Scanner in = new Scanner(System.in);
        	System.out.println("Enter length:");
        	double l = in.nextDouble();
        	System.out.print("Enter width:");
        	double w = in.nextDouble();
        
        	double area = l*w;

        	System.out.println("The area of regtangle is " + area);

    	}	
}
