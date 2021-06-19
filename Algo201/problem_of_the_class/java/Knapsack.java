public class Knapsack {

    /**
     * this problem use overlapping subproblem to indicate the most work that have the most value within scope of work 
     * by select works value and do it until the out of work to found in this step we already got the most value within scope of work
     * after that we return the last element in the work which is a most value one
     * this overlapping subproblem use O(value.length * realWork) or O(n*m) and it still polynomial time   
     */
    private static int knapSack(int realWork, int[] work, int[] value, int n) {
        int[][] note = new int[n + 1][realWork + 1];

        // iterlate though the realWork to get all of the value 
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= realWork; j++) {
                if (i == 0 || j == 0) {
                    note[i][j] = 0;
                } else if (work[i - 1] <= j) { // select the most value during the work
                    note[i][j] = Math.max(value[i - 1] + note[i - 1][j - work[i - 1]], note[i - 1][j]);
                } else { 
                    note[i][j] = note[i - 1][j];
                }
            }
        }
        return note[n][realWork];
    }

    public static void main(String[] args) {
        int[] value = { 60, 100, 120 };
        int[] work = { 10, 20, 30 };
        int realWork = 50;
        System.out.println(knapSack(realWork, work, value, value.length));
    }
}
