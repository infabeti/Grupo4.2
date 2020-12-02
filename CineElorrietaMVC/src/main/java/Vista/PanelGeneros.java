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

@SuppressWarnings("serial")
public class PanelGeneros extends JPanel {

	private JButton btnSiguiente;
	private JButton btnVolver;
	private JLabel lblGeneros;
	private ControladorPanelGeneros controladorPanelGeneros;
	
	public PanelGeneros(ControladorPanelGeneros controladorPanelGeneros)
	{
		setBackground(new Color(57, 62, 70));
		this.controladorPanelGeneros = controladorPanelGeneros;
		setLayout(null);
		
		lblGeneros = new JLabel("Panel Generos");
		lblGeneros.setBounds(10, 11, 115, 14);
		add(lblGeneros);
		
		btnSiguiente = new JButton("Siguiente");
		btnSiguiente.setBounds(602, 503, 89, 23);
		add(btnSiguiente);
		
		btnVolver = new JButton("Volver");
		btnVolver.setBounds(701, 503, 89, 23);
		add(btnVolver);
		
		JComboBox comboBoxDrama = new JComboBox();
		comboBoxDrama.setBounds(40, 96, 169, 28);
		add(comboBoxDrama);
		
		JLabel lblDrama = new JLabel("Drama");
		lblDrama.setFont(new Font("Tahoma", Font.PLAIN, 10));
		lblDrama.setBounds(40, 59, 169, 26);
		add(lblDrama);
		
		JTextArea textAreaSabado = new JTextArea();
		textAreaSabado.setBounds(253, 214, 162, 244);
		add(textAreaSabado);
		
		JLabel lblSabado = new JLabel("Sabado");
		lblSabado.setBounds(253, 180, 162, 23);
		add(lblSabado);
		
		JTextArea textAreaDomingo = new JTextArea();
		textAreaDomingo.setBounds(494, 214, 162, 244);
		add(textAreaDomingo);
		
		JLabel lblDomingo = new JLabel("Domingo");
		lblDomingo.setBounds(494, 180, 162, 23);
		add(lblDomingo);
		
		JComboBox comboBoxComedia = new JComboBox();
		comboBoxComedia.setBounds(219, 96, 169, 28);
		add(comboBoxComedia);
		
		JLabel lblComedia = new JLabel("Comedia");
		lblComedia.setFont(new Font("Tahoma", Font.PLAIN, 10));
		lblComedia.setBounds(219, 59, 169, 26);
		add(lblComedia);
		
		JComboBox comboBoxTerror = new JComboBox();
		comboBoxTerror.setBounds(398, 96, 169, 28);
		add(comboBoxTerror);
		
		JLabel lblTerror = new JLabel("Terror\r\n");
		lblTerror.setFont(new Font("Tahoma", Font.PLAIN, 10));
		lblTerror.setBounds(398, 59, 169, 26);
		add(lblTerror);
		
		JComboBox comboBoxCienciaFiccion = new JComboBox();
		comboBoxCienciaFiccion.setBounds(577, 96, 169, 28);
		add(comboBoxCienciaFiccion);
		
		JLabel lblCienciaFiccion = new JLabel("Ciencia Ficcion");
		lblCienciaFiccion.setFont(new Font("Tahoma", Font.PLAIN, 10));
		lblCienciaFiccion.setBounds(577, 59, 169, 26);
		add(lblCienciaFiccion);
		
		JRadioButton rdbtnSabado = new JRadioButton("Sabado");
		rdbtnSabado.setBounds(16, 277, 109, 23);
		add(rdbtnSabado);
		
		JRadioButton rdbtnDomingo = new JRadioButton("Domingo");
		rdbtnDomingo.setBounds(16, 303, 109, 23);
		add(rdbtnDomingo);
		
		JLabel lblSeleccion = new JLabel("Seleccione el dia en el que\r\n");
		lblSeleccion.setBounds(10, 234, 138, 14);
		add(lblSeleccion);
		
		JLabel lblQuieraMeterLa = new JLabel("quiera meter la pelicula:\r\n");
		lblQuieraMeterLa.setBounds(10, 256, 138, 14);
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
