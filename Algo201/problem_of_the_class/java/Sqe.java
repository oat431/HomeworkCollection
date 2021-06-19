import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
public class Sqe{
	private static final BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	public static void main(String[] args) throws IOException{
		int S = Integer.parseInt(in.readLine());
		int N = Integer.parseInt(in.readLine());
		String input = in.readLine();
		String[] res = input.split(",");
		int[] arr = new int[res.length];
		for(int i=0;i<res.length;i++){
			arr[i] = Integer.parseInt(res[i]);
		}

		int cnt = 0;
		for(int i=0;i<arr.length;i++){
			if(i+N-1 == arr.length){
				break;	
			}
			int sum = 0;
			for(int j=i;j<i+N;j++){
				sum += arr[j];
			}
			if(sum == S){
				cnt++;	
			}
		}

		System.out.println(cnt);
	}
}

