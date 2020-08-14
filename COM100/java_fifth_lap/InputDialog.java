import javax.swing.JOptionPane;
public class InputDialog{
	public static void main(String[] args){
		String input = JOptionPane.showInputDialog(null,"Enter input","Input dialog demo",JOptionPane.QUESTION_MESSAGE);
		
		String output = "The input is " + input;
		JOptionPane.showMessageDialog(null,output);	
	}
}
