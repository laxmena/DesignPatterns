package com.laxmena.commands;

import com.laxmena.receiver.MusicPlayer;

public class MusicStopCommand extends MusicCommand implements Command {

    public MusicStopCommand(MusicPlayer player) {
        super(player);
    }

    @Override
    public void execute() {
        player.switchOff();
    }
}
