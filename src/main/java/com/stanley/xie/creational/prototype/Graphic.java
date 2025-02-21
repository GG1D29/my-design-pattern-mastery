package com.stanley.xie.creational.prototype;

public abstract class Graphic {

    private int heightInPixels;

    public Graphic(int heightInPixels) {
        this.heightInPixels = heightInPixels;
    }

    public int getHeightInPixels() {
        return heightInPixels;
    }

    public void setHeightInPixels(int heightInPixels) {
        this.heightInPixels = heightInPixels;
    }

}
