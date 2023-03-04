package com.pildo._31socketsCreacionChat;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.ArrayList;

import javax.swing.*;

public class ClienteChat {

	public static void main(String[] args) {

		MarcoCliente mimarco = new MarcoCliente();

		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}

class MarcoCliente extends JFrame {

	public MarcoCliente() {

		setBounds(600, 300, 280, 350);

		LaminaMarcoCliente milamina = new LaminaMarcoCliente();

		add(milamina);

		setVisible(true);

		// Al abrir ventana se ejecute EnvioOnline
		addWindowListener(new EnvioOnline());
	}

}

// -------------------------- Envío señal online -------------------------------------
class EnvioOnline extends WindowAdapter {

	public void windowOpened(WindowEvent e) {
		try {
			Socket miSocket = new Socket("192.168.18.29", 9999);

			PaqueteEnvio datos = new PaqueteEnvio();

			datos.setMensaje(" online");

			// Enviar obj atraves del socket y reciba servidor
			ObjectOutputStream paqueteDatos = new ObjectOutputStream(miSocket.getOutputStream());

			paqueteDatos.writeObject(datos);

			miSocket.close();

		} catch (Exception e2) {}
	}
}

//--------------------------- Implementación Runnable hilos ---------------------------
class LaminaMarcoCliente extends JPanel implements Runnable {

	private JTextField campo1;

	private JLabel nick;

	private JComboBox ip;

	private JButton miboton;

	private JTextArea campochat;

	public LaminaMarcoCliente() {
		// Solicitud nombre usuario
		String nickUsuario = JOptionPane.showInputDialog("Nick: ").toUpperCase();

		// Adición txt
		JLabel nNick = new JLabel("Nick: ");
		add(nNick);

		// nick = new JTextField(5);
		nick = new JLabel();

		// Obtener dato nick digitado
		nick.setText(nickUsuario);

		add(nick);

		JLabel texto = new JLabel("Online: ");

		add(texto);

		// ip = new JTextField(8);
		ip = new JComboBox();

		// Datos de combo
		/*
		 * ip.addItem("Usuario 1"); ip.addItem("Usuario 2"); ip.addItem("Usuario 3");
		 */
		ip.addItem("192.168.18.29");
		ip.addItem("192.168.18.5");

		add(ip);

		campochat = new JTextArea(12, 20);

		add(campochat);

		campo1 = new JTextField(20);

		add(campo1);

		miboton = new JButton("Enviar");

		EnviaTexto miEvento = new EnviaTexto();

		miboton.addActionListener(miEvento);

		add(miboton);

		// Poner en funcionamiento 2do hilo, this porque la propia clase tiene el hilo
		// Si fuera otra clase, se deberia instanciar
		Thread miHilo = new Thread(this);

		miHilo.start();
	}

	private class EnviaTexto implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			// Mostar lo que vamos escribiendo
			campochat.append("\n" + campo1.getText());

			try { // IP local del pc y un pto
				Socket misocket = new Socket("192.168.18.29", 9999);

				// Obtener los datos
				PaqueteEnvio datos = new PaqueteEnvio();

				datos.setNick(nick.getText());

				// datos.setIp(ip.getText());
				datos.setIp(ip.getSelectedItem().toString());

				datos.setMensaje(campo1.getText());

				// Envíar los datos obtenidos
				ObjectOutputStream paqueteDatos = new ObjectOutputStream(misocket.getOutputStream());

				// Indicar en el flujo el paquete que vamos a enviar
				paqueteDatos.writeObject(datos);

				misocket.close();

			} catch (UnknownHostException e1) {
				e1.printStackTrace();
			} catch (IOException e1) {
				System.out.println(e1.getMessage());
			}
		}
	}

	@Override
	public void run() {

		try { // Escucha del pto
			ServerSocket servidorCliente = new ServerSocket(9090);

			// var
			Socket cliente;

			PaqueteEnvio paqueteRecibido;

			// Este constantemente en escucha
			while (true) {
				// Acepta todas las conexiones del exterior
				cliente = servidorCliente.accept();
				// Flujo de entrada transportar objetos
				ObjectInputStream flujoEntrada = new ObjectInputStream(cliente.getInputStream());
				// Obtener información objeto
				paqueteRecibido = (PaqueteEnvio) flujoEntrada.readObject();
				
				if(!paqueteRecibido.getMensaje().equals(" online")) {
					// Escribir area de cliente
					campochat.append("\n" + paqueteRecibido.getNick() + ": " + paqueteRecibido.getMensaje());
				} else {
					// campochat.append("\n" + paqueteRecibido.getIps());
					
					ArrayList<String> IpsMenu = new ArrayList<>();
					
					IpsMenu = paqueteRecibido.getIps();
					
					// Borra si hay ip anteriores registradas
					ip.removeAllItems();
					
					// Ir agregando ip
					for (String i : IpsMenu) {
						ip.addItem(i);
					}
				}
			}

		} catch (Exception e) {

			System.out.println(e.getMessage());
		}

	}
}

//Serializar
class PaqueteEnvio implements Serializable {

	private String nick, ip, mensaje;

	private ArrayList<String> Ips;

	public String getNick() {
		return nick;
	}

	public void setNick(String nick) {
		this.nick = nick;
	}

	public String getIp() {
		return ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
	}

	public String getMensaje() {
		return mensaje;
	}

	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}

	public ArrayList<String> getIps() {
		return Ips;
	}

	public void setIps(ArrayList<String> ips) {
		Ips = ips;
	}
}