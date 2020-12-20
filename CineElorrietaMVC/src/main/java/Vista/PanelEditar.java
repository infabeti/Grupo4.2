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

import Controlador.ControladorAnadir;
import Controlador.ControladorEditar;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.JSpinner;

@SuppressWarnings("serial")
public class PanelEditar extends JPanel {
	private JButton btnAceptar;
	private JButton btnCancelar;
	private ControladorEditar controladorPanelEditar;
	private JComboBox comboBoxGenero;
	public static JComboBox comboBoxNombre;
	private JComboBox cbCambiarGenero;
	private JTextField jtfTitulo;
	private JTextField tfDuracion;

	/**
	 * Create the panel.
	 * @param controladorPanelEditar 
	 */
	public PanelEditar(ControladorEditar controladorPanelEditar) {
		this.controladorPanelEditar = controladorPanelEditar;
		setBounds(100, 100, 800, 550);
		setBackground(new Color(57, 62, 70));
		setLayout(null);
		
		JLabel lblCuadradoFondo = new JLabel("");
		lblCuadradoFondo.setOpaque(true);
		lblCuadradoFondo.setBackground(new Color(204, 153, 0));
		lblCuadradoFondo.setBounds(689, 444, 111, 106);
		add(lblCuadradoFondo);
		
		JLabel lblTituloPanel = new JLabel("Editar pel\u00EDculas \r\n");
		lblTituloPanel.setHorizontalAlignment(SwingConstants.LEFT);
		lblTituloPanel.setVerticalAlignment(SwingConstants.TOP);
		lblTituloPanel.setForeground(new Color(255, 255, 255));
		lblTituloPanel.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblTituloPanel.setBounds(10, 11, 181, 40);
		add(lblTituloPanel);
		
		btnCancelar = new JButton("Cancelar");
		btnCancelar.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnCancelar.setBounds(560, 485, 120, 40);
		add(btnCancelar);
		
		btnAceptar = new JButton("Aceptar");
		btnAceptar.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnAceptar.setBounds(430, 485, 120, 40);
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
		lblNombre.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblNombre.setBounds(122, 90, 90, 61);
		add(lblNombre);
		
		JLabel lblGenero = new JLabel("G\u00E9nero");
		lblGenero.setForeground(new Color(255, 255, 255));
		lblGenero.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblGenero.setBounds(375, 90, 90, 61);
		add(lblGenero);
		
		setComboBoxNombre(new JComboBox());
		getComboBoxNombre().setBounds(122, 145, 192, 27);
		add(getComboBoxNombre());
		
		setComboBoxGenero(new JComboBox());
		getComboBoxGenero().setBounds(347, 145, 192, 27);
		add(getComboBoxGenero());
		
		setJtfTitulo(new JTextField());
		getJtfTitulo().setBounds(348, 246, 173, 27);
		add(getJtfTitulo());
		getJtfTitulo().setColumns(10);
		
		JLabel lbTitulo = new JLabel("T\u00EDtulo");
		lbTitulo.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lbTitulo.setForeground(Color.WHITE);
		lbTitulo.setBounds(243, 249, 46, 14);
		add(lbTitulo);
		
		setCbCambiarGenero(new JComboBox());
		getCbCambiarGenero().setBounds(348, 300, 173, 27);
		add(getCbCambiarGenero());
		
		JLabel lblnuevoGenero = new JLabel("G\u00E9nero");
		lblnuevoGenero.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblnuevoGenero.setForeground(Color.WHITE);
		lblnuevoGenero.setBounds(243, 303, 53, 14);
		add(lblnuevoGenero);
		
		JLabel lbDuracion = new JLabel("Duraci\u00F3n");
		lbDuracion.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lbDuracion.setForeground(Color.WHITE);
		lbDuracion.setBounds(243, 361, 66, 14);
		add(lbDuracion);
		
		setTfDuracion(new JTextField());
		getTfDuracion().setBounds(348, 358, 173, 27);
		add(getTfDuracion());
		getTfDuracion().setColumns(10);
		
		JLabel lblSeleccioneNG = new JLabel("Selecione el Nombre y el Genero de la pelicula que desea editar");
		lblSeleccioneNG.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblSeleccioneNG.setForeground(Color.GRAY);
		lblSeleccioneNG.setBounds(122, 79, 471, 27);
		add(lblSeleccioneNG);
		
		JLabel lblCambiaInfo = new JLabel("Cambia la Informacion");
		lblCambiaInfo.setForeground(Color.GRAY);
		lblCambiaInfo.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblCambiaInfo.setBounds(122, 203, 192, 14);
		add(lblCambiaInfo);

		JLabel lblMinutos = new JLabel("*en MINUTOS");
		lblMinutos.setForeground(Color.WHITE);
		lblMinutos.setBounds(242, 382, 72, 14);
		add(lblMinutos);
		
		initializeEvents();
	}
	
	private void initializeEvents() {
		this.btnAceptar.addActionListener(listenerBotonAceptar(this.controladorPanelEditar));
		this.btnCancelar.addActionListener(listenerBotonCancelar(this.controladorPanelEditar));
		this.getComboBoxGenero().addActionListener(listenerComboBoxGeneros(this.controladorPanelEditar));

	}
	private ActionListener listenerComboBoxGeneros(ControladorEditar controladorPanelAnadir) {
		return new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.out.println("Ejecutando evento Boton hacia Generos");
				controladorPanelAnadir.cambiarGenero();
			}
		};
	}
	private ActionListener listenerBotonAceptar(ControladorEditar controladorPanelEditar) {
		return new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.out.println("Ejecutando evento Boton hacia Generos");
				controladorPanelEditar.accionadoBotonAceptarPanelEditar();
			}
		};
	}
	private ActionListener listenerBotonCancelar(ControladorEditar controladorPanelEditar) {
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
