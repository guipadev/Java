package MVC.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

import MVC.models.EjecutarConsultas;
import MVC.view.MarcoApp;

public class ControladorBotonEjecuta implements ActionListener {

	private MarcoApp elmarco;
	
	EjecutarConsultas obj = new EjecutarConsultas();
	
	private ResultSet resultadoConsulta;
	
	public ControladorBotonEjecuta(MarcoApp elmarco) {
		this.elmarco = elmarco;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {

		String seleccionSeccion = (String) elmarco.secciones.getSelectedItem();
		
		String SeleccionPais = (String) elmarco.paises.getSelectedItem();
		
		resultadoConsulta = obj.filtrarBBDD(seleccionSeccion, SeleccionPais);
		
		try {
			
			elmarco.resultado.setText("");
		
			while (resultadoConsulta.next()) {
				
				elmarco.resultado.append(resultadoConsulta.getString(1));
				
				elmarco.resultado.append(", ");
				
				elmarco.resultado.append(resultadoConsulta.getString(2));
				
				elmarco.resultado.append(", ");
			
				elmarco.resultado.append(resultadoConsulta.getString(3));
				
				elmarco.resultado.append(", ");
				
				elmarco.resultado.append(resultadoConsulta.getString(4));
				
				elmarco.resultado.append("\n");
			
			}
			
		} catch (Exception e2) {
			// TODO: handle exception
		}
	}
	
	

}
