package com.pildo._14aplicacionesgraficasswing;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Rectangle2D;

public class PruebaDibujo {

    public static void main(String[] args) {

        MarcoConDibujo mimarco = new MarcoConDibujo();

        mimarco.setVisible(true);

        mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

class MarcoConDibujo extends JFrame {

    public MarcoConDibujo() {

        setTitle("prueba de dibujo");

        setSize(400,400);

        LaminaConFiguras milamina = new LaminaConFiguras();

        add(milamina);
        
        Color colorInventado = new Color(255,199,200);
        
        milamina.setBackground(colorInventado);
    }
}

class LaminaConFiguras extends JPanel {

    public void paintComponent(Graphics g) {

        super.paintComponent(g);

        //g.drawRect(50,50,200,200); // dibujar rectangulo

        //g.drawLine(100,100,300,2000); // dibujar linea

        //g.drawArc(50,100,100,200,120,150); // dibujar un largo78

        //Dibujo 2D
        Graphics2D g2 = (Graphics2D) g;

        Rectangle2D rectangulo = new Rectangle2D.Double(100,100,200,150);
        
        g2.setPaint(Color.CYAN.darker());//darker escureser
        
        g2.fill(rectangulo);
        //g2.draw(rectangulo);

        //Dibujo elipse
        Ellipse2D elipse = new Ellipse2D.Double();

        elipse.setFrame(rectangulo);

        g2.setPaint(new Color(0,140,255).brighter());//brighter aclarar
        
        g2.fill(elipse);
        //g2.draw(elipse);

        g2.draw(new Line2D.Double(100,100,300,250));
        
        

        double CentroenX = rectangulo.getCenterX();

        double CentroenY = rectangulo.getCenterY();

        double radio = 150;

        Ellipse2D circulo = new Ellipse2D.Double();

        circulo.setFrameFromCenter(CentroenX, CentroenY, CentroenX + radio, CentroenY + radio);

        g2.draw(circulo);

    }
}