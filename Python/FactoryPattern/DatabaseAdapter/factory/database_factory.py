from abc import ABC, abstractmethod

from db.database import Database


class DatabaseFactory(ABC):
    @abstractmethod
    def create_database(self, name: str) -> Database:
        pass
