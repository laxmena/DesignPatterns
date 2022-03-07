from beverage.beverage import Beverage
from beverage.condiments.condiments_decorator import CondimentsDecorator


class Mocha(CondimentsDecorator):
    def __init__(self, beverage: Beverage):
        self.beverage = beverage

    def get_description(self) -> str:
        return self.beverage.get_description() + ", Mocha"

    def cost(self) -> float:
        return self.beverage.cost() + 0.20
