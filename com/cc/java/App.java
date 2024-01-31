package com.cc.java;

public class App {

    public static void main(String[] args) {
        Drone drone = new Drone();
        Queen queen = new Queen();
        Worker worker = new Worker();

        output(queen.doYourJob());
        output(drone.doYourJob());
        output(worker.doYourJob());
        output(queen.fly());
        output(drone.fly());
        output(worker.fly());

    }


    private static void output(String outputStr) {
        System.out.println(outputStr);
    }


}

