package xmlandjsonassignment7_20;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connector {
    public static java.sql.Connection getMssql() throws SQLException {
        String dbURL = "jdbc:sqlserver://localhost:1433;databaseName=fptaptech";
        String username ="meo";
        String password ="123";
        java.sql.Connection connection = DriverManager.getConnection(dbURL,username,password);
        return connection;
    }

}