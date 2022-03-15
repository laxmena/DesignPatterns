package com.laxmena.db;

public interface Database {
    // To keep the implementation simple,
    // the following methods will not return values,
    // but simply print some actions for understanding.
    public void createTable(String tableName);
    public void queryTable(String tableName, String query);
}
