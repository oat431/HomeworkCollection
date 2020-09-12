import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
  private static final Scanner in = new Scanner(System.in);
    private static boolean chk(String par){
        if(par.charAt(0) == ')'||par.charAt(0) == '}'||par.charAt(0) == ']'){
            return false;
        }
        Stack<Character> cHk = new Stack<>();
        char[] p = par.toCharArray();
        for(char i : p){
            if(i == '('||i == '{'||i == '['){
                cHk.push(i);
            }else if(cHk.empty()){
                return false;
            } else if(i == ')'||i == '}'||i==']'){
                switch(cHk.peek()){
                    case '(':
                        if(i == '}'||i==']'){
                            return false;
                        }
                        cHk.pop();
                        break;
                    case '{':
                        if(i == ')'||i==']'){
                            return false;
                        }
                        cHk.pop();
                        break;
                    case '[':
                        if(i == '}'||i==')'){
                            return false;
                        }
                        cHk.pop();
                        break;
                }
            }
        }
        if(cHk.empty()){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
       int t = in.nextInt();
       for(int i=0;i<t;i++){
           String par = in.next();
           if(chk(par)){
               System.out.println("balanced");
           }else{
               System.out.println("not balanced");
           }
       }
    }
}