public class Polymorphism {
    public static void main(String[] args) {
        Print canon = new Canon("Rp 1.000.000");
        canon.price();
        Print epson = new Epson("Rp 1.000.000");
        epson.price();
        Print leserJet = new LeserJet("Rp 1.000.000");
        leserJet.price();

        buy(new Canon("1.000.000"));
        buy(new Epson("1.200.000"));
        buy(new Epson("950.000"));
    }

    static void buy(Print print) {
        if (print instanceof Canon) {
            Canon canon = (Canon) print; //dilakukan casting
            System.out.println("Beli print canon seharga " + canon.price);
            canon.brand();
            canon.dimention();
        } else if (print instanceof Epson) {
            Epson epson = (Epson) print;
            System.out.println("Beli print epson seharga " + epson.price);
            epson.brand();
            epson.dimention();
        } else {
            LeserJet leserJet = (LeserJet) print;
            System.out.println("Beli print leserjet seharga " + leserJet.price);
            leserJet.brand();
            leserJet.dimention();
        }

    }
}
