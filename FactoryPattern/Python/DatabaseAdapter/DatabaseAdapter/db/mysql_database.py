from db.database import Database


class MySQLDatabase(Database):
    def __init__(self):
        print("======== MySQL ========")

    def create_table(self, table_name: str) -> None:
        print("Creating table: " + table_name)

    def query_table(self, table_name: str, fields: str) -> None:
        print("Querying Table: " + table_name + " for fields " + fields)
