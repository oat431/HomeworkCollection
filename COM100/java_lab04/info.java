import java.util.Scanner;
public class info{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		String name = in.next();
		double hour = in.nextDouble();
		double payRate = in.nextDouble();
		double fTax = in.nextDouble()/100;
		double sTax = in.nextDouble()/100;
		
		double total = hour * payRate;

		System.out.println("Employee's name : " + name);
		System.out.println("Hour work:"+ hour + "hour(s)");
		System.out.println("Pay rate:$" + payRate);
		System.out.println("Groos pay:$" + total);
		
		System.out.println("Deductions:");
		System.out.println("\tFederal Tax(" + fTax + "%):$"+total * fTax);
		System.out.println("\tState Tax(" + sTax + "%):$"+total*sTax);
		double totalDeduct = (total*fTax) + (total*sTax);
		System.out.println("\tTotal Dedcution:$"+ totalDeduct);
		System.out.println("Net Pay:$"+(total - totalDeduct));
	}
}

