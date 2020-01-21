package com.company;
import java.util.Random;
public class Basket {
    private Random rand = new Random();
    private int apple = 0;
    private int tomato = 0;
    private int orange = 0;
    private final int size = rand.nextInt(20) + 20;
    private Fruit[] fr = new Fruit[size];

    public Basket(){

        for(int i=0;i<size;i++){
            int n = rand.nextInt(3) + 1;
            int m = rand.nextInt(3) + 1;
            double cost = 0;
            String name = "";
            switch (n){
                case 1:
                    apple++;
                    cost = 2 + (7 - 2) * rand.nextDouble();
                    name += "Apple" + apple;
                    break;
                case 2:
                    orange++;
                    cost = 2 + (5 - 2) * rand.nextDouble();
                    name += "Orange" + orange;
                    break;
                case 3:
                    tomato++;
                    cost = 2 + (4 - 2) * rand.nextDouble();
                    name += "Tomato" + tomato;
                    break;
            }

            fr[i] = new Fruit(n,m,cost,name);
        }

    }

    public int getSize(){
        return this.size;
    }

    public double getCost(){
        double cost = 0;
        for(Fruit i : fr){
            cost += i.getCost();
        }
        return cost;
    }

    public void getType(){
        System.out.println("There are " + this.apple + " apple");
        System.out.println("There are " + this.orange + " orange");
        System.out.println("There are " + this.tomato + " tomato");

        System.out.println("here is a list");

        for(Fruit i : fr){
            System.out.println(i.toString());
        }
    }

}
