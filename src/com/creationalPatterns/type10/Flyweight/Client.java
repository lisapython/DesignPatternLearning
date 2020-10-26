package com.creationalPatterns.type10.Flyweight;

public class Client {

    public static void main(String[] args) {
        ShareBike bike1 = BikeFactory.getInstance().getBike();
        bike1.ride("sam");
        //还未归还
        //bike1.back();

        ShareBike bike2 = BikeFactory.getInstance().getBike();
        bike2.ride("Tom");
        //已归还
        bike2.back();

        ShareBike bike3 = BikeFactory.getInstance().getBike();
        bike3.ride("Jerry");
        bike3.back();

        System.out.println(bike1==bike2);
        System.out.println(bike2==bike3);



    }
}
