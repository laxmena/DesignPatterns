package com.laxmena.Notifier;

public class SMSDecorator extends BaseDecorator {
    public SMSDecorator(Notifier notifier) {
        this.notifier = notifier;
        setTemplate();
    }

    private void setTemplate() {
        this.template = "SMS Message \n Message: %s";
    }

    private void sendSMS(String message) {
        System.out.printf((this.template) + "%n", message);
    }

    @Override
    public void send(String message) {
        this.notifier.send(message);
        sendSMS(message);
    }
}
