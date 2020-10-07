import java.util.Scanner;

public class mod{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		
		int num = in.nextInt();
		if(num % 2 == 0 && num % 3 == 0){
			System.out.println(num + " can divide 2 and 3");	
		}
		if(num % 2 == 0 || num % 3 == 0){
			System.out.println(num + " can divide 2 or 3");	
		}	
		if(num % 2 == 0 ^ num % 3 == 0){
			System.out.println(num + " can divide 2 or 3 but not both");	
		}	
	}
}
