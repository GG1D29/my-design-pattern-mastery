package com.stanley.xie.creational.abstractfactory;

public class UserInterface {

    private Button button;
    private ScrollBar scrollBar;

    public UserInterface(Button button, ScrollBar scrollBar) {
        this.button = button;
        this.scrollBar = scrollBar;
    }

    public Button getButton() {
        return button;
    }

    public ScrollBar getScrollBar() {
        return scrollBar;
    }

}
