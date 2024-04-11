package basics;

public class KontrollstrukturenTest2 {

    public static void main(String[] args) {

        // Endlosschleife
        /*
        for (;;) {
            System.out.println(".");
        }
        */

        //for (;; System.out.println("."));

        for (int i = 0; i < 100; i++) {
            System.out.println(i);
        }

        int i = 0;
        while(i < 100) {
            System.out.println(i++);
        }

    }

}
