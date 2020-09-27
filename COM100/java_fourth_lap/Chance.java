import java.util.Scanner;
public class Chance{
	public static void main(String[] args){
		
		Scanner in = new Scanner(System.in);
		
		double amt = in.nextDouble();
		
		int rem = (int)(amt * 100);
		
		int dollar = rem / 100;
		rem = rem%100;
		
		int quar = rem / 10;
		rem = rem%25;

		int dim = rem / 10;
		rem = rem%10;

		int ni = rem / 5;
		rem = rem%5;

		int pen = rem;

		System.out.println(dollar);		
		System.out.println(quar);		
		System.out.println(dim);		
		System.out.println(ni);		
		System.out.println(pen);		
	}
}
