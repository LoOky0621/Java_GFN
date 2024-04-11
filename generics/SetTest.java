package generics;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class SetTest {

    public static void main(String[] args) {

        Set<String> namen = new HashSet<>();
        namen.add("Peter");
        namen.add("Bruce");

        // Hash basierte Datenstrukturen prüfen beim Hinzufügen den Hashwert des Objektes
        // Ist es gleich einem Objekt immerhalb der Datenstruktur, dann wird equals aufgerufen
        // Ist er nicht gleich, wird es in die Datenstruktur aufgenommen
        if(!namen.add("Peter")) {
            System.out.println("Ist bereits im Set vorhanden");
        }

        for (String s : namen) {
            System.out.println(s);
        }

        /* Set hat keinen Index und keine get-Methode
        for(int i = 0; i < namen.size() ; i++) {
            System.out.println(namen.get(i));
        }
        */

        System.out.println();

        Set<Value> values = new HashSet<>();
        values.add(new Value("Peter"));
        values.add(new Value("Bruce"));
        values.add(new Value("Peter"));
        System.out.println(values);

        values.forEach(v -> System.out.println(v.hashCode()));


    }
}

class Value {

    private String val;

    public Value(String val) {
        this.val = val;
    }

    @Override
    public String toString() {
        return val;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Value value = (Value) o;
        return Objects.equals(val, value.val);
    }

    @Override
    public int hashCode() {
        return Objects.hash(val);
    }
}
