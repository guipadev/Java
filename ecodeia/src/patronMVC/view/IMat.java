package patronMVC.view;

import patronMVC.controller.CMat;

public interface IMat {
	
	public static final String CALCULAR="calcular";
	
	public double getA();
	public double getB();
	public char getOperacion();
	public void setRespuesta(double resp);
	public void arrancar();
	public void setControlador(CMat c);

}
