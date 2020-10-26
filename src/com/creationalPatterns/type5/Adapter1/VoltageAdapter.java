package com.creationalPatterns.type5.Adapter1;

public class VoltageAdapter extends Voltage220v implements IVoltage5v{
    @Override
    public int output5v() {
        //先获取到220v的电压
        int elec = output();
        int target = elec / 44;
        return target;
    }
}
