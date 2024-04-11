package basics;

import java.util.Arrays;

public class ArgsTest2 {

    //public static void main(String[] args) {
    //static public final void main(String args[]) {
    public final static void main(String... args) {

        System.out.println(Arrays.toString(args));

        for (int i = 0 /* bei der ersten Ausführung*/ ; i < args.length /* jedes mal */ ; i++ /* Nach dem Body */) {
            System.out.println(args[i]);
        }
        /* i ist out of scope */

        int i = 0;
        for (; i < args.length;) {
            System.out.println(args[i++]);
        }
        /* i ist noch sichtbar */

        for (String s : args) {
            System.out.println(s);
        }

        /*
        String s = "";
        for (s : args) { // Laufvariable muss im for deklariert werden!!!!
            System.out.println(s);
        }
        */

        for (String s : new String[]{"Peter", "Bruce", "Tony"}) {
            System.out.println(s);
        }

        int k = 15;
        do {

        }
        while((k = 10) == 10);

    }
}
