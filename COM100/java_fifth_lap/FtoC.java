import javax.swing.JOptionPane;
public class FtoC {
    public static void main(String[] args){
        String input = JOptionPane.showInputDialog(null,"plz give me your fahrentheit","F to C if you need me", JOptionPane.QUESTION_MESSAGE);

        double fahrentheit = Double.parseDouble(input);

        double celsius = (fahrentheit - 32) * (5.0/9.0);
        
        String output = "your fahrenheit that has temperature as " + fahrentheit + "\n is " + celsius + " celsius temperature";        

        JOptionPane.showMessageDialog(null,output, "my celsius",JOptionPane.DEFAULT_OPTION);
        
    }
}