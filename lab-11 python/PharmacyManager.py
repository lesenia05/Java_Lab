from operator import attrgetter


class PharmacyManager:

    goodsList = []

    def find_goods_by_price(price, goods_list):
        found_goods_by_price = []
        for goods in goods_list:
            if goods.price < price:
                found_goods_by_price.append(goods)
        return found_goods_by_price

    def find_by_category(goods_list, CategoryType):
        found_goods_by_category = []
        for goods in goods_list:
            if goods.category_type == CategoryType:
                found_goods_by_category.append(goods)

        return found_goods_by_category

    def sort_goods_by_manufacture_name(goods_list):
        return sorted(goods_list, key=attrgetter('name'))