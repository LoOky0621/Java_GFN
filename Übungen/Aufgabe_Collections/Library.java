package Aufgabe_Collections;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Library implements Serializable {
    private static final long serialVersionUID = 1L;

    private List<Book> bücher = new ArrayList<>();

    public void buchHinzufügen(Book buch) {
        bücher.add(buch);
    }

    public List<Book> sucheBücher(String suchbegriff) {
        List<Book> ergebnis = new ArrayList<>();
        for (Book buch : bücher) {
            if (buch.getTitel().toLowerCase().contains(suchbegriff.toLowerCase()) ||
                    buch.getAutor().toLowerCase().contains(suchbegriff.toLowerCase()) ||
                    buch.getBeschreibung().toLowerCase().contains(suchbegriff.toLowerCase())) {
                ergebnis.add(buch);
            }
        }
        return ergebnis;
    }

    public void alleBücherAnzeigen() {
        for (Book buch : bücher) {
            System.out.println(buch.getTitel() + " von " + buch.getAutor());
            System.out.println("Beschreibung: "+buch.getBeschreibung() + "\nJahr: "+buch.getErscheinungsjahr());
        }
    }
}
