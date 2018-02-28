public class Main {

    public static void main(String[] args) {
       Fish pike = new Fish();
       Fish crucian = new Fish(true, false, false, 4);
       Fish carp  = new Fish(true, false, false, 2, true);

        System.out.println("\n" + pike.toString());
        System.out.println("\n" + crucian.toString());
        System.out.println("\n" + carp.toString());

        pike.printSum();
        crucian.printSum();
        carp.printSum();

        Fish.setTotalWeight(pike.getWeight() + crucian.getWeight() + carp.getWeight());
        Fish.printStaticSum();
    }
}
