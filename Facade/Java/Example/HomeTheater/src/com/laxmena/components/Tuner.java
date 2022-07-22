package com.laxmena.components;

public class Tuner {
    Amplifier amplifier;

    double frequency;
    boolean FM = true;

    public Tuner(Amplifier amplifier) {
        this.amplifier = amplifier;
    }

    public void on() {
        System.out.println("Switching ON Tuner");
    }

    public void off() {
        System.out.println("Switching Tuner Off");
    }

    public void setAm() {
        System.out.println("Setting AM on Tuner");
        this.FM = false;
    }

    public void setFm() {
        System.out.println("Setting FM on Tuner");
        this.FM = true;
    }

    public void setFrequency(double frequency) {
        this.frequency = frequency;
        System.out.println("Setting Frequency: " + frequency);
    }

    @Override
    public String toString() {
        return "Tuner{" +
                "amplifier=" + amplifier +
                ", playing=" + ((FM == true)? "FM":"AM") +
                ", frequency=" + frequency +
                '}';
    }
}
