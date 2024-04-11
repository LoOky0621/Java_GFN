package basics;

public class InitializerTest {

    //public static final int ZAHL = 10;
    public static final int ZAHL;

    // screamin-snake-case wird hauptsächlich für public Konstanten benutzt
    public final int ANDERE_ZAHL;

    // statischer Initializer - wird nach dem Laden der Klasse ausgeführt
    static {
        ZAHL = 10;
    }

    // Instanz-Initializer - wird vor dem Konstruktor ausgeführt
    {
        //ANDERE_ZAHL = 200;
    }

    public InitializerTest() {
        //ZAHL = 10; // Zuweisung erfolgt zu spät
        // Instanz-Konstanten müssen spätestens im Konstruktor einen Wert bekommen
        ANDERE_ZAHL = 300;
    }
}
