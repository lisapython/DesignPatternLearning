package com.creationalPatterns.type1.singleton;

/**
 * 饿汉模式（静态代码块）
 * ？？？和用静态常量实现的方式有什么区别？
 */
public class SingletonClass02 {

    //1.给一个私有化的构造方法(防止new)
    private SingletonClass02(){
    }

    //2.本类内部创建对象实例
    private static SingletonClass02 instance;

    //3.在静态代码块执行时创建单例对象。
    static {
        instance= new SingletonClass02();
    }

    //4.对外提供一个公有的静态方法，返回实例对象。
    public static SingletonClass02 getInstance(){
        return instance;
    }
}

class SingletonClassTest02{
    public static void main(String[] args) {
        SingletonClass02 ins1 = SingletonClass02.getInstance();
        SingletonClass02 ins2 = SingletonClass02.getInstance();
        System.out.println(ins1==ins2);//true 说明两个对象引用的是同一个内存地址,即【只有一个实例】
        System.out.println(ins1.hashCode());//356573597
        System.out.println(ins2.hashCode());//356573597
    }
}