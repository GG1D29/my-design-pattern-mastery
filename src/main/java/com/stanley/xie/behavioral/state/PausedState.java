package com.stanley.xie.behavioral.state;

public class PausedState implements MediaPlayerState {
    @Override
    public void pressButton(MediaPlayer mediaPlayer) {
        mediaPlayer.play();
        mediaPlayer.setState(new PlayingState());
    }
}
