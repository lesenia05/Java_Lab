from Tablets import Tablets
from Syrop import Syrop
from Capsules import Capsules
from Ointment import Ointment
from PharmacyManager import PharmacyManager
from CategoryType import CategoryType

if __name__ == '__main__':

        my_pharmacy_manager = PharmacyManager

        my_pharmacy_manager.goodsList.append(Tablets("abipim", 108, 18, CategoryType.MEDICINE, 3))
        my_pharmacy_manager.goodsList.append(Tablets("aspiryn", 27, 18, CategoryType.MEDICINE, 10))
        my_pharmacy_manager.goodsList.append(Syrop("ambrol", 67, 20, CategoryType.MEDICINE, 250))
        my_pharmacy_manager.goodsList.append(Syrop("altejka", 45, 18, CategoryType.MEDICINE, 200))
        my_pharmacy_manager.goodsList.append(Ointment("bayer", 25, 21, CategoryType.BABYGOODS, 50))
        my_pharmacy_manager.goodsList.append(Ointment("nivea", 40, 21, CategoryType.DAILY_HYGIENE, 50))
        my_pharmacy_manager.goodsList.append(Capsules("lactimac", 130, 21, CategoryType.MEDICINE, 20))
        my_pharmacy_manager.goodsList.append(Capsules("ahusha", 75, 21, CategoryType.BABYGOODS, 4))

        my_pharmacy_manager.goodsList = my_pharmacy_manager.find_goods_by_price(50, my_pharmacy_manager.goodsList)
        for goods in my_pharmacy_manager.goodsList:
            print(goods.__str__())

        print('\n')

        my_pharmacy_manager.goodsList = my_pharmacy_manager.sort_goods_by_manufacture_name(my_pharmacy_manager.goodsList)
        for goods in my_pharmacy_manager.goodsList:
            print(goods.__str__())

        print('\n')

        my_pharmacy_manager.accommodationList = my_pharmacy_manager.find_by_category(my_pharmacy_manager.goodsList, CategoryType.MEDICINE)
        for goods in my_pharmacy_manager.goodsList:
            print(goods.__str__())