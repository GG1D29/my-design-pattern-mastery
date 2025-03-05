package com.stanley.xie.behavioral.observer;

import java.beans.PropertyChangeSupport;

// This is the Observable.
public class User {

    private String status;
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    public void setStatus(String status) {
        changeSupport.firePropertyChange("status", this.status, status);
        this.status = status;
    }

    public void addPropertyChangeListener(Newsfeed newsfeed) {
        changeSupport.addPropertyChangeListener(newsfeed);
    }
}
