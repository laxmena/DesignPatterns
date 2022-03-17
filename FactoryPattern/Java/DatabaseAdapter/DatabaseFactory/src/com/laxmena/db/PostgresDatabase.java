package com.laxmena.db;

public class PostgresDatabase implements Database {
    public PostgresDatabase() {
        System.out.println("============= Postgres Database =============");
    }

    @Override
    public void createTable(String tableName) {
        System.out.println("Creating Table " + tableName + "...");
    }

    @Override
    public void queryTable(String tableName, String query) {
        System.out.println("Querying " + query + " | on Table: " + tableName);
    }
}
