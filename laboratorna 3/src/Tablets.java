public class Tablets extends Goods {
    private int coundInBox;

    public Tablets(String name, double price, int expirationDate, CategoryType categoryType, int coundInBox) {
        super(name, price, expirationDate, categoryType);
        this.coundInBox = coundInBox;
    }

    public int getCoundInBox() {
        return coundInBox;
    }

    public void setCoundInBox(int coundInBox) {
        this.coundInBox = coundInBox;
    }

    @Override
    public String toString() {
        return "Tablets{" + "name='" + super.getName() + '\'' +
                ", price=" + super.getPrice() +
                ", expirationDate=" + getExpirationDate() +
                ", categoryType=" + getCategoryType() +
                "coundInBox=" + coundInBox +
                '}';
    }
}
