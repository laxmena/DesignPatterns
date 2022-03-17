from db.database import Database
from factory.nosql_factory import NoSQLFactory
from factory.sql_factory import SQLFactory

if __name__ == '__main__':
    db1: Database = NoSQLFactory.create_database("mongodb")
    db1.query_table("Table1", "user_name")
    db1.create_table("NewTable")

    db2: Database = SQLFactory.create_database("postgres")
    db2.create_table("Postgres_Table")

    print("\nTry creating an unsupported Database")
    db3: Database = SQLFactory.create_database("random_db")