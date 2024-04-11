package exceptions;

import java.io.IOException;

public class ExceptionTest2 {

    final int x = 10; // Instanzvariable

    public static void main(String[] args) {

        final int x = 10; // Lokale Variable

        try {
            Exception ex = createException();
            // Exception ist Rückgabe-Typ und wird nicht geworfen!
        }
        catch(RuntimeException e) {
            // Können immer behandelt werden
        }
        /*
        catch(IOException e) {
           // CheckExceptions können nur gefangen werden, wenn im try eine solche auftauchen kann!
        }
        */
        catch(Exception e) { // ist Checked
            // Können immer behandelt werden
        }


        try {
            createSomething();
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ARRAY EXCEPTION");
        }
        catch (RuntimeException e) {
            System.out.println("RUNTIME EXCEPTION");
        }
        catch (Exception e) {
            System.out.println("EXCEPTION");
        }
    }

    public static IOException createException() {
        return new IOException();
    }

    public static String createSomething() throws Exception {
        //throw new ArrayIndexOutOfBoundsException();
        //throw new NullPointerException();
        throw new IOException();
        //return "Hallo";
    }
}

