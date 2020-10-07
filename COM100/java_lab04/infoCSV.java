import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.File;

public class infoCSV{
	private static void showInfo(String name,double hour,double rate,double fTax,double sTax){
		
		System.out.println("===========================================");

		double total = hour * rate;

		System.out.println("Employee's name : " + name);
		System.out.println("Hour work:"+ hour + "hour(s)");
		System.out.println("Pay rate:$" + rate);
		System.out.println("Groos pay:$" + total);
		
		System.out.println("Deductions:");
		System.out.println("\tFederal Tax(" + fTax + "%):$"+total * fTax);
		System.out.println("\tState Tax(" + sTax + "%):$"+total*sTax);
		double totalDeduct = (total*fTax) + (total*sTax);
		System.out.println("\tTotal Dedcution:$"+ totalDeduct);
		System.out.println("Net Pay:$"+(total - totalDeduct));

		System.out.println("===========================================");
	}
	public static void main(String[] args) throws IOException{
		File f = new File("D:\\Work_and_Picture\\elearning cmu\\953\\COM100\\java_fourth_lap\\data.csv");
		FileReader fr = new FileReader(f);
		BufferedReader in = new BufferedReader(fr);	
		String data;
		while((data = in.readLine())!=null){
			String[] info = data.split(",");
			String name = info[0];
			double hour = Double.parseDouble(info[1]);
			double rate = Double.parseDouble(info[2]);
			double fTax = Double.parseDouble(info[3])/100;
			double sTax = Double.parseDouble(info[4])/100;
			showInfo(name, hour, rate, fTax, sTax);
		}

		
		in.close();
	}
}

