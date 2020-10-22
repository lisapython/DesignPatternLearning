package com.creationalPatterns.type2.factory.Factory;

/**
 * 只生产 惠普鼠标的工厂
 */
public class MouseHpFactory extends MouseFactory {

    @Override
    public Mouse createMouse() {
        return new MouseHp();
    }
}
