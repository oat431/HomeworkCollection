import java.util.Set;
import java.util.TreeSet;
import java.util.Arrays;
import java.util.Scanner;
public class Coin2 {
    private static Set<String> pattern = new TreeSet<>();
    private static final Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        int n = in.nextInt();
        int s = in.nextInt();
        int[] coin = new int[s];
        for(int i = 0;i<s;i++){
            coin[i] = in.nextInt();
        }
        int minCoin = findMin(coin);
        int size = minimumCoin(n, minCoin);
        genBit(n,0, size, new int[size], coin);
        System.out.println(filter(pattern).size());
    }

    public static Set<String> filter(Set<String> pattern){
        Set<String> output = new TreeSet<>();
        for(String i : pattern){
            char[] word = i.toCharArray();
            Arrays.sort(word);
            String out = "";
            for(char j : word){
                out += j;
            } 
            if(!out.equals("")){
                output.add(out);
            }
        }
        return output;
    }

    public static void genBit(int amt, int n, int size, int[] arr,int[] coin){
        if(n == size){
            pattern.add(calN(amt,arr));
            return;
        }
        for(int i=0;i<coin.length;i++){
            arr[n] = coin[i];
            genBit(amt,n+1, size, arr, coin);
        }
    }

    public static void printArr(int[] arr){
        for(int i : arr){
            if(i != 0){
                System.out.print(i);
            }
        }
        System.out.println();
    }

    public static int findMin(int[] arr){
        int min = arr[0];
        for(int i=1;i<arr.length;i++){
            if(min > arr[i]){
                min = arr[i];
            }
        }
        return min;
    }

    public static int minimumCoin(int n,int min){
        int cnt = 0;
        while(n > cnt){
            cnt += min;
        }
        return cnt;
    }

    public static String calN(int n,int[] arr){
        int sum = 0;
        boolean chk = false;
        String temp = ""; 
        for(int i : arr){
            sum += i;
            if(sum == n){
                chk = true;
                temp += i;
                break;
            } 
            temp += i;
        } 
        if(chk){
            return temp;
        }
        return "";
    }
}