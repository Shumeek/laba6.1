package com.company;

public class Server {
    // кількість транспортних засобів (ТЗ) кожного виду, що виїхали в місто
    private int[] countVehicles;
    // загальна кількість ТЗ, що виїхали в місто
    private int commonCountVehicles;
    // обмеження на кількість ТЗ, що одночасно виїхали в місто
    private int limitVehicle;
    // масив, що зберігає ТЗ будь-якого виду
    private Vehicle[] vehicles;

    // конструктор класу, параметр size – кількість видів ТЗ
    public Server (int size,int limit) {
        countVehicles = new int[size];
        vehicles = new Vehicle[limit];
        this.limitVehicle = limit;
    }

    // повертає обмеження на кількість ТЗ, що одночасно виїхали в місто
    public int getLimitVehicle () {
        return limitVehicle;
    }


    public int[] getCountVehicles() {
        return countVehicles;
    }

    // повертає загальну кількість ТЗ, що виїхали в місто
    public int getCurrentCountVehicle () {
        return commonCountVehicles;
    }

    // додає ТЗ до віртуальної бази
    public void addTransport (int numberVehicles, Vehicle vehicle, int id) {
        countVehicles[numberVehicles]++;
        vehicles [commonCountVehicles] = vehicle;
        vehicles[commonCountVehicles].move(id);
        commonCountVehicles ++;
    }

}
