package Factory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {

    public Connection getConnection(){
        try {
            //  Class.forName ("com.MySQL.jdbc.Driver");
            return DriverManager.getConnection("jdbc:mysql://localhost:3306/bancodedados", "root", "qwe123");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
