import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class second{
	private static final BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	public static void main(String[] args) throws IOException{
		//int n = Integer.parseInt(in.readLine());
		
		for(int i=1;i<=12;i++){
			System.out.println("====== " + i + " ======");
			for(int j=1;j<=12;j++){
				System.out.println(i + " x " + j + " = " + (i*j));
			}
			System.out.println("===============");
			System.out.println();
		}
	}
}
