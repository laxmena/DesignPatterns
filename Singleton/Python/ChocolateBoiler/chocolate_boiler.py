## Example from Regactoring Guru
class ChocolateBoilerMeta(type):
    """Singleton class is implemented using meta class approach here"""
    _instances = {}

    def __call__(cls, *args, **kwargs):
        if cls not in cls._instances:
            instance = super().__call__()
            cls._instances[cls] = instance
        return cls._instances[cls]


class ChocolateBoiler(metaclass=ChocolateBoilerMeta):
    _empty = False
    _boiled = False

    def fill(self):
        if self._empty:
            self._empty = False
            self._boiled = False

    def drain(self):
        if self._empty and self._boiled:
            self._empty = True

    def boil(self):
        if not self._empty and not self._boiled:
            self._boiled = True


if __name__ == "__main__":
    s1 = ChocolateBoiler()
    s2 = ChocolateBoiler()

    s1.fill()
    s2.boil()

    if id(s1) == id(s2):
        print("Both instances contain same instance, singleton works")
    else:
        print("Singleton failed, two new instances created")
