package com.stanley.xie.behavioral.observer.simple;

import java.util.ArrayList;
import java.util.List;

public class SimpleSubject implements Subject {
    private final List<Observer> observers;
    private int value;

    public SimpleSubject() {
        this.observers = new ArrayList<>();
        this.value = 0;
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        observers.forEach(observer -> observer.update(value));
    }

    public void setValue(int value) {
        this.value = value;
        notifyObservers();
    }
}
