import java.util.Scanner;
public class checkValue{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int n1 = in.nextInt();
		int n2 = in.nextInt();
		
		if(n1 > n2){
			System.out.println("The first number is greater than the second");	
		}else if(n2 > n1){
			System.out.println("The first number is no greater than the second.");	
		}else{
			System.out.println("These two number are equal");	
		}	
	}
}
