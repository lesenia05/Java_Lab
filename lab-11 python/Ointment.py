from Goods import Goods

class Ointment(Goods):

    def __init__(self, name, price, expiration_date, category_type, volume):
        super(Ointment, self).__init__(name, price, expiration_date, category_type)
        self.volume = volume


def __str__(self):
    return super(Ointment, self).__str__() + ' volume = ' \
           + str(self.volume)