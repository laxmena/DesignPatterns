from notifier.email_notifier import EmailNotifier
from notifier.fb_notifier import FacebookNotifier
from notifier.notifier import Notifier
from notifier.slack_notifier import SlackNotifier
from notifier.sms_notifier import SMSNotifier

if __name__ == '__main__':
    # Sending notification to user1 through email + slack
    notifier1: Notifier = SlackNotifier(EmailNotifier())
    notifier1.send("Hello world!")

    # Email + Facebook + Slack
    notifier2: Notifier = FacebookNotifier(SlackNotifier(EmailNotifier()))
    notifier2.send("Sending email + fb + slack notification")

    # SMS + Email
    notifier3: Notifier = SMSNotifier(EmailNotifier())
    notifier3.send("SMS + Email")
