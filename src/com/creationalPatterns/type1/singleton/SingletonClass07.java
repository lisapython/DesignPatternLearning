package com.creationalPatterns.type1.singleton;

/**
 * 通过静态内部类来实现单例模式
 * ★推荐使用的单例模式
 */
public class SingletonClass07 {
    //1.给一个私有化的构造方法(防止new)
    private SingletonClass07(){}
    //2.声明一个静态内部类，并且在类的内部声明一个静态常量用来存放instance实例
    //静态内部类：
    //      1).SingletonClass07被装载的时候，静态内部类是不会被装载的；
    //      2).只有在调用getInstance()方法的时候，才会被装载。当类装载的时候，线程是安全的。
    private static class SingletonInstance{
        private static final SingletonClass07 INSTANCE = new SingletonClass07();
    }
    //3.方法被调用的时候去取内部类的实例
    public SingletonClass07 getInstance(){
        return SingletonInstance.INSTANCE;
    }
}
