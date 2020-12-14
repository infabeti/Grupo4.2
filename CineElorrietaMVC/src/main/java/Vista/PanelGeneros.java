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
	
	public PanelGeneros(ControladorPanelGeneros controladorPanelGeneros){
		this.controladorPanelGeneros = controladorPanelGeneros;
		setBounds(100, 100, 800, 550);
		setBackground(new Color(57, 62, 70));
		setLayout(null);
		
		comboBoxCienciaFiccion = new JComboBox();
		comboBoxCienciaFiccion.setBounds(460, 141, 169, 28);
		add(comboBoxCienciaFiccion);
		
		JTextArea textAreaDomingo = new JTextArea();
		textAreaDomingo.setBounds(494, 214, 162, 228);
		add(textAreaDomingo);
		
		textAreaSabado = new JTextArea();
		textAreaSabado.setLineWrap(true);
		textAreaSabado.setBounds(253, 214, 162, 228);
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
		comboBoxDrama.setBounds(281, 65, 169, 28);
		add(comboBoxDrama);
		
		JLabel lblDrama = new JLabel("Drama");
		lblDrama.setForeground(Color.WHITE);
		lblDrama.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblDrama.setBounds(281, 28, 169, 26);
		add(lblDrama);
		
		JLabel lblSabado = new JLabel("Sabado");
		lblSabado.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblSabado.setForeground(Color.WHITE);
		lblSabado.setBounds(253, 180, 162, 23);
		add(lblSabado);
		
		JLabel lblDomingo = new JLabel("Domingo");
		lblDomingo.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblDomingo.setForeground(Color.WHITE);
		lblDomingo.setBounds(494, 180, 162, 23);
		add(lblDomingo);
		
		comboBoxComedia = new JComboBox();
		comboBoxComedia.setBounds(460, 65, 169, 28);
		add(comboBoxComedia);
		
		JLabel lblComedia = new JLabel("Comedia");
		lblComedia.setForeground(Color.WHITE);
		lblComedia.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblComedia.setBounds(460, 28, 169, 26);
		add(lblComedia);
		
		comboBoxTerror = new JComboBox();
		comboBoxTerror.setBounds(281, 141, 169, 28);
		add(comboBoxTerror);
		
		JLabel lblTerror = new JLabel("Terror\r\n");
		lblTerror.setForeground(Color.WHITE);
		lblTerror.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblTerror.setBounds(281, 104, 169, 26);
		add(lblTerror);
		
		JLabel lblCienciaFiccion = new JLabel("Ciencia Ficcion");
		lblCienciaFiccion.setForeground(Color.WHITE);
		lblCienciaFiccion.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblCienciaFiccion.setBounds(460, 104, 169, 26);
		add(lblCienciaFiccion);
		
		JRadioButton rdbtnSabado = new JRadioButton("Sabado");
		buttonGroup.add(rdbtnSabado);
		rdbtnSabado.setBounds(16, 277, 109, 23);
		add(rdbtnSabado);
		
		JRadioButton rdbtnDomingo = new JRadioButton("Domingo");
		buttonGroup.add(rdbtnDomingo);
		rdbtnDomingo.setBounds(16, 303, 109, 23);
		add(rdbtnDomingo);
		
		JLabel lblSeleccion = new JLabel("Seleccione el dia en el que\r\n");
		lblSeleccion.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblSeleccion.setForeground(Color.WHITE);
		lblSeleccion.setBounds(10, 206, 192, 36);
		add(lblSeleccion);
		
		JLabel lblQuieraMeterLa = new JLabel("quiera meter la pelicula:\r\n");
		lblQuieraMeterLa.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblQuieraMeterLa.setForeground(Color.WHITE);
		lblQuieraMeterLa.setBounds(10, 239, 182, 31);
		add(lblQuieraMeterLa);
		
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
