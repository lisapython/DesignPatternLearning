package com.creationalPatterns.type11.Proxy;

public class Client {

    public static void main(String[] args) throws Exception {
        //或者通过参数把RealSubject聚合到RealSubjectProxy类的构造方法里面。
        new RealSubjectProxy().doWork();
    }
}
