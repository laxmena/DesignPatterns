package com.laxmena.factory;

import com.laxmena.db.Database;
import com.laxmena.db.MongoDatabase;

public class NoSQLFactory extends DatabaseFactory {

    @Override
    public Database getDatabase(String database) {
        if(database.equalsIgnoreCase("MongoDB")) {
            return new MongoDatabase();
        } else {
            System.out.println("Database " + database + " - Not supported");
            return null;
        }
    }
}
