public class Epson extends Print implements HasBrand, Dimenstion {
    String price;
    Epson(String price){
        super(price);
        this.price = price;
    }

    @Override
    public void brand() {
        System.out.println("Print bernama Epson");
    }

    @Override
    public void dimention() {
        System.out.println("Epson punya dimensi 14x13");
    }

    @Override
    void price() {
        System.out.println("Epson punya harga " + this.price);
    }
}
