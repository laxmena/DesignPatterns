from abc import ABC, abstractmethod


class Beverage(ABC):
    """Abstract Class that all Concrete Beverage class should implement.

    Beverage class contains two methods and an attribute defined.
    cost is an abstract method that the child classes should implement.
    """
    description = "Unnamed Beverage"

    def get_description(self) -> str:
        return self.description

    @abstractmethod
    def cost(self) -> float:
        pass
