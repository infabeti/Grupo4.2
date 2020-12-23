package Vista;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import Controlador.ControladorGeneros;

import java.awt.Color;
import javax.swing.JComboBox;
import java.awt.Font;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;

@SuppressWarnings("serial")
public class PanelGeneros extends JPanel {

	private JButton btnSiguiente, btnVolver;
	public JButton btnDrama, btnComedia, btnTerror, btnCienciaFiccion, btnAnadirPeli, btn_limpiar_sabado, btn_limpiar_domingo;
	private JLabel lblTituloPanel, mensajeTiempoSabado, mensajeTiempoDomingo;
	public JLabel lb_genero_repetido;
	public JLabel lb_seleccione_otro_genero;
	public JComboBox comboBoxTitulos;
	public JTextArea textAreaSabado;
	public JTextArea textAreaDomingo;
	public JTextField tiempoSabado;
	public JTextField tiempoDomingo;
	private ControladorGeneros controladorPanelGeneros;
	private JLabel lblNewLabel;
	private JButton btnEdicion;

	
	public PanelGeneros(ControladorGeneros controladorPanelGeneros){
		this.controladorPanelGeneros = controladorPanelGeneros;
		setBounds(100, 100, 800, 550);
		setBackground(new Color(57, 62, 70));
		setLayout(null);
		
		lblNewLabel = new JLabel("");
		lblNewLabel.setOpaque(true);
		lblNewLabel.setBackground(new Color(204, 153, 0));
		lblNewLabel.setBounds(689, 444, 111, 106);
		add(lblNewLabel);

		btnAnadirPeli = new JButton("A\u00F1adir");
		btnAnadirPeli.setVisible(false);
		btnAnadirPeli.setEnabled(false);
		btnAnadirPeli.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnAnadirPeli.setBounds(512, 52, 123, 30);
		add(btnAnadirPeli);

		
		textAreaDomingo = new JTextArea();
		textAreaDomingo.setBounds(458, 135, 177, 228);
		add(textAreaDomingo);
		
		textAreaSabado = new JTextArea();
		textAreaSabado.setBounds(217, 135, 177, 228);
		add(textAreaSabado);
		
		mensajeTiempoSabado = new JLabel("Tiempo restante sabado:");
		mensajeTiempoSabado.setForeground(Color.LIGHT_GRAY);
		mensajeTiempoSabado.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD | Font.ITALIC, 13));
		mensajeTiempoSabado.setBounds(230, 371, 162, 19);
		add(mensajeTiempoSabado);
		
		tiempoSabado = new JTextField(controladorPanelGeneros.getModelo().secsToHours(controladorPanelGeneros.getModelo().getTIEMPO_TOTAL_SABADO()));
		tiempoSabado.setForeground(new Color(0, 0, 0));
		tiempoSabado.setBackground(new Color(255, 211, 105));
		tiempoSabado.setEditable(false);
		tiempoSabado.setColumns(10);
		tiempoSabado.setBounds(243, 394, 131, 20);
		add(tiempoSabado);

		mensajeTiempoDomingo = new JLabel("Tiempo restante domingo:");
		mensajeTiempoDomingo.setForeground(Color.LIGHT_GRAY);
		mensajeTiempoDomingo.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD | Font.ITALIC, 13));
		mensajeTiempoDomingo.setBounds(470, 371, 162, 19);
		add(mensajeTiempoDomingo);
		
		tiempoDomingo = new JTextField(controladorPanelGeneros.getModelo().secsToHours(controladorPanelGeneros.getModelo().getTIEMPO_TOTAL_DOMINGO()));
		tiempoDomingo.setForeground(new Color(0, 0, 0));
		tiempoDomingo.setBackground(new Color(255, 211, 105));
		tiempoDomingo.setEditable(false);
		tiempoDomingo.setColumns(10);
		tiempoDomingo.setBounds(487, 394, 131, 20);
		add(tiempoDomingo);
		
		btn_limpiar_sabado = new JButton("Limpiar lista");
		btn_limpiar_sabado.setFont(new Font("Tahoma", Font.PLAIN, 10));
		btn_limpiar_sabado.setForeground(new Color(255, 255, 255));
		btn_limpiar_sabado.setBackground(new Color(255, 0, 0));
		btn_limpiar_sabado.setBorderPainted(false);
		btn_limpiar_sabado.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				controladorPanelGeneros.limpiarLista("sabado");
			}
		});
		btn_limpiar_sabado.setBounds(266, 421, 87, 20);
		add(btn_limpiar_sabado);
		
		btn_limpiar_domingo = new JButton("Limpiar lista");
		btn_limpiar_domingo.setFont(new Font("Tahoma", Font.PLAIN, 10));
		btn_limpiar_domingo.setBackground(new Color(255, 0, 0));
		btn_limpiar_domingo.setBorderPainted(false);
		btn_limpiar_domingo.setForeground(new Color(255, 255, 255));
		btn_limpiar_domingo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				controladorPanelGeneros.limpiarLista("domingo");
			}
		});
		btn_limpiar_domingo.setBounds(509, 421, 87, 20);
		add(btn_limpiar_domingo);
		
		btnVolver = new JButton("Volver");
		btnVolver.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnVolver.setBounds(560, 485, 120, 40);
		add(btnVolver);
		
		btnSiguiente = new JButton("Siguiente");
		btnSiguiente.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnSiguiente.setBounds(430, 485, 120, 40);
		add(btnSiguiente);
		
		setBtnEdicion(new JButton("Edici\u00F3n"));
		getBtnEdicion().setEnabled(false);
		getBtnEdicion().setVisible(false);
		getBtnEdicion().setFont(new Font("Tahoma", Font.PLAIN, 20));
		getBtnEdicion().setBounds(10, 485, 120, 40);
		add(getBtnEdicion());
		
		JLabel lblFondo = new JLabel("");
		lblFondo.setBackground(new Color(255, 211, 105));
		lblFondo.setOpaque(true);
		lblFondo.setBounds(0, 444, 800, 106);
		add(lblFondo);
		
		JLabel lblFondoNegro = new JLabel("");
		lblFondoNegro.setOpaque(true);
		lblFondoNegro.setBackground(new Color(34, 40, 49));
		lblFondoNegro.setBounds(689, 0, 111, 450);
		add(lblFondoNegro);
		
		
		lblTituloPanel = new JLabel("Panel Generos");
		lblTituloPanel.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblTituloPanel.setForeground(Color.WHITE);
		lblTituloPanel.setBounds(10, 11, 170, 30);
		add(lblTituloPanel);
		
		comboBoxTitulos = new JComboBox();
		comboBoxTitulos.setVisible(false);
		comboBoxTitulos.setEnabled(false);
		comboBoxTitulos.setBounds(154, 52, 348, 30);
		add(comboBoxTitulos);
		
		JLabel lblSabado = new JLabel("Pel\u00EDculas s\u00E1bado");
		lblSabado.setHorizontalAlignment(SwingConstants.CENTER);
		lblSabado.setHorizontalTextPosition(SwingConstants.CENTER);
		lblSabado.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblSabado.setForeground(Color.WHITE);
		lblSabado.setBounds(230, 101, 150, 23);
		add(lblSabado);
		
		JLabel lblDomingo = new JLabel("Pel\u00EDculas domingo");
		lblDomingo.setHorizontalTextPosition(SwingConstants.CENTER);
		lblDomingo.setHorizontalAlignment(SwingConstants.CENTER);
		lblDomingo.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblDomingo.setForeground(Color.WHITE);
		lblDomingo.setBounds(470, 101, 150, 23);
		add(lblDomingo);

		btnCienciaFiccion = new JButton("Ciencia Ficcion");
		btnCienciaFiccion.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnCienciaFiccion.setBounds(10, 318, 143, 45);
		add(btnCienciaFiccion);
		
		btnTerror = new JButton("Terror");
		btnTerror.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnTerror.setBounds(10, 257, 143, 45);
		add(btnTerror);
		
		btnComedia = new JButton("Comedia");
		btnComedia.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnComedia.setBounds(10, 196, 143, 45);
		add(btnComedia);
		
		btnDrama = new JButton("Drama");
		btnDrama.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnDrama.setBounds(10, 135, 143, 45);
		add(btnDrama);
		
		lb_genero_repetido = new JLabel("G\u00E9nero repetido,");
		lb_genero_repetido.setBackground(Color.WHITE);
		lb_genero_repetido.setVisible(false);
		lb_genero_repetido.setForeground(Color.RED);
		lb_genero_repetido.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lb_genero_repetido.setBounds(10, 79, 141, 23);
		add(lb_genero_repetido);
		
		lb_seleccione_otro_genero = new JLabel("seleccione otro g\u00E9nero*");
		lb_seleccione_otro_genero.setBackground(Color.WHITE);
		lb_seleccione_otro_genero.setBorder(new LineBorder(new Color(255, 0, 0), 1, true));
		lb_seleccione_otro_genero.setVisible(false);
		lb_seleccione_otro_genero.setForeground(Color.RED);
		lb_seleccione_otro_genero.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lb_seleccione_otro_genero.setBounds(10, 79, 141, 44);
		add(lb_seleccione_otro_genero);
		
		initializeEvents();
	}
	
	private void initializeEvents() {
		this.btnSiguiente.addActionListener(listenerBotonSiguiente(this.controladorPanelGeneros));
		this.btnVolver.addActionListener(listenerBotonVolver(this.controladorPanelGeneros));
		this.getBtnEdicion().addActionListener(listenerBotonEdicion(this.controladorPanelGeneros));
		this.btnDrama.addActionListener(listenerBotonDrama(this.controladorPanelGeneros));
		this.btnComedia.addActionListener(listenerBotonComedia(this.controladorPanelGeneros));
		this.btnTerror.addActionListener(listenerBotonTerror(this.controladorPanelGeneros));
		this.btnCienciaFiccion.addActionListener(listenerBotonCienciaFiccion(this.controladorPanelGeneros));
		this.btnAnadirPeli.addActionListener(listenerBotonAnadirPeli(this.controladorPanelGeneros));
		
	}
	

	private ActionListener listenerBotonSiguiente(ControladorGeneros controladorPanelGeneros) {
		return new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.out.println("Ejecutando evento Boton Siguiente en Generos");
				controladorPanelGeneros.accionadoBotonSiguientePanelGeneros();
			}
		};
	}
	private ActionListener listenerBotonVolver(ControladorGeneros controladorPanelGeneros) {
		return new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.out.println("Ejecutando evento Boton Volver en Generos");
				controladorPanelGeneros.accionadoBotonVolverPanelGeneros();
			}
		};
	}
	private ActionListener listenerBotonEdicion(ControladorGeneros controladorPanelGeneros2) {
		return new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.out.println("Ejecutando evento Boton Edición en Generos");
				controladorPanelGeneros.accionadoBotonEdicionPanelGeneros();
			}
		};
	}
	private ActionListener listenerBotonDrama(ControladorGeneros controladorPanelGeneros) {
		return new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.out.println("Ejecutando evento Boton Drama en Generos");
				System.out.println(arg0.getSource());
				controladorPanelGeneros.titulosDelGenero(btnDrama);
//				controladorPanelGeneros.accionadoBotonDramaPanelGeneros();
			}
		};
	}
	private ActionListener listenerBotonComedia(ControladorGeneros controladorPanelGeneros) {
		return new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.out.println("Ejecutando evento Boton Comedia en Generos");
				controladorPanelGeneros.titulosDelGenero(btnComedia);
			}
		};
	}
	private ActionListener listenerBotonTerror(ControladorGeneros controladorPanelGeneros) {
		return new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.out.println("Ejecutando evento Boton Terror en Generos");
				controladorPanelGeneros.titulosDelGenero(btnTerror);
			}
		};
	}
	private ActionListener listenerBotonCienciaFiccion(ControladorGeneros controladorPanelGeneros) {
		return new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.out.println("Ejecutando evento Boton Ciencia Ficción en Generos");
				controladorPanelGeneros.titulosDelGenero(btnCienciaFiccion);
			}
		};
	}
	private ActionListener listenerBotonAnadirPeli(ControladorGeneros controladorPanelGeneros) {
		return new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.out.println("Ejecutando evento Boton Añadir película Drama");
				controladorPanelGeneros.addPelicula(comboBoxTitulos);
			}
		};
	}

	public JButton getBtnEdicion() {
		return btnEdicion;
	}

	public void setBtnEdicion(JButton btnEdicion) {
		this.btnEdicion = btnEdicion;
	}

}
