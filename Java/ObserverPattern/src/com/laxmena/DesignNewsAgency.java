package com.laxmena;

import java.time.LocalDateTime;

public class DesignNewsAgency extends NewsAgency {
    private static DesignNewsAgency instance = new DesignNewsAgency();
    private String PUBLISHER_NAME = "Design News Agency";

    private void DesignNewsAgency() {
        this.name = "Engineering News Agency";
    }

    public static DesignNewsAgency getInstance() {
        return instance;
    }

    public void addNewNews(String title, String content) {
        LocalDateTime publishedOn = LocalDateTime.now();
        News news = new News(title, content, publishedOn, PUBLISHER_NAME);
        // Whenever there is a new news, all the subscribers should be updated
        notifySubscribers();
    }
}
