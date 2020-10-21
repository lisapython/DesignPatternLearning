package com.creationalPatterns.singleton.type1;

/**
 * 饿汉模式（静态常量）
 */
public class SingletonClass01 {
    //1.给一个私有化的构造方法(防止new)
    private SingletonClass01(){
    }

    //2.本类内部创建对象实例
    private final static SingletonClass01 instance = new SingletonClass01();

    //3.对外提供一个公有的静态方法，返回实例对象。
    public static SingletonClass01 getInstance(){
        return instance;
    }
}

class SingletonClassTest01{
    public static void main(String[] args) {
        SingletonClass01 ins1 = SingletonClass01.getInstance();
        SingletonClass01 ins2 = SingletonClass01.getInstance();
        System.out.println(ins1==ins2);//true 说明两个对象引用的是同一个内存地址,即【只有一个实例】
        System.out.println(ins1.hashCode());//356573597
        System.out.println(ins2.hashCode());//356573597
    }
}