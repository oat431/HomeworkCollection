import java.io.*;

class RollingDice {
    int top = 1;
    int bottom = 6;
    int left = 3;
    int right = 4;
    int front = 2;
    int back = 5;

    public void x_roll(int a, int b, int c, int d) {
        this.front = a;
        this.bottom = b;
        this.back = c;
        this.top = d;
    }

    public void y_roll(int a, int b, int c, int d) {
        this.top = a;
        this.left = b;
        this.bottom = c;
        this.right = d;
    }

    public void z_roll(int a, int b, int c, int d) {
        this.front = a;
        this.left = b;
        this.back = c;
        this.right = d;
    }

    public int get_front() {
        return this.front;
    }

}

class Main {
    private static final BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        int t = Integer.parseInt(in.readLine());
        while (t-- > 0) {
            String pattern = in.readLine();
            System.out.print(solve(new RollingDice(), pattern) + " ");
        }
    }

    private static int solve(RollingDice dice, String pattern) {
        for (char i : pattern.toCharArray()) {
            switch (i) {
                case 'F':
                    dice.x_roll(dice.top, dice.front, dice.bottom, dice.back); 
                    break;
                case 'B':
                    dice.x_roll(dice.bottom, dice.back, dice.top, dice.front);
                    break;
                case 'L':
                    dice.y_roll(dice.right, dice.top, dice.left, dice.bottom);
                    break;
                case 'R':
                    dice.y_roll(dice.left, dice.bottom, dice.right, dice.top);
                    break;
                case 'C':
                    dice.z_roll(dice.right,dice.front, dice.left, dice.back);
                    break;
                case 'D':
                    dice.z_roll(dice.left, dice.back, dice.right, dice.front);
                    break;
            }
        }
        return dice.get_front();
    }
}