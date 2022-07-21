from abc import ABC, abstractmethod

from products.chair.chair import Chair
from products.sofa import Sofa
from products.table import Table


class FurnitureFactory(ABC):
    @abstractmethod
    def create_chair(self) -> Chair:
        pass

    @abstractmethod
    def create_sofa(self) -> Sofa:
        pass

    @abstractmethod
    def create_table(self) -> Table:
        pass
