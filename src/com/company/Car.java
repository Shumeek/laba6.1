package com.company;

public class Car extends Vehicle {
    public Car(int id) {
        super(id);
    }

    @Override
    public void move(int id) {
        System.out.println("Машина номер " + (id+1) + " завела мотор и выехала");
    }
}
