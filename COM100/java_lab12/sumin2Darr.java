import java.util.Scanner;

public class sumin2Darr{
    private static final Scanner in = new Scanner(System.in);
    public static void main(String[] args){
        int[][] m = getArray();
        printMat(m);
        System.out.println(sum(m)); 
    }

    public static int[][] getArray() {
        int[][] m = new int[3][4];
        for(int i=0;i<3;i++){
            for(int j=0;j<4;j++){
                m[i][j] = in.nextInt();
            }
        }
        return m;
    }

    public static int sum(int[][] m){
        int sum = 0;
        for(int[] i : m){
            for(int j : i){
                sum += j;
            }
        }
        return sum;
    }

    public static void printMat(int[][] m){
        for(int[] i : m){
            for(int j : i){
                System.out.print(j + " ");;
            }
            System.out.println();
        }
    }
}