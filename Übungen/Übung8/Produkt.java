package Übung8;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

class Produkt {
    @JsonFormat(pattern = "dd.MM.yyyy HH:mm:ss")
    private LocalDateTime datum;
    protected String name;
    public String beschreibung;
    public int menge;
    public double preis;

    public Produkt() {
    }

    public Produkt(String name, String beschreibung, int menge, double preis) {
        this.datum = LocalDateTime.now();
        this.name = name;
        this.beschreibung = beschreibung;
        this.menge = menge;
        this.preis = preis;
    }

    // Getter-Methode für das Datum in einem bestimmten Format
    public String getDatum() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm:ss");
        return datum.format(formatter);
    }

    // Getter-Methoden für die anderen Eigenschaften
    public String getName() {
        return name;
    }

    public String getBeschreibung() {
        return beschreibung;
    }

    public int getMenge() {
        return menge;
    }

    public double getPreis() {
        return preis;
    }
}
