package com.creationalPatterns.type5.Adapter2;

/**
 * 被适配对象
 */
public class Voltage220v {

    //输出220v电压
    public int output(){
        int elec = 220;
        System.out.println("--电压"+elec+"输出--");
        return elec;
    }
}
