package com.laxmena.components;

public class Projector {
    StreamingPlayer player;

    public Projector(StreamingPlayer player) {
        this.player = player;
    }

    public void on() {
        System.out.println("Switching Projector Tuner");
    }

    public void off() {
        System.out.println("Switching Projector Off");
    }

    public void tvMode() {
        System.out.println("Setting TV Mode");
    }

    public void wideScreenMode() {
        System.out.println("Setting wide Screen mode");
    }
}
