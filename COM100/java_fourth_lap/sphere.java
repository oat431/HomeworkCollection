import java.util.Scanner;
public class sphere{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		double pi = 3.1416;
		double radius = in.nextDouble();
		double volume = (4/3) * pi * Math.pow(radius,3);
		double surface = 4 * pi * Math.pow(radius,2);
		System.out.println(volume);
		System.out.println(surface);
	}
}
