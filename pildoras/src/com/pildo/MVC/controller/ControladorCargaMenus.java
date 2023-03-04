package MVC.controller;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import MVC.models.CargaMenus;
import MVC.view.MarcoApp;

public class ControladorCargaMenus extends WindowAdapter {

	CargaMenus obj = new CargaMenus();
	
	private MarcoApp elMarco;
	
	public ControladorCargaMenus(MarcoApp elMarco) {
		
		this.elMarco = elMarco;
	}
	
	
	public void WindowOpened(WindowEvent e) {
		
		obj.ejecutaConsultas();
		
		try {
			
			while (obj.rs.next()) {
				
				elMarco.secciones.addItem(obj.rs.getString(1));
			}
			
			while (obj.rs2.next()) {
				
				elMarco.paises.addItem(obj.rs.getString(1));
			}
			
		} catch (Exception e2) {
			
			e2.printStackTrace();
		}
	}
	
}
