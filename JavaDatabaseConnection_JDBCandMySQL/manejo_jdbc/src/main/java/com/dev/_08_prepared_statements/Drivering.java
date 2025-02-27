package com.dev._08_prepared_statements;

import java.sql.*;
public class Drivering {

    public static void main(String[] args) throws SQLException {

        Connection myConn = null;
        PreparedStatement myStmt = null;
        ResultSet myRs = null;

        try {
            // 1. Conexion a BD
            myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/demo", "student" , "student");

            // 2. Preparando consulta
            myStmt = myConn.prepareStatement("select * from employees where salary > ? and department=?");

            // 3. Set the parameters
            myStmt.setDouble(1, 80000);
            myStmt.setString(2, "Legal");

            // 4. Ejecutar SQL query
            myRs = myStmt.executeQuery();

            // 5. Mostrar el conjunto de resultados
            display(myRs);

            // Reutilice la declaración preparada: salario> 25000, departamento = HR

            System.out.println("\n\nReuse the prepared statement:  salary > 25000,  department = HR");

            // 6. Set the parameters
            myStmt.setDouble(1, 25000);
            myStmt.setString(2, "HR");

            // 7. Execute SQL query
            myRs = myStmt.executeQuery();

            // 8. Display the result set
            display(myRs);


        }
        catch (Exception exc) {
            exc.printStackTrace();
        }
        finally {
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
    }

    private static void display(ResultSet myRs) throws SQLException {
        while (myRs.next()) {
            String lastName = myRs.getString("last_name");
            String firstName = myRs.getString("first_name");
            double salary = myRs.getDouble("salary");
            String department = myRs.getString("department");

            System.out.printf("%s, %s, %.2f, %s\n", lastName, firstName, salary, department);
        }
    }
}
