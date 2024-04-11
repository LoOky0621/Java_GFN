package exceptions;

public class CustomExceptionTest {

    public static void main(String[] args) {

        //Exception ex; // Exception hat 5 Konstruktoren

        try {
            System.out.println(calculate(120));
        }
        catch(ZuKleinException e) {
            System.out.println("< " + e.getMessage());
        }
        catch(ZuGrossException e) {
            System.out.println("> " + e.getMessage());
        }
    }

    public static int calculate(int i) {

        if(i > 100) {
            //System.out.println("Zu groß");
            //throw new RuntimeException("Zu groß");
            throw new ZuGrossException();
        }
        else if(i < 0) {
            //System.out.println("Zu klein");
            //throw new RuntimeException("Zu klein");
            throw new ZuKleinException();
        }
        else {
            //return i * i;
            return (int) Math.pow(i, 2);
        }
        // return -1; // Wird nie mehr erreicht
    }
}

class ZuKleinException extends RuntimeException {

    public ZuKleinException() {
        super("Der Wert ist zu klein");
    }
}

class ZuGrossException extends RuntimeException {

    public ZuGrossException() {
        super("Der Wert ist zu gross");
    }
}