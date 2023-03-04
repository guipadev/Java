package com.pildo._21hilosThreadsProgramacionConcurrente.usoThreads;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

class MarcoRebote extends JFrame {

	private LaminaPelota lamina;

	// Var hilos accesible desde cualquier método
	Thread hiloBall1, hiloBall2, hiloBall3;

	// Creación de botones
	JButton btnStart1, btnStart2, btnStart3, btnStop1, btnStop2, btnStop3;

	public MarcoRebote() {

		setBounds(600, 300, 600, 350);

		setTitle("Rebotes");

		lamina = new LaminaPelota();

		add(lamina, BorderLayout.CENTER);

		JPanel laminaBotones = new JPanel();

		// Creación boton y evento hilo 1
		btnStart1 = new JButton("Hilo1");

		btnStart1.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent evento) {

				comienza_el_juego(evento);
			}
		});

		// Agregar botones a la lamina
		laminaBotones.add(btnStart1);

		// Creación boton y evento hilo 2
		btnStart2 = new JButton("Hilo2");

		btnStart2.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent evento) {

				comienza_el_juego(evento);
			}
		});

		// Agregar botones a la lamina
		laminaBotones.add(btnStart2);

		// Creación boton y evento hilo 3
		btnStart3 = new JButton("Hilo3");

		btnStart3.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent evento) {

				comienza_el_juego(evento);
			}
		});

		// Agregar botones a la lamina
		laminaBotones.add(btnStart3);

		// Creación boton y evento detener hilo 1
		btnStop1 = new JButton("Deten1");

		btnStop1.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent evento) {

				detener(evento);
			}
		});

		// Agregar botones a la lamina
		laminaBotones.add(btnStop1);

		// Creación boton y evento detener hilo 2
		btnStop2 = new JButton("Deten2");

		btnStop2.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent evento) {

				detener(evento);
			}
		});

		// Agregar botones a la lamina
		laminaBotones.add(btnStop2);

		// Creación boton y evento detener hilo 2
		btnStop3 = new JButton("Deten3");

		btnStop3.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent evento) {

				detener(evento);
			}
		});

		// Agregar botones a la lamina
		laminaBotones.add(btnStop3);

		add(laminaBotones, BorderLayout.SOUTH);

		// Dibuja el boton iniciar
		/*
		 * ponerBoton(laminaBotones, "Dale!", new ActionListener(){ public void
		 * actionPerformed(ActionEvent evento){ comienza_el_juego(); } });
		 */

		// Dibuja el boton salir
		/*
		 * ponerBoton(laminaBotones, "Salir", new ActionListener(){ public void
		 * actionPerformed(ActionEvent evento){ System.exit(0); } });
		 */

		// Dibuja el boton de detener
		/*
		 * ponerBoton(laminaBotones, "Detener", new ActionListener(){ public void
		 * actionPerformed(ActionEvent evento){ detener(); } });
		 */
	}

	// Ponemos botones
	public void ponerBoton(Container c, String titulo, ActionListener oyente) {
		JButton boton = new JButton(titulo);
		c.add(boton);
		boton.addActionListener(oyente);
	}

	// Añade pelota y la bota 1000 veces
	// Ahora cada vez que damos dale saldran más pelotas y al dar cerrar tambien
	// realiza el proceso
	public void comienza_el_juego(ActionEvent e) {
		Pelota pelota = new Pelota();

		lamina.add(pelota);

		// Implementar hilo
		Runnable runHilo = new PelotaHilos(pelota, lamina);

		// Thread t = new Thread(r);
		// tHilo = new Thread(runHilo);
		// tHilo.start();

		
		if (e.getSource().equals(btnStart1)) {
			hiloBall1 = new Thread(runHilo);
			hiloBall1.start();
		} else if (e.getSource().equals(btnStart2)) {
			hiloBall2 = new Thread(runHilo);
			hiloBall2.start();
		} else if (e.getSource().equals(btnStart3)) {
			hiloBall3 = new Thread(runHilo);
			hiloBall3.start();
		}
		
			}

	// Detener Hilo
	public void detener(ActionEvent e) {
		// tHilo.stop(); //obsoleto
		// tHilo.interrupt();
		
		if (e.getSource().equals(btnStop1)) {
			hiloBall1.interrupt();
		} else if (e.getSource().equals(btnStop2)) {
			hiloBall2.interrupt();
		} else if (e.getSource().equals(btnStop3)) {
			hiloBall3.interrupt();
		}
	}

}
