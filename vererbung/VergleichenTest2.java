package vererbung;

import java.time.LocalDate;
import java.util.*;

public class VergleichenTest2 {

    public static void main(String[] args) {

        List<String> namen = new ArrayList<>();
        namen.add("Peter");
        namen.add("Bruce");
        namen.add("Carol");
        namen.add("Tony");
        namen.add("Steve");
        namen.add("Natasha");

        Collections.sort(namen);
        System.out.println(namen);

        List<Integer> zahlen = new ArrayList<>();
        zahlen.add(10);
        zahlen.add(100);
        zahlen.add(-25);
        zahlen.add(8);
        zahlen.add(11);

        Collections.sort(zahlen);
        System.out.println(zahlen);

        System.out.println();

        NextBox b1 = new NextBox("123456");
        NextBox b2 = new NextBox("123456");

        System.out.println(b1.equals(b2));
        System.out.println(b1.hashCode());
        System.out.println(b2.hashCode());
        System.out.println(b1 == b2);

        //Set<NextBox> menge = new HashSet<>(); // Hash basierter Container
        // Benutzt zuerst hashCode. Wen beide gleich sind wird mit equals weiter geprüft

        System.out.println();

        List<LocalDate> datum = new ArrayList<>();
        datum.add(LocalDate.of(2000, 10, 22));
        datum.add(LocalDate.of(2025, 7, 22));
        datum.add(LocalDate.of(2019, 2, 2));
        datum.add(LocalDate.of(1989, 12, 15));
        datum.add(LocalDate.of(2001, 1, 10));

        //Collections.sort(datum);

        Comparator<LocalDate> nachJahresTag = new Comparator<LocalDate>() {
            @Override
            public int compare(LocalDate o1, LocalDate o2) {
                return o1.getDayOfYear() - o2.getDayOfYear();
            }
        };

        Collections.sort(datum, nachJahresTag);
        System.out.println(datum);

        System.out.println();

        LocalDate ld1 = LocalDate.of(2000, 10, 22);
        LocalDate ld2 = LocalDate.of(2000, 10, 22);

        System.out.println(ld1.equals(ld2)); // Wertvergleich
        System.out.println(ld1.hashCode());
        System.out.println(ld2.hashCode());
        System.out.println(ld2.toString()); // toString
        System.out.println(ld1 == ld2); // Ist es das gleiche Objekt auf dem Heap?
    }
}

class NextBox {

    private String value;

    public NextBox(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("NextBox{");
        sb.append("value='").append(value).append('\'');
        sb.append('}');
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        NextBox nextBox = (NextBox) o;
        return Objects.equals(value, nextBox.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}
