package com.laxmena.commands;

public class MacroCommand implements Command {
    Command[] commands;

    public MacroCommand(Command[] commands) {
        this.commands = commands;
    }

    @Override
    public void execute() {
        for(int i=0; i<commands.length; i++) {
            commands[i].execute();
        }
    }
}
