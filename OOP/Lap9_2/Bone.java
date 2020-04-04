package app;
public class Bone extends Food {
    private boolean badSmell;
    public Bone(boolean badSmell){
        super(0,3.0);
        this.badSmell= badSmell;
    }

    @Override
    public void print(){
        super.print();
        System.out.println("Smell : " + (badSmell? "bad":"good"));
    }
}