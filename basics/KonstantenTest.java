package basics;

public class KonstantenTest {

    private static final String NAME = "Peter";

    public static void main(String[] args) {

        System.out.println(NAME + " Parker");

        // Kompiletimekonstante
        final int zahl1 = 100;
        System.out.println(zahl1);

        // Runtimekonstante
        final int zahl2;
        zahl2 = 100;
        System.out.println(zahl2);

        final boolean wahr1 = true;

        final boolean wahr2;
        wahr2 = true;

        while(wahr2) {
            System.out.println(".");
        }

        System.out.println("Ende");
    }
}
