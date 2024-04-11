package database;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class MessageRepository {

    // CRUD: Create Read Update Delete

    private static final String TABLE = "messages";

    public MessageRepository() throws SQLException {
        createTable();
    }

    public Message findOne(int id) throws SQLException {

        final String sql = "SELECT * FROM  " + TABLE + " WHERE id = " + id;

        try(Connection conn = DBUtils.getConnection();
            Statement stmt = conn.createStatement()) {
            ResultSet results = stmt.executeQuery(sql); // Liefert ein ResultSet
            // TODO: return von null gegen eine Optional austauschen
            if(results.next()) {
                return map(results);
            }
            return null;
        }
    }

    /**
     * Wandelt/Mappt relationale Daten in Objekte um
     * @param results Relationale Daten
     * @return Gefülltes Message Objekt
     * @throws SQLException
     */
    private Message map(ResultSet results) throws SQLException {
        Message message = new Message();
        message.setId(results.getInt("id")); // id aus dem Datensatz wird in das Objekt eingesetzt
        message.setContent(results.getString("content"));
        return message;
    }

    /**
     * Liefert eine Liste von Message-Objekten
     * @return
     * @throws SQLException
     */
    public List<Message> findAll() throws SQLException {

        final String sql = "SELECT * FROM  " + TABLE;

        try(Connection conn = DBUtils.getConnection();
            Statement stmt = conn.createStatement()) {
            ResultSet results = stmt.executeQuery(sql); // Liefert ein ResultSet

            List<Message> messages = new ArrayList<>();
            while(results.next()) {
                messages.add(map(results));
            }
            return messages;
        }
    }

    public boolean save(Message message) throws SQLException {
        if(message.getId() > 0) {
            return update(message); // Wenn ID bereits vorhanden, dann update
        }
        return insert(message); // Ansonsten muss das Objekt neu eingefügt werden
    }

    private boolean insert(Message message) throws SQLException {

        /*
        final String sql = "INSERT INTO " + TABLE + " (id, content) VALUES(NULL, '" + message.getContent() + "')";

        try(Connection conn = DBUtils.getConnection();
                Statement stmt = conn.createStatement()) {
            return stmt.executeUpdate(sql) > 0;
        }
        */

        // Schutz gegen SQL-Injection
        final String sql = "INSERT INTO " + TABLE + " (id, content) VALUES(NULL, ?)";

        try(Connection conn = DBUtils.getConnection();
            PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, message.getContent());
            return stmt.executeUpdate() > 0;
        }
    }

    private boolean update(Message message) throws SQLException {

        final String sql = "UPDATE " + TABLE + " SET content = ? WHERE id = ?";

        try(Connection conn = DBUtils.getConnection();
            PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, message.getContent());
            stmt.setInt(2, message.getId());
            return stmt.executeUpdate() > 0;
        }
    }

    /*
    Erzeugt die Messages-Table, wenn diese noch nicht vorhanden ist
     */
    public void createTable() throws SQLException {

        String sql = "CREATE TABLE IF NOT EXISTS " + TABLE + " (id INTEGER PRIMARY KEY, content TEXT NOT NULL)";

        try(Connection conn = DBUtils.getConnection();
            Statement stmt = conn.createStatement()) {
            stmt.execute(sql);
            // stmt.getResultSet() // Für Abfragen (SELECT) von Daten
            // stmt.getUpdateCount() // Für andere Anweisungen (INSERT, UPDATE, DELETE etc.)
        }
    }

    public boolean delete(Message message) throws SQLException {
        return delete(message.getId());
    }

    public boolean delete(int id) throws SQLException {

        final String sql = "DELETE FROM " + TABLE + " WHERE id = " + id;

        try(Connection conn = DBUtils.getConnection();
            Statement stmt = conn.createStatement()) {
            return stmt.executeUpdate(sql) > 0;
        }
    }
}
