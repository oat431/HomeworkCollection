package app;

import java.util.Vector;
import java.util.Scanner;

public class App {
    //this method is sort the array and show the array after sort
    private static void sort(String[] word){
        //this algorithm is selection sort 
        for(int i = 0;i<word.length;i++){
            // choose minimum value and position of minimumvalue first 
            String min = word[i];
            int p = i;
            for(int j=i;j<word.length;j++){
                //then check if it really minmum value if it true remember the position
                if(min.compareTo(word[j]) < 0){
                    min = word[j];
                    p = j;
                }
            }
            //last check if the first index is really minimum
            if(min.compareTo(word[i]) > 0){
                String temp = word[i];
                word[i] = word[p];
                word[p] = temp;
            }
        }
        
        //output it 
        for(String i : word){
            System.out.println(i);
        }
    }
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        Vector<String> word = new Vector<>();

        String input;
        do{
            input = in.nextLine();
            word.add(input);
        }while(!input.equals("quit"));
           
        //this line for remove "quit" out off the vector
        word.remove(word.size()-1);

        String[] arr = new String[word.size()];
        for(int i=0;i<word.size();i++){
            arr[i] = word.get(i);
        }

        sort(arr);
    }
}
