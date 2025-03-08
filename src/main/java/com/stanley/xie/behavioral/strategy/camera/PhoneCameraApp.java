package com.stanley.xie.behavioral.strategy.camera;

public abstract class PhoneCameraApp {

    public void share(ShareStrategy shareStrategy) {
        shareStrategy.share();
    }

    public void take() {
        System.out.println("Taking the photo");
    }

    public void save() {
        System.out.println("Saving the photo");
    }

    public abstract void edit();
}
