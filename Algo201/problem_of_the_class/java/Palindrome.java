/**
 * Author : Sahachan
 *  Date : 15/01/2021
 */
import java.util.Scanner;
public class Palindrome{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String word = ""; // for getting input from user

        do{
            System.out.print("Please enter the word:");
            word = in.next();
            if(word.equals("quit")){
                break;
            } 
            if(isPalindrome(word)){
                System.out.println(word + " is palindrome");
            }else{
                System.out.println(word + " is not Palindrome");
            }
        }while(true);

    }

    public static boolean isPalindrome(String word){
        int first = 0;
        int last = word.length() - 1;
        while(first != word.length()/2){
            if(word.charAt(first) != word.charAt(last)){
                return false;
            }
            first = first + 1;
            last = last - 1;
        }
        return true;
    }
    
}

// Sahachan output : false
//   01234567
// racecar output true
