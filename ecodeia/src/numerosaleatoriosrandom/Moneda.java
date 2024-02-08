package numerosaleatoriosrandom;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Moneda extends JFrame implements ActionListener {

	// Img de la moneda
	private JLabel lImagen;

	// Resultados
	private JTextField tResultado;

	// Donde se guarda la img
	private ImageIcon imagen;

	// Botones
	private JButton bNuevo, bLanzar;

	private int cont, caso;

	// Numero de intentos
	private final int INTENTOS = 5;

	// Contatena cada uno de los resultados
	private String moneda;

	// Aleatorio
	private Random aleatorio;

	// Crea un hilo, para ejecutar en paralelo a otros procesos
	private Timer timer;

	// Crea la tarea
	private TimerTask tt;

	public Moneda() {
		// Definiremos el caractersiticas del JFrame
		// titulo, tamaño, forma de cierro, posición ventana
		super("Cara y sello");
		this.setSize(600, 400);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);

		// Definición JFrame del titulo
		JLabel lTitulo = new JLabel("Números Aleatorios: Cara y Sello.", JLabel.CENTER);
		lTitulo.setFont(new Font("Arial", Font.BOLD + Font.ITALIC, 18));
		this.add(lTitulo, BorderLayout.NORTH);

		// Definición Panel centro con el tipo del border layout
		JPanel pCentro = new JPanel(new BorderLayout());

		// Definición label de la imagen
		lImagen = new JLabel("", JLabel.CENTER);

		// Definición icon, que por defecto es la mano cerrada
		imagen = new ImageIcon("media/rinicio.jpg");

		lImagen.setIcon(imagen);

		// Agregamos panel centro la img
		pCentro.add(lImagen, BorderLayout.CENTER);

		// Definimos el resultado
		tResultado = new JTextField();
		// No sea editable
		tResultado.setEditable(false);
		tResultado.setFont(new Font("Arial", Font.BOLD, 18));
		// Alinear horizontalmente el texto
		tResultado.setHorizontalAlignment(JTextField.CENTER);
		pCentro.add(tResultado, BorderLayout.SOUTH);

		// Agregamos el JPanel al centro dentro del JFrame centro
		this.add(pCentro, BorderLayout.CENTER);

		// Creamos y agregamos el panel de los 2 botones
		JPanel pBotones = new JPanel();
		bNuevo = new JButton("NUEVO");
		bNuevo.addActionListener(this);
		pBotones.add(bNuevo);

		bLanzar = new JButton("LANZAR");
		bLanzar.addActionListener(this);
		// Boton lanzar no estar habilitado, hasta que de clic boton iniciar e
		// inicialice todas las variables
		bLanzar.setEnabled(false);
		pBotones.add(bLanzar);

		this.add(pBotones, BorderLayout.SOUTH);
	}

	/**
	 * Método Iniciar que se ejecuta al presionar botón nuevo Inicia el random,
	 * habilita boton de lanzar, deshabilita boton nuevo Limpiara el resultado,
	 * inicializara la moneda en blanco y caso en 0
	 */
	public void iniciar() {
		// Constructor tambien puede inicializar la semilla
		aleatorio = new Random(123);
		bNuevo.setEnabled(false);
		bLanzar.setEnabled(true);
		tResultado.setText("");
		moneda = "";
		caso = 0;
	}

	/**
	 * Método se ejecutara al tener 5 resultados al lanzar la moneda Se habilita el
	 * botón nuevo, se deshabilitará el botón lanzar Se detendra la tarea
	 */
	public void terminar() {
		bNuevo.setEnabled(true);
		bLanzar.setEnabled(false);
		timer.cancel();
	}

	/**
	 * Método Inicializar
	 */

	@Override
	public void actionPerformed(ActionEvent e) {

		// Evento generado por los botones, captura evento
		Object bt = e.getSource();

		// Si botón es nuevo
		if (bt == bNuevo) {
			cont = 0;
			iniciar();
		}

		// Si es botón lanzar
		if (bt == bLanzar) {
			bLanzar.setEnabled(false);
			tt = new TimerTask() {

				// Desarrollo de la tarea, en cada ciclo de lanzar la moneda
				@Override
				public void run() {
					// Evaluamos la var caso
					if (caso == 0) {
						cont++;
						if (aleatorio.nextBoolean()) {
							imagen = new ImageIcon("media/rcara.jpg");
							moneda = moneda + " CARA";
						} else {
							imagen = new ImageIcon("media/rsello.jpg");
							moneda = moneda + " SELLO";
						}
						lImagen.setIcon(imagen);
						lImagen.repaint(); // Volver a dibujar todo el contenido de la img
						tResultado.setText(moneda);
						caso = 1; // si genero un cara o un sello, en la próxima tiene que cerrar la mano

					} else if (caso == 1) {
						imagen = new ImageIcon("media/rinicio.jpg");
						lImagen.setIcon(imagen);
						lImagen.repaint();
						caso = 0;
						if (cont == INTENTOS)
							terminar();

					}
				}
			};
			timer = new Timer();
			// La tarea inicia en 10 ms y se ejecuta en 1.5 seg para poder ver moneda y cara
			timer.schedule(tt, 10, 1500);
		}

	}

}
