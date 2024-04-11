package vererbung;

public class AnonymeKlasseTest {

    public static void main(String[] args) {

        Parent p = new Child();
        //Integer i = new CustomInteger(10); // Geht nicht. Integer ist final d.h. keine Kindklasse erlaubt

        // Anonyme Klasse - Einwegklasse
        // Basis für Anonyme Klassen kann ein Interface, abstrakte Klasse oder eine konkrete Klasse sein
        // Hier wird eine Klasse ohne Namen deklariert die Schablone implementiert
        Schablone s = new Schablone() {
            @Override
            public void machDies() {
                System.out.println("AAAAAA");
            }

            @Override
            public void machDas() {
                System.out.println("BBBBB");
            }
        };

        s.machDas();
        s.machDies();
    }
}

interface Schablone { // interfaces und abstrakte Klassen dürfen nicht final sein!!!!!

    void machDies(); // alle Methoden per default public

    void machDas();
}
