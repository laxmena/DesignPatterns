package com.laxmena;

import com.laxmena.invoker.RemoteControl;

public class Client {

    public static void main(String[] args) {
        // Create an Instance of the Pre-Configured Remote
        RemoteControl remote = new RemoteControl();

        System.out.println(remote);

        remote.invoke(2); // Turn on Music
        remote.invoke(5); // Set Volume to Low
        remote.invoke(1); // Turn Off the Light

        System.out.println("\nSetting Party Mode:\n-------------------");
        remote.invoke(6);
    }
}
