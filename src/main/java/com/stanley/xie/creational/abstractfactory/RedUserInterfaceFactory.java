package com.stanley.xie.creational.abstractfactory;

public class RedUserInterfaceFactory implements UserInterfaceFactory {
    @Override
    public Button createButton() {
        return new RedButton();
    }

    @Override
    public ScrollBar createScrollBar() {
        return new RedScrollBar();
    }
}
