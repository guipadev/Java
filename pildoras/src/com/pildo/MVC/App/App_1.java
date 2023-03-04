package MVC.App;

import javax.swing.JFrame;

import MVC.view.MarcoApp;

public class App {

	public static void main(String[] args) {
		
		MarcoApp miMarco = new MarcoApp();
		
		miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		miMarco.setVisible(true);
	}

}
