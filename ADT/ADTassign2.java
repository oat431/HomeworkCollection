import java.util.*;
import java.io.*;
class ADT22y {
    public static void main(String[] args) throws FileNotFoundException{
        File myfile = new File("D:\\IAMDEV\\JaJaJaJaVaVaVaVa\\data.txt");
        Scanner in = new Scanner(myfile);
        Vector<Double> arr = new Vector<Double>();
        while(in.hasNextLine()){
            arr.add(Double.parseDouble(in.nextLine()));
        }

        System.out.println(arr.size());
        double sum = 0;
        for(double i : arr){
            sum += i;
        }
        System.out.println(sum);
    }
}