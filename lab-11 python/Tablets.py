from Goods import Goods

class Tablets(Goods):

    def __init__(self, name, price, expiration_date, category_type,cound_in_box):
        super(Tablets, self).__init__(name, price, expiration_date, category_type)
        self.cound_in_box = cound_in_box


def __str__(self):
    return super(Tablets, self).__str__() + ' volume = ' \
           + str(self.volume)