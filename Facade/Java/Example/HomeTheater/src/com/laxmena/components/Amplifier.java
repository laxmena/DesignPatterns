package com.laxmena.components;

public class Amplifier {
    Tuner tuner;
    StreamingPlayer player;
    int volume;
    boolean surroundSound = true;

    public Amplifier() {}
    public Amplifier(Tuner tuner) {
        this.tuner = tuner;
    }
    public Amplifier(StreamingPlayer player) {
        this.player = player;
    }
    public Amplifier(Tuner tuner, StreamingPlayer player) {
        this.tuner = tuner;
        this.player = player;
    }

    public void on() {
        System.out.println("Switching ON Amplifier");
    }

    public void off() {
        System.out.println("Switching OFF Amplifier");
    }

    public void setStreamingPlayer(StreamingPlayer player) {
        this.player = player;
    }

    public void setStereoSound() {
        System.out.println("Setting Stereo Sound");
        surroundSound = false;
    }

    public void setSurroundSound() {
        System.out.println("Setting Surround Sound");
        surroundSound = true;
    }

    public void setTuner(Tuner tuner) {
        System.out.println("Setting Tuner");
        this.tuner = tuner;
    }

    public void setVolume(int volume) {
        System.out.println("Setting volume to: " + volume);
        this.volume = volume;
    }
 }
