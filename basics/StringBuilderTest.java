package basics;

public class StringBuilderTest {

    public static void main(String[] args) {

        String output = "";

        for (int i = 0; i <= 100; i++) {
            output += i + ", ";
        }

        System.out.println(output);

        System.out.println();

        StringBuilder sb = new StringBuilder(); // Default-Array-Size: 16
        // Sobald Size überschritten wird: neueSize = alteSize * 2 + 2;

        sb = new StringBuilder(303); // Array-Size: 303

        sb = new StringBuilder(0); // 0 * 2 + 2

        sb = new StringBuilder("Start: "); // Array-Size: Anzahl Zeichen (7) + 16 = 23

        for (int i = 0; i <= 100; i++) {
            // sb.append(i);
            // sb.append(", ");
            sb.append(i).append(", ");
            // sb.append(i + ", ");
        }

        System.out.println(sb); // toString wird automatisch verwendet

        // sb.setLength(int size); // Kürzt/Erweitert den Inhalt auf vorgegebe länge
        // sb.ensureCapacity(); // Sichert zu, dass eine ausreichende Kapazität vorhanden ist
        // sb.trimToSize(); // Kürzt die capacity auf Anzahl der Zeichen

        sb.delete(5, 10); // Löscht Zeichen zwischen zwei Positionen
        // 5 Startindex, 10 Endindex. Startindex inklusive, Endindex IMMER exclusive

        sb.insert(10, "Text..."); // Fügt neue Zeichen an gewünschter Position
        sb.replace(10, 20, "***zensiert***"); // Ersetzt Zeichen
        sb.reverse(); // Inhalt umdrehen
        sb.length(); // Anzahl der Zeichen
        sb.capacity(); // Größe des internen Array

    }
}
