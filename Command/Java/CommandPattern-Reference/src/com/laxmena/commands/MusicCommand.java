package com.laxmena.commands;

import com.laxmena.receiver.MusicPlayer;

public abstract class MusicCommand {
    MusicPlayer player;

    MusicCommand(MusicPlayer player) {
        this.player = player;
    }
}
