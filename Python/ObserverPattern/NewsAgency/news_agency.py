import string
from abc import ABCMeta
from datetime import datetime
from typing import List

from News.news import News
from interface.news_publisher import NewsPublisher
from interface.news_subscriber import NewsSubscriber


class NewsAgency(NewsPublisher, metaclass=ABCMeta):
    publisher: string = None
    name: string = None
    subscribers: List[NewsSubscriber] = []
    news_list: List[News] = []

    def register_subscriber(self, subscriber: NewsSubscriber):
        if subscriber not in self.subscribers:
            self.subscribers.append(subscriber)

    def unsubscribe(self, subscriber: NewsSubscriber):
        if subscriber in self.subscribers:
            self.subscribers.remove(subscriber)

    def notify_subscribers(self):
        news_id = len(self.news_list) - 1
        for subscriber in self.subscribers:
            subscriber.update(news_id)

    def add_news(self, title, content):
        news = News(title, content, datetime.now().strftime("%m/%d/%Y, %H:%M:%S"), self.publisher)
        self.news_list.append(news)
        self.notify_subscribers()

    def get_news(self, news_id):
        if news_id < 0 or news_id >= len(self.news_list):
            return None
        return self.news_list[news_id]
