import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;

class Termin {
    private Date datum;
    private Date uhrzeit;
    private String titel;
    private String beschreibung;

    public Termin(Date datum, Date uhrzeit, String titel, String beschreibung) {
        this.datum = datum;
        this.uhrzeit = uhrzeit;
        this.titel = titel;
        this.beschreibung = beschreibung;
    }

    public Date getDatum() {
        return datum;
    }

    public Date getUhrzeit() {
        return uhrzeit;
    }

    public String getTitel() {
        return titel;
    }

    public String getBeschreibung() {
        return beschreibung;
    }
}

public class Kalender {
    private static ArrayList<Termin> termine = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        auswahl();
    }

    private static void auswahl() throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Termin (h)inzufügen");
        System.out.println("Termine (a)nzeigen");
        System.out.println("Programm (b)eenden");

        System.out.print("Bitte wählen Sie eine Option (h/a/b): ");
        String eingabe = input.readLine();

        if (eingabe.equalsIgnoreCase("h"))
            terminHinzufuegen(input);
        if (eingabe.equalsIgnoreCase("a"))
            termineAnzeigen();
        if (eingabe.equalsIgnoreCase("b"))
            System.out.println("Programm wird beendet.");
    }

    private static void terminHinzufuegen(BufferedReader input) throws IOException {
        System.out.print("Datum (DD-MM-YYYY): ");
        String datumStr = input.readLine();

        System.out.print("Uhrzeit (HH:mm): ");
        String uhrzeitStr = input.readLine();

        System.out.print("Titel: ");
        String titel = input.readLine();

        System.out.print("Beschreibung: ");
        String beschreibung = input.readLine();

        try {
            SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
            Date datum = dateFormat.parse(datumStr);

            SimpleDateFormat timeFormat = new SimpleDateFormat("HH:mm");
            Date uhrzeit = timeFormat.parse(uhrzeitStr);

            Termin termin = new Termin(datum, uhrzeit, titel, beschreibung);
            termine.add(termin);

            System.out.println("Termin erfolgreich hinzugefügt.");
            System.out.println("--------------------------------------");
        } catch (ParseException e) {
            System.out.println("Ungültiges Datums- oder Uhrzeitformat. Bitte verwenden Sie das Format DD-MM-YYYY für das Datum und HH:mm für die Uhrzeit.");
        }
        auswahl();
    }

    private static void termineAnzeigen()throws IOException {
        if (termine.isEmpty()) {
            System.out.println("Keine Termine vorhanden.");
            System.out.println("--------------------------------------");
            //auswahl();
        }

        Collections.sort(termine, Comparator.comparing(Termin::getDatum).thenComparing(Termin::getUhrzeit));

        System.out.println("\nTermine:");
        for (int i = 0; i < termine.size(); i++) {
            Termin termin = termine.get(i);
            System.out.println((i + 1) + ". Datum: " + new SimpleDateFormat("dd-MM-yyyy").format(termin.getDatum()) +
                    ", Uhrzeit: " + new SimpleDateFormat("HH:mm").format(termin.getUhrzeit()) +
                    ", Titel: " + termin.getTitel() + ", Beschreibung: " + termin.getBeschreibung());
        }
        System.out.println("--------------------------------------");
        auswahl();
    }
}
