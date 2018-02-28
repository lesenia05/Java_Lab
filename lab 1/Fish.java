public class Fish {
    private boolean freshwater ;
    private boolean sea;
	private boolean ocean;
	private double weight;
    private boolean frozen;
    public static double totalWeight = 0;


    public Fish() {
        freshwater = true;
        sea = false;
        ocean = false;
        weight = 5;
        frozen = true;
    }

    public Fish(boolean freshwater, boolean sea, boolean ocean, double weight){
        this.freshwater = freshwater;
        this.sea = sea;
        this.ocean = ocean;
        this.weight = weight;
        frozen = true;
    }

    public Fish(boolean freshwater, boolean sea, boolean ocean, double weight, boolean frozen ){
        this.freshwater = freshwater;
        this.sea = sea;
        this.ocean = ocean;
        this.weight = weight;
        this.frozen = frozen;
    }

    @Override
    public String toString() {
        return "Fish{" +
                "freshwater=" + freshwater +
                ", sea=" + sea +
                ", ocean=" + ocean +
                ", weight=" + weight +
                ", frozen=" + frozen +
                '}';
    }

    public static void printStaticSum(){
        System.out.println("Fish total weight: " + getTotalWeight());
    }

    public void printSum(){
        System.out.println("Fish total weight: " + getWeight());
    }

    public void resetValues(boolean freshwater, boolean sea, boolean ocean, double weight, boolean frozen ){
        this.freshwater = freshwater;
        this.sea = sea;
        this.ocean = ocean;
        this.weight = weight;
        this.frozen = frozen;

    }

    public boolean isFreshwater() {
        return freshwater;
    }

    public void setFreshwater(boolean freshwater) {
        this.freshwater = freshwater;
    }

    public boolean isSea() {
        return sea;
    }

    public void setSea(boolean sea) {
        this.sea = sea;
    }

    public boolean isOcean() {
        return ocean;
    }

    public void setOcean(boolean ocean) {
        this.ocean = ocean;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public boolean isFrozen() {
        return frozen;
    }

    public void setFrozen(boolean frozen) {
        this.frozen = frozen;
    }

    public static double getTotalWeight() {
        return totalWeight;
    }

    public static void setTotalWeight(double totalWeight) {
        Fish.totalWeight = totalWeight;
    }

}
