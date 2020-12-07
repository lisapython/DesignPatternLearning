package com.creationalPatterns.type1.singleton;

/**
 * 枚举（能解决线程安全问题和懒加载问题）
 * ★推荐使用的单例模式
 */
public enum SingletonClass08 {
    INSTANCE;
    public void run(){
        System.out.println("ok");
    }
}


class SingletonClassTest08 {
    public static void main(String[] args) {
        SingletonClass08 ins1 = SingletonClass08.INSTANCE;
        SingletonClass08 ins2 = SingletonClass08.INSTANCE;
        System.out.println(ins1==ins2);//true 说明两个对象引用的是同一个内存地址,即【只有一个实例】
        System.out.println(ins1.hashCode());//356573597
        System.out.println(ins2.hashCode());//356573597
    }
}

