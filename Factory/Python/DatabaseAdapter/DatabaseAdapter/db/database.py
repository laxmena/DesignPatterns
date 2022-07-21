from abc import ABC, abstractmethod


class Database(ABC):
    @abstractmethod
    def create_table(self, table_name: str) -> None:
        pass

    @abstractmethod
    def query_table(self, table_name: str, field: str) -> None:
        pass
