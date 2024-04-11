package basics;

public class SwitchTest2 {

    public static void main(String[] args) {

        final int v1 = 10; // Kompiletime-Konstante: Deklaration und Zuweisung in einem
        final int v2 = 20;
        final int v3; // Runtime-Konstante
        v3 = 30;
        final int v4 = 40;

        int input = 100;

        switch(input) {

            case v1:
                System.out.print("10");
            default:
                System.out.print("Passt nicht!"); break;
            case v2:
                System.out.print("20");
            //case v3: // Runtime-Konstanten sind als Case nicht erlaubt
            //    System.out.print("30");
            case v4:
                System.out.print("40");

        }

        int x = 5;
        // Postfix ++ setzt zuerst eine Vormerkung für spätere Erhöhung
        if(x++ == 5); // zuerst x == 5 und danach wird x erhöht auf 6

        x = 5;
        if(++x == 5); // zuerst x erhöht auf 6 == 5


        int y = 50;
        y = y++ + 10; // Neuzuweisung von y überschreibt die ++ Vormerkung

        int i = 10;
        i++; // i = (int)(i + 1);

        //10++; // 10 = 10 + 1;

        ;

        // for(;;);

        if(i < 10) {
            System.out.println(i);
            //...
        }

        if(i < 10) System.out.println(i);
        else System.out.println(i); // OK

        if(i < 10); System.out.println(i);
        //else System.out.println(i); // Error!

        String[] arr = {"Peter", "Bruce", "Carol"};
        System.out.println(arr.length); // length vom Array
        //System.out.println(arr[0].length); // Error: length vom Wert auf dem Index 0, String
        System.out.println(arr[0].length()); // length vom Wert auf dem Index 0, String

        int j = 10;
        //                 10    11    13
        System.out.println(j++ + j++ + ++j);

    }
}
