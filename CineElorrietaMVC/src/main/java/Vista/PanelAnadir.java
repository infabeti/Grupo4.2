package Vista;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import Controlador.ControladorPanelAnadir;

@SuppressWarnings("serial")
public class PanelAnadir extends JPanel {
	private JTextField textField;
	private JButton btnAceptar;
	private JButton btnCancelar;
	private ControladorPanelAnadir controladorPanelAnadir;
	/**
	 * Create the panel.
	 * @param controladorPanelAnadir 
	 */
	public PanelAnadir(ControladorPanelAnadir controladorPanelAnadir) {
		this.controladorPanelAnadir = controladorPanelAnadir;
		setBounds(100, 100, 800, 550);
		setBackground(new Color(57, 62, 70));
		setLayout(null);
		
		btnAceptar = new JButton("Aceptar");
		btnAceptar.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnAceptar.setBounds(444, 485, 113, 41);
		add(btnAceptar);
		
		btnCancelar = new JButton("Cancelar");
		btnCancelar.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnCancelar.setBounds(588, 485, 113, 41);
		add(btnCancelar);
		
		JLabel lblTitulo = new JLabel("T\u00EDtulo:");
		lblTitulo.setForeground(new Color(255, 255, 255));
		lblTitulo.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblTitulo.setBounds(86, 115, 90, 61);
		add(lblTitulo);
		
		JComboBox comboBoxGenero = new JComboBox();
		comboBoxGenero.setBounds(247, 230, 339, 40);
		add(comboBoxGenero);
		
		JLabel lblAñadir = new JLabel("A\u00F1adir");
		lblAñadir.setForeground(new Color(255, 255, 255));
		lblAñadir.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblAñadir.setBounds(10, 11, 595, 46);
		add(lblAñadir);
		
		JLabel lblGenero = new JLabel("G\u00E9nero:");
		lblGenero.setForeground(Color.WHITE);
		lblGenero.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblGenero.setBounds(86, 209, 90, 61);
		add(lblGenero);
		
		textField = new JTextField();
		textField.setBounds(247, 139, 339, 37);
		add(textField);
		textField.setColumns(10);
		
		initializeEvents();
	}
	
	private void initializeEvents() {
		this.btnAceptar.addActionListener(listenerBotonAceptar(this.controladorPanelAnadir));
		this.btnCancelar.addActionListener(listenerBotonCancelar(this.controladorPanelAnadir));
	}
	
	private ActionListener listenerBotonAceptar(ControladorPanelAnadir controladorPanelAnadir) {
		return new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.out.println("Ejecutando evento Boton hacia Generos");
				controladorPanelAnadir.accionadoBotonAceptarPanelAnadir();
			}
		};
	}
	private ActionListener listenerBotonCancelar(ControladorPanelAnadir controladorPanelAnadir) {
		return new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.out.println("Ejecutando evento Boton hacia Generos");
				controladorPanelAnadir.accionadoBotonCancelarPanelAnadir();
			}
		};
	}

}
