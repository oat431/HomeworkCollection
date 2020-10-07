public class convert {
    public static void main(String[] args){
        int i = 1;
        System.out.println("Inches\t\t\tCentimeters");
        while(i < 200){
            System.out.println(i + "\t\t\t" + i*2.54);
            i += 2;
        }
    } 
}
