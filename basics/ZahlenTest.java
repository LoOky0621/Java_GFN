package basics;

public class ZahlenTest {

    public static void main(String[] args) {

        int x = 10;
        int y = 0;
        // System.out.println(x / y); // ArithmeticException bei Ganzzahlen

        double xx = 10;
        double yy = 0;
        Double erg = xx / yy;
        if(erg.isInfinite()) {
            System.out.println("Problem!");
        }

    }
}
