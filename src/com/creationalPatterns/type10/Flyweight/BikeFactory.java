package com.creationalPatterns.type10.Flyweight;

import java.util.HashSet;
import java.util.Set;

//享元工厂类；
// 是一个“单车工厂”，他类似于池的概念，有人借车，就给他一个车，归还了就还放在池子里，等待被借出去。
// 单例模式实现
public class BikeFactory {

    //声明一个单车的池子
    private Set<ShareBike> bikePool = new HashSet<>();

    //单例模式
    private BikeFactory(){
        for(int i=0;i<2;i++){
            bikePool.add(new Bike(i+"号"));
        }
    }

    private static BikeFactory instance = new BikeFactory();

    public static BikeFactory getInstance(){
        return instance;
    }

    public ShareBike getBike(){
        for(ShareBike bike:bikePool){
            if (bike.state==0){
                return bike;
            }
        }
        return null;
    }


}
