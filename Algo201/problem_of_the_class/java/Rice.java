import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.Arrays;
class Product implements Comparable<Product>{
    private int p;
    private int q;
    private double perKg;
    public Product(int p,int q){
        this.p = p;
        this.q = q;
        this.perKg = (double)this.p / (double)this.q;
    }

    public int getQ(){
        return this.q;
    }

    public double perKg(){
        return this.perKg;
    }

    public void takeOut(int i){
        this.q -= i;
    }

    public int takeOutTil0(){
        int temp = this.q;
        this.q -= this.q;
        return temp;
    }

    public boolean isRunOut(int i){
        return this.q - i <= 0;
    }

    public int compareTo(Product cmp) {
        return this.perKg() > cmp.perKg() ? 1 : this.perKg() < cmp.perKg() ? -1 : 0;
    }
}
public class Rice {
    private static final BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) throws IOException {
        int k = Integer.parseInt(in.readLine()); 
        Product[] rice = new Product[k];
        for(int i=0;i<k;i++){
            String[] input = in.readLine().split(" ");
            rice[i] = new Product(Integer.parseInt(input[0]),Integer.parseInt(input[1]));
        }
        Arrays.sort(rice);
        
        int m = Integer.parseInt(in.readLine()); 
        int[] b = new int[m]; // farmer
        int[] amt = new int[m];
        for(int i=0;i<m;i++){
            b[i] = Integer.parseInt(in.readLine());
        }
        
        int que = 0;
        while(que < m){
            if(b[que] < rice[que].getQ()){
                amt[que] += b[que] * rice[que].perKg();
                rice[que].takeOut(b[que]);
                b[que] = 0;
            }else if(b[que] > rice[que].getQ()){
                if(b[que] - rice[que].getQ() < 0){
                    int temp = rice[que].takeOutTil0();   
                    amt[que] += temp * rice[que].perKg();
                    b[que] = b[que] - temp;
                }else{
                    
                }
            }


        }
    }    
}
