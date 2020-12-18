package Vista;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;

import Controlador.ControladorPanelBorrar;
import Controlador.ControladorPanelEditar;

@SuppressWarnings("serial")
public class PanelBorrar extends JPanel {
	private JButton btnAceptar;
	private JButton btnCancelar;
	private ControladorPanelBorrar controladorPanelBorrar;
	private JComboBox comboBoxTitulo,comboBoxGenero;
	/**
	 * Create the panel.
	 * @param controladorPanelBorrar 
	 */
	public PanelBorrar(ControladorPanelBorrar controladorPanelBorrar) {
		this.controladorPanelBorrar = controladorPanelBorrar;
		setBounds(100, 100, 800, 550);
		setBackground(new Color(57, 62, 70));
		setLayout(null);
		
		btnAceptar = new JButton("Aceptar");
		btnAceptar.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnAceptar.setBounds(430, 485, 113, 41);
		add(btnAceptar);
		
		btnCancelar = new JButton("Cancelar");
		btnCancelar.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnCancelar.setBounds(575, 485, 113, 41);
		add(btnCancelar);
		
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
		
		JLabel lblTitulo = new JLabel("T\u00EDtulo:");
		lblTitulo.setForeground(new Color(255, 255, 255));
		lblTitulo.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblTitulo.setBounds(89, 216, 90, 61);
		add(lblTitulo);
		
		setComboBoxTitulo(new JComboBox());
		getComboBoxTitulo().setBounds(247, 230, 339, 40);
		add(getComboBoxTitulo());
		
		comboBoxGenero(new JComboBox());
		comboBoxGenero().setBounds(341, 140, 101, 27);
		add(comboBoxGenero());
		
		JLabel lblNewLabel = new JLabel("Seleccione el titulo que se desea borrar");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblNewLabel.setBounds(10, 11, 595, 46);
		add(lblNewLabel);
		
		initializeEvents();
	}
	
	private void initializeEvents() {
		this.btnAceptar.addActionListener(listenerBotonAceptar(this.controladorPanelBorrar));
		this.btnCancelar.addActionListener(listenerBotonCancelar(this.controladorPanelBorrar));
		this.comboBoxGenero.addActionListener(listenerComboBoxGeneros(this.controladorPanelBorrar));

	}
	private ActionListener listenerComboBoxGeneros(ControladorPanelBorrar controladorPanelBorrar) {
		return new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.out.println("Ejecutando evento Boton hacia Generos");
				controladorPanelBorrar.cambiarGenero();
			}
		};
	}
	private ActionListener listenerBotonAceptar(ControladorPanelBorrar controladorPanelBorrar) {
		return new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.out.println("Ejecutando evento Boton hacia Generos");
				controladorPanelBorrar.accionadoBotonAceptarPanelBorrar();
			}
		};
	}
	private ActionListener listenerBotonCancelar(ControladorPanelBorrar controladorPanelBorrar) {
		return new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.out.println("Ejecutando evento Boton hacia Generos");
				controladorPanelBorrar.accionadoBotonCancelarPanelBorrar();
			}
		};
	}

	public JComboBox comboBoxGenero() {
		return comboBoxGenero;
	}

	public void comboBoxGenero(JComboBox comboBoxNombre) {
		this.comboBoxGenero = comboBoxNombre;
	}

	public JComboBox getComboBoxTitulo() {
		return comboBoxTitulo;
	}

	public void setComboBoxTitulo(JComboBox comboBoxTitulo) {
		this.comboBoxTitulo = comboBoxTitulo;
	}

}
