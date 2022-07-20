package com.laxmena.receiver;

public class Light {
    private boolean on = false;

    public void switchOn() {
        if(on == true) {
            System.out.println("Light is already switched on");
        } else {
            on = true;
            System.out.println("Switching on the Light");
        }
    }

    public void switchOff() {
        if(on == false) {
            System.out.println("Light is already switched off");
        } else {
            on = false;
            System.out.println("Switching off the Light");
        }
    }
}
