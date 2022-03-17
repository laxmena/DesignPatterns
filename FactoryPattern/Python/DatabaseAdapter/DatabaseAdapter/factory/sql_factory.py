from db.database import Database
from db.mysql_database import MySQLDatabase
from db.postgres_database import PostgresDatabase
from factory.database_factory import DatabaseFactory


class SQLFactory(DatabaseFactory):
    @staticmethod
    def create_database(name: str) -> Database:
        if name.lower() == "postgres":
            return PostgresDatabase()
        elif name.lower() == "mysql":
            return MySQLDatabase()
        else:
            print("Requested Database not found")
            return None
