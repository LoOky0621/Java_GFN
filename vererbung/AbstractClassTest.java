package vererbung;

import java.util.ArrayList;
import java.util.List;

public class AbstractClassTest {

    public static void main(String[] args) {

        // Referenztyp      // Objekttyp
        AbstractMensch m1 = new Student();
        m1.setVorname("Bruce");
        m1.setNachname("Banner");
        m1.sayHello(); // Instanzmethoden werden IMMER auf dem Objekttyp ausgeführt

        m1 = new Arbeiter();
        m1.setVorname("Peter");
        m1.setNachname("Parker");
        m1.sayHello();

        print(m1);
        print(new Student());
        print(new Arbeiter());

        System.out.println();

        List<AbstractMensch> menschen = new ArrayList<>();
        menschen.add(m1);
        menschen.add(new Student());

        Arbeiter a = new Arbeiter();
        a.setVorname("Carol");
        a.setNachname("Danvers");
        a.setPersonalNr("12345678");
        menschen.add(a); // menschen-List ist kompatibel mit allen Klassen, die von AbstractMensch abgeleitet sind

        for (AbstractMensch m: menschen) {
            System.out.println(m.getVorname() + " " + m.getNachname());
        }
    }

    public static void print(AbstractMensch mensch) {
        mensch.sayHello();
    }
}

abstract class AbstractMensch { // Abstrakte Klassen dürfen nicht final sein

    private String vorname = "Unbekannt";

    private String nachname = "Unbekannt";

    public String getVorname() {
        return vorname;
    }

    public void setVorname(String vorname) {
        this.vorname = vorname;
    }

    public String getNachname() {
        return nachname;
    }

    public void setNachname(String nachname) {
        this.nachname = nachname;
    }

    // Abstrakte Methoden dürfen nicht final sein
    public abstract void sayHello(); // Abstrakte Methode: muss in den Kindklassen eingebaut werden
}

class Student extends AbstractMensch {

    private String matrikelNr;

    public String getMatrikelNr() {
        return matrikelNr;
    }

    public void setMatrikelNr(String matrikelNr) {
        this.matrikelNr = matrikelNr;
    }

    @Override
    public String getVorname() {
        return super.getVorname().toUpperCase();
    }

    @Override
    public void sayHello() {
        System.out.println("Hallo. Mein Name ist " + getVorname() + " " + getNachname() + ". Ich bin ein Student.");
    }
}

class Arbeiter extends AbstractMensch {

    private String personalNr;

    public String getPersonalNr() {
        return personalNr;
    }

    public void setPersonalNr(String personalNr) {
        this.personalNr = personalNr;
    }

    @Override
    public void sayHello() {
        System.out.println("Hi. Ich bin " + getVorname() + " " + getNachname() + ". Ich bin ein Arbeiter.");
    }
}
