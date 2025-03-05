package com.stanley.xie.behavioral.observer.weather;

import java.util.ArrayList;
import java.util.List;

public class WeatherUpdates {

    private List<String> weatherUpdates = new ArrayList<>();

    public void printUpdates() {
        weatherUpdates.forEach(System.out::println);
    }

}
