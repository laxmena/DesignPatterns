package com.laxmena.Notifier;

public class SlackDecorator extends BaseDecorator {

    public SlackDecorator(Notifier notifier) {
        this.notifier = notifier;
        this.template = "Slack Notification\nMessage: %s";
    }

    @Override
    public void send(String message) {
        this.notifier.send(message);
        System.out.printf((this.template) + "%n", message);
    }
}
