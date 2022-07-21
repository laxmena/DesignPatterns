from notifier.decorator import BaseDecorator


class FacebookNotifier(BaseDecorator):
    def send(self, message: str):
        self.wrappedObject.send(message)
        print("Sending Facebook Notification: " + message)
