package app;

import java.util.Vector;
import java.util.Scanner;

public class App {
    private static void sort(String[] word){
        for(int i = 0;i<word.length;i++){
            String min = word[i];
            int p = i;
            for(int j=i;j<word.length;j++){
                if(min.compareTo(word[j]) < 0){
                    min = word[j];
                    p = j;
                }
            }
            if(min.compareTo(word[i]) > 0){
                String temp = word[i];
                word[i] = word[p];
                word[p] = temp;
            }
        }
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

        word.remove(word.size()-1);

        String[] arr = new String[word.size()];
        for(int i=0;i<word.size();i++){
            arr[i] = word.get(i);
        }

        sort(arr);
    }
}