package com.company;

public class Jumpers extends Vehicle{
    public Jumpers(int id) {
        super(id);
    }

    @Override
    public void move(int id) {
        System.out.println("Джамеры под номером " + (id+1) + " поскакали");
    }
}
