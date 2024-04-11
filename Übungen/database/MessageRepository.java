package database;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class MessageRepository {

    public boolean insert(String text) throws SQLException {

        try(Connection conn = DBUtils.getConnection();
                Statement stmt = conn.createStatement()) {

            String sql = "INSERT INTO messages (id, content) VALUES(NULL, '" + text + "')";
            return stmt.executeUpdate(sql) > 0;
        }
    }
}
