import java.util.Scanner;
public class invest{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		double money = in.nextDouble();
		double intRate = in.nextDouble();
		int year = in.nextInt();

		System.out.println(money * Math.pow(1+intRate/12/100,year*12));
		
	}
}
