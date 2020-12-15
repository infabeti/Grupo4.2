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
	private JButton btnAceptar;
	private JButton btnCancelar;
	private ControladorPanelAnadir controladorPanelAnadir;
	private JComboBox comboBoxGenero;
	private JTextField jtf_titulo;
	private JTextField jtf_codigo;
	private JTextField jtf_duracion;
	/**
	 * Create the panel.
	 * @param controladorPanelAnadir 
	 */
	public PanelAnadir(ControladorPanelAnadir controladorPanelAnadir) {
		this.controladorPanelAnadir = controladorPanelAnadir;
		setBounds(100, 100, 800, 550);
		setBackground(new Color(57, 62, 70));
		setLayout(null);
		
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
		
		JLabel lblTitulo = new JLabel("T\u00EDtulo:");
		lblTitulo.setForeground(new Color(255, 255, 255));
		lblTitulo.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblTitulo.setBounds(86, 130, 90, 40);
		add(lblTitulo);
		
		setComboBoxGenero(new JComboBox());
		getComboBoxGenero().setBounds(247, 340, 339, 40);
		add(getComboBoxGenero());

		JLabel lblAñadir = new JLabel("A\u00F1adir");
		lblAñadir.setForeground(new Color(255, 255, 255));
		lblAñadir.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblAñadir.setBounds(10, 11, 595, 46);
		add(lblAñadir);
		
		JLabel lblGenero = new JLabel("G\u00E9nero:");
		lblGenero.setForeground(Color.WHITE);
		lblGenero.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblGenero.setBounds(86, 340, 90, 40);
		add(lblGenero);
		
		setJtf_titulo(new JTextField());
		getJtf_titulo().setBounds(247, 130, 339, 40);
		add(getJtf_titulo());
		getJtf_titulo().setColumns(10);
		
		JLabel lblCodigo = new JLabel("C\u00F3digo:");
		lblCodigo.setForeground(Color.WHITE);
		lblCodigo.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblCodigo.setBounds(86, 200, 90, 40);
		add(lblCodigo);
		
		JLabel lblDuracion = new JLabel("Duraci\u00F3n:");
		lblDuracion.setForeground(Color.WHITE);
		lblDuracion.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblDuracion.setBounds(86, 270, 90, 40);
		add(lblDuracion);
		
		setJtf_codigo(new JTextField());
		getJtf_codigo().setColumns(10);
		getJtf_codigo().setBounds(247, 200, 339, 40);
		add(getJtf_codigo());
		
		jtf_duracion = new JTextField();
		jtf_duracion.setColumns(10);
		jtf_duracion.setBounds(247, 270, 339, 40);
		add(jtf_duracion);
		
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

	public JComboBox getComboBoxGenero() {
		return comboBoxGenero;
	}

	public void setComboBoxGenero(JComboBox comboBoxGenero) {
		this.comboBoxGenero = comboBoxGenero;
	}

	public JTextField getJtf_titulo() {
		return jtf_titulo;
	}

	public void setJtf_titulo(JTextField jtf_titulo) {
		this.jtf_titulo = jtf_titulo;
	}

	public JTextField getJtf_codigo() {
		return jtf_codigo;
	}

	public void setJtf_codigo(JTextField jtf_codigo) {
		this.jtf_codigo = jtf_codigo;
	}
}
