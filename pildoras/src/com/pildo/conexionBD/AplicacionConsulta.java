package conexionBD;

import java.awt.*;
import java.awt.event.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.*;

public class AplicacionConsulta {

	public static void main(String[] args) {

		JFrame mimarco = new MarcoAplicacion();

		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		mimarco.setVisible(true);
	}
}

class MarcoAplicacion extends JFrame {

	private Connection miConexion;

	private PreparedStatement enviaConsultaSeccion;

	private PreparedStatement enviaConsultaPais;

	private PreparedStatement enviaConsultaTodos;

	// Consulta parametrizada
	private final String consultaSeccion = "SELECT NOMBREARTICULO, SECCION, PRECIO, PAISDEORIGEN FROM PRODUCTOS WHERE SECCION=?";

	private final String consultaPais = "SELECT NOMBREARTICULO, SECCION, PRECIO, PAISDEORIGEN FROM PRODUCTOS WHERE PAISDEORIGEN=?";

	private final String consultaTodos = "SELECT NOMBREARTICULO, SECCION, PRECIO, PAISDEORIGEN FROM PRODUCTOS WHERE SECCION=? AND PAISDEORIGEN=?";

	private JComboBox secciones;

	private JComboBox paises;

	private JTextArea resultado;

	public MarcoAplicacion() {

		setTitle("Consulta BBDD");

		setBounds(500, 300, 400, 400);

		setLayout(new BorderLayout());

		JPanel menus = new JPanel();

		menus.setLayout(new FlowLayout());

		secciones = new JComboBox();

		secciones.setEditable(false);

		secciones.addItem("Todos");

		paises = new JComboBox();

		paises.setEditable(false);

		paises.addItem("Todos");

		resultado = new JTextArea(4, 50);

		resultado.setEditable(false);

		add(resultado);

		menus.add(secciones);

		menus.add(paises);

		add(menus, BorderLayout.NORTH);

		add(resultado, BorderLayout.CENTER);

		JButton botonConsulta = new JButton("Realizar Consulta");

		// Accion boton
		botonConsulta.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {

				ejecutaConsulta();
			}

		});

		add(botonConsulta, BorderLayout.SOUTH);
		
		

		// *************************** CONEXIÓN CON BBDD ***************************//

		try {

			miConexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/prueba", "root", "Nataly89");

			Statement sentencia = miConexion.createStatement();

			// Carga JComboBox SECCIONES
			String consulta = "SELECT DISTINCTROW SECCION FROM productos";

			ResultSet rta = sentencia.executeQuery(consulta);

			// Recorrer y almacenar valores para el primer combo
			while (rta.next()) {

				secciones.addItem(rta.getString(1));
			}

			rta.close();

			// Carga JComboBox PAISES
			consulta = "SELECT DISTINCTROW PAISDEORIGEN FROM productos";

			rta = sentencia.executeQuery(consulta);

			// Recorrer y almacenar valores para el primer combo
			while (rta.next()) {

				paises.addItem(rta.getString(1));
			}

			rta.close();

		} catch (Exception e) {
			// TODO: handle exception
		}
	}


	private void ejecutaConsulta() {
		
		ResultSet rs = null;

		try {
			// Resetear cada vez que realiza consulta
			resultado.setText("");
 
			String seccion = (String) secciones.getSelectedItem();

			String pais = (String) paises.getSelectedItem();

			if (!seccion.equals("Todos") && pais.equals("Todos")) {

				enviaConsultaSeccion = miConexion.prepareStatement(consultaSeccion);

				// Indicamos la posición del parametro y lo que deseamos guardar
				enviaConsultaSeccion.setString(1, seccion);

				rs = enviaConsultaSeccion.executeQuery();

			} else if (seccion.equals("Todos") && !pais.equals("Todos")) {

				enviaConsultaPais = miConexion.prepareStatement(consultaPais);

				enviaConsultaPais.setString(1, seccion);

				rs = enviaConsultaPais.executeQuery();

			} else if (!seccion.equals("Todos") && !pais.equals("Todos")) {

				enviaConsultaTodos = miConexion.prepareStatement(consultaTodos);

				enviaConsultaTodos.setString(1, seccion);

				enviaConsultaTodos.setString(2, pais);

				rs = enviaConsultaTodos.executeQuery();

			}

			// Recorrer y obtener datos forma organizada
			while (rs.next()) {

				resultado.append(rs.getString(1));

				resultado.append(", ");

				resultado.append(rs.getString(2));

				resultado.append(", ");

				resultado.append(rs.getString(3));
 
				resultado.append(", ");

				resultado.append(rs.getString(4));

				resultado.append("\n");
			}

		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}
}