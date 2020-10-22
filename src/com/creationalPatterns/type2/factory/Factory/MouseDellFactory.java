package com.creationalPatterns.type2.factory.Factory;

/**
 *只生产 dell鼠标的工厂
 */
public class MouseDellFactory extends MouseFactory {

    @Override
    public Mouse createMouse() {
        return new MouseDell();
    }
}
