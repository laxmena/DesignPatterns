from db.database import Database
from db.mongo_database import MongoDatabase
from factory.database_factory import DatabaseFactory


class NoSQLFactory(DatabaseFactory):
    @staticmethod
    def create_database(name: str) -> Database:
        if name == "mongodb":
            return MongoDatabase()
        else:
            print("Requested database not found")
            return None
