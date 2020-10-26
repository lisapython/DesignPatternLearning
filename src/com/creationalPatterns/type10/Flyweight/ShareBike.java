package com.creationalPatterns.type10.Flyweight;

//内部状态类：
//享元模式中需要关注的类，池也是在控制内部状态
//拿共享单车的例子来说就是大家共享单车时，单车只有被借出去和归还了两个状态，
// 这两个状态是不会变的（大部分情况下），我们只关注这一部分状态。
public abstract class ShareBike {

    //内部状态
    protected Integer state = 0;

    //username外部状态
    abstract void ride(String userName);
    abstract void back();

    public Integer getState(){
        return state;
    }
}
