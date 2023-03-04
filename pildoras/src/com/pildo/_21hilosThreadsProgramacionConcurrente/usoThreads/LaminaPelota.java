package com.pildo._21hilosThreadsProgramacionConcurrente.usoThreads;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.ArrayList;

import javax.swing.JPanel;

//Lámina que dibuja las pelotas
public class LaminaPelota extends JPanel {
	
	private ArrayList<Pelota> pelotas = new ArrayList<Pelota>();
	
	public void add(Pelota b){	
		pelotas.add(b);
	}
	
	public void paintComponent(Graphics g){
		super.paintComponent(g);
		
		Graphics2D g2=(Graphics2D)g;
		
		for(Pelota b: pelotas){	
			g2.fill(b.getShape());
		}
	}

}
