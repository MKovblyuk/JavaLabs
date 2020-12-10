package Database;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;

public class ConnectionManager {

    private static final String DB_URL = "jdbc:postgresql://127.0.0.1:5234/Zoo";
    private static final String USER = "user1";
    private static final String PASS = "1111";


    public static Connection getConnection() throws SQLException{

        try {
            Class.forName("org.postgresql.Driver");
        }
        catch (ClassNotFoundException e) {
            System.out.println("Class not found");
            return null;
        }

        Connection connection = null;
        connection = DriverManager.getConnection(DB_URL, USER, PASS);
        if (connection == null)
            System.out.println("Incorrect connection to database");
        return connection;
    }

}
