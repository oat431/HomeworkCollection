public class Food{
    
    private int cost = 0;
    private double weight = 0.0;
    
    public Food(int cost, double weight){
        this.cost = cost;
        this.weight = weight;
    }

    public void getEat(){
        System.out.print("WIWW");
    }

    public int show(){
        System.out.print("eiei");
        return 0;
    }

    public void print(){
        System.out.println("Cost: " + cost);
        System.out.println("Weight: " + weight);
    }
}