package com.laxmena.Notifier;

public class FacebookDecorator extends BaseDecorator {

    public FacebookDecorator(Notifier notifier) {
        this.notifier = notifier;
        this.template = "Facebook Notification\n Message: %s";
    }

    @Override
    public void send(String message) {
        this.notifier.send(message);
        System.out.printf((this.template) + "%n", message);
    }
}