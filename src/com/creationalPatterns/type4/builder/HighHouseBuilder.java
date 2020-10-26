package com.creationalPatterns.type4.builder;

public class HighHouseBuilder extends HouseBuilder{
    @Override
    public void buildBasic() {
        System.out.println("建高房子，打地基");
    }

    @Override
    public void buildWall() {
        System.out.println("建高房子，刷墙");
    }

    @Override
    public void buildRoof() {
        System.out.println("建高房子，建屋顶");
    }
}
