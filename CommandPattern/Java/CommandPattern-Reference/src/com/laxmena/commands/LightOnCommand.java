package com.laxmena.commands;

import com.laxmena.receiver.Light;
import com.laxmena.receiver.MusicPlayer;

public class LightOnCommand implements Command {
    Light light;

    public LightOnCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.switchOn();
    }
}
