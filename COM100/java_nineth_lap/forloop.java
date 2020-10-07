public class forloop{
    public static void main(String[] args) {
        System.out.println("\t\t\t Multiplication Table");
        System.out.print("  ");
        for(int i=9;i>=1;i--){
            System.out.print("   " + i);
        }
        System.out.println("\n--------------------------------------");

        for(int i=9;i>=1;i--){
            System.out.print(i + "|");
            for(int j=9;j>=1;j--){
                System.out.printf("%4d",i*j);
            }
            System.out.println();
        }
        
    }
}