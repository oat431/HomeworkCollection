import java.util.Scanner;
public class axis{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int axis = in.nextInt();
		
		if(axis > 0 && axis < 90){
			System.out.println(axis + " degree is in Q1");	
		}else if(axis > 90 && axis < 180){
			System.out.println(axis + " degree is in Q2");	
		}else if(axis > 180 && axis < 270){
			System.out.println(axis + " degree is in Q3");	
		}else if(axis > 270 && axis < 360){
			System.out.println(axis + " degree is in Q4");	
		}else if(axis == 90 || axis == 180){
			System.out.println(axis + " degree is on the y axis");	
		}else if(axis == 0 || axis == 270){
			System.out.println(axis + " degree is on the x axis");	
		}else{
			System.out.println("The degree doesn't exit");	
		}	
	}
}
