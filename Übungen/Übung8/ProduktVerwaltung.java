package Übung8;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.type.CollectionType;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class ProduktVerwaltung {

    private static final String DATEI_NAME = "produkte.json";

    private static final ObjectMapper objectMapper = new ObjectMapper().registerModule(new JavaTimeModule());

    public static void main(String[] args) throws IOException{
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Produkt> produktListe = ladeProdukte();

        while (true) {
            System.out.println("\nAktion auswählen:");
            System.out.println("1. Neues Produkt erstellen");
            System.out.println("2. Vorhandene Produkte anzeigen");
            System.out.println("3. Produkt bearbeiten");
            System.out.println("4. Produkt löschen");
            System.out.println("5. Programm beenden");

            String auswahl = input.readLine();

            switch (auswahl) {
                case "1":
                    Produkt neuesProdukt = produktErstellen();
                    produktListe.add(neuesProdukt);
                    speichereProdukte(produktListe);
                    System.out.println("Produkt erstellt!");
                    break;

                case "2":
                    produkteAnzeigen(produktListe);
                    break;

                case "3":
                    produktBearbeiten(produktListe);
                    break;

                case "4":
                    produktLoeschen(produktListe);
                    speichereProdukte(produktListe);
                    break;

                case "5":
                    System.out.println("Programm beendet.");
                    System.exit(0);

                default:
                    System.out.println("Ungültige Eingabe. Bitte wählen Sie 1, 2, 3, 4 oder 5.");
            }
        }
    }

    private static Produkt produktErstellen() throws IOException{
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Produktname: ");
        String name = input.readLine();

        System.out.print("Beschreibung: ");
        String beschreibung = input.readLine();

        System.out.print("Menge: ");
        int menge = Integer.parseInt(input.readLine());

        System.out.print("Preis: ");
        double preis = Double.parseDouble(input.readLine());

        return new Produkt(name, beschreibung, menge, preis);
    }

    private static void produkteAnzeigen(ArrayList<Produkt> produkte) {
        System.out.println("\nListe der vorhandenen Produkte:");
        for (Produkt produkt : produkte) {
            System.out.println("\nDatum: " + produkt.getDatum());
            System.out.println("Produktname: " + produkt.getName());
            System.out.println("Beschreibung: " + produkt.getBeschreibung());
            System.out.println("Menge: " + produkt.getMenge());
            System.out.println("Preis: " + produkt.getPreis() + " Euro");
        }
    }

    private static void produktBearbeiten(ArrayList<Produkt> produkte) throws IOException{
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Produktname zum Bearbeiten eingeben: ");
        String produktName = input.readLine();

        for (Produkt produkt : produkte) {
            if (produkt.getName().equalsIgnoreCase(produktName)) {
                System.out.println("Bearbeiten von Produkt: " + produkt.getName());
                System.out.print("Neuer Produktname (leer lassen, um unverändert zu lassen): ");
                String neuerName = input.readLine();
                if (!neuerName.isEmpty()) {
                    produkt.name = neuerName;
                }

                System.out.print("Neue Beschreibung (leer lassen, um unverändert zu lassen): ");
                String neueBeschreibung = input.readLine();
                if (!neueBeschreibung.isEmpty()) {
                    produkt.beschreibung = neueBeschreibung;
                }

                System.out.print("Neue Menge (0 lassen, um unverändert zu lassen): ");
                int neueMenge = Integer.parseInt(input.readLine());
                if (neueMenge != 0) {
                    produkt.menge = neueMenge;
                }

                System.out.print("Neuer Preis (0.0 lassen, um unverändert zu lassen): ");
                double neuerPreis = Double.parseDouble(input.readLine());
                if (neuerPreis != 0.0) {
                    produkt.preis = neuerPreis;
                }

                System.out.println("Produkt bearbeitet!");
                speichereProdukte(produkte);
                return;
            }
        }

        System.out.println("Produkt nicht gefunden.");
    }

    private static void produktLoeschen(ArrayList<Produkt> produkte) throws IOException{
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Produktname zum Löschen eingeben: ");
        String produktName = input.readLine();

        produkte.removeIf(produkt -> produkt.getName().equalsIgnoreCase(produktName));

        System.out.println("Produkt gelöscht!");
    }

    private static ArrayList<Produkt> ladeProdukte() {
        File datei = new File(DATEI_NAME);

        if (datei.exists()) {
            try {
                CollectionType listType = objectMapper.getTypeFactory().constructCollectionType(ArrayList.class, Produkt.class);
                return objectMapper.readValue(datei, listType);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        return new ArrayList<>();
    }

    private static void speichereProdukte(ArrayList<Produkt> produkte) {
        try {
            objectMapper.writeValue(new File(DATEI_NAME), produkte);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

