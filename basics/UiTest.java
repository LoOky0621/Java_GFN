package basics;

import java.util.Scanner;

public class UiTest {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        boolean exit = false;

        //while(!exit) {
        app: while(true) {

            switch(scanner.nextLine().trim().toLowerCase()) {
                case "a":
                    System.out.println("AAAAAAA");
                    break;

                case "b":
                    System.out.println("BBBBBB");
                    break;

                case "exit":
                    //exit = true;
                    break app;

                default:
                    System.out.println("Falsche Eingabe!");

            }
        }
    }
}
