import java.util.Scanner;
public class PorF{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter Score: ");
		int score = in.nextInt();
		
		if(score >= 80)
			System.out.println("You are pass");
		else 
			System.out.println("You are fail");	
	}
}
