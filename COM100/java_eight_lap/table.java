public class table {
    public static void main(String[] args){
        int i = 1;
        while(i<=100){
            System.out.print(i + " ");
            if(i%10 == 0){
                System.out.println();
            }
            i++;
        }
    }
}
