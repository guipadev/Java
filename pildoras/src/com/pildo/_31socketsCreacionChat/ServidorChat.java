package com.pildo._31socketsCreacionChat;

import javax.swing.*;

import java.awt.*;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

public class ServidorChat {

	public static void main(String[] args) {

		MarcoServidor mimarco = new MarcoServidor();

		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}

// Runnable para que este siempre a la escucha por hilos
class MarcoServidor extends JFrame implements Runnable {
	private JTextArea areatexto;

	public MarcoServidor() {

		setBounds(1200, 300, 280, 350);

		JPanel milamina = new JPanel();

		milamina.setLayout(new BorderLayout());

		areatexto = new JTextArea();

		milamina.add(areatexto, BorderLayout.CENTER);

		add(milamina);

		setVisible(true);

		// Creación del hilo
		Thread miHilo = new Thread(this);

		miHilo.start();
	}

	@Override
	public void run() {
		// crear socket server a la escucha pto
		try {
			ServerSocket servidor = new ServerSocket(9999);

			// Var que almacenan los datos que llegan
			String nick, ip, mensaje;
			
			// Almacenar las IP que se conectan 
			ArrayList<String> listaIp = new ArrayList<String>();

			// Instancia del paquete data a recibir
			PaqueteEnvio paqueteRecibido;

			// Bucle infinito para que permite recibir mas texto y no se cierre
			while (true) {
				// Aceptar cualquier conexion del exterior
				Socket miSocket = servidor.accept();

				// Creación de flujo de entrada data objeto
				ObjectInputStream paqueteDatos = new ObjectInputStream(miSocket.getInputStream());
				// Leer el flujo y guardar data recibida
				paqueteRecibido = (PaqueteEnvio) paqueteDatos.readObject();
				// Obtener los datos
				nick = paqueteRecibido.getNick();
				
				ip = paqueteRecibido.getIp();
				
				mensaje = paqueteRecibido.getMensaje();

				if (!mensaje.equals(" online")) {
					// Agregar data a la GIU
					areatexto.append("\n" + nick + ": " + mensaje + " para " + ip);
					// Puente envío información a ip y pto
					Socket enviaDestinatario = new Socket(ip, 9090);
					// Obtener el paquete dato a enviar
					ObjectOutputStream paqueteReenvio = new ObjectOutputStream(enviaDestinatario.getOutputStream());
					// Escribir y guardar objeto
					paqueteReenvio.writeObject(paqueteRecibido);
					// cerrar flujo de datos
					paqueteReenvio.close();
					// cerrar envio
					enviaDestinatario.close();
					// cerrar socket
					miSocket.close();
				} else {
					// Detectar clientes online la ip
					InetAddress localizacion = miSocket.getInetAddress();
					// Almacenar ip cliente a conectar
					String ipRemota = localizacion.getHostAddress();
					// prueba conocer ip conexion cliente
					// System.out.println("Online " + ipRemota);
					// Almacenar las ip
					listaIp.add(ipRemota);
					// Almacenar ip en arraylist
					paqueteRecibido.setIps(listaIp);
					// prueba arraylist
					for (String direcionIp : listaIp) {
						System.out.println("Array: " + direcionIp);
						
						Socket enviaDestinatario = new Socket(direcionIp, 9090);
						
						ObjectOutputStream paqueteReenvio = new ObjectOutputStream(enviaDestinatario.getOutputStream());
						
						paqueteReenvio.writeObject(paqueteRecibido);
						
						paqueteReenvio.close();
						
						enviaDestinatario.close();
						
						miSocket.close();
					}
				}
			}

		} catch (IOException | ClassNotFoundException e) {

			e.printStackTrace();
		}
	}
}
