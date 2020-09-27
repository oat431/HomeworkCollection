import javax.swing.JOptionPane;
import java.text.DecimalFormat;
import java.lang.Math;
public class trigo{
	public static void main(String[] args){
		String[] triFunction = {"sine","consine","tangent","hyperbolic sine","hyperbolic consin","hyperbolic tan","cancel"};
		int choice = JOptionPane.showOptionDialog(null, "Please select function below", "Trigonometric function",JOptionPane.INFORMATION_MESSAGE,JOptionPane.CLOSED_OPTION, null,triFunction, "cancel");	
		double input = 0.0;
		DecimalFormat de = new DecimalFormat("0.##");	
		switch(choice){
			case 0:
				input = Double.parseDouble(JOptionPane.showInputDialog(null, "You choose the sin function please input your degree"));
				JOptionPane.showMessageDialog(null,input + " degree in sine function is " + de.format(Math.sin(input)),"Sine function", JOptionPane.INFORMATION_MESSAGE);
				break;
			case 1:
				input = Double.parseDouble(JOptionPane.showInputDialog(null, "You choose the cosin function please input your degree"));
				JOptionPane.showMessageDialog(null,input + " degree in cosine function is " + de.format(Math.cos(input)),"Cosine function", JOptionPane.INFORMATION_MESSAGE);
				break;
			case 2:
				input = Double.parseDouble(JOptionPane.showInputDialog(null, "You choose the tan function please input your degree"));
				JOptionPane.showMessageDialog(null,input + " degree in tangle function is " + de.format(Math.tan(input)),"Tangle function", JOptionPane.INFORMATION_MESSAGE);
				break;
			case 3:
				input = Double.parseDouble(JOptionPane.showInputDialog(null, "You choose the sinh function please input your degree"));
				JOptionPane.showMessageDialog(null,input + " degree in hyperbolic sine function is " + de.format(Math.sinh(input)),"Hyperbolic Sine function", JOptionPane.INFORMATION_MESSAGE);
				break;
			case 4:
				input = Double.parseDouble(JOptionPane.showInputDialog(null, "You choose the cosh function please input your degree"));
				JOptionPane.showMessageDialog(null,input + " degree in hyperbolic cos function is " + de.format(Math.cosh(input)),"Hyperbolic cos function", JOptionPane.INFORMATION_MESSAGE);
				break;
			case 5:
				input = Double.parseDouble(JOptionPane.showInputDialog(null, "You choose the tanh function please input your degree"));
				JOptionPane.showMessageDialog(null,input + " degree in hyperbolic tangel function is " + de.format(Math.tanh(input)),"Hyperbolic tangle function", JOptionPane.INFORMATION_MESSAGE);
				break;
			default:
				JOptionPane.showMessageDialog(null, "you don't choose any function", "thank you", JOptionPane.INFORMATION_MESSAGE);
		}		
	}
}
