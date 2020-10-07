import java.util.Scanner;
public class var4{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int second = in.nextInt();

		int day = second/86400;
		int hour = (second%86400)/3600;
	       	int minute = (second%86400%3600)/60;
		System.out.println("day:hour:minute:second");
		System.out.println(day + ":" + hour + ":" + minute + ":" + second%86400%3600%60);	

	}
}
