package com.laxmena;

import com.laxmena.Notifier.*;

public class Main {

    public static void main(String[] args) {
	    // Default Notifier + SMS + Slack Notification
        Notifier notifier1 = new EmailNotifier();
        notifier1 = new SlackDecorator(notifier1);
        notifier1 = new SMSDecorator(notifier1);
        notifier1.send("SMS Slack and Email Notification!");

        // notifier 2 => facebook + slack + email
        Notifier notifier2 = new FacebookDecorator(new SlackDecorator(new EmailNotifier()));
        notifier2.send("This is the second combination of notifier!");
    }
}
