public class TreasureGameDynamic {
    /**
     *  this problem use a overlapping subproblem to solve by iterlate though the maze to find the most valuable tresure and get collect it
     *  the problem use O(n*m) which is still polynomial time and  
     */
    private static int treasureGame(int[][] treasure, int row, int col) {
        int[][] maze = new int[row][col];

        // iterlate though the maze and collect the most valuable tresure that found during the way
        for (int i = col - 1; i >= 0; i--) {
            for (int j = 0; j < row; j++) {
                int goRight = (i == col - 1) ? 0 : maze[j][i + 1];
                int goRightDown = (i == col - 1) || (j == row - 1) ? 0 : maze[j + 1][i + 1];
                int goRightUp = (i == col - 1) || (j == 0) ? 0 : maze[j - 1][i + 1];
                maze[j][i] = treasure[j][i] + Math.max(goRight, Math.max(goRightDown, goRightUp));
            }
        }

        // now find the most valuable tresure that found on the way
        int res = maze[0][0];
        for (int i = 1; i < row; i++) {
            res = Math.max(res, maze[i][0]);
        }
        return res;
    }

    public static void main(String[] args) {
        int[][] treasure = { { 1, 3, 1, 5 }, { 2, 2, 4, 1 }, { 5, 0, 2, 3 }, { 0, 6, 1, 2 } };
        int row = 4, col = 4;
        System.out.println(treasureGame(treasure, row, col));
        System.exit(0);
    }
}
