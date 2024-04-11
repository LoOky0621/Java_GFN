package uebung4;

import java.util.HashSet;
import java.util.Set;

public class App {

    public static void main(String[] args) {

        //ProductManagement management = new ProductManagement(10);
        ProductManagement management = new ProductManagement();

        management.add(new Product("Tasse, gelb", 100, 2.99));
        management.add(new Product("Tasse, rot", 10, 2.19));
        management.add(new Product("Tasse, blau", 1000, 1.99));
        management.add(new Product("Tasse, grün", 200, 3.99));

        management.show();

        System.out.println();

        Product p1 = new Product("Tasse, gelb", 100, 2.99);
        Product p2 = new Product("Tasse, gelb", 100, 2.99);
        //Product p2 = null;
        System.out.println(p1.equals(p2)); // Wertevergleich
        System.out.println(p1 == p2); // Referenzvergleich

        System.out.println(p1.hashCode());
        System.out.println(p2.hashCode());

        System.out.println();

        // Menge - Hash basiert
        Set<Product> sammlung = new HashSet<>();
        sammlung.add(new Product("Tasse, gelb", 100, 2.99));
        sammlung.add(new Product("Tasse, blau", 100, 3.99));
        sammlung.add(new Product("Tasse, blau", 100, 3.99));

        System.out.println(sammlung);


    }
}
