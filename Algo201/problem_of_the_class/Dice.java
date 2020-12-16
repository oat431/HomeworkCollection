import java.io.*;
class RollingDice{
    private int top = 1;
    private int bottom = 6;
    private int left = 3;
    private int right = 4;
    private int front = 2;
    private int back = 5;

    public void y_roll(int a,int b,int c,int d){
        this.front = a;
        this.bottom = b;
        this.back = c;
        this.top = d;
    }

    public void x_roll(int a,int b,int c,int d){
        this.top = a;
        this.left = b;
        this.bottom = c;
        this.right = d;       
    }

    public void z_roll(int a,int b,int c,int d){
        this.front = a; 
        this.left = b;
        this.back = c;
        this.right = d;
    }

    public void front_roll(){ // when F occur
        y_roll(this.top, this.front, this.bottom, this.back);
    }

    public void back_roll(){ // when B occur
        y_roll(this.bottom,this.back,this.top,this.front);
    }

    public void left_roll(){ //when L occur
        x_roll(this.right, this.top, this.left, this.bottom);
    }
 
    public void right_roll(){ //when R occur
        x_roll(this.left, this.bottom, this.right, this.top);
    }

    public void clock_roll(){ //when C occur
        z_roll(this.right, this.front, this.left, this.back);
    }

    public void counter_roll(){ //when D occur
        z_roll(this.left, this.back, this.right, this.front);
    }

    public int get_front(){
        return this.front;
    }

}
public class Dice{
    private static final BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) throws IOException{
        int t = Integer.parseInt(in.readLine()); 
        while(t-- > 0){
            String pattern = in.readLine();
            System.out.print(solve(new RollingDice(), pattern) + " ");
        } 
    }

    private static int solve(RollingDice dice,String pattern){
        for(char i : pattern.toCharArray()){
            switch(i){
                case 'F':dice.front_roll();break; 
                case 'B':dice.back_roll();break;
                case 'L':dice.left_roll();break;
                case 'R':dice.right_roll();break;
                case 'C':dice.clock_roll();break;
                case 'D':dice.counter_roll();break;
            }
        } 
        return dice.get_front();
    }
}