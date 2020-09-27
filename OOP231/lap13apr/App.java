import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
class Except{
    public void findException() throws IOException{
        int ch;
        try{
            FileInputStream fis = new FileInputStream("test.bat");
            while((ch=fis.read()) != -1){
                System.out.print((char) ch);
            }
            div(3,0);
            printArray("A","B","C");
            printValue("Hello world");
        }catch(FileNotFoundException e){
            System.out.println("Not found flie name "+e.getMessage());
        }catch(ArithmeticException e){
            System.out.println("Aritmetic error type: "+e.getMessage());
        }catch(IndexOutOfBoundsException e){
            System.out.println("it cause error bacause "+e.getMessage());
        }catch(NullPointerException e){
            System.out.println("The value of the String is "+e.getMessage());
        }
        finally {
            System.out.println("Congratulation This is end process");
        }
        
    }

    private double div(int x,int y){
        return x/y;
    }

    private void printArray(String ...x){
        for(int i=0;i<=x.length;i++){
            String string = x[i];
            System.out.println(string);
        }
    }

    private void printValue(String value){
        value = null;
        System.out.println(value.toString());
    }
}
public class App{
    public static void main(String[] args) throws Exception{
        Except ex = new Except();
        ex.findException();
    }
}