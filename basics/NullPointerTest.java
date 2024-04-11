package basics;

public class NullPointerTest {

    //static String s = ""; // leerer String
    static String s; // NULL

    public static void main(String[] args) {

        //String s = "Hallo Test";
        // Alle Operationen auf eine Null-Referenz führen zu einer NullPointerException

        /*
        if(s != null & s.length() > 0) {
            System.out.println(s.toLowerCase());
        }
        */

        if(s != null && s.length() > 0) {
            System.out.println(s.toLowerCase());
        }

        int a = 5;
        int b = 10;
        System.out.println(a % b);

        System.out.println();

        // Postfix ++ wird nach der Zuweisung ausgeführt - es sei denn, die Variable wird neu zugewiesen
        a =  a + b + a++;
        // a: 20

        int erg = b++ + ++b + b++; // 34
        System.out.println(erg);
        // b: 13

        double div = 10.0 / 3;

        double sum = 10 / 3 * 2.0;
        System.out.println(sum);
    }
}
