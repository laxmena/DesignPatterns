from News.news import News
from NewsAgency.engineering_news_agency import EngineeringNewsAgency
from NewsReader.engineering_news_reader import EngineeringNewsReader
from interface.news_publisher import NewsPublisher
from interface.news_subscriber import NewsSubscriber

if __name__ == '__main__':
    news_agency: NewsPublisher = EngineeringNewsAgency.get_instance()
    news_reader: NewsSubscriber = EngineeringNewsReader("Reader1")

    # Create news for Engineering News Agency
    news_agency.add_news("Test title", "Python Engineering content")
    news_agency.add_news("Yet another title", "Random content")

    # Add another reader with subscription to the Engineering news agency
    newsReader2: NewsSubscriber = EngineeringNewsReader("AnotherReader")

    news_agency.add_news("Another user added!", "News should print twice with the user name")
