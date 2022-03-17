from NewsAgency.news_agency import NewsAgency


class EngineeringNewsAgency(NewsAgency):
    __instance = None

    @staticmethod
    def get_instance():
        if EngineeringNewsAgency.__instance is None:
            EngineeringNewsAgency()
        return EngineeringNewsAgency.__instance

    def __init__(self):
        if EngineeringNewsAgency.__instance is not None:
            raise Exception("This class is singleton")
        else:
            EngineeringNewsAgency.__instance = self
            self.publisher = "Engineering News Agency"


