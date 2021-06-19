import java.util.Arrays;
public class TreasureGame {
    public static void main(String[] args) {
        int[][] A = {
             { 2, 2, 3, 4, 2 }, 
             { 1, 2, 2, 4, 5 },
             { 6, 5, 6, 1, 5 }, 
             { 3, 6, 5, 4, 3 } 
        };
        int m = 4;
        int n = 5;
        System.out.println(getMaxGold(A, m, n)); 
        System.exit(0);
    }

    static int getMaxGold(int[][] gold, int m, int n) {

        int[][] goldTable = new int[m+1][n+1];
        
        for (int col = 0; col < n; col++) {
            for (int row = 0; row < m; row++) {

                int right = (col == n + 1) ? 0 : goldTable[row][col + 1];

                int down = (row == m + 1) ? 0 : goldTable[row + 1][col];

                goldTable[row][col] = gold[row][col] + Math.max(right, down);
            }
        }

        for(int[] i : goldTable){
            for(int j : i){
                System.out.print(j + " ");
            }
            System.out.println();
        }

        int res = goldTable[0][0];

        for (int i = 0; i < m; i++)
            res += Math.max(res, goldTable[i][0]);

        return res;
    }
}