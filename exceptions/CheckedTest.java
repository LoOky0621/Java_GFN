package exceptions;

public class CheckedTest {

    public static void main(String[] args) {
        new CheckedTest().start();
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
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.println("M2: Ende");
    }

    private void m3() throws Exception{
        System.out.println("M3");
        m4(); // handle? or declare?
        System.out.println("M3: Ende");
    }

    private void m4() throws Exception { // throws sagt aus, dass diese Methode eine CheckedException werfen KANN
        System.out.println("M4");
        // Eine Exception MUSS geworfen werden, damit sie gefangen werden kann

        final boolean ex; // Runtime-Konstante
        ex = true;

        if(ex) {
            throw new Exception("Tue das nicht Dave!"); // Checked-Exception
        }
        System.out.println("M4: Ende");
    }
}
