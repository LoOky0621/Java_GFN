package generics;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Set;
import java.util.TreeSet;

public class SortierteCollectionsTest {

    public static void main(String[] args) {

        // String implementiert das Comparable-Interface
        Set<String> namen = new TreeSet<>();
        namen.add("Peter");
        namen.add("Bruce");
        namen.add("Bob");
        namen.add("Natasha");
        namen.add("Carol");
        namen.add("Steve");
        namen.add("bruce");
        namen.add("!bruce");
        namen.add("012bruce");
        namen.add("12bruce");

        System.out.println(namen);

        // Integer implementiert das Comparable-Interface
        Set<Integer> zahlen = new TreeSet<>();
        zahlen.add(10);
        zahlen.add(-101);
        zahlen.add(-20);
        zahlen.add(172);
        zahlen.add(1);

        System.out.println(zahlen);

        System.out.println();

        Set<Message> messages = new TreeSet<>(); // Sortiert nach der natürlichen Reihnefolge (Comparable)
        messages.add(new Message("Dies und das!"));
        messages.add(new Message("Und das auch noch!"));
        messages.add(new Message("Und noch ein klein Nachtrag!"));

        System.out.println(messages);
        System.out.println();

        messages = new TreeSet<>((a, b) -> a.getId() - b.getId()); // Sortiert nach dem Comparator
        Message m1 = new Message("Dies und das!");
        Message m2 = new Message("Und das auch noch!");
        Message m3 = new Message("Und noch ein klein Nachtrag!");
        messages.add(m3);
        messages.add(m1);
        messages.add(m2);

        System.out.println(messages);

    }
}

class Message implements Comparable<Message> {

    private static int count;

    private int id;

    private LocalDateTime createdAt;

    private String text;

    public int getId() {
        return id;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public String getText() {
        return text;
    }

    public Message(String text) {
        id = ++count;
        createdAt = LocalDateTime.now();
        this.text = text;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Message{");
        sb.append("id=").append(id);
        sb.append(", createdAt=").append(createdAt);
        sb.append(", text='").append(text).append('\'');
        sb.append('}');
        return sb.toString();
    }


    @Override
    public int compareTo(Message other) {
        // return this.id - other.id; // Sortierung nach der ID
        // return this.createdAt.compareTo(other.createdAt); // Sortierung nach der Erzeugungsdatum
        // return other.createdAt.compareTo(this.createdAt); // Sortierung nach der Erzeugungsdatum umgekehrt
        return this.text.compareTo(other.text); // Sortierung nach dem Nachrichtentext
    }
}
