package com.creationalPatterns.singleton.type1;

/**
 * 饿汉模式（静态常量）
 */
public class SingletonClass {
    //1.给一个私有化的构造方法
    private SingletonClass(){
    }

    //2.本类内部创建对象实例
    private final static SingletonClass instance = new SingletonClass();

    //3.对外提供一个公有的静态方法，返回实例对象。
    public static SingletonClass getInstance(){
        return instance;
    }
}

class SingletonClassTest01{
    public static void main(String[] args) {
        SingletonClass ins1 = SingletonClass.getInstance();
        SingletonClass ins2 = SingletonClass.getInstance();
        System.out.println(ins1==ins2);
    }
}