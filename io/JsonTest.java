package io;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.type.CollectionType;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class JsonTest {

    public static void main(String[] args) {

        final String FILE_NAME = "data.json";


        Message m1 = new Message("Das ist der Inhalt");
        List<Message> messages = new ArrayList<>();
        messages.add(m1);
        messages.add(new Message("Dies und Das"));

        ObjectMapper mapper = new ObjectMapper();
        mapper.registerModule(new JavaTimeModule()); // Verwendung von Java 8 Datentypen wird aktiviert

        /* SCHREIBEN */
        /*
        try {
            // mapper.writeValue(new FileWriter(FILE_NAME), m1); // Eine Message schreiben
            mapper.writeValue(new FileWriter(FILE_NAME), messages); // Eine Liste von Messages schreiben
        }
        catch (IOException e) {
            e.printStackTrace();
            System.out.println("Problem beim Schreiben");
        }
        */

        /* LESEN */
        try {
            // m1 = mapper.readValue(new FileReader(FILE_NAME), Message.class); // Ein Objekt lesen
            // System.out.println(m1);

            CollectionType type = mapper.getTypeFactory()
                    .constructCollectionType(List.class, Message.class);

            messages = mapper.readValue(new FileReader(FILE_NAME), type); // Liste von Objekten lesen
            //System.out.println(messages);

            for (Message m: messages) {
                System.out.println(m.getText());
            }

        }
        catch (IOException e) {
            e.printStackTrace();
            System.out.println("Problem beim Lesen");
        }
    }
}
