from beverage.beverage import Beverage
from beverage.condiments.condiments_decorator import CondimentsDecorator


class Soy(CondimentsDecorator):
    def __init__(self, beverage: Beverage):
        self.beverage = beverage

    def get_description(self) -> str:
        return self.beverage.get_description() + ", Soy"

    def cost(self) -> float:
        return self.beverage.cost() + 0.15
