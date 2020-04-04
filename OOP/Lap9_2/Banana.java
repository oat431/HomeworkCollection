package app;
public class Banana extends Food {
    private int sweetLevel = 0;
    public Banana(int sweetLevel){
        super(40,1.2);
        this.sweetLevel = sweetLevel;
    }

    @Override
    public void print(){
        super.print();
        System.out.println("Sweet Level : " + sweetLevel);
    }
}