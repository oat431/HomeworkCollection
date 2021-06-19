import java.util.Scanner;
public class RotMat{
	public static void main(String[] args){
		//input initial
		String mat = input();
		mat = mat.replace('[', ' ');
		mat = mat.replace(']', ' ');
		mat = mat.trim();	
		String[] row = mat.split(",");
		String[] temp = row[0].split(" ");
		int[][] matrix = new int[row.length][temp.length];
		int n=0,m=0;
		
		for(String i : row){
			String[] col = i.split(" ");
			for(String j : col){
				matrix[n][m] = Integer.parseInt(j);
				m++;	
			}
			m = 0;	
			n++;
		}
		// end input

		n = row.length;
		m = temp.length;
		for(int i=0;i<n;i++){
			for(int j=0;j<m/2;j++){
				int t = matrix[i][j];
				matrix[i][j] = matrix[i][m-j-1];
				matrix[i][m-j-1] = t;
			}	
		}

		for(int i=0;i<n;i++){
			for(int j=0;j<m;j++){
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
	}

	private static String input(){
		Scanner in = new Scanner(System.in);
		String word = "";
		String input = "";
		do{
			word = in.nextLine();
			if(word.length() == 0){
				word = ",";
			}
			input += word;
		}while(word.charAt(word.length()-1) != ']');
		in.close();	
		return input;
	}
}

