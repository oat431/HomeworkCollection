import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Zuma {
    private static final BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        String[] input = in.readLine().split(" ");
        System.out.println(findMinStep(input[0], input[1]));
        in.close();
    }
    
    public static int findMinStep(String board, String hand) {
        if (board == null) {
            return 0;
        }

        HashMap<Character, Integer> hitAmount = new HashMap<Character, Integer>();
        for (int i = 0; i < hand.length(); i++) {
            char c = hand.charAt(i);
            hitAmount.put(c, hitAmount.getOrDefault(c, 0) + 1);
        }

        return DepthFirstSearch(board, hitAmount, new HashMap<String, Integer>());
    }

    public static int DepthFirstSearch(String board, Map<Character, Integer> hitAmount, Map<String, Integer> temp) {
        if (temp.containsKey(board)) {
            return temp.get(board);
        }

        if (board.isEmpty())
            return 0;

        int i = 0;
        int ans = Integer.MAX_VALUE;
        StringBuilder currentBoard = new StringBuilder(board);
        while (i < currentBoard.length()) {
            for (char c : hitAmount.keySet()) {
                if (hitAmount.get(c) != null && hitAmount.get(c) > 0) {
                    currentBoard.insert(i + 1, c);
                    hitAmount.put(c, hitAmount.get(c) - 1);

                    String newBoard = updateBoard(currentBoard.toString());
                    int r = DepthFirstSearch(newBoard, hitAmount, temp);
                    if (r != -1) {
                        ans = Math.min(ans, r + 1);
                    }

                    // backtracking
                    currentBoard.deleteCharAt(i + 1);
                    hitAmount.put(c, hitAmount.get(c) + 1);
                }
            }

            i++;
        }
        ans = ans == Integer.MAX_VALUE ? -1 : ans;
        temp.put(board, ans);
        return ans;
    }

    public static  String updateBoard(String board) {
        int i = 0;
        while (i < board.length()) {
            int j = i;
            while (j < board.length() && (board.charAt(i) == board.charAt(j)))
                j++;
            if (j - i >= 3) {
                board = board.substring(0, i) + board.substring(j);
                return updateBoard(board);
            } else {
                i++;
            }
        }
        return board;
    }
}
