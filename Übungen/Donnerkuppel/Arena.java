package Donnerkuppel;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Arena {
    private static Kämpfer kämpfer1;
    private static Kämpfer kämpfer2;
    private static int counter1 = 0;
    private static int counter2 = 0;
    private static int rundenanzahl = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Willkommen in der Arena!!");
            System.out.println("----------Menü-------");

        while(true) {
            System.out.println("1: 1. Kämpfer erstellen");
            System.out.println("2: 1. Kämpfer ändern");
            System.out.println("3: 2. Kämpfer erstellen");
            System.out.println("4: 2. Kämpfer ändern");
            System.out.println("5: Arena betreten");
            System.out.println("6: Programm verlassen");
            int eingabe = Integer.parseInt(input.readLine());
            if (eingabe!=6)
                menü(eingabe);
            else
                break;
        }
    }

    public static void menü(int eingabe) {

        switch (eingabe) {
            case 1:
                kämpfer1 = erstelleZufälligenKämpfer();
                System.out.println("1. Kämpfer wurde erstellt.");
                kämpferAusgabe(kämpfer1);
                break;
            case 2:
                if (kämpfer1 != null) {
                    kämpfer1 = erstelleZufälligenKämpfer();
                    kämpferAusgabe(kämpfer1);
                    System.out.println("1. Kämpfer wurde geändert.");
                } else {
                    System.out.println("1. Kämpfer wurde noch nicht erstellt.");
                }
                break;
            case 3:
                kämpfer2 = erstelleZufälligenKämpfer();
                System.out.println("2. Kämpfer wurde erstellt.");
                kämpferAusgabe(kämpfer2);
                break;
            case 4:
                if (kämpfer2 != null) {
                    kämpfer2 = erstelleZufälligenKämpfer();
                    kämpferAusgabe(kämpfer2);
                    System.out.println("2. Kämpfer wurde geändert.");
                } else {
                    System.out.println("2. Kämpfer wurde noch nicht erstellt.");
                }
                break;
            case 5:
                if (kämpfer1 != null && kämpfer2 != null) {
                    vergleicheKämpfer(kämpfer1, kämpfer2);
                } else {
                    System.out.println("Beide Kämpfer müssen erstellt sein, bevor die Arena betreten wird.");
                }
                break;
            default:
                System.out.println("Programm wird beendet.");
                break;
        }
    }
    public static Kämpfer erstelleZufälligenKämpfer() {
        Kämpfer kämpfer = new Kämpfer(Eigenschaften.bezeichnung(),
                Eigenschaften.angriff(),
                Eigenschaften.beweglichkeit(),
                Eigenschaften.gesundheit());
        return kämpfer;
    }

    public static void kämpferAusgabe(Kämpfer kämpfer) {
        String kämpferInfo = "Name: " + kämpfer.getName() + "\n" +
                "Stärke: " + kämpfer.getStärke() + "\n" +
                "Agilität: " + kämpfer.getAgilität() + "\n" +
                "Lebenspunkte: " + kämpfer.getLebenspunkte() + "\n" +
                "---------------------";
        System.out.println(kämpferInfo);
    }

    public static void vergleicheKämpfer(Kämpfer kämpfer1, Kämpfer kämpfer2) {
        Kämpfer starter = (kämpfer1.getAgilität() >= kämpfer2.getAgilität()) ? kämpfer1 : kämpfer2;
        Kämpfer nichtStarter = (starter == kämpfer1) ? kämpfer2 : kämpfer1;

        System.out.println(starter.getName() + " fängt an");

        while (kämpfer1.getLebenspunkte() > 0 && kämpfer2.getLebenspunkte() > 0) {
            trefferAusgabe(starter, nichtStarter);
        }
        erkläreSieger(kämpfer1, kämpfer2);
    }

    public static void trefferAusgabe(Kämpfer kämpfer, Kämpfer gegner) {

        if(ausweichen(kämpfer)) {
            System.out.println(kämpfer.getName() + " hat nicht getroffen");
            counter1++;
        }
        else {
            System.out.println("Treffer von: " + kämpfer.getName());
            System.out.print(gegner.getName() + " Verliert: ");
            System.out.println(kämpfer.getStärke());
            gegner.setLebenspunkte(gegner.getLebenspunkte() - kämpfer.getStärke());
        }
        System.out.println(gegner.getName() + " hat noch: " + gegner.getLebenspunkte());
        System.out.println("-------------------------");

        if(ausweichen(gegner)) {
            System.out.println(gegner.getName() + " hat nicht getroffen");
            counter2++;
        }
        else {
        System.out.println("Treffer von: " + gegner.getName());
        System.out.print(kämpfer.getName() + " Verliert: ");
        System.out.println(gegner.getStärke());
        kämpfer.setLebenspunkte(kämpfer.getLebenspunkte() - gegner.getStärke());
        }
        System.out.println(kämpfer.getName() + " hat noch: " + kämpfer.getLebenspunkte());
        System.out.println("-------------------------");
        rundenanzahl++;
    }

    public static void erkläreSieger(Kämpfer kämpfer, Kämpfer gegner) {
        if (kämpfer.getLebenspunkte() <= 0)
            System.out.println(gegner.getName() + " gewann nach: "+rundenanzahl+" Runden!");
        else
            System.out.println(kämpfer.getName() + " gewann nach: "+rundenanzahl+" Runden!");

        System.out.println(kämpfer.getName()+" ist insgesamt: "+counter2+" male ausgewichen!");
        System.out.println(gegner.getName()+" ist insgesamt: "+counter1+" male ausgewichen!");
        System.out.println();
        System.out.println();
    }
    public static boolean ausweichen(Kämpfer kämpfer){

        double zufallszahl = Eigenschaften.würfel(10, 1);

        return zufallszahl >= kämpfer.getAgilität();
    }
}