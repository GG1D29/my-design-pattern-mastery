package com.stanley.xie.behavioral.observer.simple;

public class App {
    public static void main(String[] args) {

        // Test adding 2 Observers initially.
        SimpleSubject simpleSubject = new SimpleSubject();
        Observer simpleObserver = new SimpleObserver(simpleSubject);
        Observer simpleObserver2 = new SimpleObserver(simpleSubject);
        simpleSubject.setValue(80);
        System.out.println("---");

        // Try to remove the Observer.
        simpleSubject.removeObserver(simpleObserver);
        simpleSubject.setValue(81);
        System.out.println("---");

        // Try to remove another Observer.
        simpleSubject.removeObserver(simpleObserver2);
        simpleSubject.setValue(82);
    }
}
