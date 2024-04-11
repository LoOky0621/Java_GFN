package basics;

public class WrappeTest {

    public static void main(String[] args) {

        Integer ii = 10; // primitiv int wird über Autoboxing zu komplex Integer
        int iii = ii; // Autounboxing von komplex Integer zu int

        // byte = Byte
        // short = Short
        // int = Integer
        // long = Long
        // float = Float
        // double = Double
        // char = Character
        // boolean = Boolean

        Byte bb = 10;
        // ii = bb; // Bei komplexen Datentypen gibt es kein widening zum größeren Zahlentyp

        // Double d = 100; // Autoboxing von int zu Integer (und dann Widening von Integer auf Double) nicht erlaubt

        // byte < short < int etc.

        // Number
        // Byte, Integer etc sind Kindklassen von Number

        Integer i = Integer.parseInt("100"); // Integer Objekt wird erst gebaut

        i.longValue(); // Konvertiert 100 zu Long
        //Integer.longValue(); // Hier gibt es kein Objekt, das konvertiert werden kann
        Integer.valueOf(10).longValue(); // Ok. valueOf baut ein Objekt

        //Double d = 100f; // Autoboxing von float zu Float, Float und Double sind nicht kompatibel

        Number n = 100; // Autoboxing von int zu Integer, Kompelx Widening von Integer auf Number
        n = 100f; // Autoboxing von float zu Float, Kompelx Widening von Float auf Number


    }
}
