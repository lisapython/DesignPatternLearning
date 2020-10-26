package com.creationalPatterns.type5.Adapter2;

public class Phone {

    //充电方法充电
    public void charging(IVoltage5v iVoltage5v){
        if(iVoltage5v.output5v()==5){
            System.out.println("--电压5v，可以充电--");
        }else {
            System.out.println("--error--");
        }
    }
}
