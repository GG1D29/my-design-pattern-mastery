package com.stanley.xie.structural.composite;

public class App {

    /*
    Objective:
        - Use composite pattern to give the song play method
        - Replace all these calls to play with single call to song.play()
     */
    public static void main(String[] args) {

        var c = new Note('C');
        var d = new Note('D');
        var e = new Note('E');

        var doReMe = new Song();

        doReMe.addNote(c);
        doReMe.addNote(d);
        doReMe.addNote(e);
        doReMe.addNote(c);
        doReMe.addNote(e);
        doReMe.addNote(c);
        doReMe.addNote(e);

        doReMe.play();

    }

}
