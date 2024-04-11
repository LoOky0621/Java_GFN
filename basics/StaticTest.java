package basics;

public class StaticTest {

    public static void main(String[] args) {

        System.out.println(Vehicle.count);
        Vehicle.count++;
        System.out.println(Vehicle.count);

        Vehicle v1 = new Vehicle("HH:AB 123", "Fiat");
        Vehicle v2 = new Vehicle("HH:AB 337");

        System.out.println(Vehicle.count);

    }
}

class Vehicle {

    private String registration;

    private String brand;

    private int id;

    static int count = 1; // package private

    public Vehicle(String registration, String brand) {
        this.registration = registration;
        this.brand = brand;
        // cout ist in der Klasse vefügbar und alle Objekte der Klasse können
        // es gemeinsam nutzen
        this.id = ++count;
    }

    /*
    public Vehicle(String registration) {
        this.registration = registration;
        this.brand = "Unbekannt";
        this.id = ++count;
    }
    */

    public Vehicle(String registration) {
        // Fall ein anderer Konstruktor verwendet wird, muss es die erste Anweisung im Konstruktor sein
        this(registration, "Unbekannt"); // ruft den anderen Konstruktor auf
    }

    public String getRegistration() {
        return registration;
    }

    public String getBrand() {
        return brand;
    }
}