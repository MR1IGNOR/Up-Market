package database;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class db {
    
    String db_Path = "database/Shop_E.db";
    public String url = "jdbc:sqlite:" + db_Path;
    
    public void Connection() {
        try (Connection conn = DriverManager.getConnection(url)) {
            System.out.println("Соединение с SQLite установлено!");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}