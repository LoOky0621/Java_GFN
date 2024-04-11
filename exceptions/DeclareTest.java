package exceptions;

public class DeclareTest {

    public static void main(String[] args) throws Exception {

        machWas();
        System.out.println("ENDE main");

        String s = "Hallo";
        Object o = s; // Up Casting
        s = (String) o; // Down Casting

        Integer i = 100;
        //i.longValue();
        o = i; // Up Casting
        //o.toString(); Über eine Referenz von Object sind nur Methoden von Object sichtbar
        s = (String) o; // Down Casting: ClassCastException

        // Double d = Integer.valueOf(100);

        Double d = i.doubleValue(); // Kein Cast! Konvertierung über eine Methode
        d = Double.parseDouble("100"); // Kein Cast! Konvertierung über eine Methode

        double d2 = 100; // primitive Widening von int auf double
        Double d3 = 100d;
        //float f1 = 100; // primitive Widening von int auf float
        Float f2 = 100f; // Autoboxing von float zu Float
        //Float f3 = 100; // Autoboxing von int zu Integer, komplex Widening von Integer auf Float (nicht erlaubt)

        machWas();

    }

    static void machWas() throws Exception {

        machWasAnderes();
        System.out.println("ENDE machWas");

    }

    static void machWasAnderes() throws Exception {

        System.out.println(10 / 0); // RuntimeException: ArithmeticException
        //System.out.println(10 / 2);
        System.out.println("ENDE machWasAnderes");

    }
}
