package Database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DBTables {
    public static void createAnimalsTable (Connection connection){

        String sql = "CREATE TABLE IF NOT EXISTS animals (\n"
                + "	sex VARCHAR(20) NOT NULL,\n"
                + "	type VARCHAR(20) NOT NULL,\n"
                + "	name VARCHAR(20),\n"
                + "	birthDate DATETIME\n"
                + ");";

        try (Statement stmt = connection.createStatement()) {
            stmt.execute(sql);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

    }

    public static void createAviaryTable (Connection connection){

        String sql = "CREATE TABLE IF NOT EXISTS aviary (\n"
                + "	type VARCHAR(50) NOT NULL,\n"
                + "	capacity int\n"
                + ");";

        try (Statement stmt = connection.createStatement()) {
            stmt.execute(sql);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void createEmployeeTable (Connection connection){

        String sql = "CREATE TABLE IF NOT EXISTS employee (\n"
                + "	name VARCHAR(50) NOT NULL,\n"
                + "	sex VARCHAR(20) NOT NULL,\n"
                + "	surname VARCHAR(50) NOT NULL\n"
                + "	birthDate DATETIME\n"
                + ");";

        try (Statement stmt = connection.createStatement()) {
            stmt.execute(sql);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void createVaccineTable (Connection connection){

        String sql = "CREATE TABLE IF NOT EXISTS vaccine (\n"
                + "	name VARCHAR(50) NOT NULL,\n"
                + "	vaccineType VARCHAR(50) NOT NULL,\n"
                + "	disease VARCHAR(20) NOT NULL\n"
                + ");";

        try (Statement stmt = connection.createStatement()) {
            stmt.execute(sql);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void dropAnimalTable(Connection connection){
        dropTable(connection,"animals");
    }
    public static void dropAviaryTable(Connection connection){
        dropTable(connection,"aviary");
    }
    public static void dropEmployeeTable(Connection connection){
        dropTable(connection,"employee");
    }
    public static void dropVaccineTable(Connection connection){
        dropTable(connection,"vaccine");
    }

    public static void dropTable(Connection connection, String tableName){

        String sql = "DROP TABLE IF EXISTS " + tableName;

        try (Statement stmt = connection.createStatement()) {
            stmt.execute(sql);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

}
