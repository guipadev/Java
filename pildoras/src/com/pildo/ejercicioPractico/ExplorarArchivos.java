package ejercicioPractico;

import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.filechooser.FileNameExtensionFilter;

public class ExplorarArchivos {

	public static void main(String[] args) {

		Marco mimarco = new Marco();
		
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JFileChooser chooser = new JFileChooser();
		
		FileNameExtensionFilter filter = new FileNameExtensionFilter("Archivos de texto", "txt"); // "jpg", "gif" 
	
		chooser.setFileFilter(filter);
		
		int returnVal = chooser.showOpenDialog(mimarco);
		
		if (returnVal == JFileChooser.APPROVE_OPTION) {
			
			System.out.println("You chose to open this file: " +
			 chooser.getSelectedFile().getAbsolutePath());
			
			// Nombre archivo
			// chooser.getSelectedFile().getName()
		}
	}

}


class Marco extends JFrame {
	
	public Marco() {
		
		setBounds(300,300,300,300);
		
		setVisible(true);
	}
}