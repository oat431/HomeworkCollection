import java.util.*;
import java.io.*;
import java.net.*;
public class db{

	public static int displayNumRow(URL url) throws IOException{
		int cntNumRow = 0;
		Scanner in = new Scanner(url.openStream());
		while(in.hasNextLine()){
			if(in.nextLine().isEmpty()){
				break;
			}
			cntNumRow++;
		}
		in.close();
		return cntNumRow;
	}
	
	public static void displayNumIrisByType(URL url) throws IOException{
		Scanner in = new Scanner(url.openStream());
		HashSet<String> typeOfFlower = new HashSet<>();
		ArrayList<String> typeRefference = new ArrayList<>();
		while(in.hasNextLine()){
			String chk = in.nextLine();
			if(chk.isEmpty()){
				break;
			}
			Iris flower = new Iris(chk.split(",")[3]);
			typeRefference.add(chk.split(",")[3]);  
			typeOfFlower.add(flower.getType());
		}
		
		HashMap<String,Integer> result = new HashMap<>();
		
		for(String i : typeOfFlower){
			result.put(i, 0);
		}

		for(String i : typeRefference){
			result.replace(i, result.get(i), result.get(i)+1);
		}
		
		for (Map.Entry<String, Integer> i : result.entrySet()) {
		    System.out.println(i.getKey() + " - " + i.getValue());
		}
	}

	public static void main(String[] args) throws IOException{
		URL url = new URL("https://archive.ics.uci.edu/ml/machine-learning-databases/adult/adult.data");
		displayNumIrisByType(url);
		System.out.println("Total number of flower:"+displayNumRow(url));
	}
}

class Iris{
	private String type;

	public Iris(String name){
		this.type = name;
	}

	public String getType(){
		return this.type;
	}
}

