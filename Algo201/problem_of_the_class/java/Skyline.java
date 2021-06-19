import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

class Buidling {
    private int leftPosition;
    private int rightPosition;
    private int high;

    public Buidling(int l, int h, int r) {
        this.leftPosition = l;
        this.high = h;
        this.rightPosition = r;
    }

    public int getHigh() {
        return this.high;
    }

    public int getRightPosition() {
        return this.rightPosition;
    }

    public int getLeftPosition() {
        return this.leftPosition;
    }
}

public class Skyline {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(in.readLine());
        Buidling[] city = new Buidling[t];

        for (int i = 0; i < t; i++) {
            String[] input = in.readLine().split(" ");
            city[i] = new Buidling(Integer.parseInt(input[0]), Integer.parseInt(input[1]), Integer.parseInt(input[2]));
        }

        int cityBouder = city[0].getRightPosition();

        for(Buidling b : city){
            if(cityBouder < b.getRightPosition()){
                cityBouder = b.getRightPosition();
            }
        }

        int[] newcity = new int[cityBouder+2];

        for (int i = 0; i < t; i++) {
            for (int j = city[i].getLeftPosition(); j < city[i].getRightPosition(); j++) {
                newcity[j] = newcity[j] > city[i].getHigh() ? newcity[j] : city[i].getHigh();
            }
        }
        
        int oldHigh = 0;
        
        for (int i = 0; i <= cityBouder; i++) {
            if (oldHigh != newcity[i]) {
                System.out.print(i + " " + newcity[i] + " ");
                oldHigh = newcity[i];
            }
        }

        in.close();
    }
}