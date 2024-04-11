package database;

import java.sql.SQLException;

public class DBTest2 {

    public static void main(String[] args) {

        MessageRepository repo = new MessageRepository();

        try {
            if(repo.insert("Dies und was anderes....")) {
                System.out.println("Gespeichert!");
            }
        }
        catch(SQLException e) {
            System.out.println("Problem! " + e.getMessage());
        }
    }
}
