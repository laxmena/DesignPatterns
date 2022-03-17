package com.laxmena;

public class ObserverPatternDemo {
    public static void main(String[] args) {
        EngineeringNewsAgency newsAgency = EngineeringNewsAgency.getInstance();
        EngineeringNewsReader reader = new EngineeringNewsReader();

        newsAgency.addNewNews("Sample News Title", "Here goes some content");
        newsAgency.addNewNews("Heres another news title", "and some more content");
        newsAgency.addNewNews("Interesting titile?", "and interestign news article content here!!");
    }
}
