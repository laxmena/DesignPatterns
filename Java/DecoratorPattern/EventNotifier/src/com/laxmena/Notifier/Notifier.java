package com.laxmena.Notifier;

import java.util.ArrayList;

public abstract class Notifier {
    String template;

    public abstract void send(String message);
}
