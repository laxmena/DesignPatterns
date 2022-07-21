package com.laxmena;

import java.util.ArrayList;
import java.util.List;

/**
 * There are two types of implementation in Publisher Subscriber models - Push and Pull models.
 *
 * In Push model, whenever there is an update, the publisher pushes the update to the subscriber.
 * In Pull model, publisher notifies the subscriber that there is an update, and subscriber decides
 * when to pull the data.
 *
 * In this example, we implement the Pull model.
 */

public abstract class NewsAgency implements NewsPublisher {
    String publisher;
    String name;
    ArrayList<NewsSubscriber> subscribers;
    ArrayList<News> newsList;

    public NewsAgency() {
        subscribers = new ArrayList<NewsSubscriber>();
        newsList = new ArrayList<News>();
    }

    @Override
    public void registerSubscriber(NewsSubscriber subscriber) {
        this.subscribers.add(subscriber);
    }

    @Override
    public void removeSubscriber(NewsSubscriber subscriber) {
        this.subscribers.remove(subscriber);
    }

    @Override
    public void notifySubscribers() {
        for(NewsSubscriber subscriber: this.subscribers) {
            // Subscriber can subscribe to multiple publishers.
            // So we send a reference to the subscriber.
            subscriber.update(publisher);
        }
    }

    @Override
    public News getNews(int newsId) {
        if(newsId < 0 || newsId >= this.newsList.size())
            return null;
        return this.newsList.get(newsId);
    }
}
