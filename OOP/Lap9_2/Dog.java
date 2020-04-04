package app;
import java.util.ArrayList;
public class Dog extends Animal{
    public ArrayList<String> feel = new ArrayList<>();
    public Dog(){
        super(true,false);
    }

    @Override
    public void bark(){
        for(String i : feel){
            System.out.println(i);
        }
    }

    @Override
    public void eat(Food f){
        if(f.getClass().getName().equals("app.Banana") && !super.getIsEatBanana()){
            feel.add("I love Banana");
            super.setIsEatBanana(true);
        }else if(f.getClass().getName().equals("app.Banana") && super.getIsEatBanana()){
            feel.add("I hate banana I don't want it");
        }

        if(f.getClass().getName().equals("app.Bone") && !super.getIsEatBone()){
            feel.add("I Very love Bone");
            super.setIsEatBone(true);
        }else if(f.getClass().getName().equals("app.Bone") && super.getIsEatBone()){
            feel.add("Already eat bone I don't want it");
        }
    }


}