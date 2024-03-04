public class Canon extends Print implements HasBrand, Dimenstion {

    String price;
    Canon(String price){
        super(price);
        this.price = price;
    }

    @Override
    public void brand() {
        System.out.println("Print bernama Canon");
    }

    @Override
    public void dimention() {
        System.out.println("Canon punya dimensi 14x11");
    }

    @Override
    void price() {
        System.out.println("Canon punya harga " + this.price);
    }


}
