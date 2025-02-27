package com.stanley.xie.structural.bridge;

public class App {

    /*
    Objective:
      - Make red circle
      - Make blue square
     */
    public static void main(String[] args) {
        var circle = new Circle(new Red());
        circle.getType();
        circle.getColor().get();

        var square = new Square(new Blue());
        square.getType();
        square.getColor().get();
    }

}
