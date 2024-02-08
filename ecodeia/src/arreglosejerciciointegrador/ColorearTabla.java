package arreglosejerciciointegrador;

import java.awt.Color;
import java.awt.Component;

import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

public class ColorearTabla extends DefaultTableCellRenderer{
	public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
		super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
		
		this.setForeground(Color.WHITE);
		
		Color color=(row%2==0)? Color.BLACK: Color.DARK_GRAY;
		this.setBackground(color);
		
		return this;
	}

}