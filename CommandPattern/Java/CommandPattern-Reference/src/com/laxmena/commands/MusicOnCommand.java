package com.laxmena.commands;

import com.laxmena.receiver.MusicPlayer;

public class MusicOnCommand extends MusicCommand implements Command  {

    public MusicOnCommand(MusicPlayer player) {
        super(player);
    }

    @Override
    public void execute() {
        player.switchOn();
    }
}
