import java.util.Scanner;
import java.util.Random;

public class HTgame{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		Random rd = new Random();
		
		System.out.println(in.nextInt() == rd.nextInt(2)?"Hoorayyy You are win":"Boooo You are lose");	
	}
}
