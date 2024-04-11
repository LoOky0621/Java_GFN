package basics;

import java.time.LocalTime;

public class KontrollstruktrurenTest {

    public static void main(String[] args) {

        boolean aktiv = true;

        if(aktiv) {
            System.out.println("Super!");
        }

        if(aktiv) {
            System.out.println("Super!");
        }
        else {
            System.out.println("Nicht gut!");
        }

        int i = 10;

        if(i > 0) {
            System.out.println("Super!");
        }
        else if(i > -10) {
            System.out.println("So la la!");
        }
        else {
            System.out.println("Nicht gut!");
        }

        // Nur die nächste Anweisung gehört zum Bereich
        if(aktiv);
            //System.out.println("Super!");
        else System.out.println("Nicht gut!");

        String str;
        if(LocalTime.now().getHour() > 12) {
            str = "Nachmittag";
        }
        else {
            str = "Vormittag";
        }

        str = (LocalTime.now().getHour() > 12) ? "Nachmittag" : "Vormittag";

        System.out.println();

        // switch

        // Ganzzahlenwerte, char, Strings oder ENUMs
        int j = 20;

        final int k = 10;

        switch(j) {
            case 10 + k:
                System.out.println("Montag");
                //break;

            case 20 + k:
                System.out.println("Dienstag");
                //break;

            case 30 + k:
                System.out.println("Mittwoch");
                //break;

            default: // Wird benutzt, wenn kein anderer case passt
                System.out.println("Passt nicht");
        }

        byte b = 20;
        switch(b) {
            case 10:
                System.out.println("Mo");
                break;

            case 120:
                System.out.println("Di");
                break;

            case 127: // muss im Wertbereich von b liegen
                System.out.println("Mi");
                break;

            default:
                System.out.println("Passt nicht");
        }

        System.out.println();

        char c = 'A';
        switch(c) {
            case 65:
                System.out.println("A");
                break;

            case 66:
                System.out.println("B");
                break;

            case 67:
                System.out.println("C");
                break;

            default:
                System.out.println("Passt nicht");
        }

        System.out.println();

        Status stat = Status.GEBLOCKT;
        //stat.ordinal();

        switch(stat) {
            case AKTIV:
                System.out.println("1");
                break;

            case GEBLOCKT:
                System.out.println("2");
                break;

            case GELÖSCHT:
                System.out.println("3");
                break;
        }

        System.out.println(Farbe.GELB);

    }
}

enum Status {
    AKTIV, GEBLOCKT, GELÖSCHT, UNBEKANNT;

    Status() {
        System.out.println("STAT OBJ");
    }
}

enum Farbe {

    GRÜN("00ff00"), ROT("ff0000"), BLAU("0000ff"), SCHWARZ("000000"), GELB("00ffff");

    private final String hex;

    Farbe(String hex) {
        this.hex = '#' + hex;
    }

    public String getHex() {
        return hex;
    }
}