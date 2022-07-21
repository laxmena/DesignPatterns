from factory.art_deco_furniture_factory import ArtDecoFurnitureFactory
from factory.furniture_factory import FurnitureFactory
from factory.mordern_furniture_factory import ModernFurnitureFactory
from factory.victorian_furniture_factory import VictorianFurnitureFactory
from products.chair import Chair
from products.sofa import Sofa
from products.table import Table

if __name__ == '__main__':
    print("Abstract Factory Demo\n")

    # Victorian Style
    factory: FurnitureFactory = VictorianFurnitureFactory()
    chair1: Chair = factory.create_chair()
    table1: Table = factory.create_table()
    chair1.sit_on()
    print(table1.weight_capacity())

    # ArtDeco Style
    factory = ArtDecoFurnitureFactory()
    chair2: Chair = factory.create_chair()
    sofa2: Sofa = factory.create_sofa()
    print("Legs count: ", chair2.legs_count())
    print("Cushion Type: ", sofa2.cushion_type())

    # Modern Style
    factory = ModernFurnitureFactory()
    table3: Table = factory.create_table()
    sofa3: Sofa = factory.create_sofa()
    print("Table load capacity: ", table3.weight_capacity())
    print("Modern Cushion Type? ", sofa3.cushion_type())
