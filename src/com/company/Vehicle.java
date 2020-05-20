package com.company;

public abstract class Vehicle {
    protected int id;

    public abstract void move(int id);

    public Vehicle(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }
}
