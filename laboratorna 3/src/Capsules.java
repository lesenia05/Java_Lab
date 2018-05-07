public class Capsules extends Goods {

    private  double coundInPackaging;

    public Capsules(String name, double price,  int expirationDate, CategoryType categoryType,double coundInPackaging) {
        super(name, price, expirationDate, categoryType );
        this.coundInPackaging = coundInPackaging;
    }

    public double getCoundInPackaging() {
        return coundInPackaging;
    }

    public void setCoundInPackaging(double coundInPackaging) {
        this.coundInPackaging = coundInPackaging;
    }

    @Override
    public String toString() {
        return "Capsules{" + "name='" + super.getName() + '\'' +
                ", price=" + super.getPrice() +
                ", expirationDate=" + getExpirationDate() +
                ", categoryType=" + getCategoryType() +
                "coundInPackaging=" + coundInPackaging +
                '}';
    }
}
