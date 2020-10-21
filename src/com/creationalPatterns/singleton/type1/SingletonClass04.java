package com.creationalPatterns.singleton.type1;

/**
 * 懒汉模式（线程安全,同步方法实现）
 */
public class SingletonClass04 {

    //1.给一个私有化的构造方法(防止new)
    private SingletonClass04(){}

    //2.本类内部创建对象实例
    private static SingletonClass04 instance;

    //3.提供一个静态的公有方法
    //  只有在使用到getInstance()方法的时候，才去创建instance
    //加一个synchronized关键字，保证线程安全
    public static synchronized SingletonClass04 getInstance(){
        if (instance == null){
            instance = new SingletonClass04();
        }
        return instance;
    }
}

class SingletonClassTest04{
    public static void main(String[] args) {
        SingletonClass04 ins1 = SingletonClass04.getInstance();
        SingletonClass04 ins2 = SingletonClass04.getInstance();
        System.out.println(ins1==ins2);//true 说明两个对象引用的是同一个内存地址,即【只有一个实例】
        System.out.println(ins1.hashCode());//356573597
        System.out.println(ins2.hashCode());//356573597
    }
}