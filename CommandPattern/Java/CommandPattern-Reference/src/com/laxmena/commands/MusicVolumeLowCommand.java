package com.laxmena.commands;

import com.laxmena.receiver.MusicPlayer;

public class MusicVolumeLowCommand extends MusicCommand implements Command {
    public MusicVolumeLowCommand(MusicPlayer player) {
        super(player);
    }

    @Override
    public void execute() {
        player.setVolume(MusicPlayer.VOLUME_LEVEL.LOW);
    }
}
