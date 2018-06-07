class Goods:

    def __init__(self, name, price, expiration_date, category_type):
        self.name = name
        self.price = price
        self.expiration_date = expiration_date
        self.category_type = category_type
    def __str__(self):
        return ' name = ' + self.name + ' price = ' \
               + str(self.price) + ' expiration_date = ' + str(self.expiration_date) +\
               ' category_type = ' + str(self.category_type)


