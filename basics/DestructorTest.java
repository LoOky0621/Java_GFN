package basics;

public class DestructorTest {

    // Kann nachträglich nicht mehr verändert werden
    public static final double PI = 3.14;

    public static void main(String[] args) throws InterruptedException {

        DestructorTest dt = new DestructorTest();
        dt = null; // Referenz zeigt auf null, Objekt kann vom Speicher entfernt werden
        // sobald es entfernt wird, wird die finalize-Methode automatisch aufgerufen

        System.gc(); // Fordert die Müllabfuhr auf tätig zu werden
        Thread.sleep(10_000);

        new DestructorTest().machWas(10);
    }

    void machWas(final int x) {
        // x kann in der Methode nicht verändert werden
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("AGGRRRRRRR..... bis weg!");
    }
}
