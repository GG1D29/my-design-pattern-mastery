package com.stanley.xie.structural.bridge;

public class App {

    /*
    Objective:
      - Make red circle
      - Make blue square
     */
    public static void main(String[] args) {
        var circle = new Circle();
        circle.getType();

        var square = new Square();
        square.getType();
    }

}
