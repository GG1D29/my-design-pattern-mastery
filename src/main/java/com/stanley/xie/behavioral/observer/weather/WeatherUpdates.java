package com.stanley.xie.behavioral.observer.weather;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.util.ArrayList;
import java.util.List;

// Step1. implement the Observer class here.
public class WeatherUpdates implements PropertyChangeListener {

    private List<String> weatherUpdates = new ArrayList<>();

    public void printUpdates() {
        weatherUpdates.forEach(System.out::println);
    }

    @Override
    public void propertyChange(PropertyChangeEvent evt) {
        weatherUpdates.add((String) evt.getNewValue());
    }
}
