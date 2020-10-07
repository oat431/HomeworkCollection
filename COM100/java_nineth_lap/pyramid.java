public class pyramid {
    public static void main(String[] args) {
        for(int i=0;i<9;i++){
            for(int j=9;j>i;j--){
                System.out.print("    ");
            }
            for(int j=0;j<i;j++){
                if(Math.pow(2,j) > 100){
                    System.out.printf("%.0f ",Math.pow(2,j));
                }else if(Math.pow(2,j) > 10){
                    System.out.printf("%.0f  ",Math.pow(2,j));
                }else{
                    System.out.printf("%.0f   ",Math.pow(2,j));
                }
            }
            for(int j=i-1;j>0;j--){
                if(Math.pow(2,j-1) > 100){
                    System.out.printf("%.0f ",Math.pow(2,j-1));
                }else if(Math.pow(2,j-1) > 10){
                    System.out.printf("%.0f  ",Math.pow(2,j-1));
                }else{
                    System.out.printf("%.0f   ",Math.pow(2,j-1));
                }
            }
            System.out.println();
        }
    } 
}
