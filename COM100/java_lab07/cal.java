import java.util.Scanner;
public class cal{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int operation = in.nextInt();
		
		double answer = 0;
		int x = 50;
		int y = 2;
		boolean check = true;	
		switch(operation){
			case 1: answer = x + y;break;
			case 2: answer = x - y;break; 
			case 3: answer = x * y;break; 
			case 4: answer = x / y;break;
			default :check = false ;System.out.println("invalid choice");break;
    	
		}
		if(check){
			System.out.println("answer is " + answer);	
		}	
	}
}
