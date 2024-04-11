package database;

import java.sql.*;

public class DBTest1 {

    public static void main(String[] args) {

        /*
        Connection dbh = null;
        try {
            dbh = DriverManager.getConnection("...");
            //...

        }
        catch(SQLException e) {
            System.out.println(e.getMessage());
            if(dbh != null) {
                try {
                    dbh.close();
                }
                catch(SQLException ex) {
                    System.out.println(ex.getMessage());
                }
            }
        }
        */

        // Ab Java 1.7 möglich

        final String URL_MEM = "jdbc:sqlite::memory:test";
        final String URL_PROJECT = "jdbc:sqlite:test.db";
        // System.getProperty("user.home") ermitteld das Benutzerverzeichnis
        final String URL_USER_PATH = "jdbc:sqlite:" + System.getProperty("user.home")  + "/test.db";


        try(Connection dbh = DriverManager.getConnection(URL_USER_PATH);
            Statement stmt = dbh.createStatement()) {

            String sql = "CREATE TABLE IF NOT EXISTS messages (" +
                            "id INTEGER PRIMARY KEY, " +
                            "content TEXT NOT NULL)";

            if(stmt.execute(sql)) { // Sendet eine Anfrage an die DB
                System.out.println("CREATE TABLE... done");
            }

            sql = "INSERT INTO messages (id, content) VALUES(NULL, 'Das ist eine Nachricht')";

            if(stmt.execute(sql)) { // Sendet eine Anfrage an die DB
                System.out.println("INSERT INTO... done");
            }

            sql = "SELECT * FROM messages";

            ResultSet data = stmt.executeQuery(sql);
            while(data.next()) {
                System.out.println(data.getInt("id") + ": " + data.getString("content"));
            }
        }
        catch(SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}
