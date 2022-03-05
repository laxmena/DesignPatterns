package com.laxmena;

import java.time.LocalDateTime;

public class EngineeringNewsAgency extends NewsAgency {
    private static EngineeringNewsAgency instance = new EngineeringNewsAgency();
    private String PUBLISHER_NAME = "Engineering News";

    private void EngineeringNewsAgency() {
        this.name = "Engineering News Agency";
    }

    public static EngineeringNewsAgency getInstance() {
        return instance;
    }

    public void addNewNews(String title, String content) {
        LocalDateTime publishedOn = LocalDateTime.now();
        News news = new News(title, content, publishedOn, PUBLISHER_NAME);
        this.newsList.add(news);
        // Whenever there is a new news, all the subscribers should be updated
        notifySubscribers();
    }
}
