package com.laxmena.invoker;

import com.laxmena.commands.*;
import com.laxmena.receiver.Light;
import com.laxmena.receiver.MusicPlayer;

import java.util.ArrayList;

public class RemoteControl {
    /**
     * Command Pattern is a behavioral pattern, in which an object is used to encapsulate all
     * information needed to perform an action or trigger an event at a later time.
     *
     * This RemoteControl Invoker is a middle layer, which pre-configures different actions to be performed
     * when the user requests it. This class Pre-Configures the command execution part by assigning different
     * commands to different inputs from the user.
     *
     */
    ArrayList<Command> commands;
    Command noCommand;

    public RemoteControl() {
        // initialize and Pre-Configure Different Commands that can be performed with this remote.
        noCommand =  new NoCommand();
        commands = new ArrayList<>();
        init();
    }

    public void init() {
        Light light = new Light();
        MusicPlayer player = new MusicPlayer();

        // First Command:
        commands.add(new LightOnCommand(light));
        commands.add(new LightOffCommand(light));
        commands.add(new MusicOnCommand(player));
        commands.add(new MusicStopCommand(player));
        commands.add(new MusicVolumeHighCommand(player));
        commands.add(new MusicVolumeLowCommand(player));

        Command[] partyCommands = {new LightOnCommand(light),new MusicOnCommand(player), new MusicVolumeHighCommand(player)};
        MacroCommand partyCommand = new MacroCommand(partyCommands);
        commands.add(partyCommand);
    }

    public void addControl(Command command) {
        commands.add(command);
    }

    public void invoke(int n) {
        if(n < commands.size() && n >= 0) {
            commands.get(n).execute();
        } else {
            noCommand.execute();;
        }
    }

    public String toString() {
        StringBuffer buffer = new StringBuffer();
        buffer.append("\n-------Remote Control-------\n");
        for(int i=0; i<commands.size(); i++) {
            buffer.append("[" + i + "]" + commands.get(i).getClass().getSimpleName() + "\n");
        }
        return buffer.toString();
    }

}
