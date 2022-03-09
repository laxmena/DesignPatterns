package com.laxmena.Notifier;

/** EmailNotification - Concrete Implementation of the abstract Notifer Class

 This is the default notification, and other decorators wrap this class.
 */
public class EmailNotifier extends Notifier {
    public EmailNotifier() {
        this.template = "Default Notification: Email Notification\nMessage: %s";
    }

    @Override
    public void send(String message) {
        System.out.printf((this.template) + "%n", message);
    }
}
