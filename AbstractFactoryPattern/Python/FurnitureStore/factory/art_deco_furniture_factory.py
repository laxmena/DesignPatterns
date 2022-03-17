from products.chair.art_deco_chair import ArtDecoChair
from products.chair.chair import Chair
from factory.furniture_factory import FurnitureFactory
from products.sofa.art_deco_sofa import ArtDecoSofa
from products.sofa import Sofa
from products.table import ArtDecoTable
from products.table import Table


class ArtDecoFurnitureFactory(FurnitureFactory):
    def create_chair(self) -> Chair:
        return ArtDecoChair()

    def create_sofa(self) -> Sofa:
        return ArtDecoSofa()

    def create_table(self) -> Table:
        return ArtDecoTable()