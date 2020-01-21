package com.company;

public class Main {

    public static void main(String[] args) {
        Basket oat = new Basket();
        System.out.println(oat.getSize());
        System.out.println(String.format("%.2f",oat.getCost()));
        oat.getType();
    }
}
