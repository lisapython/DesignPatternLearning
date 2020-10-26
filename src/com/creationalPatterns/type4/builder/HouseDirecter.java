package com.creationalPatterns.type4.builder;

/**
 * 当逻辑十分复杂的时候，建议把builder和director分开，
 * 以实现构建和装配的解耦。
 */
public class HouseDirecter {

    private HouseBuilder builder;
    public HouseDirecter(HouseBuilder builder){
        this.builder = builder;
    }

    public void createHouse(){
        builder.buildBasic();
        builder.buildWall();
        builder.buildRoof();
    }

}
