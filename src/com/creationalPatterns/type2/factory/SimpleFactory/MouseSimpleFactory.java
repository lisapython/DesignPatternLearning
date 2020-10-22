package com.creationalPatterns.type2.factory.SimpleFactory;

/**
 * 鼠标工厂（简单工厂类）
 */
public class MouseSimpleFactory {

    //简单工厂模式也叫静态工厂模式（static factory pattern）
    //把任务交给简单工厂类，来工厂类来生产相对应的实例
    public static Mouse makeMouses(String mousBrand){
        Mouse mouse = null;
        switch (mousBrand) {
            case "hp":
                //根据传入的内容创建实例
                mouse = new MouseHp();
                break;
            case "dell":
                mouse = new MouseDell();
                break;
            default:
                System.out.println("error");
        }
        return mouse;
    }
}
