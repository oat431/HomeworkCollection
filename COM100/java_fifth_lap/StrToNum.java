import javax.swing.JOptionPane;
public class StrToNum {
    public static void main(String[] args){
        String input1 = JOptionPane.showInputDialog(null,"value of A","number",JOptionPane.QUESTION_MESSAGE);
        String input2 = JOptionPane.showInputDialog(null,"value of B","number",JOptionPane.QUESTION_MESSAGE);
        
        int a = Integer.parseInt(input1);
        int b = Integer.parseInt(input2);

        String output = "The result of " + a + " + " + b + " = " + (a+b);

        JOptionPane.showMessageDialog(null, output,"Show the result of A+B",JOptionPane.QUESTION_MESSAGE);
    }
}