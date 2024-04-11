package io;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SerializeTest {

    private static final String FILE_NAME = "namen.ser";

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        // Altdaten werden eingelesen
        List<String> namen = readFromFile();
        System.out.println("Altdaten:");
        System.out.println(namen);

        System.out.print("\nNeuer Namen: ");
        String name = scanner.nextLine().trim();
        namen.add(name);

        writeInFile(namen); // Schreibt die neuen Daten ins File

    }

    public static void writeInFile(List<String> data) {

        try(OutputStream out = new FileOutputStream(FILE_NAME);
            ObjectOutputStream oos = new ObjectOutputStream(out)) {

            oos.writeObject(data); // Objekte werden serialisiert und in eine Datei geschrieben

        }
        catch(FileNotFoundException e) {
            System.out.println("Datei nicht verfügbar.");
        }
        catch(IOException e) {
            System.out.println("Probleme beim Schreiben in die Datei.");
        }
    }

    public static List<String> readFromFile() {

        try(InputStream in = new FileInputStream(FILE_NAME);
            ObjectInputStream ois = new ObjectInputStream(in)) {

            // readObject liefert ein Object zurück. Das muss in den passenden Typ gecastet werden
            return (List<String>) ois.readObject(); // Serialisierte Daten aus Datei einlesen und in Objekte umwandeln

        }
        catch(ClassNotFoundException e) {
            System.out.println("Probleme beim Deserialisieren der Daten.");
        }
        catch(IOException e) {
            System.out.println("Probleme beim Lesen der Daten aus der Datei.");
        }

        return new ArrayList<>(); // Wenn Probleme autauchen, wird eine leere Liste zurückgegeben
    }
}
