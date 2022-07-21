from abc import ABC, abstractmethod


class Table(ABC):
    material_type: str = None
    capacity: float = None

    def weight_capacity(self) -> float:
        return self.capacity

    def material(self) -> str:
        return self.material_type
