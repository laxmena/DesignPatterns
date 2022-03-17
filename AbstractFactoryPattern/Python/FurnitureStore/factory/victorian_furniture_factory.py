from products.chair.chair import Chair
from products.chair.victorian_chair import VictorianChair
from factory.furniture_factory import FurnitureFactory
from products.sofa import Sofa
from products.sofa import VictorianSofa
from products.table import Table
from products.table.victorian_table import VictorianTable


class VictorianFurnitureFactory(FurnitureFactory):
    def create_chair(self) -> Chair:
        return VictorianChair()

    def create_sofa(self) -> Sofa:
        return VictorianSofa()

    def create_table(self) -> Table:
        return VictorianTable()