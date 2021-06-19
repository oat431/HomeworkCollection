import java.util.Scanner;
public class Bit{
	public static void main(String[] args) {
		double l = System.currentTimeMillis();	
		Scanner in = new  Scanner(System.in);
		int t = in.nextInt();
		binaryString(t, new int[t], 0);
		in.close();
		System.out.println(System.currentTimeMillis() - l);
	}
	
	private static void binaryString(int size,int[] arr,int n){
		if(n == size){
			printString(arr);
			return ;
		}

		arr[n] = 0;
		binaryString(size, arr, n+1);

		arr[n] = 1;
		binaryString(size, arr, n+1);

	}

	private static void printString(int[] arr){
		for(int i : arr){
			System.out.print(i + " ");
		}
		System.out.println();
	}
}