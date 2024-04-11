package basics;

public class LiteralTest {

    public static void main(String[] args) {

        // 100 ist ein Literal
        int i = 100;

        // "Hallo Welt" ist ein StringLiteral
        String s = "Hallo Welt";

        machWas(s); // Übergabe einer Variable
        machWas("Moin"); // Übergabe eines Literals


        String s1 = "HI"; // Stringobjekt wird erzeugt und im StringLiteralPool abgelegt
        String s2 = "HI"; // s2 ist eine Referenz auf das Objekt aus dem Pool

        System.out.println(s1.equals(s2)); // Wertevergleich
        System.out.println(s1 == s2); // Referenzvergleich (Zeigen beide Referenzen auf das gleich Objekt auf dem Heap?)


        String s3 = new String("HI"); // Stringobjekt wird erzeugt und landet NICHT im Pool
        String s4 = new String("HI");

        System.out.println(s3.equals(s4));
        System.out.println(s3 == s4);

    }

    public static void machWas(String text) {

    }
}
