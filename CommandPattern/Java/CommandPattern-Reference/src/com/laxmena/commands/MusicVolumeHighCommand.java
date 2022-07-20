package com.laxmena.commands;

import com.laxmena.receiver.MusicPlayer;

public class MusicVolumeHighCommand extends MusicCommand implements Command {
    public MusicVolumeHighCommand(MusicPlayer player) {
        super(player);
    }

    @Override
    public void execute() {
        player.setVolume(MusicPlayer.VOLUME_LEVEL.HIGH);
    }
}
