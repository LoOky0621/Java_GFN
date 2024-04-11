package vererbung;

public class AbstractClassTest2 {

    public static void main(String[] args) {

        // Xyz x = new Xyz(); // Abstrakte Klasse darf nicht instanziert werden

        // Hier wird einen anonyme Klasse deklariert, die von Xyz erbt und diese wird anschließend instanziert
        Xyz x = new Xyz() {
        };

        long l = 0123l;
        l = 0b10001l;
        l = 0xabc;

        int[] arr = {1,2,3};
        Object o = arr; // Array ist ein Object - Upcast
        // Object[] oArr = arr; // int's sind keine Objekte
        // Integer[] oArr = arr; // int's sind keine Integer-Objekte
        arr = (int[]) o; // Downcast

        Integer[] arr2 = {1,2,3};
        Object o2 = arr2; // Array ist ein Object
        Object[] oArr = arr2; // Integer sind Objekte
        Number[] nArr = arr2; // Integer sind Number

        // double[] dArr = arr; // intArray ist kein doubleArray

        float f = 10; // primitive widening von int auf float
        double d = 10; // primitive widening von int auf double
        //Double d2 = 10; // Autoboxing von int auf Integer und danach komplex Widening von Integer auf Double - Nicht möglich!
        Double d3 = 10.0; // Autoboxing von double auf Double
        Double d4 = Double.valueOf(10.0); // Methode wandelt den Wert um
        d4 = Double.valueOf("15"); // Punkt ist optional
        System.out.println(d4);
        System.out.println(d4.intValue());
        System.out.println(d4.floatValue());

        machWas(5, 10.0);

    }

    public static void machWas(int i, double j) {
        //...
    }
}

abstract class Xyz {

    public Xyz() {
    }
}
