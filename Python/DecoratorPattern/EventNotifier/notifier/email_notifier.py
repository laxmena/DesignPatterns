from notifier.notifier import Notifier


class EmailNotifier(Notifier):
    def send(self, message: str):
        print("Sending Email Notification: {}".format(message))
