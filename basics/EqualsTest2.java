package basics;

import java.util.Arrays;

public class EqualsTest2 {

    public static void main(String[] args) {

        int[] arr1 = {1,2,3};
        int[] arr2 = {1,2,3};
        int[] arr3 = {1,2,4}; // 1.equals(1)
        Integer[] arr5 = {1,2,4}; // new Integer(1).equals(new Integer(1))
        Integer[] arr6 = {1,2,4};

        System.out.println(arr1.equals(arr2)); // false - equals aus Object wird verwendet
        System.out.println(Arrays.equals(arr1, arr2)); // Vergleicht den Inhalt
        System.out.println(Arrays.equals(arr1, arr3));
        //System.out.println(Arrays.deepEquals(arr1, arr3)); // Primitive Werte (int) haben kein equals
        System.out.println(Arrays.deepEquals(arr5, arr6)); // Integer hat equals

    }
}
