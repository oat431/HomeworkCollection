import javax.swing.JOptionPane;
public class info {
    public static void main(String[] args) {
        String name = JOptionPane.showInputDialog(null, "What is your name","I need to know",JOptionPane.QUESTION_MESSAGE);
        double hour = Double.parseDouble(JOptionPane.showInputDialog(null, "How many hour you work on?","you tried of you work?",JOptionPane.QUESTION_MESSAGE));
        double payRate = Double.parseDouble(JOptionPane.showInputDialog(null, "How much do you gain per hour?","I need to know",JOptionPane.QUESTION_MESSAGE));
        double fTax =  Double.parseDouble(JOptionPane.showInputDialog(null, "How much you lose on state tax?","Hey don't be sad we all pay",JOptionPane.QUESTION_MESSAGE)) / 100;
        double sTax = Double.parseDouble(JOptionPane.showInputDialog(null, "How much you lose on fax tax","Your money is worth to lose to gov man",JOptionPane.QUESTION_MESSAGE)) / 100;

        double total = hour * payRate;

        double totalDeduct = (total * fTax) + (total * sTax);
        String output = "Employee's name : " + name +"\n" 
        + "Hour work:" + hour + "hour(s)" + "\n"
        + "Pay rate:$" + payRate + "\n"
        + "Groos pay:$" + total + "\n"

        + "Deductions:" + "\n"
        + "        Federal Tax(" + fTax*100 + "%):$" + total * fTax + "\n"
        + "        State Tax(" + sTax*100 + "%):$" + total * sTax + "\n"
        + "        Total Dedcution:$" + totalDeduct + "\n"
        + "Net Pay:$" + (total - totalDeduct) + "\n";

        JOptionPane.showMessageDialog(null, output, "here this is your result", JOptionPane.PLAIN_MESSAGE);
    }

}
