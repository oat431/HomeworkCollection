import java.util.Scanner;
public class sort{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int n1 = in.nextInt();
		int n2 = in.nextInt();
		int n3 = in.nextInt();
		
		if(n1 > n2){
			int temp = n1;
			n1 = n2;
			n2 = temp;	
		}
		if(n2 > n3){
			int temp = n2;
			n2 = n3;
			n3 = temp;	
		}
		if(n1 > n2){
			int temp = n1;
			n1 = n2;
			n2 = temp;	
		}

		System.out.println(n1 + " " + n2 + " " + n3);	
	}
}

/*
 * 5 4 1
 * 4 5 1
 * 4 1 5
 * 1 4 5
 * */
