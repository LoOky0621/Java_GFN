package basics;

public class DatatypesTest2 {

    private int i; // Instanzvariable - bekommt einen Standardwert
    private static int j; // Klassenvariable - bekommt einen Standardwert
    // bei komplexen Datentypen ist der Standardwert immer null
    private static Integer ii; // Klassenvariable - bekommt einen Standardwert
    private static Integer jj; // Klassenvariable - bekommt einen Standardwert

    public static void main(String[] args) {
        int k; // lokale Variable - bekommt keinen Standardwert
        Integer kk; // lokale Variable - bekommt keinen Standardwert

        int[] zahlen = new int[10]; // Array mit 10 Positionen befüllt mit Standardwerten

        byte b = 127; // 10 ist ein int und wird hier sofort zu byte konvertiert
        b++; // nicht b = b + 1; sondern b = (byte)(b + 1);

        short s = 12345; // 12345 ist ein int und wird hier sofort zu short konvertiert

        // Alle ganzzahlen sind per Default int
        // Alle fließkommazahlen sind per Default double

        long l = 1000000; // 1000000 ist ein int und wird hier sofort zu long konvertiert
        l = 100_000_000_000l;
        l = 100l; // 100l ist ein long, muss nicht konvertiert werden


        go(10);
        go(b);
        go(s);

        // byte < short < int < long

        // primitive widening - automatisch
        l = b; // byte wird zu long konvertiert - möglich, da byte kleiner ist als long
        // b = l; // Error: long ist zu groß für byte

        // primitive narrowing - nur mit einem cast möglich
        b = (byte) l; // long ist zu groß für byte - konvertierung wird erzwungen

        l = (b + b); // erg wird automatich zu long

    }

    public static void go(byte zahl) {
        System.out.println("BYTE");
    }

    public static void go(int zahl) {
        System.out.println("INT");
    }

    public static void go(short zahl) {
        System.out.println("SHORT");
    }


}
