package exceptions;

import java.io.FileWriter;
import java.io.IOException;

public class ExceptionTest {

    public static void main(String[] args) {

        int[] arr = new int[10];
        try {
            System.out.println(arr[100]); // Unchecked: ArrayIndexOutOfBoundsException
        }
        catch(ArrayIndexOutOfBoundsException e) {
            System.out.println("Das Array ist zu klein.");
            //e.printStackTrace();
        }


        try {
            FileWriter out = new FileWriter("data.txt"); // CheckedException: IOException
        } catch (IOException e) {
            System.out.println("Probleme beim Zugriff auf die Datei");
            //e.printStackTrace();
        }

        System.out.println("ENDE");
    }
}
