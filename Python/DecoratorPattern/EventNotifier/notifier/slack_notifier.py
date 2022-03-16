from notifier.decorator import BaseDecorator


class SlackNotifier(BaseDecorator):
    def send(self, message: str):
        self.wrappedObject.send(message)
        print("Sending Slack Notification: " + message)
