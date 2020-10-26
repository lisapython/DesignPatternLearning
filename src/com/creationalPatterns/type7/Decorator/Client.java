package com.creationalPatterns.type7.Decorator;

public class Client {
    public static void main(String[] args) {
        new RobotDecorator(new FirstRobot()).doMorething();
    }
}
