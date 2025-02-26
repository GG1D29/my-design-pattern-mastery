package com.stanley.xie.structural.adapter;

public class App {

    public static void main(String[] args) {
        var englishLocalizedMessage = new EnglishLocalizedMessage();
        var englishGreeting = new Greeting(englishLocalizedMessage);
        englishGreeting.print();

        var frenchGreetingAdapter = new FrenchGreetingAdapter();
        var frenchGreeting = new Greeting(frenchGreetingAdapter);
        frenchGreeting.print();
    }

}
