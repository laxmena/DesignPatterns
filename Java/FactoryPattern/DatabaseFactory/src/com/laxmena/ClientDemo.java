package com.laxmena;

import com.laxmena.db.Database;
import com.laxmena.factory.DatabaseFactory;
import com.laxmena.factory.NoSQLFactory;
import com.laxmena.factory.SQLFactory;

public class ClientDemo {

    public static void main(String[] args) {
        DatabaseFactory nosqlFactory = new NoSQLFactory();
        DatabaseFactory sqlFactory = new SQLFactory();

	    Database mongoDb = nosqlFactory.getDatabase("mongodb");
        Database mysqlDb = sqlFactory.getDatabase("mysql");

        mongoDb.createTable("Test Mongo");
        mysqlDb.createTable("Testing MySQL");
    }
}
