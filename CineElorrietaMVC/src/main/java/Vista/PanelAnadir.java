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
import javax.swing.SwingConstants;

@SuppressWarnings("serial")
public class PanelAnadir extends JPanel {
	private JButton btnAceptar;
	private JButton btnCancelar;
	private ControladorPanelAnadir controladorPanelAnadir;
	private JComboBox comboBoxGenero;
	private JTextField jtf_titulo;
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
		
		JLabel lblCuadradoFondo = new JLabel("");
		lblCuadradoFondo.setOpaque(true);
		lblCuadradoFondo.setBackground(new Color(204, 153, 0));
		lblCuadradoFondo.setBounds(689, 444, 111, 106);
		add(lblCuadradoFondo);
		
		btnCancelar = new JButton("Cancelar");
		btnCancelar.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnCancelar.setBounds(569, 485, 120, 40);
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
		
		JLabel lblTitulo = new JLabel("T\u00EDtulo:");
		lblTitulo.setForeground(new Color(255, 255, 255));
		lblTitulo.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblTitulo.setBounds(86, 130, 90, 40);
		add(lblTitulo);
		
		setComboBoxGenero(new JComboBox());
		getComboBoxGenero().setBounds(247, 310, 339, 40);
		add(getComboBoxGenero());

		JLabel lblTituloPanel = new JLabel("A\u00F1adir pel\u00EDculas");
		lblTituloPanel.setVerticalAlignment(SwingConstants.TOP);
		lblTituloPanel.setForeground(new Color(255, 255, 255));
		lblTituloPanel.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblTituloPanel.setBounds(10, 11, 595, 40);
		add(lblTituloPanel);
		
		JLabel lblGenero = new JLabel("G\u00E9nero:");
		lblGenero.setForeground(Color.WHITE);
		lblGenero.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblGenero.setBounds(86, 310, 90, 40);
		add(lblGenero);
		
		setJtf_titulo(new JTextField());
		getJtf_titulo().setBounds(247, 130, 339, 40);
		add(getJtf_titulo());
		getJtf_titulo().setColumns(10);
		
		JLabel lblDuracion = new JLabel("Duraci\u00F3n:");
		lblDuracion.setForeground(Color.WHITE);
		lblDuracion.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblDuracion.setBounds(86, 220, 90, 40);
		add(lblDuracion);
		
		setJtf_duracion(new JTextField());
		getJtf_duracion().setColumns(10);
		getJtf_duracion().setBounds(247, 220, 339, 40);
		add(getJtf_duracion());
		
		JLabel lblMinutos = new JLabel("*en MINUTOS");
		lblMinutos.setForeground(Color.WHITE);
		lblMinutos.setBounds(86, 255, 74, 14);
		add(lblMinutos);
		
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

	public JTextField getJtf_duracion() {
		return jtf_duracion;
	}

	public void setJtf_duracion(JTextField jtf_duracion) {
		this.jtf_duracion = jtf_duracion;
	}
}
