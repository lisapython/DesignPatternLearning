package com.creationalPatterns.type6.Brige;

/**
 * 折叠手机
 */
public class FlodedPhone extends Phone {
    public FlodedPhone(Brand brand) {
        super(brand);
    }

    public void open(){
        super.open();
        System.out.println("折叠样式的手机开机");
    }

    public void close(){
        super.close();
        System.out.println("折叠样式的手机关机");
    }

    public void call(){
        super.call();
        System.out.println("折叠样式的手机打电话");
    }
}
