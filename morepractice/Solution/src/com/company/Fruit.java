package com.company;

public class Fruit {
    private String color;
    private String taste;
    private int price;

    public Fruit(String color, String taste, int price){
        this.color = color;
        this.taste = taste;
        this.price  = price;
    }

    public Fruit(){}

    public Fruit(String color, int price){
        this.color = color;
        this.price = price;
    }

    public void setColor(String color){
        this.color = color;
    }

    public void setTaste(String taste){
        this.taste = taste;
    }

    public void setPrice(int price){
        this.price = price;
    }

    public String getColor(){
        return this.color;
    }

    public String getTaste(){
        return this.taste;
    }

    public int getPrice(){
        return this.price;
    }

    @Override
    public String toString() {
        return "Fruit{" +
                "color='" + color + '\'' +
                ", taste='" + taste + '\'' +
                ", price=" + price +
                '}';
    }
}
