package co.yom.thecodercave.dependencyinjection.notdi;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class MySQLConnection {

    private final String username;
    private final String password;
    private final String host;
    private final int port;
    private final String database;

    private Connection connection;

    public MySQLConnection(String username, String password, String host, int port, String database) {
        this.username = username;
        this.password = password;
        this.host = host;
        this.port = port;
        this.database = database;
    }

    public void connect() throws SQLException {
        // Establecemos la conexión a la base de datos
        Connection connection = DriverManager.getConnection(
                "jdbc:mysql://" + host + ":" + port + "/" + database,
                username,
                password
        );

        // Guardamos la conexión
        this.connection = connection;
    }

    public void close() throws SQLException {
        // Cerramos la conexión a la base de datos
        if (this.connection != null) {
            this.connection.close();
        }
    }

    public void executeQuery(String query) throws SQLException {
        // Ejecutamos la consulta SQL
        PreparedStatement statement = this.connection.prepareStatement(query);
        statement.execute();
    }

    public ResultSet getResultSet(String query) throws SQLException {
        // Ejecutamos la consulta SQL y obtenemos los resultados
        PreparedStatement statement = this.connection.prepareStatement(query);
        ResultSet resultSet = statement.executeQuery();

        // Devolvemos los resultados
        return resultSet;
    }
}
