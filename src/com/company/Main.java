package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Random random = new Random();
        int num;
        Server serv = new Server(4, 20);

        Bicycle b;
        Car c;
        Roll r;
        Jumpers j;

        for (int i = 0; i < 20; i++) {
            num = random.nextInt(4);
            switch (num) {
                case 0:
                    c = new Car(i);
                    serv.addTransport(0, c, i);
                    break;
                case 1:
                    r = new Roll(i);
                    serv.addTransport(1, r, i);
                    break;
                case 2:
                    b = new Bicycle(i);
                    serv.addTransport(2, b, i);
                    break;
                case 3:
                    j = new Jumpers(i);
                    serv.addTransport(3, j, i);
                    break;
            }
        }

        int veh[] = serv.getCountVehicles();
        System.out.println("Велосипедов: " + veh[0]);
        System.out.println("Машин:       " + veh[1]);
        System.out.println("Роликов:     " + veh[2]);
        System.out.println("Джамперов:   " + veh[3]);
        // write your code here


    }
}
