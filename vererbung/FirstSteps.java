package vererbung;

import java.io.IOException;

public class FirstSteps {

    public static void main(String[] args) {

        Child c1 = new Child();
        //System.out.println(c1.name); // Über Child nicht sichtbar
        System.out.println(c1.getName()); // Getter über Child sichtbar
        c1.setName("Peter"); // Setter über Child sichtbar
        System.out.println(c1.nr);
        //c1.machWas(); // Über Child nicht sichtbar
        c1.machWasAnderes();

        // Referenz sagt aus, was sichtbar ist
        Object o = new Child();
        System.out.println(o.hashCode());

        // Referenztyp     // Objekttyp auf dem Heap
        Child c2    =   new Child();
        Object o2 = c2; // Upcasting
        c2 = null;

        c2 = (Child) o2; // Downcasting, geht nicht automatisch ggfl. ClassCastException

        // Referenztyp        // Objekttyp auf dem Heap
        RuntimeException re = new RuntimeException();
        Exception e = re; // Upcasting - Möglich: RuntimeException IS-A Exception
        re = null;
        // IOException ioe = (IOException) e; // ClassCastException: Objekt auf dem Heap ist eine RuntimeException

        System.out.println();

        Child c3 = new Child();
        c3.print();

    }
}

class Parent {

    private String name = "Unbekannt"; // Wird nicht vererbt
    protected int nr; // Wird vererbt

    public Parent() {
        System.out.println("Parent");
    }

    private void machWas() { // Wid nicht vererbt
        System.out.println("machWas");
    }

    protected void machWasAnderes() { // Wid nicht vererbt
        System.out.println("machWasAnderes");
    }

    public String getName() { // Wird vererbt
        return name;
    }

    public void setName(String name) { // Wird vererbt
        this.name = name;
    }

    @Override
    public String toString() {
        return "PARENT";
    }
}

class Child extends Parent {

    public Child() {
        //super();
        System.out.println("Child");
    }

    @Override
    public String toString() {
        return super.toString() + " CHILD";
    }

    public void print() {
        System.out.println(this.toString()); // Verwendet die Methode aus dieser Elternklasse
        //System.out.println(super.toString()); // Verwendet die Methode aus der Elternklasse
    }
}