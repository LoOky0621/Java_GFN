package vererbung.b;

import vererbung.a.Person;

public class SpecialPerson extends Person {

    private String localtion;

    public static void main(String[] args) {

        Person p = new Person("Peter", "Parker");
        //p.sayHello(); // Hier wird KEINE vererbung benutzt
        // Nur eine SpecialPerson darf die protected Methoden und Eigenschaften von Person verwenden
    }

    public String getLocaltion() {
        sayHello(); // Instanzmethoden nutzen die Vererbung zu Person um die Methode aufzurufen
        return localtion;
    }

    public void setLocaltion(String localtion) {
        this.localtion = localtion;
    }
}
