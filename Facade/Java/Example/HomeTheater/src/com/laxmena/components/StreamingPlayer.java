package com.laxmena.components;

public class StreamingPlayer {
    Amplifier amplifier;

    public StreamingPlayer(Amplifier amplifier) {
        this.amplifier = amplifier;
    }

    public void on() {
        System.out.println("Switching ON StreamingPlayer");
    }

    public void off() {
        System.out.println("Switching OFF StreamingPlayer");
    }

    public void pause() {
        System.out.println("Pausing StreamingPlayer");
    }

    public void setSurroundAudio() {
        amplifier.setSurroundSound();
    }

    public void setTwoChannelAudio() {
        amplifier.setStereoSound();
    }

    public void stop() {
        System.out.println("Stop StreamingPlayer");
    }

    public void play(String movie) {
        System.out.println("Playing movie: " + movie);
    }
}
