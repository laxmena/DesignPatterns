from notifier.decorator import BaseDecorator


class SMSNotifier(BaseDecorator):
    def send(self, message: str):
        self.wrappedObject.send(message)
        print("Sending SMS Notification: " + message)
        