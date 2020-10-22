package com.creationalPatterns.type2.factory.Factory;

/**
 * factory pattern
 * 工厂方法模式
 *与简单工厂模式相比，工厂方法模式更偏向于“用什么工厂生产什么东西”
 * 比如：
 * 我们已经有了个拖拉机工厂，想要生产口罩
 * 这个时候不可能把拖拉机工厂进行改造，做成又能生产拖拉机又能生产口罩的工厂啊！（简单工厂模式——通过ifelse判断去生产什么产品）
 * 所以干脆重开一条生产线，专门生产口罩，而拖拉机工厂保持原貌。（工厂模式--通过分成不同工厂去处理）
 *
 * 这个类相当于一个客户端
 */
public class Client {

    public static void main(String[] args) {

        //用dell鼠标工厂类实例化工厂类接口/抽象类
        MouseFactory factory = new MouseDellFactory();
        //用dell鼠标工厂类生产dell鼠标
        Mouse mouse = factory.createMouse();
        mouse.makeMouse();
    }
}
