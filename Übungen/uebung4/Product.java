package uebung4;

import java.time.LocalDate;
import java.util.Objects;

public class Product {

    private String name;
    private LocalDate date;
    private int quantity;
    private double price;

    public Product(String name, int quantity, double price) {
        this.name = name;
        this.date = LocalDate.now();
        this.quantity = quantity;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        System.out.println("EQUALS");
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return quantity == product.quantity && Double.compare(product.price, price) == 0 && Objects.equals(name, product.name) && Objects.equals(date, product.date);
    }

    @Override
    public int hashCode() {
        System.out.println("HASHCODE");
        return Objects.hash(name, date, quantity, price);
    }
}
