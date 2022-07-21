package com.laxmena;

import com.laxmena.db.Database;
import com.laxmena.factory.DatabaseFactory;
import com.laxmena.factory.NoSQLFactory;
import com.laxmena.factory.SQLFactory;

public class ClientDemo {

    public static void main(String[] args) {
        // We have two Database Factories here.
        // SQLFactory creates Relational Databases like Postgres, MySQL
        // NoSQLFactory creates Non-Relational DB like MongoDB
        DatabaseFactory nosqlFactory = new NoSQLFactory();
        DatabaseFactory sqlFactory = new SQLFactory();

        // MongoDB
	    Database mongoDb = nosqlFactory.createDatabase("mongodb");
        mongoDb.createTable("Test Mongo");

        // MySQL
        Database mysqlDb = sqlFactory.createDatabase("mysql");
        mysqlDb.createTable("Testing MySQL");
        mysqlDb.queryTable("UserTable", "name");

        // Postgres
        Database postgresDB = sqlFactory.createDatabase("postgres");
        postgresDB.queryTable("TestTable", "age");
    }
}
