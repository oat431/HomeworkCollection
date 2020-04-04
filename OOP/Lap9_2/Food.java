package app;
public class Food{
    
    private int cost = 0;
    private double weight = 0.0;
    
    public Food(int cost, double weight){
        this.cost = cost;
        this.weight = weight;
    }

    public void print(){
        System.out.println("Cost: " + cost);
        System.out.println("Weight: " + weight);
    }
}