package com.creationalPatterns.type7.Decorator;

/**
 * 第一代机器人
 * 角色：具体构件（ConcreteComponent）
 * 可以认为是原本需要拓展的组件。
 * 在这里实现Robot抽象构件
 */
public class FirstRobot implements Robot {

    @Override
    public void doSomthing() {
        System.out.println("唱歌");
        System.out.println("对话");
    }


}
