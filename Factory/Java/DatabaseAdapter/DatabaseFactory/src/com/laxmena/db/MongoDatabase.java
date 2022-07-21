package com.laxmena.db;

public class MongoDatabase implements Database {
    public MongoDatabase() {
        System.out.println("============= MongoDB =============");
    }
    @Override
    public void createTable(String tableName) {
        System.out.println("Creating table now!! " + tableName);
    }

    @Override
    public void queryTable(String tableName, String query) {
        System.out.println("Table: " + tableName + " | Query: " + query);
    }
}
