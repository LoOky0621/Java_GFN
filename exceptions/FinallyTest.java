package exceptions;

public class FinallyTest {

    public static void main(String[] args) {
        new FinallyTest().start();
    }

    private void start() {

        System.out.println(start(new int[]{2,5,7,9,22,11,8,25,17,19}));

    }

    private int start(int[] arr) {

        try {
            return arr[9];
        }
        catch(ArrayIndexOutOfBoundsException e) {
            return -1;
        }
        finally {
            //System.out.println("Ende");
            // Wird direkt vor dem Verlassen der Methode ausgeführt
            return -10; // Bestimmt den Return der Methode
        }
    }
}
