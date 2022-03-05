package com.laxmena;

public class EngineeringNewsReader implements NewsSubscriber {
    NewsAgency engineeringNews;
    int lastNewsIndex;

    public EngineeringNewsReader() {
        this.engineeringNews = EngineeringNewsAgency.getInstance();
        this.engineeringNews.registerSubscriber(this);
        this.lastNewsIndex = -1;
    }

    @Override
    public void update(String agency) {
        News news = engineeringNews.getNews(lastNewsIndex + 1);
        if(news == null) {
            System.out.println("No news available");
        } else {
            lastNewsIndex += 1;
            news.printFormattedNews();
        }
    }

}
