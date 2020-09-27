import java.util.Scanner;
class Main{

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int[] a = {12,5,10,15,31,20,25,2,40};
        int index = LinearSeach(a,in.nextInt());
        System.out.println(index == -1?"No element in the array" : "the element is take " +(index+1) + " step");
    } 

    private static int LinearSeach(int[] a,int value){
        for(int i=0;i<a.length;i++){
            if(a[i] == value){
                return i;
            }
        }
        return -1;
    }
}