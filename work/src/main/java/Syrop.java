public class Syrop extends Goods {
    private double volume;

    public Syrop(String name, double price, int expirationDate, CategoryType categoryType, double volume) {
        super(name, price, expirationDate, categoryType);
        this.volume = volume;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    @Override
    public String toString() {
        return "Syrop{" + "name='" + super.getName() + '\'' +
                ", price=" + super.getPrice() +
                ", expirationDate=" + getExpirationDate() +
                ", categoryType=" + getCategoryType() +
                "volume=" + volume +
                '}';
    }
}
