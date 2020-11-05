public class exam {
    public static void main(String[] args) {
        char[][] answers = {
            {'A', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
            {'D', 'B', 'A', 'B', 'C', 'A', 'E', 'E', 'A', 'D'},
            {'E', 'D', 'D', 'A', 'C', 'B', 'E', 'E', 'A', 'D'},
            {'C', 'B', 'A', 'E', 'D', 'C', 'E', 'E', 'A', 'D'},
            {'A', 'B', 'D', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
            {'B', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
            {'B', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
            {'E', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'}};
        
        char[] key = {'D','B','D','C','C','D','A','E','A','D'};
        check(answers, key);
    }
    
    public static void check(char[][] answers,char[] key){
        int people = 0; 
        for(char[] ans : answers){
            int sum = 0; 
            for(int i=0;i<ans.length;i++){
                if(key[i] == ans[i]){
                    sum++;
                }
            }
            System.out.println("Student " + people++ +"\'s correct count is " + sum);
        }
    }
}
