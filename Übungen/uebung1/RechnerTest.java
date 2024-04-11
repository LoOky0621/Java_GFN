package uebung1;

public class RechnerTest {

    public static void main(String[] args) {

        Rechner rechner = new Rechner();
        double erg = rechner.add(10, 15);
        System.out.println(erg);

        erg = rechner.sub(10, 15);
        System.out.println(erg);

        erg = rechner.div(10, 15);
        System.out.println(erg);

        erg = rechner.multi(10, 15);
        System.out.println(erg);

        rechner.printProtokoll();

        System.out.println();

        // Statisch - Kein Objekt nötig

        erg = StaticRechner.add(10, 15);
        System.out.println(erg);

        erg = StaticRechner.sub(10, 15);
        System.out.println(erg);

        erg = StaticRechner.div(10, 15);
        System.out.println(erg);

        erg = StaticRechner.multi(10, 15);
        System.out.println(erg);
    }
}
