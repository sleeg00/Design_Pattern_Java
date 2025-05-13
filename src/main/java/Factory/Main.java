package Factory;

import Factory.framework.Factory;
import Factory.framework.Product;
import Factory.idcard.IDCardFactory;

public class Main {
    public static void main(String[] args) {
        Factory factory = new IDCardFactory();
        Product card1 = factory.create("Y");
        Product card2 = factory.create("T");
        Product card3 = factory.create("Q");

        card1.use();
        card2.use();
        card3.use();
    }
}
