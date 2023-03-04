package com.pildo._30sockets;

import javax.swing.*;

import java.awt.*;
import java.io.DataInputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Servidor  {

	public static void main(String[] args) {
		
		MarcoServidor mimarco=new MarcoServidor();
		
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);			
	}	
}

// Runnable para que este siempre a la escucha por hilos
class MarcoServidor extends JFrame implements Runnable {
	private	JTextArea areatexto;
	
	public MarcoServidor(){
		
		setBounds(1200,300,280,350);				
			
		JPanel milamina= new JPanel();
		
		milamina.setLayout(new BorderLayout());
		
		areatexto=new JTextArea();
		
		milamina.add(areatexto,BorderLayout.CENTER);
		
		add(milamina);
		
		setVisible(true);		
		
		// Creación del hilo
		Thread miHilo = new Thread(this);
		
		miHilo.start();
		}

	@Override
	public void run() {
		// System.out.println("Estoy a la escucha");
		
		// crear socket server a la escucha pto
		try {
			ServerSocket servidor = new ServerSocket(9999);

			// Bucle infinito para que permite recibir mas texto y no se cierre
			while(true) {
				// Aceptar cualquier conexion del exterior
				Socket miSocket = servidor.accept();
				// Por cual socket viaja la información de entrada
				DataInputStream flujoEntrada = new DataInputStream(miSocket.getInputStream());
				// Saber leer lo que vieje del flujo de entrada
				String mensajeTexto = flujoEntrada.readUTF();
				// Escribir en el area
				areatexto.append("\n" + mensajeTexto);
				// cerrar
				miSocket.close();
			}
					
		} catch (IOException e) {

			e.printStackTrace();
		}
	}	
}
