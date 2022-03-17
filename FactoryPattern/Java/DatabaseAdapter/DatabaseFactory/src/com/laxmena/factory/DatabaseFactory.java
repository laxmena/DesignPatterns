package com.laxmena.factory;

import com.laxmena.db.Database;

public abstract class DatabaseFactory {
    public abstract Database createDatabase(String database);
}
