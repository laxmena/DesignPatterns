from beverage.beverage import Beverage


class Decaf(Beverage):
    def __init__(self):
        self.description = "Decaf"

    def cost(self) -> float:
        return 1.05
