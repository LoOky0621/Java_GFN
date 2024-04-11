package basics;

public class OverloadingTest {

    public static void main(String[] args) {

        // Methoden können überladen werden
        // Paramter- anzahl, typ, reihenfolge muss anders sein

        OverloadingTest ot = new OverloadingTest();
        ot.doSomething();
        ot.doSomething(10);

        // Pflichtparameter
        // ot.doSomething("X"); // Error: Methode nicht verfügbar

        // ot.doSomething(new Object()); // Error: Methode nicht verfügbar

        ot.doSomething(new User());

    }


    // Instanzmethode - nur über ein Objekt nutzbar
    public void doSomething() {
        System.out.println("doSomething");
    }

    public void doSomething(int x) {
        System.out.println("doSomething int");
    }

    public void doSomething(User u) {
        System.out.println("doSomething User");
    }

}
