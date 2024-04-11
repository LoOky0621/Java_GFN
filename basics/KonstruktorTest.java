package basics;

public class KonstruktorTest {

    /* Default Konstruktor
    public KonstruktorTest() {
        super();
    }
    */

    public KonstruktorTest(int zahl) {
    }

    public static void main(String[] args) {

        //KonstruktorTest t1 = new KonstruktorTest(); // Verwendet den Defaultkostruktor
        KonstruktorTest t1 = new KonstruktorTest(100);

    }

}


class A {

    private int i;

    public A(int wert) {
        // super(); // Konstruktor von Object wird verwendet
        i = wert;
    }
}

class B extends A {

    private int j;
    private int k;

    public B() {
        super(10); // Konstruktor von A wird verwendet
    }

    private B(int i, int j, int k) {
        super(i);
        this.j = j;
        this.k = k;
    }

    public B(int i, int j) {
        this(i, j, 100); // Verwendet einen anderen Konstruktor aus dieser Klasse
        /*
        super(i);
        this.j = j;
        this.k = 100;
        */
    }

    public B(int i) {
        this(i, 50, 100); // Verwendet einen anderen Konstruktor aus dieser Klasse
        /*
        super(i);
        this.j = j;
        this.k = 100;
        */
    }
}