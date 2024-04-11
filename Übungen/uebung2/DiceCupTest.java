package uebung2;

import java.util.Scanner;

public class DiceCupTest {

    private Scanner scanner = new Scanner(System.in);

    // Für statische Methoden wird kein Objekt benötigt - sie werden auf der Klasse (Bauplan) ausgeführt
    public static void main(String[] args) {
        //DiceCupTest test = new DiceCupTest();
        //test.start();

        // Ohne ein Objekt können Instanzmethoden nicht verwendet werden
        new DiceCupTest().start(); // DiceCupTest wird instanziert und die start-Methode aufgerufen
    }

    private void start() {

       while(true) {

           System.out.print("Eingabe: ");
           String input = scanner.nextLine().trim().toLowerCase();

           if(input.equals("exit")) break;

           switch(input) {

               case "w6":
                   System.out.println("W6 ausgewählt");
                   break;

               case "w10":
                   System.out.println("W10 ausgewählt");
                   break;

               case "w20":
                   System.out.println("W20 ausgewählt");
                   break;

               case "w100":
                   System.out.println("W100 ausgewählt");
                   break;

               default:
                   System.out.println("Keine gültige Eingabe");
           }

       }

        System.out.println("Programmende");
    }
}
