package basics;

public class ZahlensystemeTest {

    public static void main(String[] args) {

        int i = 10;
        System.out.println(i);
        // int i = 15; // Error: Redeklaration!
        i = 012; // Oktal
        System.out.println(i);
        i = 0b11; // Binär
        System.out.println(i);
        i = 0x12; // Hex
        System.out.println(i);

        System.out.println();

        int j = 100;
        Integer k = j; // Autoboxing von primitiv int zu Integer
        j = k; // Auto-Unboxing von Integer zu primitiv int

        System.out.println(Integer.toHexString(i));
        System.out.println(Integer.toBinaryString(i));
        System.out.println(Integer.toOctalString(i));
        System.out.println(i);

        long l = 100_00_00_00l;

        float f = 10.0f; // bei float-literalen muss IMMER das f mit angegeben werden

        int erg1 = 2 / 3;
        System.out.println(erg1);
        double erg2 = 2 / 3.0;
        System.out.println(erg2);

        erg2 = 2.0 / 3.2 * 1.5;
        System.out.println(erg2);

        // byte < short < int < long < float < double
        //         char <

        char c = 'A';
        System.out.println(c);
        i = c;
        i = 'a'; // primitive Widening von char auf int
        System.out.println(i);
        System.out.println((char)10000);
        System.out.println("\ufff0");
    }
}
