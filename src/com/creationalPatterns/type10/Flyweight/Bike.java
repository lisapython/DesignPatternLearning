package com.creationalPatterns.type10.Flyweight;

//外部状态类：
//拿共享单车的例子来说就是大家共享单车时，被谁借了这部分我们管不着，
// 也不去管，或者就是client来处理。
public class Bike extends ShareBike {

    //定义新的内部状态，车号
    private String bikeId;

    public Bike(String bikeId){
        this.bikeId = bikeId;
    }

    @Override
    void ride(String userName) {
        state = 1;
        System.out.println(userName +"骑 "+bikeId+"号自行车出行！");
    }

    @Override
    void back() {
        state = 0;
    }
}
