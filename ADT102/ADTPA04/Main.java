import java.awt.*;
import java.awt.font.*;
import java.awt.geom.*;
import java.io.File;
import java.util.Scanner;
import javax.swing.*;

public class Main extends JPanel {
    static double[] data = new double[397];
    static double[] avg = new double[397];
    final int PAD = 20;

    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D)g;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
                RenderingHints.VALUE_ANTIALIAS_ON);
        int w = getWidth();
        int h = getHeight();
        // Draw Y axsis
        g2.draw(new Line2D.Double(PAD, PAD, PAD, h-PAD));
        // Draw x axsis
        g2.draw(new Line2D.Double(PAD, h-PAD, w-PAD, h-PAD));

        // write y lebel.
        Font font = g2.getFont();
        FontRenderContext frc = g2.getFontRenderContext();
        LineMetrics lm = font.getLineMetrics("0", frc);
        float sh = lm.getAscent() + lm.getDescent();
        String s = "Electricity Consumption";
        float sw = (float) font.getStringBounds(s, frc).getWidth();
        float sx = (PAD - sw) / 2;
        float sy = PAD + ((h - 2*PAD) - s.length()*sh)/2 + lm.getAscent();
        g2.drawString(s, sx, sy);

        // write x lebel.
        s = "Time";
        sy = h - PAD + (PAD - sh) / 2 + lm.getAscent();
        sx = (w - sw)/2;
        g2.drawString(s, sx, sy);

        // Draw graph.
        double xInc = (double)(w - 2*PAD)/(data.length-1);
        double scale = (double)(h - 2*PAD)/getMax();
        for(int i = 0; i < data.length-1; i++) {
            g2.setPaint(Color.green.darker());
            double x1 = PAD + i*xInc;
            double y1 = h - PAD - scale*data[i];
            double x2 = PAD + (i+1)*xInc;
            double y2 = h - PAD - scale*data[i+1];
            g2.draw(new Line2D.Double(x1, y1, x2, y2));
            if(avg[i] != 0){
                g2.setPaint(Color.red);
                double y1avg = h - PAD - scale*avg[i];
                double x2avg = PAD + (i+1)*xInc;
                double y2avg = h - PAD - scale*avg[i+1];
                g2.draw(new Line2D.Double(x1,y1avg,x2avg,y2avg));
            }
        }
    }

    //control height and width a window
    private int getMax() {
        int max = -Integer.MAX_VALUE;
        for (double datum : data) {
            if (datum > max)
                max = (int) datum;
        }
        return max;
    }

    //read the data from csv file
    private static void genData(){
        try{
            File f = new File("D:\\Work_and_Picture\\elearning cmu\\953\\ADT102\\Electric_consumption.csv");
            Scanner in = new Scanner(f);
            in.nextLine();
            int index = 0;

            while(in.hasNextLine()){
                String dabs = in.nextLine();
                data[index] = Double.parseDouble(dabs.split("[,]")[1]);
                avg[index] = Double.parseDouble(dabs.split("[,]")[2]);
                index++;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    //drive code
    public static void main(String[] args){
        genData();
        JFrame f = new JFrame();
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.add(new Main());
        f.setTitle("ADT04 Sahachan Tippimwong ");
        f.setSize(400,400);
        f.setLocation(200,200);
        f.setVisible(true);
    }
}