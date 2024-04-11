package basics;

public class ByteLiteralTest {

    public static void main(String[] args) {

        // Alle Ganzzahlen-Wrapper-Objekte im Umfang von -128 bis 127 liegen vorbereitet im Byte-Literal-Pool

        Integer a = 128;
        Integer b = 128; // wird ein Wert außerhalb des Byte-Bereiches erzeugt, wird dafür ein Neues Objekt angelegt
        System.out.println(a.equals(b));
        System.out.println(a == b);

        Byte aa = -128;
        Byte bb = 127;
        bb = ++bb;
        // bb += 1;
        System.out.println(aa == bb);
        System.out.println(aa.equals(bb));
    }
}
