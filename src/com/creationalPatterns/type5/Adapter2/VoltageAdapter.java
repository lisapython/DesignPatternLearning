package com.creationalPatterns.type5.Adapter2;

public class VoltageAdapter implements IVoltage5v {

    private Voltage220v voltage220v;

    public VoltageAdapter(Voltage220v voltage220v){
        this.voltage220v = voltage220v;
    }

    @Override
    public int output5v() {
        int dst=0;
        if(null != voltage220v){
            //获取220v的电压
            int src = voltage220v.output();
            dst = src / 44;
            System.out.println("输出电压为"+dst);
        }
        return dst;
    }
}
