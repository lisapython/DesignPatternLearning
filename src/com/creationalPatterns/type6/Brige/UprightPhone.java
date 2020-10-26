package com.creationalPatterns.type6.Brige;

/**
 * 翻盖手机
 */
public class UprightPhone extends Phone {
    public UprightPhone(Brand brand) {
        super(brand);
    }

    public void open(){
        super.open();
        System.out.println("翻盖样式的手机开机");
    }

    public void close(){
        super.close();
        System.out.println("翻盖样式的手机关机");
    }

    public void call(){
        super.call();
        System.out.println("翻盖样式的手机打电话");
    }
}
