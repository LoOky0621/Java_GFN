package Aufgabe_Collections;

import java.io.*;
import java.util.List;

public class LibraryManagement {
    public static void main(String[] args) {
        Library bibliothek = ladeBibliothek();

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            System.out.println("------------------------");
            System.out.println("1. Buch hinzufügen");
            System.out.println("2. Bücher suchen");
            System.out.println("3. Alle Bücher anzeigen");
            System.out.println("4. Programm beenden");
            System.out.print("Geben Sie Ihre Auswahl ein: ");

            try {
                int auswahl = Integer.parseInt(reader.readLine());

                switch (auswahl) {
                    case 1:
                        buchHinzufügen(bibliothek, reader);
                        break;
                    case 2:
                        bücherSuchen(bibliothek, reader);
                        break;
                    case 3:
                        bibliothek.alleBücherAnzeigen();
                        break;
                    case 4:
                        speichereBibliothek(bibliothek);
                        System.out.println("Programm wird beendet.");
                        System.exit(0);
                    default:
                        System.out.println("Ungültige Auswahl. Bitte geben Sie eine Zahl zwischen 1 und 4 ein.");
                }
            } catch (IOException | NumberFormatException e) {
                System.out.println("Fehler beim Lesen der Eingabe. Bitte versuchen Sie es erneut.");
            }
        }
    }

    private static void buchHinzufügen(Library bibliothek, BufferedReader reader) throws IOException {
        System.out.print("Geben Sie die 13-Stellige ISBN ein: ");
        boolean input = false;
        String formattedIsbn ="";
        do {
            String rawIsbn = reader.readLine();

            if (rawIsbn.length() == 13 || rawIsbn.length() == 17) {
                formattedIsbn = Book.formatiereIsbn(rawIsbn);
                System.out.println("Formatierte ISBN: " + formattedIsbn);
                input = true;
            } else
                System.out.print("Das ist keine ISBN-Nummer!\nBitte nochmal Versuchen:");
        }
        while(!input);
        
        System.out.print("Geben Sie den Autor ein: ");
        String autor = reader.readLine();

        System.out.print("Geben Sie den Titel ein: ");
        String titel = reader.readLine();

        System.out.print("Geben Sie das Erscheinungsjahr(YYYY) ein: ");
        int erscheinungsjahr = Integer.parseInt(reader.readLine());

        System.out.print("Geben Sie den Verlag ein: ");
        String verlag = reader.readLine();

        System.out.print("Geben Sie die Beschreibung ein: ");
        String beschreibung = reader.readLine();

        System.out.print("Geben Sie die Seitenanzahl ein: ");
        int seitenanzahl = Integer.parseInt(reader.readLine());

        Book neuesBuch = new Book(formattedIsbn, autor, titel, erscheinungsjahr, verlag, beschreibung, seitenanzahl);
        bibliothek.buchHinzufügen(neuesBuch);

        System.out.println("Buch erfolgreich hinzugefügt.");
    }

    private static void bücherSuchen(Library bibliothek, BufferedReader reader) throws IOException {
        System.out.print("Geben Sie den Suchbegriff ein: ");
        String suchbegriff = reader.readLine();

        List<Book> suchErgebnis = bibliothek.sucheBücher(suchbegriff);

        if (suchErgebnis.isEmpty()) {
            System.out.println("Keine übereinstimmenden Bücher gefunden.");
        } else {
            System.out.println("Übereinstimmende Bücher:");
            for (Book buch : suchErgebnis) {
                System.out.println(buch.getTitel() + " von " + buch.getAutor()+
                        "\nISBN: "+buch.getIsbn());
            }
        }
    }

    private static Library ladeBibliothek() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("bibliothek.ser"))) {
            return (Library) ois.readObject();
        } catch (FileNotFoundException | ClassNotFoundException e) {
            return new Library();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static void speichereBibliothek(Library bibliothek) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("bibliothek.ser"))) {
            oos.writeObject(bibliothek);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
