public class CoinChange {

    private static long countCoin(int[] coin ,int m ,int n){
        long[] table = new long[n+1];
        table[0] = 1;

        for(int i=0;i<m;i++){
            for(int j=coin[i];j<= n ; j++){
                table[j] += table[j-coin[i]];
            }
        }

        return table[n]; 
    }

    public static void main(String[] args) {
        int[] coin = {1,2,5,10};
        int n = 12;
        System.out.println(countCoin(coin, coin.length,n));
    }
}


