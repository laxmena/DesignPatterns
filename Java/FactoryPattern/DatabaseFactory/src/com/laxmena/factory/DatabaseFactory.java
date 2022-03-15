package com.laxmena.factory;

import com.laxmena.db.Database;

public abstract class DatabaseFactory {
    public abstract Database getDatabase(String database);

}
