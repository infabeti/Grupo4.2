package Vista;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import java.awt.Color;
import javax.swing.SwingConstants;

import Controlador.ControladorPanelAnadir;
import Controlador.ControladorPanelEditar;
import javax.swing.JTable;

@SuppressWarnings("serial")
public class PanelEditar extends JPanel {
	private JButton btnAceptar;
	private JButton btnCancelar;
	private ControladorPanelEditar controladorPanelEditar;
	public JComboBox comboBoxGenero, comboBoxNombre;

	/**
	 * Create the panel.
	 * @param controladorPanelEditar 
	 */
	public PanelEditar(ControladorPanelEditar controladorPanelEditar) {
		this.controladorPanelEditar = controladorPanelEditar;
		setBounds(100, 100, 800, 550);
		setBackground(new Color(57, 62, 70));
		setLayout(null);
		
		JLabel lblEditar = new JLabel("se mostrar\u00E1 una nueva ventana en la que ser\u00E1n editables tanto el nombre de una pel\u00EDcula como su g\u00E9nero\r\n");
		lblEditar.setHorizontalAlignment(SwingConstants.LEFT);
		lblEditar.setVerticalAlignment(SwingConstants.TOP);
		lblEditar.setForeground(new Color(255, 255, 255));
		lblEditar.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblEditar.setBounds(10, 11, 700, 130);
		add(lblEditar);
		
		btnCancelar = new JButton("Cancelar");
		btnCancelar.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnCancelar.setBounds(575, 485, 113, 41);
		add(btnCancelar);
		
		btnAceptar = new JButton("Aceptar");
		btnAceptar.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnAceptar.setBounds(430, 485, 113, 41);
		add(btnAceptar);
		
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
		
		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setForeground(new Color(255, 255, 255));
		lblNombre.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNombre.setBounds(209, 198, 90, 61);
		add(lblNombre);
		
		JLabel lblGenero = new JLabel("Gen\u00E9ro");
		lblGenero.setForeground(new Color(255, 255, 255));
		lblGenero.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblGenero.setBounds(405, 198, 90, 61);
		add(lblGenero);
		
		comboBoxNombre = new JComboBox();
		comboBoxNombre.setBounds(209, 285, 101, 27);
		add(comboBoxNombre);
		
		comboBoxGenero = new JComboBox();
		comboBoxGenero.setBounds(405, 285, 101, 27);
		add(comboBoxGenero);
		
		initializeEvents();
	}
	
	private void initializeEvents() {
		this.btnAceptar.addActionListener(listenerBotonAceptar(this.controladorPanelEditar));
		this.btnCancelar.addActionListener(listenerBotonCancelar(this.controladorPanelEditar));
		this.comboBoxGenero.addActionListener(listenerComboBoxGeneros(this.controladorPanelEditar));

	}
	private ActionListener listenerComboBoxGeneros(ControladorPanelEditar controladorPanelAnadir) {
		return new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.out.println("Ejecutando evento Boton hacia Generos");
				controladorPanelAnadir.cambiarGenero();
			}
		};
	}
	private ActionListener listenerBotonAceptar(ControladorPanelEditar controladorPanelEditar) {
		return new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.out.println("Ejecutando evento Boton hacia Generos");
				controladorPanelEditar.accionadoBotonAceptarPanelEditar();
			}
		};
	}
	private ActionListener listenerBotonCancelar(ControladorPanelEditar controladorPanelEditar) {
		return new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.out.println("Ejecutando evento Boton hacia Generos");
				controladorPanelEditar.accionadoBotonCancelarPanelEditar();
			}
		};
	}
}
