package com.laxmena;

public interface NewsPublisher {
    public void registerSubscriber(NewsSubscriber subscriber);
    public void removeSubscriber(NewsSubscriber subscriber);
    public void notifySubscribers();
    public News getNews(int index);
}
