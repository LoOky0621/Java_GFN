package basics;

public class ArrayTest2 {

    public static void main(String[] args) {

        int[] arr1 = {2,5,7,9,22,18}; // nur bei gleichzeitiger deklaration erlaubt

        int[] arr2;
        //arr2 = {2,5,7,9,22,18}; // hier nicht erlaubt
        arr2 = new int[]{2,5,7,9,22,18}; // ok

        // arr2 = new int[-5]; // Erst zur Laufzeit ein Problem
        System.out.println(arr2[10]); // Erst zur Laufzeit ein Problem

        int[][] arr3 = new int[10][10]; // symetrisch
        int[][] arr4 = new int[10][];

    }

}
