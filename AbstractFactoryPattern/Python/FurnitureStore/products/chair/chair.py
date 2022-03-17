from abc import ABC, abstractmethod


class Chair(ABC):
    legs = 4

    @abstractmethod
    def sit_on(self) -> None:
        pass

    def legs_count(self) -> int:
        return self.legs
