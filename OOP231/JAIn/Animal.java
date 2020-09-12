public class Animal{
    private boolean isEatBanana;
    private boolean isEatBone;
    protected int food;
    public Animal(boolean isEatBanana, boolean isEatBone){
        this.isEatBanana = isEatBanana;
        this.isEatBone = isEatBone;
    }

    public void eat(Food a){
        System.out.println("Just is it and I love it");
    }

    public void setIsEatBanana(boolean update){
        this.isEatBanana = update;
    }

    public void setIsEatBone(boolean update){
        this.isEatBone = update;
    }

    public boolean getIsEatBanana(){
        return this.isEatBanana;
    }

    public boolean getIsEatBone(){
        return this.isEatBone;
    }

    public void bark(){System.out.println("something");}

    public void roar(){System.out.println("something");}

}