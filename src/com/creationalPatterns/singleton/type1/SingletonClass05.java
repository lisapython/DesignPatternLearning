package com.creationalPatterns.singleton.type1;

/**
 * 懒汉模式（线程不安全,同步代码块实现）
 */
public class SingletonClass05 {
    //1.给一个私有化的构造方法(防止new)
    private SingletonClass05(){}

    //2.本类内部创建对象实例
    private static SingletonClass05 instance;

    //3.提供一个静态的公有方法
    //  只有在使用到getInstance()方法的时候，才去创建instance
    //加一个synchronized关键字，保证线程安全
    public static SingletonClass05 getInstance(){
        if (instance == null){
            //本意是想对懒汉模式同步方法进行改进，但是实际上并不能起到同步的作用
            //原因是if判断了instance是不是空，
            // 有那么种情况是两个线程几乎同时进入if判断里（那个时点instance正好没被赋值），
            // 第一个线程执行完new了，第二个线程还是会接着又new一个实例，
            // 违背了只有一个实例的初衷，所以说这种做法其实是完全无意义的。
            //实际开发中【不要】使用这种方式。
            synchronized (SingletonClass05.class){
                instance = new SingletonClass05();
            }
        }
        return instance;
    }
}
class SingletonClassTest05{
    public static void main(String[] args) {
        //不测了
    }
}