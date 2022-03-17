from chair.chair import Chair


class ArtDecoChair(Chair):
    def __init__(self):
        self.legs = 2

    def sit_on(self):
        print("Art deco chair occupied!!!")
