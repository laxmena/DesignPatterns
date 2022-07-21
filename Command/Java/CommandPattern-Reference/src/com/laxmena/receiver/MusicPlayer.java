package com.laxmena.receiver;

public class MusicPlayer {

    public enum VOLUME_LEVEL {
        HIGH,
        LOW,
        MEDIUM
    }

    private boolean on;
    private VOLUME_LEVEL volume;

    public MusicPlayer() {
        on = false;
        volume = VOLUME_LEVEL.LOW;
    }

    public void switchOn() {
        if(on == true) {
            System.out.println("Music Player is already Switched on");
        } else {
            on = true;
            System.out.println("Switched on Music Player");
        }
    }

    public void switchOff() {
        if(on == false) {
            System.out.println("Music Player is already switched off");
        } else {
            on = false;
            System.out.println("Switching off Music Player");
        }
    }

    public void setVolume(VOLUME_LEVEL level) {
        if(volume == level) {
            System.out.println("No changes made as the Volume is already set to desired level");
        } else {
            volume = level;
            System.out.println("Volume set to desired level");
        }
    }

}
