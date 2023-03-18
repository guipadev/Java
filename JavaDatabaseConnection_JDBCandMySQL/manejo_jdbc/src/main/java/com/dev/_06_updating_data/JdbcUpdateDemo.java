package com.dev._06_updating_data;

import java.sql.*;
public class JdbcUpdateDemo {

    public static void main(String[] args) throws SQLException {

        Connection myConn = null;
        Statement myStmt = null;
        ResultSet myRs = null;

        String dbUrl = "jdbc:mysql://localhost:3306/demo";
        String user = "student";
        String pass = "student";

        try {
            // Obtener una conexión a la base de datos
            myConn = DriverManager.getConnection(dbUrl, user, pass);

            // Crear una declaración
            myStmt = myConn.createStatement();

            // Llamar al método auxiliar para mostrar la información del empleado
            System.out.println("ANTES DE LA ACTUALIZACIÓN...");
            displayEmployee(myConn, "John", "Doe");

            // Actualizando empleado
            System.out.println("\nEJECUTAR LA ACTUALIZACIÓN PARA: John Doe\n");

            int rowsAffected = myStmt.executeUpdate(
                    "update employees " +
                            "set email='john.doe@luv2code.com' " +
                            "where last_name='Doe' and first_name='John'");

            // Llamar al método auxiliar para mostrar la información del empleado
            System.out.println("DESPUÉS DE LA ACTUALIZACIÓN...");
            displayEmployee(myConn, "John", "Doe");

        }
        catch (Exception exc) {
            exc.printStackTrace();
        }
        finally {
            close(myConn, myStmt, myRs);
        }
    }

    private static void displayEmployee(Connection myConn, String firstName, String lastName) throws SQLException {
        PreparedStatement myStmt = null;
        ResultSet myRs = null;

        try {
            // Prepare statement
            myStmt = myConn
                    .prepareStatement("select last_name, first_name, email from employees where last_name=? and first_name=?");

            myStmt.setString(1, lastName);
            myStmt.setString(2, firstName);

            // Execute SQL query
            myRs = myStmt.executeQuery();

            // Process result set
            while (myRs.next()) {
                String theLastName = myRs.getString("last_name");
                String theFirstName = myRs.getString("first_name");
                String email = myRs.getString("email");

                System.out.printf("%s %s, %s\n", theFirstName, theLastName, email);
            }
        } catch (Exception exc) {
            exc.printStackTrace();
        } finally {
            close(myStmt, myRs);
        }

    }

    private static void close(Connection myConn, Statement myStmt,
                              ResultSet myRs) throws SQLException {
        if (myRs != null) {
            myRs.close();
        }

        if (myStmt != null) {
            myStmt.close();
        }

        if (myConn != null) {
            myConn.close();
        }
    }

    private static void close(Statement myStmt, ResultSet myRs)
            throws SQLException {

        close(null, myStmt, myRs);
    }
}
