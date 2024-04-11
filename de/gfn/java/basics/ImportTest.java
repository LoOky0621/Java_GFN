package de.gfn.java.basics;

import java.util.*; // Alle Klassen aus java.util werden importiert
//import java.util.Date;

// Statische Imports importieren statische Eigenschaften und Methoden
import static java.lang.System.out;
import static java.lang.Math.PI;
import static java.lang.Math.pow;
import static de.gfn.java.basics.Wochentag.*;

public class ImportTest {

    private int zahl = 10; // Instanzvariable
    private static int zahlStatic = 10; // Instanzvariable

    public static void main(String[] args) {
        Date d = new Date();

        System.out.println("Hallo OUT");

        StringBuilder sb = new StringBuilder();
        sb.append("Hallo").append(123).append("Welt");

        out.println("Hi");

        // Math.PI;
        out.println(PI);
        out.println(pow(5, 2));

        out.println(Wochentag.MO); // Ohne import
        out.println(MO); // Mit import

        // machWas(); // Instanzmethoden sind in statischen Methoden nicht verfügbar
        machWasStatisch(); // Kann hier verwendet werden

        //out.println(zahl); // Instanzvariablen sind in statischen Methoden nicht verfügbar
        out.println(zahlStatic); // Kann hier verwendet werden
    }

    void machWas() { // Instanzmethode
    }

    static void machWasStatisch() { // Klassenmethode
    }
}
