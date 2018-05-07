import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        PharmacyManager pharmacyManager = new PharmacyManager();

        pharmacyManager.getAvailableGoods().add(new Tablets("abipim", 108, 18, CategoryType.MEDICINE, 3));
        pharmacyManager.getAvailableGoods().add(new Tablets("aspiryn", 27, 18, CategoryType.MEDICINE, 10));
        pharmacyManager.getAvailableGoods().add(new Syrop("ambrol", 67, 20, CategoryType.MEDICINE, 250));
        pharmacyManager.getAvailableGoods().add(new Syrop("altejka", 45, 18, CategoryType.MEDICINE, 200));
        pharmacyManager.getAvailableGoods().add(new Ointment("bayer", 25, 21, CategoryType.BABYGOODS, 50));
        pharmacyManager.getAvailableGoods().add(new Ointment("nivea", 40, 21, CategoryType.DAILYHYGIENE, 50));
        pharmacyManager.getAvailableGoods().add(new Capsules("lactimac", 130, 21, CategoryType.MEDICINE, 20));
        pharmacyManager.getAvailableGoods().add(new Capsules("ahusha", 75, 21, CategoryType.BABYGOODS, 4));


        System.out.println("Menu: " +
                "\n1. Show all available goods" +
                "\n2. Show goods at a price" +
                "\n3. Sort by manyfacture name"  +
                "\n4. Show goods at a category type ");

        Scanner scanner = new Scanner(System.in);
        int userChoice = scanner.nextInt();

        switch (userChoice) {
            case 1:
                pharmacyManager.getAvailableGoods().forEach(good -> System.out.println(good.toString()));
                break;
            case 2:
                pharmacyManager.findGoodsByPrice(50).forEach(good -> System.out.println(good.toString()));
                break;
            case 3:
                pharmacyManager.sortByManyfactureName(pharmacyManager.getAvailableGoods());
                pharmacyManager.getAvailableGoods().forEach(good -> System.out.println(good.toString()));
                break;
            case 4:
                pharmacyManager.findGoodsByCategory(pharmacyManager.getAvailableGoods(), CategoryType.MEDICINE).forEach(good -> System.out.println(good.toString()));
                break;
        }
    }
}


