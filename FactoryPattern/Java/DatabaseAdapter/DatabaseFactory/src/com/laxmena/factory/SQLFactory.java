package com.laxmena.factory;

import com.laxmena.db.Database;
import com.laxmena.db.MySQLDatabase;
import com.laxmena.db.PostgresDatabase;

public class SQLFactory extends DatabaseFactory {

    @Override
    public Database createDatabase(String database) {
        if(database.equalsIgnoreCase("MySQL")) {
            return new MySQLDatabase();
        } else if(database.equalsIgnoreCase("Postgres")) {
            return new PostgresDatabase();
        } else {
            System.out.println("Requested database " + database + "is not supported yet.");
            return null;
        }
    }
}
