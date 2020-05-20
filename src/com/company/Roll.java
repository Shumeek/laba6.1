package com.company;

public class Roll extends Vehicle{
    public Roll(int id) {
        super(id);
    }
    @Override
    public void move(int id) {
        System.out.println("Ролики под номером " + (id+1) + " покатились");
    }
}