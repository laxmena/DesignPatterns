package com.laxmena.commands;

import com.laxmena.receiver.Light;

public class LightOffCommand implements Command {
    private Light light;

    public LightOffCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        // Commands to the Receiver
        light.switchOff();
    }
}
