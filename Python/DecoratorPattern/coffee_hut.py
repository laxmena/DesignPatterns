# This implementation is based on the example from Headfirst Design Patterns book
from beverage.beverage import Beverage
from beverage.condiments.mocha import Mocha
from beverage.condiments.soy import Soy
from beverage.condiments.whip import Whip
from beverage.dark_roast import DarkRoast
from beverage.espresso import Espresso
from beverage.house_blend import HouseBlend


def print_cost(beverage: Beverage):
    print(beverage.get_description() + " $" + str(beverage.cost()))


if __name__ == '__main__':
    # First Customer comes in to the Store and orders one plain House Blend Coffee
    order1: Beverage = HouseBlend()
    print_cost(order1)

    # Second customer orders an Espresso with double whip and soy milk
    order2: Beverage = Whip(Whip(Soy(Espresso())))
    print_cost(order2)

    # Third customer wants Dark Roast, with double mocha and whip
    order3: Beverage = Whip(Mocha(Mocha(DarkRoast())))
    print_cost(order3)
