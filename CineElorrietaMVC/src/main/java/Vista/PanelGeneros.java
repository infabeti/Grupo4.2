package Vista;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import Controlador.ControladorPanelGeneros;
import java.awt.Color;
import javax.swing.JComboBox;
import java.awt.Font;
import javax.swing.JTextArea;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;

@SuppressWarnings("serial")
public class PanelGeneros extends JPanel {

	private JButton btnSiguiente, btnVolver;
	public JButton btnDrama, btnComedia, btnTerror, btnCienciaFiccion, btnAnadirDrama, btnAnadirComedia, btnAnadirTerror, btnAnadirCienciaFiccion;
	private JLabel lblGeneros;
	public JComboBox comboBoxDrama, comboBoxComedia, comboBoxCienciaFiccion, comboBoxTerror;
	public JTextArea textAreaSabado;
	private ControladorPanelGeneros controladorPanelGeneros;

	
	public PanelGeneros(ControladorPanelGeneros controladorPanelGeneros){
		this.controladorPanelGeneros = controladorPanelGeneros;
		setBounds(100, 100, 800, 550);
		setBackground(new Color(57, 62, 70));
		setLayout(null);
		
		btnAnadirComedia = new JButton("A\u00F1adir");
		btnAnadirComedia.setVisible(false);
		btnAnadirComedia.setEnabled(false);
		btnAnadirComedia.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnAnadirComedia.setBounds(512, 52, 123, 30);
		add(btnAnadirComedia);
		
		btnAnadirDrama = new JButton("A\u00F1adir");
		btnAnadirDrama.setVisible(false);
		btnAnadirDrama.setEnabled(false);
		btnAnadirDrama.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnAnadirDrama.setBounds(512, 52, 123, 30);
		add(btnAnadirDrama);
		
		btnAnadirTerror = new JButton("A\u00F1adir");
		btnAnadirTerror.setEnabled(false);
		btnAnadirTerror.setVisible(false);
		btnAnadirTerror.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnAnadirTerror.setBounds(512, 52, 123, 30);
		add(btnAnadirTerror);
		
		btnAnadirCienciaFiccion = new JButton("A\u00F1adir");
		btnAnadirCienciaFiccion.setVisible(false);
		btnAnadirCienciaFiccion.setEnabled(false);
		btnAnadirCienciaFiccion.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnAnadirCienciaFiccion.setBounds(512, 52, 123, 30);
		add(btnAnadirCienciaFiccion);
		
		comboBoxCienciaFiccion = new JComboBox();
		comboBoxCienciaFiccion.setEnabled(false);
		comboBoxCienciaFiccion.setVisible(false);
		comboBoxCienciaFiccion.setBounds(154, 52, 348, 30);
		add(comboBoxCienciaFiccion);
		
		JTextArea textAreaDomingo = new JTextArea();
		textAreaDomingo.setBounds(473, 135, 162, 228);
		add(textAreaDomingo);
		
		textAreaSabado = new JTextArea();
		textAreaSabado.setLineWrap(true);
		textAreaSabado.setBounds(232, 135, 162, 228);
		add(textAreaSabado);
		
		btnVolver = new JButton("Volver");
		btnVolver.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnVolver.setBounds(575, 485, 115, 41);
		add(btnVolver);
		
		btnSiguiente = new JButton("Siguiente");
		btnSiguiente.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnSiguiente.setBounds(430, 485, 115, 41);
		add(btnSiguiente);
		
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
		
		
		lblGeneros = new JLabel("Panel Generos");
		lblGeneros.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblGeneros.setForeground(Color.WHITE);
		lblGeneros.setBounds(10, 11, 115, 14);
		add(lblGeneros);
		
		comboBoxDrama = new JComboBox();
		comboBoxDrama.setVisible(false);
		comboBoxDrama.setEnabled(false);
		comboBoxDrama.setBounds(154, 52, 348, 30);
		add(comboBoxDrama);
		
		JLabel lblSabado = new JLabel("Sabado");
		lblSabado.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblSabado.setForeground(Color.WHITE);
		lblSabado.setBounds(232, 102, 162, 23);
		add(lblSabado);
		
		JLabel lblDomingo = new JLabel("Domingo");
		lblDomingo.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblDomingo.setForeground(Color.WHITE);
		lblDomingo.setBounds(473, 102, 162, 23);
		add(lblDomingo);
		
		comboBoxComedia = new JComboBox();
		comboBoxComedia.setVisible(false);
		comboBoxComedia.setEnabled(false);
		comboBoxComedia.setBounds(154, 52, 348, 30);
		add(comboBoxComedia);
		
		comboBoxTerror = new JComboBox();
		comboBoxTerror.setEnabled(false);
		comboBoxTerror.setVisible(false);
		comboBoxTerror.setBounds(154, 52, 348, 30);
		add(comboBoxTerror);
		
		btnCienciaFiccion = new JButton("Ciencia Ficcion");
		btnCienciaFiccion.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnCienciaFiccion.setBounds(30, 318, 123, 45);
		add(btnCienciaFiccion);
		
		btnTerror = new JButton("Terror");
		btnTerror.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnTerror.setBounds(30, 257, 123, 45);
		add(btnTerror);
		
		btnComedia = new JButton("Comedia");
		btnComedia.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnComedia.setBounds(30, 196, 123, 45);
		add(btnComedia);
		
		btnDrama = new JButton("Drama");
		btnDrama.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnDrama.setBounds(30, 135, 123, 45);
		add(btnDrama);
		
		initializeEvents();
	}
	
	private void initializeEvents() {
		this.btnSiguiente.addActionListener(listenerBotonSiguiente(this.controladorPanelGeneros));
		this.btnVolver.addActionListener(listenerBotonVolver(this.controladorPanelGeneros));
		this.btnDrama.addActionListener(listenerBotonDrama(this.controladorPanelGeneros));
		this.btnComedia.addActionListener(listenerBotonComedia(this.controladorPanelGeneros));
		this.btnTerror.addActionListener(listenerBotonTerror(this.controladorPanelGeneros));
		this.btnCienciaFiccion.addActionListener(listenerBotonCienciaFiccion(this.controladorPanelGeneros));
		this.btnAnadirDrama.addActionListener(listenerBotonAnadirDrama(this.controladorPanelGeneros));
		this.btnAnadirComedia.addActionListener(listenerBotonAnadirComedia(this.controladorPanelGeneros));
		this.btnAnadirTerror.addActionListener(listenerBotonAnadirTerror(this.controladorPanelGeneros));
		this.btnAnadirCienciaFiccion.addActionListener(listenerBotonAnadirCienciaFiccion(this.controladorPanelGeneros));
	}
	
	private ActionListener listenerBotonSiguiente(ControladorPanelGeneros controladorPanelGeneros) {
		return new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.out.println("Ejecutando evento Boton Siguiente en Generos");
				controladorPanelGeneros.accionadoBotonSiguientePanelGeneros();
			}
		};
	}
	private ActionListener listenerBotonVolver(ControladorPanelGeneros controladorPanelGeneros) {
		return new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.out.println("Ejecutando evento Boton Volver en Generos");
				controladorPanelGeneros.accionadoBotonVolverPanelGeneros();
			}
		};
	}
	private ActionListener listenerBotonDrama(ControladorPanelGeneros controladorPanelGeneros) {
		return new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.out.println("Ejecutando evento Boton Drama en Generos");
				controladorPanelGeneros.accionadoBotonDramaPanelGeneros();
			}
		};
	}
	private ActionListener listenerBotonComedia(ControladorPanelGeneros controladorPanelGeneros) {
		return new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.out.println("Ejecutando evento Boton Comedia en Generos");
				controladorPanelGeneros.accionadoBotonComediaPanelGeneros();
			}
		};
	}
	private ActionListener listenerBotonTerror(ControladorPanelGeneros controladorPanelGeneros) {
		return new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.out.println("Ejecutando evento Boton Terror en Generos");
				controladorPanelGeneros.accionadoBotonTerrorPanelGeneros();
			}
		};
	}
	private ActionListener listenerBotonCienciaFiccion(ControladorPanelGeneros controladorPanelGeneros) {
		return new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.out.println("Ejecutando evento Boton Ciencia Ficción en Generos");
				controladorPanelGeneros.accionadoBotonCienciaFiccionPanelGeneros();
			}
		};
	}
	private ActionListener listenerBotonAnadirDrama(ControladorPanelGeneros controladorPanelGeneros) {
		return new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.out.println("Ejecutando evento Boton Añadir película Drama");
				controladorPanelGeneros.addPelicula(comboBoxDrama);
			}
		};
	}
	private ActionListener listenerBotonAnadirComedia(ControladorPanelGeneros controladorPanelGeneros) {
		return new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.out.println("Ejecutando evento Boton Añadir película Comedia");
				controladorPanelGeneros.addPelicula(comboBoxComedia);
			}
		};
	}
	private ActionListener listenerBotonAnadirTerror(ControladorPanelGeneros controladorPanelGeneros) {
		return new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.out.println("Ejecutando evento Boton Añadir película Terror");
				controladorPanelGeneros.addPelicula(comboBoxTerror);
			}
		};
	}
	private ActionListener listenerBotonAnadirCienciaFiccion(ControladorPanelGeneros controladorPanelGeneros) {
		return new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.out.println("Ejecutando evento Boton Añadir película Ciencia Ficción");
				controladorPanelGeneros.addPelicula(comboBoxCienciaFiccion);
			}
		};
	}
}
