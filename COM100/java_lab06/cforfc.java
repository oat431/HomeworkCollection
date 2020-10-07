import javax.swing.JOptionPane;
public class cforfc{
    public static void main(String[] args){
        char type = JOptionPane.showInputDialog(null,"Select your convertion \n c for fahrenheit to celsius \n f for celsius to fahrenheit","choosing input type",JOptionPane.QUESTION_MESSAGE).toLowerCase().charAt(0);

        double temperature;

        if(type == 'c'){
            temperature = Double.parseDouble(JOptionPane.showInputDialog(null,"enter you temperature as a fahrenheit","fahrenheit to celsius",JOptionPane.CLOSED_OPTION));

            double celsius = (temperature - 32) * (5.0/9.0);

            JOptionPane.showMessageDialog(null, "your " + temperature + " in fahrenheit is " + celsius + " in celsius", "your temperature in celsius", JOptionPane.CLOSED_OPTION);
        }else if(type == 'f'){
            temperature = Double.parseDouble(JOptionPane.showInputDialog(null,"enter you temperature as a celsius","celsius to fahrenheit",JOptionPane.CLOSED_OPTION));

            double fahrenheit = ((9 * temperature)/5.0) + 32;

            JOptionPane.showMessageDialog(null, "your " + temperature + " in celsius is " + fahrenheit + " in fahrenheit", "your temperature in fahrenheit", JOptionPane.CLOSED_OPTION);

        }

        
    }
}