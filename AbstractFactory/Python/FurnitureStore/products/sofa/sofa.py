from abc import ABC, abstractmethod


class Sofa(ABC):
    cushion = None

    def has_cushion(self) -> bool:
        return self.cushion is not None

    def cushion_type(self) -> str:
        return self.cushion
