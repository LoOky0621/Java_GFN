package interfaces;

public class InterfaceTest1 {
}

class School {

    // Tightly coupling - NEGATIV
    // Koplung mit einer konkreten Klassen - wenig Möglichkeiten für Erweiterungen
    // Teacher t;
    // Student s;

    // Loose coupling - POSITIV
    // Koplung mit einer Gruppe von Klassen, die die Anforderung des Interface erfüllt
    Unterrichtend u;
    Lernend l;

}

interface Lernend {

    //Methoden zum Lernen
}

interface Unterrichtend {

    //Methoden zum Lehren
}

class Teacher implements Unterrichtend {

}

class Student implements Lernend {

}
