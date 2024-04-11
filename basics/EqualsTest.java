package basics;

public class EqualsTest {

    public static void main(String[] args) {

        // primitive datentypen vergleicht man mit ==

        int i = 10;
        int j = 20;
        char c = 'X';
        System.out.println(i == j);
        System.out.println(i == c); // c wird zu int konvertiert und dann erfolgt der Wertevergleich

        i = j; // primitive Datentypen werden als Kopie weitergegeben

        // Byte-Literal-Pool für Zahlen zwischen -128 bis 127

        Integer ii = 10;
        Integer jj = 20;
        ii = jj; // komplexe Datentypen werden als Referenz weitergegeben

        // bei komplexen Datentypen
        // == vergleicht, ob die Referenzen auf das gleiche Objekt zeigen
        // equals ist ein Wertevergleich

        // Manche Objekte in Java sind Immutable d.h. nicht veränderbar
        // Immutable: Strings, Zahlenwerte als Objekte, LocalDate etc.


    }
}
