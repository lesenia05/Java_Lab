from Goods import Goods

class Capsules(Goods):

    def __init__(self, name, price,  expiration_date, category_type, cound_in_packaging):
        super(Capsules, self).__init__(name, price, expiration_date, category_type)
        self.cound_in_packaging = cound_in_packaging

        def __str__(self):
            return super(Capsules, self).__str__() + ' cound_in_packaging = ' + str(self.cound_in_packaging)