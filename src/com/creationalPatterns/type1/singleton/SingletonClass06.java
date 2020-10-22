package com.creationalPatterns.singleton.type1;

/**
 * 双重检查（能解决线程安全问题和懒加载问题）
 * ★推荐使用的单例模式
 */
public class SingletonClass06 {
    //1.给一个私有化的构造方法(防止new)
    private SingletonClass06(){}

    //2.使用关键字来描述instance。
    // 关键字：volatile[ˈvɒlətaɪl] 易变的，不稳定的
    private static volatile SingletonClass06 instance;

    //3.在使用synchronized关键字的同时进行两次if判断，
    // 务必保证instance是在没有被实例化的情况下实例化。
    public static SingletonClass06 getInstance(){
        if (instance == null){
            synchronized (SingletonClass05.class){
                if (instance == null) {
                    instance = new SingletonClass06();
                }
            }
        }
        return instance;
    }
}
class SingletonClassTest06{
    public static void main(String[] args) {
        SingletonClass06 ins1 = SingletonClass06.getInstance();
        SingletonClass06 ins2 = SingletonClass06.getInstance();
        System.out.println(ins1==ins2);//true 说明两个对象引用的是同一个内存地址,即【只有一个实例】
        System.out.println(ins1.hashCode());//356573597
        System.out.println(ins2.hashCode());//356573597
    }
}