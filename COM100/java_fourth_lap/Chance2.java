import java.util.Scanner;
public class Chance2{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int cent = in.nextInt();
		
		System.out.println(cent/100 + " dollars " + cent%100 + " cents ");	
	}
}
