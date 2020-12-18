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
import javax.swing.JTextField;
import javax.swing.JSpinner;

@SuppressWarnings("serial")
public class PanelEditar extends JPanel {
	private JButton btnAceptar;
	private JButton btnCancelar;
	private ControladorPanelEditar controladorPanelEditar;
	private JComboBox comboBoxGenero, comboBoxNombre,cbCambiarGenero;
	private JTextField jtfTitulo;
	private JTextField tfDuracion;

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
		lblNombre.setBounds(206, 44, 90, 61);
		add(lblNombre);
		
		JLabel lblGenero = new JLabel("Gen\u00E9ro");
		lblGenero.setForeground(new Color(255, 255, 255));
		lblGenero.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblGenero.setBounds(402, 44, 90, 61);
		add(lblGenero);
		
		setComboBoxNombre(new JComboBox());
		getComboBoxNombre().setBounds(206, 131, 101, 27);
		add(getComboBoxNombre());
		
		setComboBoxGenero(new JComboBox());
		getComboBoxGenero().setBounds(402, 131, 101, 27);
		add(getComboBoxGenero());
		
		setJtfTitulo(new JTextField());
		getJtfTitulo().setBounds(386, 207, 86, 20);
		add(getJtfTitulo());
		getJtfTitulo().setColumns(10);
		
		JLabel lbTitulo = new JLabel("T\u00EDtulo");
		lbTitulo.setForeground(Color.WHITE);
		lbTitulo.setBounds(235, 207, 46, 14);
		add(lbTitulo);
		
		setCbCambiarGenero(new JComboBox());
		getCbCambiarGenero().setBounds(386, 261, 86, 22);
		add(getCbCambiarGenero());
		
		JLabel lblnuevoGenero = new JLabel("G\u00E9nero");
		lblnuevoGenero.setForeground(Color.WHITE);
		lblnuevoGenero.setBounds(235, 265, 46, 14);
		add(lblnuevoGenero);
		
		JLabel lbDuracion = new JLabel("Duracion");
		lbDuracion.setForeground(Color.WHITE);
		lbDuracion.setBounds(235, 322, 46, 14);
		add(lbDuracion);
		
		setTfDuracion(new JTextField());
		getTfDuracion().setBounds(386, 319, 86, 20);
		add(getTfDuracion());
		getTfDuracion().setColumns(10);
		
		initializeEvents();
	}
	
	private void initializeEvents() {
		this.btnAceptar.addActionListener(listenerBotonAceptar(this.controladorPanelEditar));
		this.btnCancelar.addActionListener(listenerBotonCancelar(this.controladorPanelEditar));
		this.getComboBoxGenero().addActionListener(listenerComboBoxGeneros(this.controladorPanelEditar));

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

	public JComboBox getComboBoxNombre() {
		return comboBoxNombre;
	}

	public void setComboBoxNombre(JComboBox comboBoxNombre) {
		this.comboBoxNombre = comboBoxNombre;
	}

	public JComboBox getComboBoxGenero() {
		return comboBoxGenero;
	}

	public void setComboBoxGenero(JComboBox comboBoxGenero) {
		this.comboBoxGenero = comboBoxGenero;
	}

	public JComboBox getCbCambiarGenero() {
		return cbCambiarGenero;
	}

	public void setCbCambiarGenero(JComboBox cbCambiarGenero) {
		this.cbCambiarGenero = cbCambiarGenero;
	}

	public JTextField getTfDuracion() {
		return tfDuracion;
	}

	public void setTfDuracion(JTextField tfDuracion) {
		this.tfDuracion = tfDuracion;
	}

	public JTextField getJtfTitulo() {
		return jtfTitulo;
	}

	public void setJtfTitulo(JTextField jtfTitulo) {
		this.jtfTitulo = jtfTitulo;
	}
}
