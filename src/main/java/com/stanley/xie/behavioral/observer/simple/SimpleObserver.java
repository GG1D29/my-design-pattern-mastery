package com.stanley.xie.behavioral.observer.simple;

public class SimpleObserver implements Observer {
    private int value;

    public SimpleObserver(Subject simpleSubject) {
        simpleSubject.registerObserver(this);
    }

    @Override
    public void update(int value) {
        this.value = value;
        display();
    }

    public void display() {
        System.out.println("Value: " + value);
    }
}
