package basics;

public class PrimitivTest {

    public static void main(String[] args) {

        byte b1 = 10;
        byte b2 = 20;

        //byte sum = b1 + b2; // addition führt zu Promotion auf int
        //byte sum = (byte)(b1 + b2); // Cast kann immer zu einem Über- oder Unterlauf führen
        int sum = b1 + b2;

        float f1 = 10f;
        // sum = b1 + f1; // erg ist float. Float passt nicht in ein int

        long a = 2_140_000_000;
        long b = 1_000_000;
        long i = a * b;
        System.out.println(i);

        System.out.println(Math.abs(i));

        int j = 360;
        b1 = (byte) j;
        System.out.println(b1);

    }


}
