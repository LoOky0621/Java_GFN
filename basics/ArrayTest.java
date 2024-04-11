package basics;

//import jdk.swing.interop.SwingInterOpUtils;

import java.util.Arrays;

public class ArrayTest {

    public static void main(String[] args) {

        int[] arr1 = new int[10]; // Leeres Array, Größe MUSS vorgegeben werden

        int[] arr2 = {2,4,5,8,10,22}; // nur bei gleichzeitiger Deklaration erlaubt
        // arr2 = {10,20,30}; // Error
        arr2 = new int[]{2,4,5,8,10,22}; // Bei Neuzuweisung diese Schreibweise

        // Können komplex oder primitiv sein
        String[] arr3;
        User[] arr4;
        byte[] arr5;

        System.out.println(arr2);
        System.out.println(Arrays.toString(arr2));

        for (int i = 0; i < arr2.length ; i++) {
            System.out.println(arr2[i]);
        }

        System.out.println();

        for (int wert : arr2) {
            System.out.println(wert);
        }

        arr2[3] = 22;
        System.out.println(Arrays.toString(arr2));
        System.out.println(arr2[3]);

        try {
            System.out.println(arr2[10]);
        }
        catch(Exception e) {
            System.out.println(e.getMessage());
        }

        System.out.println("Programmende");


        int a, b, c; // 3 int Varaiablen werden deklariert
        int x = 10, y = 20;

        int a3[];
        //int[] a3;

        // int[] a1, a2; // a1 ist ein int-Array, a2 ist int-Array
        // int a1[], a2; // a1 ist ein int-Array, a2 ist int
        int[] a1[], a2; // a1 ist ein 2d-int-Array, a2 ist int-Array

        int[][] fields = new int[5][5];

        /*
        [
            0: [0,0,0,0,0],
            1: [0,0,0,0,0],
            2: [0,0,0,0,0],
            3: [0,0,0,0,0],
            4: [0,0,0,0,0],
        ]
        */

        fields = new int[5][];
        fields[2] = new int[5];
        fields[1] = new int[2];

        /*
        [
            0: null,
            1: [0,0],
            2: [0,0,0,0,0],
            3: null,
            4: null,
        ]
        */

        for (int[] row : fields) {

            if(row == null) continue;

            for (int col : row) {
                System.out.print(col + ", ");
            }
            System.out.println();
        }

        int[] zahlen = new int[20];
        for (int i = 0; i < zahlen.length; i++) {
            zahlen[i] = (int)(Math.random() * 100) + 1;
        }

        // 1,5,3,2,4,2,1
        // 1,1,2,2,3,4,6
        // Binärsuche funktioniert nur auf sortierten Mengen

        // Arrays = Utility-Klasse: Hat einen privaten Konstruktor und nur statische Methoden

        Arrays.sort(zahlen); // Array wird sortiert
        int erg = Arrays.binarySearch(zahlen, 95);
        System.out.println(Arrays.toString(zahlen));
        System.out.println(erg);

    }
}
