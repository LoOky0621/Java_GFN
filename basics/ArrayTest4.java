package basics;

import java.util.Arrays;
import java.util.List;

public class ArrayTest4 {

    public static void main(String[] args) {

        Integer ints[] = {1,2,3,4};
        //ints = {2,4}; // Nur bei gleichzeitiger Deklaration erlaubt
        ints = new Integer[]{2,4};

        System.out.println(ints);
        System.out.println(Arrays.toString(ints));

        int[][] arr = new int[2][];
        System.out.println(Arrays.toString(arr));
        System.out.println(arr[1]);

        // +=, -=, *=, /=, %=
        //x *= 10; // x = (int)(x * 10)
        // <=, >=

        byte b1 = 10;
        byte b2 = 15;

        //b1 = b1 + b2; // Mathematische Operation promoviert die Operanden mind. zu int
        b1 += b2; // b1 = (byte)(b1 + b2);

        b1 = 127;
        b1 += b2;
        System.out.println(b1);

        b1++; // b1 = (byte)(b1 + 1)

        System.out.println(Integer.MIN_VALUE + " bis " + Integer.MAX_VALUE);

        AAA a1 = new AAA();
        //a1 = new BBB(); // BBB IS-A AAA
        BBB b3 = (BBB)a1; // ClassCastException, hinter a1 befindet sich kein BBB-Objekt

        b1 = 10;
        b2 = 20;

        //System.out.println("erg:" + b2 - b1);
        //System.out.println("erg:" + b2 * b1);

        //int[] arr2[];
        //int[][] arr2;
        //int arr2[][];

        int i[], j; // i ist ein int-array, j ist ein int
        int[] x, y; // x und y sind int-arrays
        int[] o, p[]; // o ist ein 1d int-array und p ist ein 2d int-array

        for(int k = 0; k < 100; k++) {
            System.out.println(k);
        }

        for(int k: new int[]{10,20,30,40,50}) {
            System.out.println(k);
        }

        List<Integer> zahlen = List.of(1,2,3,4,5,6,7,8,9,10);
        zahlen.forEach(z -> System.out.println(z));
        //zahlen.forEach(); // Braucht einen Consumer als Parameter

        final int xx = 10; // Kompiletime-Konstante
        final int yy;
        yy = 20; // Runtime-Konstante

        Integer z = 10;
        Object o1 = z;
        // z.equals(10.0);

        // Object > Number > Integer

        System.out.println(z instanceof Object); // true
        System.out.println(z instanceof Number); // true
        System.out.println(o1 instanceof Double); // false

    }

}

class AAA {
}

class BBB extends AAA {
}