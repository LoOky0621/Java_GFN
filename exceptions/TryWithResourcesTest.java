package exceptions;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;

public class TryWithResourcesTest {

    public static void main(String[] args) {

        Writer out = null;
        try {
            out = new FileWriter("data.txt");
            out.append("Das ist das Haus von Nikigraus!");
        }
        catch(IOException e) {
            System.out.println("Problem");
        }
        finally {
            if(out != null) {
                try {
                    out.close();
                } catch (IOException e) {
                    System.out.println("Problem");
                }
            }
        }

        // Alle Klassen die im try-with-resources geöffnet werden müssen AutoClosable sein
        // AutoClosable ist ein Interface, dass eine close-Methode erzwingt
        try(Writer out2 = new FileWriter("data.txt")) {
        //try(List out2 = new ArrayList()) { // Implementiert nicht das AutoClosable
            out = new FileWriter("data.txt");
            out.append("Das ist das Haus von Nikigraus!");
            // out2 wird automatisch geschlossen
        }
        catch(IOException e) {
            System.out.println("Problem");
        }
    }
}
