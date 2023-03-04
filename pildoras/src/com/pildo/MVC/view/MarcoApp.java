package MVC.view;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;

import MVC.controller.ControladorBotonEjecuta;
import MVC.controller.ControladorCargaMenus;

public class MarcoApp extends JFrame {
	
	public JComboBox secciones;

	public JComboBox paises;

	public JTextArea resultado;
	
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

		add(botonConsulta, BorderLayout.SOUTH);
		
		botonConsulta.addActionListener(new	ControladorBotonEjecuta(this));
		
		// Estar pendiente a la escucha
		addWindowListener(new ControladorCargaMenus(this));
	}

}
