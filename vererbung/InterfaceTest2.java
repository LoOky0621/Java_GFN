package vererbung;

public class InterfaceTest2 {

    public static void main(String[] args) {

    }
}

interface Movable {

    int x = 10; // static final
    int y = 20; // static final

    void moveTo();

    static void checkPosition() {
        System.out.println("Unbekannt");
    }
}

class NextFahrzeug implements Movable {

    @Override
    public void moveTo() {
        Movable.checkPosition(); // Methode aus dem Interface
        this.checkPosition(); // Methode aus der NextFahrzeug-Klasse
    }

    // Statische Methoden vom Interface werden nicht vererbt
    static void checkPosition() {
        System.out.println(x); // Eigenschaften werden auf dem Interface vererbt
        System.out.println(y);
        System.out.println("NextFahrzeug");
    }
}