package com.creationalPatterns.type6.Brige;

public class Client {

    public static void main(String[] args) {
        //获取折叠式手机
        Phone p = new FlodedPhone(new Xiaomi());
        p.open();
        p.close();
        p.call();

        System.out.println("=====================");
        //获取折叠式手机
        Phone p2 = new FlodedPhone(new Vivo());
        p2.open();
        p2.close();
        p2.call();
    }

}
