package com.company;

public class Tree{

    private double height;

    public Tree(){}

    public Tree(double height){
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    @Override
    public String toString() {
       
        return "this tree have " + String.format("%.2f", this.height) + " M ";
    }

}