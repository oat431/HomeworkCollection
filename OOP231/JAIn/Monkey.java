import java.util.ArrayList;
public class Monkey extends Animal{
    public ArrayList<String> feel = new ArrayList<>();
    private int b;
    public Monkey(Food b){
        super(false,false);
        this.b = b.show();
    }

    @Override
    public void roar(){
        System.out.println("Monkey:");
        for(String i : feel){
            System.out.println(i);
        }
        System.out.println("ate " + this.food + " banana");
        System.out.println("has " + this.b + " left");
    }

    @Override
    public void eat(Food f){
        if(f.getClass().getName().equals("Banana") && !super.getIsEatBanana()){
            feel.add("I love Banana");
            super.setIsEatBanana(true);
            this.b--;
            this.food++;
        }else if(f.getClass().getName().equals("Banana") && super.getIsEatBanana()){
            feel.add("Already eat banana I don't want it");
        }

        if(f.getClass().getName().equals("Bone") && !super.getIsEatBone()){
            feel.add("I hate Bone");
            super.setIsEatBone(true);
        }else if(f.getClass().getName().equals("Bone") && super.getIsEatBone()){
            feel.add("Already eat bone I don't want it");
        }
    }


}