package com.company;

public class Fruit {
    private String type;
    private String name;
    private String color;
    private double cost;

    public Fruit(){}

    public Fruit(int n, int m, double cost, String name ){
        switch (n){
            case 1:
                this.type = "Apple";
                break;
            case 2:
                this.type = "Orange";
                break;
            case 3:
                this.type = "Tomato";
                break;
        }

        switch (m){
            case 1:
                this.color = "Purple";
                break;
            case 2:
                this.color = "Red";
                break;
            case 3:
                this.color = "Green";
                break;
        }
        this.cost = cost;
        this.name = name;
    }

    public double getCost(){
        return this.cost;
    }

    @Override
    public String toString() {
        return "Fruit{" +
                "type='" + this.type + '\'' +
                ", name='" + this.name + '\'' +
                ", color='" + this.color + '\'' +
                ", cost=" + String.format("%.2f",this.cost) +
                '}';
    }
}
