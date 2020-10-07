import java.util.Scanner;
public class salary{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		System.out.println("Enter you hours of working");
		int hour = in.nextInt();
		if(hour <= 40){
			System.out.println("Your weekly salary is: $" + hour*8.00);	
		}else{
			System.out.println("Your weekly salary is: $" + (((hour-40)*12.00) + 320.0));
		}	
	}
}
