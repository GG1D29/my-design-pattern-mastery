package com.stanley.xie.creational.abstractfactory;

public class UserInterfaceApp {

    //TODO factory to create each element
    //TODO FactoryMaker to return the right factory depending on color passed in

//    public static void main(String[] args) {
//        UserInterface roadUserInterface = createUserInterface("RED");
//        UserInterface mountainUserInterface = createUserInterface("BLUE");
//
//        System.out.println(roadUserInterface);
//        System.out.println(mountainUserInterface);
//
//    }


    public UserInterface createUserInterface(String color) {
        if (color.equalsIgnoreCase("RED")) {
            return new UserInterface(new RedButton(), new RedScrollBar());
        } else if (color.equalsIgnoreCase("BLUE")) {
            return new UserInterface(new BlueButton(), new BlueScrollBar());
        } else {
            throw new IllegalArgumentException("Color not supported");
        }

    }

}

