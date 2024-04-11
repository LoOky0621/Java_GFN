package basics;

import java.time.LocalDate;
import java.util.Random;

public class FinalTest {

    // Instanz und Klassenvariablen bekommen defaultwerte
    int zahl; // defaultwert 0 wird zugewisen
    String wort; // defaultwert null wird zugewisen

    // primitive Datentypen:
    // byte, short, int, long = defaultwert: 0
    // float und double = defaultwert: 0.0
    // boolean = defaultwert: false
    // char = defaultwert: Erstest Zeichen aus der Unicode-Tabelle
    // alle komplexen typen = defaultwert: null

    public static void main(String[] args) {

        //Math.abs(10);

        //LocalDate date = new LocalDate();
        LocalDate date = LocalDate.now(); // Factory-Methode

        // Zufall
        Math.random();
        Random r = new Random();
        r.nextInt(10);

        // Lokale-Variablen bekommen KEINE defaultwerte!!!!!!!!

        int x; // muss vor der Verwendung initialisiert werden
        x = 10;
        System.out.println(x); // x hat keinen Wert. Verwendung nicht erlaubt

        String a; // Nicht initialisiert - kann nicht benutzt werden
        String b = null; // Ist eine NULL-Referenz. Kann verwendet werden - produziert aber ggfl. eine Ausnahme
        String c = ""; // Ist eine Referenz auf ein String Objekt
        String d = new String(""); // Ist eine Referenz auf ein String Objekt

        final int i = 10; // Kostante, kann nicht geändert werden
        // i = 20; // Error

        final int zahlen[] = new int[10]; // Array mit 10 stellen

        int andereZahlen[] = {10,20,30,40,50}; // Array mit 5 Werten

        //zahlen[] = new int[5]; // Neuzuweisung ist nicht erlaubt, da final

        // die Variable zahlen kann kein neues Array zugewiesen bekommen
        // Inhalt des Arrays darf sich aber ändern

        zahlen[0] = 15;
        zahlen[1] = 1;
        zahlen[2] = 18;
        zahlen[3] = 22;

        for(int j = 0; j < zahlen.length; j++) {
            System.out.println(zahlen[j]);
        }
    }

    // int[] = int-Array
    public int[] generateArray(int size) {
        return new int[size];
    }
}
