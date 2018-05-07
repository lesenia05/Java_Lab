public class Ointment extends Goods{
    private int volume;

    public Ointment(String name, double price,  int expirationDate, CategoryType categoryType,int volume) {
        super(name, price, expirationDate, categoryType );
        this.volume = volume;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    @Override
    public String toString() {
        return "Ointment{" + "name='" + super.getName() + '\'' +
                ", price=" + super.getPrice() +
                ", expirationDate=" + getExpirationDate() +
                ", categoryType=" + getCategoryType() +
                "volume=" + volume +
                '}';
    }
}
