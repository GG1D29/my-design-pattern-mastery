package com.stanley.xie.structural.composite;

public class Note {

    private final char value;

    public Note(char value) {
        this.value = value;
    }

    public void play() {
        System.out.println(value);
    }

}
