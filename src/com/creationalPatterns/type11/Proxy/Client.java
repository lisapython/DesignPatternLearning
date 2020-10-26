package com.creationalPatterns.type11.Proxy;

public class Client {

    public static void main(String[] args) throws Exception {
        new RealSubjectProxy().doWork();
    }
}
