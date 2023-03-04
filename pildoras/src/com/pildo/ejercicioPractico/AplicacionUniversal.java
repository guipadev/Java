package ejercicioPractico;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.filechooser.FileNameExtensionFilter;

// Cambiar la conexión a cualquier BBDD de acuerdo a información de archivo externo
public class AplicacionUniversal {

	public static void main(String[] args) {

		MarcoBBDD mimarco = new MarcoBBDD();

		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		mimarco.setVisible(true);

	}

}

class MarcoBBDD extends JFrame {

	public MarcoBBDD() {

		setBounds(300, 300, 700, 700);

		LaminaBBDD milamina = new LaminaBBDD();
		;
		add(milamina);
	}
}

class LaminaBBDD extends JPanel {

	private JComboBox comboTablas;

	private JTextArea areaInformacion;

	private Connection miConexion;

	private FileReader entrada;

	public LaminaBBDD() {

		setLayout(new BorderLayout());

		comboTablas = new JComboBox();

		areaInformacion = new JTextArea();

		add(areaInformacion, BorderLayout.CENTER);

		comboTablas.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				String nombreTabla = (String) comboTablas.getSelectedItem();

				mostrarInfoTabla(nombreTabla);
			}

		});

		add(comboTablas, BorderLayout.NORTH);

		conectarBBDD();

		obtenerTablas();

	}

	public void conectarBBDD() {

		// Connection miConexion = null;

		String datos[] = new String[3];

		try {
			// Si el archivo cambia ruta, saldra para explorar y buscarlo
			entrada = new FileReader("/media/yamid/FAT_473/JAVA/pildoras_informaticas/datos_config.txt");

		} catch (IOException e) {

			JFileChooser chooser = new JFileChooser();

			FileNameExtensionFilter filter = new FileNameExtensionFilter("Archivos de texto", "txt"); // "jpg", "gif"

			chooser.setFileFilter(filter);

			int returnVal = chooser.showOpenDialog(this);

			if (returnVal == JFileChooser.APPROVE_OPTION) {

				// System.out.println("You chose to open this file: " +
				// chooser.getSelectedFile().getAbsolutePath());
				try {
					entrada = new FileReader(chooser.getSelectedFile().getAbsolutePath());
				} catch (FileNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		}

		try {

			// Creación flujo de dato, para extraer información
			BufferedReader mibuffer = new BufferedReader(entrada);

			for (int i = 0; i <= 2; i++) {
				datos[i] = mibuffer.readLine();
			}

			miConexion = DriverManager.getConnection(datos[0], datos[1], datos[2]);

			entrada.close();

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public void obtenerTablas() {

		ResultSet miResultSet = null;

		try {

			DatabaseMetaData datosBBDD = miConexion.getMetaData();

			miResultSet = datosBBDD.getTables(null, null, null, null);

			while (miResultSet.next()) {
				comboTablas.addItem(miResultSet.getString("TABLE_NAME"));
			}

		} catch (Exception e) {

			e.printStackTrace();
		}
	}

	public void mostrarInfoTabla(String tabla) {

		ArrayList<String> campos = new ArrayList<>();

		String consulta = "SELECT * FROM " + tabla;

		try {

			areaInformacion.setText("");

			Statement miStatement = miConexion.createStatement();

			ResultSet miResultSet = miStatement.executeQuery(consulta);

			ResultSetMetaData rsBBDD = miResultSet.getMetaData();

			for (int i = 1; i <= rsBBDD.getColumnCount(); i++) {
				campos.add(rsBBDD.getColumnLabel(i));
			}

			while (miResultSet.next()) {

				for (String nombreCampo : campos) {
					areaInformacion.append(miResultSet.getString(nombreCampo) + " ");
				}

				areaInformacion.append("\n");
			}

		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}