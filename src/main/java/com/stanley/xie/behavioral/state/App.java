package com.stanley.xie.behavioral.state;

public class App {

    public static void main(String[] args) {

        /*
        Should display following in the console:
            Playing
            Displaying pause icon
            Paused
            Displaying play icon
         */
        var mediaPlayer = new MediaPlayer();
        mediaPlayer.pressButton();
        mediaPlayer.pressButton();

    }

}
