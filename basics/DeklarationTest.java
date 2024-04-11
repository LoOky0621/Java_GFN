package basics;

public class DeklarationTest {

    private int i;
    private static int j;

    public static void main(String[] args) {

        {
            int k;
            //System.out.println(k); // ist nicht initialisiert!
        } // k wird am Ende des Scopes vom Stack entfernt

        String s;

        int k; // Variablen sind im Scope (und in allen seinen Unterscopes) sichtbar in dem sie deklariert wurden

        {
            //int k; // Redeklaration: k aus der Main ist noch vorhanden
        }

        if(true) {
            int x = 100;
        }

        // System.out.println(x); // x ist bereits out-of-scope

    }
}
