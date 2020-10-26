package com.creationalPatterns.type11.Proxy;

//和真正的目标类实现同一个接口，目的是实现多态。
//它还可以自定义before和after方法做网络连接的建立，Io流的建立，日志记录，以及结果解析等等工作
public class RealSubjectProxy implements Subject{

    private RealSubject realSubject;
    //建立代理类和目标类的关联关系
    public RealSubjectProxy()  {
        try{
            this.realSubject = (RealSubject) this.getClass().getClassLoader().loadClass("com.creationalPatterns.type11.Proxy.RealSubject").newInstance();
        }catch (Exception e){
            e.printStackTrace();
        }

    }

    @Override
    public void doWork() {
        connect();
        realSubject.doWork();
        log();
    }

    //添加一些方法
    public void connect(){
        System.out.println("Connect Start");
    }

    //添加一些方法
    public void log(){
        System.out.println("create log");
    }
}
