package com.laxmena.commands;

public class NoCommand implements Command {
    @Override
    public void execute() {
        System.out.println("NoCommand: No action is performed");
    }
}
