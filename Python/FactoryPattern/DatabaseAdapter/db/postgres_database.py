from db.database import Database


class PostgresDatabase(Database):
    def __init__(self):
        print("======== Postgres ========")

    def create_table(self, table_name: str) -> None:
        print("PostgreSQL table creation: " + table_name)

    def query_table(self, table_name: str, fields: str) -> None:
        print("Querying Table: " + table_name + " for fields " + fields)
