import java.util.Scanner;
public class var3{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		double area = Math.pow(3.1428,2) * in.nextDouble();
		double volume = area * in.nextDouble();
		System.out.printf("%.2f\n",volume);

	}
}
