import java.util.Scanner;
public class Pow{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int m = in.nextInt();
		int res = 1;
		while(m-- > 0){
			res *= n;	
		}	
		System.out.println(res);
	}
}
