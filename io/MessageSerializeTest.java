package io;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MessageSerializeTest {

    private static final String FILE_NAME = "messages.ser";

    private final Scanner scanner = new Scanner(System.in);

    private final List<Message> messages;

    public MessageSerializeTest() {
        this.messages = readFromFile(); // Daten werden aus der Datei gelesen und deserialisiert
    }

    public static void main(String[] args) {
        new MessageSerializeTest().start(); // Wechsel vom statischen Kontext auf Instanz-Kontext
    }

    private void start() {

        System.out.println("Alte Nachrichten:");
        for(Message m : messages) {
            System.out.println(m);
        }

        System.out.println();

        messages.add(new Message("Unser Lager ist fast leer!"));
        messages.add(new Message("Die Tomaten sind über die Zeit!"));
        messages.add(new Message("Das Papier muss entsorgt werden!"));

        try {
            writeInFile();
            System.out.println("Daten wurden gespeichert.");
        }
        catch(IOException e) {
            System.out.println("Problem beim Speichern");
        }
    }

    public void writeInFile() throws FileNotFoundException, IOException {

        try(OutputStream out = new FileOutputStream(FILE_NAME);
            ObjectOutputStream oos = new ObjectOutputStream(out)) {
            oos.writeObject(messages); // Objekte werden serialisiert und in eine Datei geschrieben
            // oos und out werden automatisch geschlossen
        }
    }

    public List<Message> readFromFile() {

        try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream(FILE_NAME))) {

            return (List<Message>) ois.readObject();

            // ois und in werden automatisch geschlossen
        }
        catch(ClassNotFoundException e) {
            System.out.println("Probleme beim Deserialisieren der Daten.");
        }
        catch(IOException e) {
            System.out.println("Probleme beim Lesen der Daten aus der Datei.");
        }

        return new ArrayList<>();
    }
}
