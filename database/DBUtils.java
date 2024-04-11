package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtils {

    private static final String URL = "jdbc:sqlite:" + System.getProperty("user.home")  + "/data.db";

    private DBUtils() {
    }

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL);
    }
}
