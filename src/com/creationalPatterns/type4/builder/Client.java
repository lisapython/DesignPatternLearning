package com.creationalPatterns.type4.builder;

/**
 * 建造者模式
 */
public class Client {
    public static void main(String[] args) {
        //House h = new House();
        HouseBuilder builder = new CommonHouseBuilder();
        HouseDirecter d = new HouseDirecter(builder);
        d.createHouse();
    }
}
