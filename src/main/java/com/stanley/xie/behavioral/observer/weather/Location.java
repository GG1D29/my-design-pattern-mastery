package com.stanley.xie.behavioral.observer.weather;

import java.beans.PropertyChangeSupport;

//Step2. Implement the Observable class, and adding the Property change listener here.
public class Location {

    private String weatherEvent;
    private PropertyChangeSupport support = new PropertyChangeSupport(this);

    public void setWeatherEvent(String weatherEvent) {
        support.firePropertyChange("weatherEvent", this.weatherEvent, weatherEvent);
        this.weatherEvent = weatherEvent;
    }

    public void addPropertyChangeListener(WeatherUpdates weatherUpdates) {
        support.addPropertyChangeListener(weatherUpdates);
    }
}
