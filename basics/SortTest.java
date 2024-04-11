package basics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortTest {

    public static void main(String[] args) {

        // Generische Typen sind IMMER komplex
        // List.of seit Java 1.9
        // List<Integer> zahlen = List.of(2,5,7,19,22,18,1,17); // Erzeugt eine gefüllte Liste mit fixen Größe
        List<Integer> zahlen = new ArrayList<>(List.of(2,5,7,19,22,18,1,17)); // Erzeugt eine gefüllte ArrayList mit flexibler Größe

        // Vor Java 1.9
        // List<Integer> zahlen = Arrays.asList(2,5,7,19,22,18,1,17); // Erzeugt eine gefüllte Liste mit fixen Größe

        // zahlen.sort(); // Comparator
        Collections.sort(zahlen); // ohne Comparator
        System.out.println(zahlen);

        System.out.println();

        List<Hero> heros = new ArrayList<>();
        heros.add(new Hero("Spiderman", "Peter Parker"));
        heros.add(new Hero("Black Widow", "Natasha Romanov"));
        heros.add(new Hero("Hulk", "Bruce Banner"));
        heros.add(new Hero("Cap. Marvel", "Carol Danvers"));

        Collections.sort(heros);

        System.out.println(heros);

    }
}

class Hero implements Comparable<Hero> {

    private String name;

    private String publicName;

    public Hero(String name, String publicName) {
        this.name = name;
        this.publicName = publicName;
    }

    public String getName() {
        return name;
    }

    public String getPublicName() {
        return publicName;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Hero{");
        sb.append("name='").append(name).append('\'');
        sb.append(", publicName='").append(publicName).append('\'');
        sb.append('}');
        return sb.toString();
    }

    @Override
    public int compareTo(Hero other) {
        //return name.compareTo(other.name);
        //return other.name.compareTo(name);
        return publicName.compareTo(other.publicName);
    }
}
