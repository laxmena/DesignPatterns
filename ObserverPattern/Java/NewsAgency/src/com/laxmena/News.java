package com.laxmena;

import java.time.LocalDateTime;

public class News {
    private String title;
    private String content;
    private LocalDateTime publishedOn;
    private String publishedBy;

    public News(String title, String content, LocalDateTime date, String publisher) {
        this.title = title;
        this.content = content;
        this.publishedOn = date;
        this.publishedBy = publisher;
    }

    public String getTitle() {
        return title;
    }

    public String getContent() {
        return content;
    }

    public String getPublishedBy() {
        return publishedBy;
    }

    public LocalDateTime getPublishedOn() {
        return publishedOn;
    }

    public void printFormattedNews() {
        System.out.println("------------");
        System.out.println("Published by: " + this.publishedBy + " | Published on: " + this.publishedOn.toString());
        System.out.println("Title: " + this.title);
        System.out.println("Content: " + this.content);
        System.out.println("------------");
    }
}
