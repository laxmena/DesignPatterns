from abc import ABCMeta, abstractmethod
from beverage.beverage import Beverage


class CondimentsDecorator(Beverage, metaclass=ABCMeta):
    beverage: Beverage = None

    @abstractmethod
    def get_description(self) -> str:
        pass

    @abstractmethod
    def cost(self) -> float:
        pass
