public class Max{
    public static void main(String[] args){
        int i = 5;
        int j = 2;
        int x = 9;
        int y = 7;
        int k = max(i,j);
        int z = max(x,y);
        System.out.println("The maximum between " + i + " and " + j + " is " + k);
        System.out.println("The maximum between " + x + " and " + y + " is " + z);
    }

    public static int max(int num1, int num2){
        return num1 > num2 ? num1 : num2;
    }
}