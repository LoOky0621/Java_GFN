package generics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

public class SearchTest {

    public static void main(String[] args) {

        List<String> namen = new ArrayList<>(Set.of("Peter", "Bruce", "Carol", "Natasha", "Steve", "Tony", "Scott"));
        System.out.println(namen);

        // BinarySearch funktioniert nur richtig, wenn die Daten sortiert sind!!!!!
        Collections.sort(namen); // Sort funktioniert nur für Listen
        System.out.println(namen);
        int i = Collections.binarySearch(namen, "Olga"); // binarySearch funktioniert nur für Listen
        //int i = Collections.binarySearch(namen, "Steve");
        System.out.println(i);

        Container c1 = new Container();
        c1.addValue("Montag");
        c1.addValue("Dienstag");
        c1.addValue("Mittwoch");

        // c1.getValues().clear(); // die Innere Liste wird von außen geleert!
        // c1.getValues().add("Sonntag"); // Manipuliert die Liste im Container

        for (String s: c1.getValues()) {
            System.out.println(s);
        }
    }
}

class Container {

    private List<String> values = new ArrayList<>();

    public List<String> getValues() {
        // return values; // Statt eine Referenz zurückzugeben
        return Collections.unmodifiableList(values); // Man giobt eine nicht Veränderbare Version der Liste zurück
    }

    public void addValue(String value) {
        this.values.add(value);
    }
}
