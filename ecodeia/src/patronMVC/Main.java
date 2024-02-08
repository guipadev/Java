package patronMVC;

import patronMVC.controller.CMat;
import patronMVC.model.MMat;
import patronMVC.view.IMat;
import patronMVC.view.VMat;
import patronMVC.view.VMat2;

public class Main {

	public static void main(String[] args) {
		MMat modelo= new MMat();
		IMat vista= new VMat();
		IMat vista2= new VMat2();
		
		
		CMat controlador= new CMat(modelo, vista);
		CMat controlador2= new CMat(modelo, vista2);
		
		vista.setControlador(controlador);
		vista2.setControlador(controlador2);
		
		vista.arrancar();
		vista2.arrancar();
	}
}
