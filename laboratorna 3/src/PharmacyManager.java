import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class PharmacyManager {

    private String name;
    private String adress;
    private int  workinghours;

    private List<Goods> availableGoods = new ArrayList<>();

    public  List<Goods> findGoodsByCategory(List<Goods> goods, CategoryType categoryType){
        List<Goods> result = new LinkedList<>();
        for (Goods good : goods) {
            if (good.getCategoryType() == categoryType) {
                result.add(good);
            }
        }
        return result;
    };

    public List<Goods> findGoodsByPrice (double price){
        List<Goods> result = new LinkedList<>();
        for (Goods good : availableGoods) {
            if (good.getPrice() < price) {
                result.add(good);
            }
        }
        return result;
    };

    public void sortByManyfactureName(List<Goods> goods){
        goods.sort(Comparator.comparing(Goods::getName));
    };

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public int getWorkinghours() {
        return workinghours;
    }

    public void setWorkinghours(int workinghours) {
        this.workinghours = workinghours;
    }

    public List<Goods> getAvailableGoods() {
        return availableGoods;
    }

}


