package com.laxmena.Notifier;

public abstract class BaseDecorator extends Notifier{
    // Wrapped notifier object
    Notifier notifier;

    public abstract void send(String message);
}
