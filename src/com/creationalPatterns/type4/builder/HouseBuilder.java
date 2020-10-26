package com.creationalPatterns.type4.builder;

/**
 * Builder里面定义好具体的制作流程（房子虽然有很多种，但是制作流程都一样）
 */
public abstract class HouseBuilder {
    public abstract void buildBasic();
    public abstract void buildWall();
    public abstract void buildRoof();
}
