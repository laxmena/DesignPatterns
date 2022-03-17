from chair.chair import Chair


class VictorianChair(Chair):
    def __init__(self):
        self.legs = 4

    def sit_on(self):
        print("Royal Victorian Chair is now occupied")
