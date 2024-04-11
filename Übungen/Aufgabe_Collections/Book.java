package Aufgabe_Collections;

import java.io.Serializable;

public class Book implements Serializable {
    private static final long serialVersionUID = 1L;

    private String isbn;
    private String autor;
    private String titel;
    private int erscheinungsjahr;
    private String verlag;
    private String beschreibung;
    private int seitenanzahl;

    public Book(String formattedIsbn, String autor, String titel, int erscheinungsjahr, String verlag, String beschreibung, int seitenanzahl) {
        this.isbn = formattedIsbn;
        this.autor = autor;
        this.titel = titel;
        this.erscheinungsjahr = erscheinungsjahr;
        this.verlag = verlag;
        this.beschreibung = beschreibung;
        this.seitenanzahl = seitenanzahl;
    }

    public int getErscheinungsjahr() {
        return erscheinungsjahr;
    }

    public String getAutor() {
        return autor;
    }

    public String getTitel() {
        return titel;
    }

    public String getIsbn() {
        return isbn;
    }

    public String getBeschreibung() {
        return beschreibung;
    }

    public static String formatiereIsbn(String isbn) {
        String bereinigteIsbn = isbn.replaceAll("[\\s-]", "");

        return String.format("%s-%s-%s-%s-%s",
                bereinigteIsbn.substring(0, 3),
                bereinigteIsbn.substring(3, 4),
                bereinigteIsbn.substring(4, 8),
                bereinigteIsbn.substring(8, 12),
                bereinigteIsbn.substring(12));//XXX-X-XXXX-XXXX-X
    }
}
