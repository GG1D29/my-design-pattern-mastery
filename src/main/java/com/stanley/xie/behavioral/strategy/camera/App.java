package com.stanley.xie.behavioral.strategy.camera;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        PhoneCameraApp cameraApp = new BasicCameraApp();
        ShareStrategy shareStrategy = getShareStrategy();

        cameraApp.take();
        cameraApp.edit();
        cameraApp.save();
        cameraApp.share(shareStrategy);
    }

    private static ShareStrategy getShareStrategy() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Share with txt (t), email (e), or social media (s)?");
        String appName = scanner.next();
        scanner.close();

        return switch (appName) {
            case ("e") -> new Email();
            case ("s") -> new Social();
            default -> new Txt();
        };
    }
}
