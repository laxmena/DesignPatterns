package com.laxmena.db;

public class MySQLDatabase implements Database {
    public MySQLDatabase() {
        System.out.println("============= MySQL Database =============");
    }
    @Override
    public void createTable(String tableName) {
        System.out.println("Creating MySQL table: " + tableName);
    }

    @Override
    public void queryTable(String tableName, String query) {
        System.out.println("Querying Table " + tableName + " for " + query);
    }
}
