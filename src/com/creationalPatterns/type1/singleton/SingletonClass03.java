package com.creationalPatterns.type1.singleton;

/**
 * 懒汉模式（线程不安全）
 * 1.只有在使用到getInstance方法的时候，才去new，这就是懒汉式。
 * 2.优点是有懒加载效果，用到的时候才去加载，但是只能在单线程下使用
 * 3.在多线程情况下，如果多条线程几乎同时进入了if(instance==null)判断，同时去new了对象，那么这个时候就会产生多个实例，所以在多线程情况下不可以使用这种方式。
 * 4.实际开发中不要用
 */
public class SingletonClass03 {
    //1.给一个私有化的构造方法(防止new)
    private SingletonClass03(){}

    //2.本类内部创建对象实例
    private static SingletonClass03 instance;

    //3.提供一个静态的公有方法
    //  只有在使用到getInstance()方法的时候，才去创建instance
    public static SingletonClass03 getInstance(){
        if (instance == null){
            instance = new SingletonClass03();
        }
        return instance;
    }

}

class SingletonClassTest03{
    public static void main(String[] args) {
        SingletonClass03 ins1 = SingletonClass03.getInstance();
        SingletonClass03 ins2 = SingletonClass03.getInstance();
        System.out.println(ins1==ins2);//true 说明两个对象引用的是同一个内存地址,即【只有一个实例】
        System.out.println(ins1.hashCode());//356573597
        System.out.println(ins2.hashCode());//356573597
    }
}