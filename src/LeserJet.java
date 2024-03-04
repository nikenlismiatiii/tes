public class LeserJet extends Print implements HasBrand, Dimenstion {
    String price;
    LeserJet(String price){
        super(price);
        this.price = price;
    }

    @Override
    public void brand() {
        System.out.println("Print bernama LeserJet");
    }

    @Override
    public void dimention() {
        System.out.println("LeserJet punya dimensi 16x12");
    }

    @Override
    void price() {
        System.out.println("LeserJet punya harga " + this.price);
    }
}
