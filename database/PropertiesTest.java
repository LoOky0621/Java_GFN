package database;

import java.io.*;
import java.util.Properties;

public class PropertiesTest {

    public static void main(String[] args) {

        Properties prop = new Properties();

         // Schreiben
        prop.setProperty("db.url", "localhost");
        prop.setProperty("db.user", "root");
        prop.setProperty("db.password", "pa$$w0rd");

        /*
        try(OutputStream out = new FileOutputStream("config.properties")) {
            prop.store(out, null);
        }
        catch(IOException e) {
            System.out.println(e.getMessage());
        }
        */

        try(OutputStream out = new FileOutputStream("config.xml")) {
            prop.storeToXML(out, null);
        }
        catch(IOException e) {
            System.out.println(e.getMessage());
        }

        /*
        try(InputStream in = new FileInputStream("config.properties")) {
            prop.load(in);
            System.out.println(prop.getProperty("db.user"));
            System.out.println(prop.getProperty("db.password", "Unbekannt"));
            System.out.println(prop.getProperty("db.dialect", "Unbekannt"));
        }
        catch(IOException e) {
            System.out.println(e.getMessage());
        }
        */

    }
}
