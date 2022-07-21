from products.chair.chair import Chair
from products.chair.modern_chair import ModernChair
from factory.furniture_factory import FurnitureFactory
from products.sofa.modern_sofa import ModernSofa
from products.sofa import Sofa
from products.table.modern_table import ModernTable
from products.table import Table


class ModernFurnitureFactory(FurnitureFactory):
    def create_chair(self) -> Chair:
        return ModernChair()

    def create_sofa(self) -> Sofa:
        return ModernSofa()

    def create_table(self) -> Table:
        return ModernTable()