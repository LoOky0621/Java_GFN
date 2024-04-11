package Arbeitsblatt5;

import java.util.Scanner;

public class Kassensystem {
    private static double summe = 0;
    private static StringBuilder erg = new StringBuilder();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Produkte: ");

        while (true) {
            String produkt = scanner.nextLine();

            if (!produkt.equals("")) {
                addProdukt(produkt);
            } else {
                kassenzettel();
                break;
            }
        }
    }

    private static void addProdukt(String produkt) {
        double preis = Double.parseDouble(produkt);
        summe += preis;
        erg.append(String.format("%.2f", preis)).append("€\n");
    }

    private static void kassenzettel() {
        System.out.println("Kassenzettel");
        System.out.print(erg);
        System.out.println("-------");
        System.out.println(summe + "€");
    }
}
