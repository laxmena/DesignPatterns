from beverage.beverage import Beverage


class Espresso(Beverage):
    def __init__(self):
        self.description = "Espresso Coffee"

    def cost(self) -> float:
        return 1.99
