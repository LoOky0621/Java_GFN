package vererbung;

public class InterfaceTest {

    public static void main(String[] args) {


    }
}

interface Movable1 {

    void moveTo(int x, int y); // Abstrakte Methode: Muss eingebaut werden!

    // Seit Java 1.8, Standardimplementierungen
    default void moveToStart() { // Einbau ist für die Kindklasse optional
        moveTo(0,0);
    }

    // default Methoden dürfen keine Methoden (equals, hashCode, toString etc.) von Object überschreiben
}

interface Movable2 {

    default void moveToStart() {
    }
}

// Problem: Beide Interfaces vererben eine Methode mit der gleichen Signatur
class Fahrzeug implements Movable1, Movable2 {

    @Override
    public void moveTo(int x, int y) {
    }

    // Lösung: Klasse benutzt nicht die geerbten Methoden sondern hat eine eigene
    @Override
    public void moveToStart() {
        //...
    }
}

interface FirstInterface {

    void methodA();

}

interface NextInterface {

    void methodA();

    void methodB();
}

interface LastInterface extends FirstInterface, NextInterface {

    void methodC();

}

// Eine Klasse, die LastInterface implementiert muss auch alle Methoden von First- und NextInterface einbauen
class MyClass implements LastInterface {

    @Override
    public void methodA() {

    }

    @Override
    public void methodB() {

    }

    @Override
    public void methodC() {

    }
}