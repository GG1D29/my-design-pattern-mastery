package com.stanley.xie.structural.decorator;

public class House {

    public static void main(String[] args) {

        var room = new BasicRoom();
        room.printFurniture();

        System.out.println();

        // create a room with a carpet and a couch
        var roomWithCouch = new RoomWithCouch(room);
        roomWithCouch.printFurniture();

        System.out.println();

        // create a room with a carpet, a couch and a table
        var roomWithCouchTable = new RoomWithTable(roomWithCouch);
        roomWithCouchTable.printFurniture();
    }

}
