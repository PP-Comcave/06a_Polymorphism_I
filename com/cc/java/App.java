package com.cc.java;

public class App {

    public static void main(String[] args) {
        Drone drone = new Drone();
        Queen queen = new Queen();
        Worker worker = new Worker();

        poolObj(drone);
        poolObj(worker);
        poolObj(queen);

    }


    private static void output(String outputStr) {
        System.out.println(outputStr);
    }
    private static void poolObj(HoneyBee obj){
        output(obj.doYourJob());
        output(obj.fly());
    }

}

