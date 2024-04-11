package basics;

import java.util.Arrays;

public class ArrayTest3 {

    public static void main(String[] args) {

        int[][] arr1 = {{1,2,3}, {4,5,6}};
        int[][] arr2 = {{1,2,3}, {4,5,6}};

        System.out.println(arr1 == arr2); // Referenzvergleich
        System.out.println(arr1[1] == arr2[1]); // Referenzvergleich
        System.out.println(arr1[1][2] == arr2[1][2]); // Wertvergleich
        System.out.println(arr1.equals(arr2)); // Referenzvergleich: equals in Array nicht überschrieben
        System.out.println(Arrays.equals(arr1, arr2));
        System.out.println(Arrays.equals(arr1[1], arr2[1])); // Wertevergleich

        System.out.println();

        int[][] arr3 = new int[2][];
        System.out.println(Arrays.toString(arr3));

        X x1 = new Z(); // Z IS-A X
        Exception e1 = new Z(); // Z IS-A Exception
        Object o1 = new Z(); // Z IS-A Object
    }
}

class X extends Exception {

}

class Y extends X {

}

class Z extends Y {

}
