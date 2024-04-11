package basics;

public class PolyTest1 {

    public static void main(String[] args) {

        AAAA aaaa = new AAAA();
        aaaa.machWas();
        aaaa.machWasStatic(); // Der Aufruf wird zur Laufzeit als AAAA.machWasStatic(); ausgeführt
        System.out.println(aaaa.zahl);

        System.out.println();

        // Instanzmethoden werden IMMER auf dem Objekttyp ausgeführt
        // Statische Methoden werden IMMER auf dem Referenztyp ausgeführt
        // Variablen werden auf dem Referenztyp ausgeführt

        aaaa = new BBBB();
        aaaa.machWas();
        aaaa.machWasStatic(); // Der Aufruf wird zur Laufzeit als AAAA.machWasStatic(); ausgeführt
        System.out.println(aaaa.zahl);
    }
}

class AAAA {

    public int zahl = 10;

    void machWas() {
        System.out.println("AAAA: machWas");
    }

    static void machWasStatic() {
        System.out.println("AAAA: machWasStatic");
    }
}

class BBBB extends AAAA {

    public int zahl = 20;

    @Override
    void machWas() {
        System.out.println("BBBB: machWas");
    }

    static void machWasStatic() {
        System.out.println("BBBB: machWasStatic");
    }
}
