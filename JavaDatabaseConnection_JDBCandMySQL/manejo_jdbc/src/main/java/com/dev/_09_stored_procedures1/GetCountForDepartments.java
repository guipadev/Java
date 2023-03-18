package com.dev._09_stored_procedures1;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Types;
public class GetCountForDepartments {

    public static void main(String[] args) throws Exception {

        Connection myConn = null;
        CallableStatement myStmt = null;

        try {
            // Conexion a BD
            myConn = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/demo", "student", "student");

            String theDepartment = "Engineering";

            // Preparar la llamada al procedimiento almacenado
            myStmt = myConn
                    .prepareCall("{call get_count_for_department(?, ?)}");

            // Establecer los parámetros
            myStmt.setString(1, theDepartment);
            myStmt.registerOutParameter(2, Types.INTEGER);

            // Llamar a procedimiento almacenado
            System.out.println("Llamando al procedimiento almacenado. get_count_for_department('" + theDepartment + "', ?)");
            myStmt.execute();
            System.out.println("Finished calling stored procedure");

            // Obtener el valor del parámetro OUT
            int theCount = myStmt.getInt(2);

            System.out.println("\nThe count = " + theCount);

        } catch (Exception exc) {
            exc.printStackTrace();
        } finally {
            close(myConn, myStmt);
        }
    }

    private static void close(Connection myConn, Statement myStmt) throws SQLException {
        if (myStmt != null) {
            myStmt.close();
        }

        if (myConn != null) {
            myConn.close();
        }
    }
}
