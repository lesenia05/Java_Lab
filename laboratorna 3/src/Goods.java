public class Goods {

    private String name;
    private double price;
    private int expirationDate;
    private CategoryType categoryType;

    public Goods (String name, double price,  int expirationDate, CategoryType categoryType) {
        this.name = name;
        this.price = price;
        this.expirationDate = expirationDate;
        this.categoryType = categoryType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(int expirationDate) {
        this.expirationDate = expirationDate;
    }

    public CategoryType getCategoryType() {
        return categoryType;
    }

    public void setCategoryType(CategoryType categoryType) {
        this.categoryType = categoryType;
    }

    @Override
    public String toString() {
        return "Goods{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", expirationDate=" + expirationDate +
                ", categoryType=" + categoryType +
                '}';
    }
}

