package vererbung;

import java.time.LocalDate;

public class VererbungTest1 {

    public static void main(String[] args) {

        A a = new A();
        System.out.println(a); // toString wird automatisch benutzt

        LocalDate.now().format(CustomFormatter.FMT_DATE);

    }
}

class A /* extends Object */ {

    private int value = 100;

    // Die von Object geerbte toString-Methode wird mit einer eigenen Version überlagert
    // primitive Rückgabetypen MÜSSEN gleich bleiben
    // bei komplexen Rückgabetypen kann die Rückgabe auch ein Objekt einer Kindklasse des
    // Original-Rückgabetyps sein

    @Override
    public String toString() {
        return "A: " + value;
    }
}
