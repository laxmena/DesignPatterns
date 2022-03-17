from chair.chair import Chair


class ModernChair(Chair):
    def __init__(self):
        self.legs = 0

    def sit_on(self):
        print("Modern Chair with no legs!")
