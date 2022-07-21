from db.database import Database


class MongoDatabase(Database):
    def __init__(self):
        print("======== MongoDB ========")

    def create_table(self, table_name: str) -> None:
        print("Table Creation ==> " + table_name)

    def query_table(self, table_name: str, fields: str) -> None:
        print("Querying Table: " + table_name + " for fields " + fields)
