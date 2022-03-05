import string
from abc import ABC, abstractmethod


class NewsSubscriber(ABC):
    @abstractmethod
    def update(self, news_id: int):
        pass
