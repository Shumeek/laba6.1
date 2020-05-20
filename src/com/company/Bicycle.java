package com.company;

public class Bicycle extends Vehicle{
    public Bicycle(int id) {
        super(id);
    }

    @Override
    public void move(int id) {
        System.out.println("Велосипед номер " + (id+1) + " покрутил свои педали.");
    }
}
