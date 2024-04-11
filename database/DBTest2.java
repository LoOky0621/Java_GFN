package database;

import java.sql.SQLException;
import java.util.List;

public class DBTest2 {

    public static void main(String[] args) {

        try {
            MessageRepository repo = new MessageRepository();

            /* //INSERT
            Message message = new Message("Das ist das Haus von Nikigraus");
            if(repo.save(message)) {
                System.out.println("Gespeichert!");
            }
            */

            // FIND ONE
            Message message = repo.findOne(1);
            System.out.println(message.getId() + ": " + message.getContent());

            // UPDATE
            message.setContent("Das ist die Änderung");
            repo.save(message);

            /* // DELETE BY ID
            if(repo.delete(1)) {
                System.out.println("Objekt gelöscht");
            }
            */

            /* // DELETE OBJECT
            Message message = repo.findOne(2);
            if(repo.delete(message)) {
                System.out.println("Objekt gelöscht");
            }
            */

            // FIND ALL
            List<Message> messages = repo.findAll();
            messages.forEach(m -> System.out.println(m.getId() + ": " + m.getContent()));

        }
        catch(SQLException e) {
            System.out.println("Problem! " + e.getMessage());
        }
        catch(Exception e) {
            System.out.println("Sonstiges Problem!");
        }
    }
}
