from abc import ABC, abstractmethod

from interface.news_subscriber import NewsSubscriber


class NewsPublisher(ABC):
    @abstractmethod
    def register_subscriber(self, subscriber: NewsSubscriber):
        pass

    @abstractmethod
    def unsubscribe(self, subscriber: NewsSubscriber):
        pass

    @abstractmethod
    def notify_subscribers(self):
        pass
