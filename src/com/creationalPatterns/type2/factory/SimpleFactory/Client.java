package com.creationalPatterns.type2.factory.SimpleFactory;

/**
 * simple factory
 * 简单工厂模式：可以根据参数的不同返回不同类的实例，被创建的实例通常都具有共同的父类
 */
public class Client {

    public static void main(String[] args) {
        System.out.println("鼠标开始生产");
        MouseSimpleFactory mouseSimpleFactory = new MouseSimpleFactory();
        //创建了一个工厂类，这个类用来封装实例化对象。
        // 这些对象往往都有继承自同一个父类。
        Mouse mouse = mouseSimpleFactory.makeMouses("dell");
        mouse.makeMouse();
        System.out.println("鼠标生产完成");
    }
}
