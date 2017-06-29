package DOA;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Created by staLker on 23-06-2017.
 */
public class ConnectionFactory {
    String driverClassName = "com.mysql.jdbc.Driver";
    String connectionUrl = "jdbc:mysql://localhost:3306/myStudent";
    String dbUser  = "root";
    String dbPswd = "mysql461";
    private static ConnectionFactory connectionFactory = null;
    private ConnectionFactory(){
        try {
            Class.forName(driverClassName);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
    public Connection getConnection() throws SQLException {
        Connection connection = null;
        connection = DriverManager.getConnection(connectionUrl,dbUser,dbPswd);
        return connection;
    }
    public  static ConnectionFactory getInstance(){
        if(connectionFactory == null){
            connectionFactory = new ConnectionFactory();
        }
        return connectionFactory;
    }
}
