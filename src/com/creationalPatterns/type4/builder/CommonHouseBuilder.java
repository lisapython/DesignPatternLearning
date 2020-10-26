package com.creationalPatterns.type4.builder;

public class CommonHouseBuilder extends HouseBuilder{
    @Override
    public void buildBasic() {
        System.out.println("建普通的房子，打地基");
    }

    @Override
    public void buildWall() {
        System.out.println("建普通的房子，刷墙");
    }

    @Override
    public void buildRoof() {
        System.out.println("建普通的房子，建屋顶");
    }
}
