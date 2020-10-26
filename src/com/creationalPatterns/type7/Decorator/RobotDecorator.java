package com.creationalPatterns.type7.Decorator;

/**
 * 抽象装饰者角色
 *
 * 定义成抽象类也可以
 */
public class RobotDecorator implements Robot {

    private Robot robot;
    public RobotDecorator(Robot robot)
    {
        this.robot=robot;
    }

    @Override
    public void doSomthing() {
        robot.doSomthing();
    }

    public void doMorething(){
        robot.doSomthing();
        System.out.println("跳舞，拖地");
    }
}
