package basics; // Package-Anweisung, Max. 1x pro Klasse

import java.util.Date; // Alles aus anderen Packages muss importiert werden
import java.util.*;
// alles aus java.lang ist immer verfügbar und muss nicht importiert werden!

/**
 * Diese Klasse mach nix
 * @author tlubowiecki
 * @since 1.8
 */
public class DatatypeTest {

    // PascalCase = Klassen, Interfaces und Enums
    // camelCase = variablen, Attribute und Methoden
    // snake_case = Wird in Java nicht verwendet!
    // SCREAMING_SNAKE_CASE = Konstanten
    // kleinbuchstabeben = packeges

    // de.gfn.video.converter.MP4Converter
    // com.adobe.video.converter.MP4Converter

    private int anzahl; // Eigenschaft, Instanzvariable
    private static int count; // Klassenvariable

    public static void main(String[] /* Hallo Welt */ args) {

        byte i = 100; // primitiv, lokale Variable
        StringBuilder sb = new /* Moin */ StringBuilder(); // komplex, lokale Variable

        // komplex
        Date heute = new Date();

        // zahlen
        // standard für Ganzzahlen
        int ganzzahlen;

        byte kleineGanzhallen; // max 127

        long sehrGrosseZahlen;

        // Dezimalzahlen
        float kleinDezimalzahlen = 10.0f;

        // standard für DezimalPunktZahlen
        double grosseDezimalzahlen;

        // byte < short < int < long < float < double

    }

    /**
     * Der angegebene Name wird in Großbuchstaben geändert
     * @param name Name des Users
     * @return
     */
    public String machWas(String name) { // Methode
        return name.toUpperCase();
    }
}
