package vererbung;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class VergleichenTest {

    public static void main(String[] args) {

        // Comparable-Interface: Natürliche Reihenfolge

        // Comparator-Interface: Vergleichsobjekt für verschidene Vergleichsvarianten

        // Referenztyp kann ein Interface, abstrakte Klasse oder eine konkrete Klasse sein
        // Objekttyp MUSS IMMER eine konkrete Klasse sein

        // Referenztyp      // Objekttyp
        List<Box> boxes = new ArrayList<>();

        boxes.add(new Box("Hallo"));
        boxes.add(new Box("Moin"));
        boxes.add(new Box("Salut"));
        boxes.add(new Box("Hi"));
        boxes.add(new Box("Aloha"));

        // Collections.sort(boxes); // Verwendet die natürliche Reihenfolge (Comparable compareTo)

        // Anonyme Klasse
        Comparator<Box> nachDatum = new Comparator<Box>() {
            @Override
            public int compare(Box o1, Box o2) {
                return o1.getCreatedAt().compareTo(o2.getCreatedAt());
            }
        };

        Comparator<Box> nachValueLänge = new Comparator<Box>() {
            @Override
            public int compare(Box o1, Box o2) {
                return o1.getValue().length() - o2.getValue().length();
            }
        };

        //Collections.sort(boxes, nachDatum); // Wird nach Datum sortiert
        //Collections.sort(boxes, nachDatum.reversed()); // Wird nach Datum umgekehrt sortiert
        // Collections.sort(boxes, nachValueLänge); // Wird nach ValueLänge umgekehrt sortiert
        Collections.sort(boxes, nachValueLänge.thenComparing(nachDatum)); // Wird nach ValueLänge und Datumsortiert

        for (Box b : boxes) {
            System.out.println(b); // toString wird verwendet
            //System.out.println(b.getValue());
        }


        StringBuilder sb = new StringBuilder("Das ist ");
        sb.append("ein Haus ").append("von Nikigraus!");

        System.out.println(sb); // verwendet automatisch toString

        // StringBuilder != String
        String output = sb.toString(); // toString konvertiert den StringBuilder in String

    }
}

class Box implements Comparable<Box> {

    private final LocalDateTime createdAt;
    private final String value;

    public Box(String value) {
        createdAt = LocalDateTime.now();
        this.value = value;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public String getValue() {
        return value;
    }

    @Override
    public int compareTo(Box other) { // Natürliche Reihenfolge
        return value.compareTo(other.value); // Sortierung nach value
    }

    @Override // die geerbte toString aus Object wird überlagert
    public String toString() {
        return createdAt + ": " + value;
    }
}
