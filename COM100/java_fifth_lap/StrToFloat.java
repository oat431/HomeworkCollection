import javax.swing.JOptionPane;
public class StrToFloat {
 public static void main(String[] args){
        String input1 = JOptionPane.showInputDialog(null,"value of A","Floating point",JOptionPane.QUESTION_MESSAGE);
        String input2 = JOptionPane.showInputDialog(null,"value of B","Floating point",JOptionPane.QUESTION_MESSAGE);
        
        float a = Float.parseFloat(input1);
        float b = Float.parseFloat(input2);

        String output = "The result of " + a + " + " + b + " = " + (a+b);

        JOptionPane.showMessageDialog(null, output,"Show the result of A+B",JOptionPane.QUESTION_MESSAGE);
    }
   
}