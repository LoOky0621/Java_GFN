package basics;

import java.util.Arrays;

public class ArrayTest5 {

    static int[] arr1 = new int[4];
    int[] arr2 = new int[4];
    static Integer[] arr3 = new Integer[4];
    Integer[] arr4 = new Integer[4];

    int[] arr7; // Null-Referenz

    public static void main(String[] args) {
        new ArrayTest5().start();
    }

    private void start() {

        int[] arr5 = new int[4];
        Integer[] arr6 = new Integer[4];
        int[] arr7; // Wird vom Kompiler entfernt, da es nicht initialisiert ist

        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
        System.out.println(Arrays.toString(arr3));
        System.out.println(Arrays.toString(arr4));
        System.out.println(Arrays.toString(arr5));
        System.out.println(Arrays.toString(arr6));

        System.out.println();

        StringBuilder sb = new StringBuilder("ABC");
        sb.setLength(100);
        sb.append("X");
        System.out.println(sb);

        var y = 10; // seit Java 1.9 möglich
        // y = 10.0; // Nicht erlaut. y ist ein int

        if(y == 15) {
            //...
        }

        if(15 == y) {
            //....
        }

        var z = "Moin"; // z ist ein String

        var b = false;
        if(b = true) { // Zuweisung
            //...
        }

        if(true == b) {
            //...
        }

        int[] arr = {2,4,5,7,19};
        System.out.println(arr);
        System.out.println(Arrays.toString(arr));

        System.out.println(-10 % -3);
        System.out.println(-10 % 3);

        System.out.println(10.0 / 0);

        // int _ = 10; // _ kann in Java 8 und davor verwendet werden. Danach ist es ein Schlüsselwort
    }
}
