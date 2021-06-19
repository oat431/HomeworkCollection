public class Stair {
    public static void main(String[] args) {
        int t = 7;
        System.out.println(jump(t));
    }
    
    public static int jump(int j){
        if(j == 1 || j == 0){
            return 1; 
        } 
        return jump(j-1) + jump(j-2);
    }
}
