public class Banana extends Food {
    private int sweetLevel = 0;
    public Banana(int sweetLevel){
        super(40,1.2);
        this.sweetLevel = sweetLevel;
    }
    
    @Overrride
    public void getEat(){
        this.sweetLevel--;
    }

    @Overrride
    public int show(){
        return this.sweetLevel;
    }

    @Override
    public void print(){
        super.print();
        System.out.println("Sweet Level : " + sweetLevel);
    }
}