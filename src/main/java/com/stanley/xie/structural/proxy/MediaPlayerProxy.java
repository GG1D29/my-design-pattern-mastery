package com.stanley.xie.structural.proxy;

public class MediaPlayerProxy implements MediaPlayer {
    private MovieMediaPlayer movieMediaPlayer;

    @Override
    public void playMedia() {
        if (movieMediaPlayer == null) {
            movieMediaPlayer = new MovieMediaPlayer();
        }

        movieMediaPlayer.playMedia();
    }
}
