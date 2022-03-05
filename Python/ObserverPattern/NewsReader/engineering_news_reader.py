import string

from NewsAgency.engineering_news_agency import EngineeringNewsAgency
from interface.news_subscriber import NewsSubscriber


class EngineeringNewsReader(NewsSubscriber):
    def __init__(self, user_id: string):
        self.subscription = EngineeringNewsAgency.get_instance()
        self.subscription.register_subscriber(self)
        self.id = user_id

    def update(self, news_id: int):
        news = self.subscription.get_news(news_id)
        if news is None:
            print("No new news available at this moment!")
        else:
            print("News alert for Reader: ", self.id)
            news.print_formatted_news()


