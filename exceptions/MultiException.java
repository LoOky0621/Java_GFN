package exceptions;

public class MultiException {

    public static void main(String[] args) {

        try {
            //int[] a1 = null;
            //int[] a1 = new int[-10];
            int[] a1 = new int[0];
            machWas(a1);
        }
        catch(NullPointerException e) {
            System.out.println("Es gibt gar kein Array...! GRRRR!!!!");
        }
        catch(NegativeArraySizeException | ArrayIndexOutOfBoundsException e) { // Multicatch
            System.out.println("Das Array ist ungültig!");
        }
        catch(RuntimeException e) {
            System.out.println("Unbekanntes Laufzeit-Problem!");
        }
        catch(Exception e) {
            System.out.println("Unbekanntes Problem!");
        }
        finally {
            System.out.println("Und nu ist alles wieder gut :-)");
        }
    }

    static void machWas(int[] arr) {
        System.out.println(arr[10]);
    }
}
