package MVC.view;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class MarcoApp extends JFrame {
	
	private JComboBox secciones;

	private JComboBox paises;

	private JTextArea resultado;
	
	public MarcoApp() {
		
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


	}

}
