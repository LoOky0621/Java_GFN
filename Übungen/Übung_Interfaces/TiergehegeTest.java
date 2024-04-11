package Übung_Interfaces;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.type.CollectionType;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

import static Übung_Interfaces.Tiergehege.*;

public class TiergehegeTest {

    private static final String DATEI_NAME = "Tiere.json";
    private static final ObjectMapper objectMapper = new ObjectMapper().registerModule(new JavaTimeModule());

    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<Tier> tierListe = ladeTiere();

        while (true) {
            System.out.println("\nAktion auswählen:");
            System.out.println("1. Tier hinzufügen");
            System.out.println("2. Vorhandene Tiere anzeigen");
            System.out.println("3. Vorhandene Gehege anzeigen");
            System.out.println("4. Gehege bearbeiten");
            System.out.println("5. Tier löschen");
            System.out.println("6. Programm beenden");

            String auswahl = input.readLine();

            switch (auswahl) {
                case "1":
                    Tier neuesTier = tierHinzufügen();
                    tierListe.add(neuesTier);
                    speichereTiere(tierListe);
                    System.out.println("Tier hinzugefügt!");
                    break;

                case "2":
                    tiereAnzeigen(tierListe);
                    break;

                case "3":
                    gehegeAnzeigen(tierListe);
                    break;

                case "4":
                    gehegeBearbeiten(tierListe);
                    break;

                case "5":
                    tierLöschen(tierListe);
                    break;

                case "6":
                    speichereTiere(tierListe);
                    System.out.println("Programm beendet.");
                    System.exit(0);

                default:
                    System.out.println("Ungültige Eingabe. Bitte wählen Sie 1, 2, 3, 4, 5 oder 6.");
            }
        }
    }

    private static Tier tierHinzufügen() throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Tiername: ");
        String name = input.readLine();

        System.out.print("Tierart: ");
        String art = input.readLine();

        System.out.println("Nahrung: ");
        System.out.println("(1)Fleischfresser/(2)Pflanzenfresser/Unbekannt: ");
        String auswahl = input.readLine();
        String essen ="";
        switch(auswahl){
            case "1":
                essen = "Fleischfresser";
                break;
            case "2":
                essen = "Pflanzenfresser";
                break;
            default:
                essen = "Unbekannt";
        }

        System.out.print("Aktiv: ");
        System.out.println("(1)Nachtaktiv/(2)Tagaktiv/Unbekannt: ");
        String auswahl2 = input.readLine();
        String aktiv ="";
        switch(auswahl2){
            case "1":
                aktiv = "Nachtaktiv";
                break;
            case "2":
                aktiv = "Tagaktiv";
                break;
            default:
                aktiv = "Unbekannt";
        }

        System.out.print("Lebensraum: ");
        System.out.println("(1)Wasser/(2)Boden/(3)Luft/(4)Terrarientiere/Unbekannt: ");
        String auswahl3 = input.readLine();
        String lebensraum ="";
        switch(auswahl3){
            case "1":
                lebensraum = "Wasser";
                break;
            case "2":
                lebensraum = "Boden";
                break;
            case "3":
                lebensraum = "Luft";
                break;
            case "4":
                lebensraum = "Terrarientiere";
                break;
            default:
                lebensraum = "Unbekannt";
        }

        return new Tier(name, art, essen, aktiv, lebensraum);
    }

    private static void tiereAnzeigen(ArrayList<Tier> tiere) {
        System.out.println("\nListe der vorhandenen Tiere:");
        for (Tier tier : tiere) {
            System.out.println("Tiername: " + tier.getName());
            System.out.println("Art: " + tier.getArt());
            System.out.println("Nahrung: " + tier.getEssen());
            System.out.println("Aktiv: " + tier.getAktiv());
            System.out.println("Lebensraum: " + tier.getLebensraum());
        }
    }

    private static void gehegeAnzeigen(ArrayList<Tier> tiere) {
        Tiergehege tiergehege = new Tiergehege();

        System.out.println("\nListe der vorhandenen Gehege:");
        for (Tier tier : tiere) {
            System.out.println("Tiername: " + tier.getName());
            System.out.println("Gehege: " + zuweisungGehege(tier, tiergehege));
            System.out.println(starteNachtruhe(tier));
            System.out.println(starteFütterung(tier));
        }
    }
    private static String zuweisungGehege(Tier tier, Tiergehege tiergehege) {
        String lebensraum = tier.getLebensraum().toLowerCase();
        String essen = tier.getEssen().toLowerCase();

        switch (lebensraum) {
            case "boden":
                return essen.equals("fleischfresser") ? tiergehege.getBodenFleischfresserGehege() : tiergehege.getBodenPflanzenfresserGehege();
            case "luft":
                return essen.equals("fleischfresser") ? tiergehege.getLuftFleischfresserGehege() : tiergehege.getLuftPflanzenfresserGehege();
            case "wasser":
                return essen.equals("fleischfresser") ? tiergehege.getWasserFleischfresserGehege() : tiergehege.getWasserPflanzenfresserGehege();
            case "terrarientiere":
                return essen.equals("fleischfresser") ? tiergehege.getTerrariumFleischfresserGehege() : tiergehege.getTerrariumPflanzenfresserGehege();
            default:
                return "Unbekanntes Gehege";
        }
    }

    private static void gehegeBearbeiten(ArrayList<Tier> tiere) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

        // Gehege auflisten
        Tiergehege tiergehege = new Tiergehege();
        System.out.println("\nListe der vorhandenen Gehege:");
        System.out.println("1. " + tiergehege.getBodenPflanzenfresserGehege());
        System.out.println("2. " + tiergehege.getBodenFleischfresserGehege());
        System.out.println("3. " + tiergehege.getLuftPflanzenfresserGehege());
        System.out.println("4. " + tiergehege.getLuftFleischfresserGehege());
        System.out.println("5. " + tiergehege.getWasserPflanzenfresserGehege());
        System.out.println("6. " + tiergehege.getWasserFleischfresserGehege());
        System.out.println("7. " + tiergehege.getTerrariumPflanzenfresserGehege());
        System.out.println("8. " + tiergehege.getTerrariumFleischfresserGehege());
        System.out.println("9. Abbrechen");

        System.out.print("Auswahl treffen (1-9): ");
        String gehegeAuswahl = input.readLine();

        switch (gehegeAuswahl) {
            case "1": case "2": case "3": case "4":
            case "5": case "6": case "7": case "8":
                tiereAnzeigen(tiere);
                break;
            case "9":
                System.out.println("Abgebrochen.");
                break;
            default:
                System.out.println("Ungültige Auswahl. Bitte wählen Sie 1 bis 9.");
        }
    }

    private static void tierLöschen(ArrayList<Tier> tiere) throws IOException{
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Tier zum Löschen eingeben: ");
        String tierName = input.readLine();

        tiere.removeIf(tier -> tier.getName().equalsIgnoreCase(tierName));

        System.out.println("Tier gelöscht!");
    }

    private static ArrayList<Tier> ladeTiere() {
        File datei = new File(DATEI_NAME);

        if (datei.exists()) {
            try {
                CollectionType listType = objectMapper.getTypeFactory().constructCollectionType(ArrayList.class, Tier.class);
                return objectMapper.readValue(datei, listType);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        return new ArrayList<>();
    }

    private static void speichereTiere(ArrayList<Tier> tiere) {
        try {
            objectMapper.writeValue(new File(DATEI_NAME), tiere);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

