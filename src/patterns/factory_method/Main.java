package patterns.factory_method;

import patterns.factory_method.framework.Factory;
import patterns.factory_method.framework.Product;
import patterns.factory_method.idcard.IDCardFactory;

public class Main {
    public static void main(String[] args) {
        Factory factory = new IDCardFactory();

        Product card1 = factory.create("Jane");
        Product card2 = factory.create("Hana");
        Product card3 = factory.create("Ken");

        card1.use();
        card2.use();
        card3.use();
    }
}
