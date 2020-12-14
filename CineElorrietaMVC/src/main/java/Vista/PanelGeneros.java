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

	private JButton btnSiguiente;
	private JButton btnVolver;
	private JLabel lblGeneros;
	public JComboBox comboBoxDrama, comboBoxComedia, comboBoxCienciaFiccion, comboBoxTerror;
	public JTextArea textAreaSabado;
	private ControladorPanelGeneros controladorPanelGeneros;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JButton btnTerror;
	private JButton btnComedia;
	private JButton btnDrama;
	private JButton btnAnadirDrama;
	private JButton btnAnadirComedia;
	private JButton btnAnadirTerror;
	private JButton btnAnadirCienciaFiccion;
	
	public PanelGeneros(ControladorPanelGeneros controladorPanelGeneros){
		this.controladorPanelGeneros = controladorPanelGeneros;
		setBounds(100, 100, 800, 550);
		setBackground(new Color(57, 62, 70));
		setLayout(null);
		
		btnAnadirComedia = new JButton("A\u00F1adir");
		btnAnadirComedia.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnAnadirComedia.setBounds(512, 41, 123, 50);
		add(btnAnadirComedia);
		
		btnAnadirDrama = new JButton("A\u00F1adir");
		btnAnadirDrama.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnAnadirDrama.setBounds(512, 41, 123, 50);
		add(btnAnadirDrama);
		
		btnAnadirTerror = new JButton("A\u00F1adir");
		btnAnadirTerror.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnAnadirTerror.setBounds(512, 41, 123, 50);
		add(btnAnadirTerror);
		
		btnAnadirCienciaFiccion = new JButton("A\u00F1adir");
		btnAnadirCienciaFiccion.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnAnadirCienciaFiccion.setBounds(512, 41, 123, 50);
		add(btnAnadirCienciaFiccion);
		
		comboBoxCienciaFiccion = new JComboBox();
		comboBoxCienciaFiccion.setBounds(154, 52, 348, 28);
		add(comboBoxCienciaFiccion);
		
		JTextArea textAreaDomingo = new JTextArea();
		textAreaDomingo.setBounds(473, 136, 162, 228);
		add(textAreaDomingo);
		
		textAreaSabado = new JTextArea();
		textAreaSabado.setLineWrap(true);
		textAreaSabado.setBounds(232, 136, 162, 228);
		add(textAreaSabado);
		
		btnVolver = new JButton("Volver");
		btnVolver.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnVolver.setBounds(675, 472, 115, 50);
		add(btnVolver);
		
		btnSiguiente = new JButton("Siguiente");
		btnSiguiente.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnSiguiente.setBounds(520, 476, 115, 50);
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
		comboBoxDrama.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				controladorPanelGeneros.addPelicula((JComboBox) arg0.getSource());
			}
		});
		comboBoxDrama.setBounds(154, 52, 348, 28);
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
		comboBoxComedia.setBounds(154, 52, 348, 28);
		add(comboBoxComedia);
		
		comboBoxTerror = new JComboBox();
		comboBoxTerror.setBounds(154, 52, 348, 28);
		add(comboBoxTerror);
		
		JButton btnCienciaFiccion = new JButton("Ciencia Ficcion");
		btnCienciaFiccion.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnCienciaFiccion.setBounds(30, 314, 123, 50);
		add(btnCienciaFiccion);
		
		btnTerror = new JButton("Terror");
		btnTerror.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnTerror.setBounds(30, 248, 123, 50);
		add(btnTerror);
		
		btnComedia = new JButton("Comedia");
		btnComedia.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnComedia.setBounds(30, 187, 123, 50);
		add(btnComedia);
		
		btnDrama = new JButton("Drama");
		btnDrama.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnDrama.setBounds(30, 126, 123, 50);
		add(btnDrama);
		
		initializeEvents();
	}
	
	private void initializeEvents() {
		this.btnSiguiente.addActionListener(listenerBotonSiguiente(this.controladorPanelGeneros));
		this.btnVolver.addActionListener(listenerBotonVolver(this.controladorPanelGeneros));
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
}
