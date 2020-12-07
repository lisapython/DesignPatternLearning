package com.creationalPatterns.type11.Proxy;

//真正的目标类
public class RealSubject implements Subject{
    @Override
    public void doWork() {
        System.out.println("真正的去干活儿了");
    }
}
