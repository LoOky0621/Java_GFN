package exceptions;

public class UncheckedTest {

    public static void main(String[] args) {
        new UncheckedTest().start();
    }

    private void start() {
        System.out.println("START");
        m1();
        System.out.println("START: Ende");
    }

    private void m1() {
        System.out.println("M1");
        m2();
        System.out.println("M1: Ende");
    }

    private void m2() {
        System.out.println("M2");
        try {
            m3();
        }
        catch(Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.println("M2: Ende");
    }

    private void m3() {
        System.out.println("M3");
        m4();
        System.out.println("M3: Ende");
    }

    private void m4() {
        System.out.println("M4");
        // Eine Exception MUSS geworfen werden, damit sie gefangen werden kann

        final boolean ex; // Runtime-Konstante
        ex = true;

        if(ex) {
            throw new RuntimeException("Tue das nicht Dave!");
        }
        System.out.println("M4: Ende");
    }
}
