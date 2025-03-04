package com.stanley.xie.structural.decorator;

public abstract class RoomDecorator implements Room {
    private final Room room;

    public RoomDecorator(Room room) {
        this.room = room;
    }

    @Override
    public void printFurniture() {
        room.printFurniture();
    }
}
