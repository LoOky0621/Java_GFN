package uebung4;

import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class ProductManagement {

    //private Product[] products;
    private List<Product> products;

    //private int count;

    private static final String TBL_ROW = "| %-20s | %-12s | %-8s | %-8s | \n";

    private static final DateTimeFormatter FMT_DATE = DateTimeFormatter.ofPattern("dd.MM.yyyy");

    public ProductManagement(int size) {
        //this.products = new Product[size];
        this.products = new ArrayList<>(size); // ArrayList mit einem interenen Array in Größe von size
    }

    public ProductManagement() {
        this.products = new ArrayList<>(); // Größe des interenen Arrays = 10
    }

    public void add(Product product) {

        /*
        if(count >= products.length) {
            System.out.println("Liste ist schon voll");
            return;
        }

        products[count] = product;
        count++;
        */

        if(product != null) {
            products.add(product);
        }
    }

    public void show() {
        System.out.println("Produkte: ");

        System.out.printf(TBL_ROW, "Name", "Datum", "Anzahl", "Preis");

        for (Product p : products) {
            // if(p == null) continue;

            System.out.printf(TBL_ROW, p.getName(), p.getDate().format(FMT_DATE), p.getQuantity(), String.format("%.2f", p.getPrice()));
        }
    }
}
