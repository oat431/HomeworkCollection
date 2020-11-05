import java.util.Scanner;
public class minMaxMet {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] num = new int[n];

        for(int i=0;i<n;i++){
            num[i] = in.nextInt();
        }
        in.close();
        printArr(num);
        System.out.println(findMax(num));
        System.out.println(findMin(num));
    } 

    public static int findMax(int[] num){
        int max = num[0];
        for(int i : num){max = max < i ? i : max;}
        return max;
    }

    public static int findMin(int[] num){
        int min = num[0];
        for(int i : num){min = min > i ? i : min;}
        return min;
    }

    public static void printArr(int[] num){
        for(int i : num){System.out.print(i + " ");}
        System.out.println();
    }
}
