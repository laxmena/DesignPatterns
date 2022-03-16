from abc import abstractmethod

from notifier.notifier import Notifier


class BaseDecorator(Notifier):
    wrappedObject: Notifier = None

    def __init__(self, obj: Notifier):
        self.wrappedObject = obj

    @abstractmethod
    def send(self, message: str):
        pass
