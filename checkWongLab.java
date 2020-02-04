import java.util.Stack;
class Main {
    private static boolean check(String word){
        Stack<Character> chk = new Stack<>();
        switch (word.charAt(0)){
            case '{':
            case '[':
            case '(':
                chk.push(word.charAt(0));
                break;
            default:
                return false;
        }
        for(int i=1;i<word.length();i++){
            for(char j : chk){
                System.out.print(j);
            }
            System.out.println();
            switch (word.charAt(i)){
                case '{':
                case '[':
                case '(':
                    chk.push(word.charAt(i));
                    break;
            }
            switch (word.charAt(i)){
                case '}':
                    if(chk.peek() == '[' || chk.peek() == '('){
                        return false;
                    }
                    chk.pop();
                    break;
                case ']':
                    if(chk.peek() == '{' || chk.peek() == '('){
                        return false;
                    }
                    chk.pop();
                    break;
                case ')':
                    if(chk.peek() == '{' || chk.peek() == '['){
                        return false;
                    }
                    chk.pop();
                    break;
            }
        }
        if(chk.empty()){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        String data = "{[(())]}";

        System.out.println(check(data));


    }
}
