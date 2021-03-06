package Vista;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;

import Controlador.ControladorBorrar;
import Controlador.ControladorEditar;
import javax.swing.SwingConstants;

@SuppressWarnings("serial")
public class PanelBorrar extends JPanel {
	private JButton btnBorrar;
	private JButton btnCancelar;
	private ControladorBorrar controladorPanelBorrar;
	private JComboBox comboBoxTitulo,comboBoxGenero;
	/**
	 * Create the panel.
	 * @param controladorPanelBorrar 
	 */
	public PanelBorrar(ControladorBorrar controladorPanelBorrar) {
		this.controladorPanelBorrar = controladorPanelBorrar;
		setBounds(100, 100, 800, 550);
		setBackground(new Color(57, 62, 70));
		setLayout(null);
		
		JLabel lblCuadradoFondo = new JLabel("");
		lblCuadradoFondo.setOpaque(true);
		lblCuadradoFondo.setBackground(new Color(204, 153, 0));
		lblCuadradoFondo.setBounds(689, 444, 111, 106);
		add(lblCuadradoFondo);
		
		btnBorrar = new JButton("BORRAR");
		btnBorrar.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnBorrar.setBounds(466, 325, 120, 40);
		add(btnBorrar);
		btnBorrar.addMouseListener(new java.awt.event.MouseAdapter() {
		    public void mouseEntered(java.awt.event.MouseEvent evt) {
		    	btnBorrar.setBackground(Color.RED);
		    	btnBorrar.setForeground(Color.YELLOW);
		    }

		    public void mouseExited(java.awt.event.MouseEvent evt) {
		    	btnBorrar.setBackground(Color.WHITE);
		    	btnBorrar.setForeground(Color.BLACK);
		    }
		});
		
		btnCancelar = new JButton("Cancelar");
		btnCancelar.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnCancelar.setBounds(567, 485, 120, 40);
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
		lblTitulo.setBounds(89, 246, 90, 61);
		add(lblTitulo);
		
		setComboBoxTitulo(new JComboBox());
		getComboBoxTitulo().setBounds(247, 260, 339, 27);
		add(getComboBoxTitulo());
		
		comboBoxGenero(new JComboBox());
		comboBoxGenero().setBounds(247, 195, 339, 27);
		add(comboBoxGenero());
		
		JLabel lblTituloPanel = new JLabel("Borrar pel\u00EDculas");
		lblTituloPanel.setVerticalAlignment(SwingConstants.TOP);
		lblTituloPanel.setHorizontalAlignment(SwingConstants.LEFT);
		lblTituloPanel.setForeground(new Color(255, 255, 255));
		lblTituloPanel.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblTituloPanel.setBounds(10, 11, 172, 40);
		add(lblTituloPanel);
		
		JLabel lblGenero = new JLabel("G\u00E9nero:");
		lblGenero.setForeground(Color.WHITE);
		lblGenero.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblGenero.setBounds(89, 174, 90, 61);
		add(lblGenero);
		
		JLabel lblNewLabel = new JLabel("Seleccione el G\u00E9nero y el Titulo que desea borrar");
		lblNewLabel.setForeground(Color.GRAY);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel.setBounds(89, 133, 500, 27);
		add(lblNewLabel);
		
		initializeEvents();
	}
	
	private void initializeEvents() {
		this.btnBorrar.addActionListener(listenerBotonBorrar(this.controladorPanelBorrar));
		this.btnCancelar.addActionListener(listenerBotonCancelar(this.controladorPanelBorrar));
		this.comboBoxGenero.addActionListener(listenerComboBoxGeneros(this.controladorPanelBorrar));

	}
	private ActionListener listenerComboBoxGeneros(ControladorBorrar controladorPanelBorrar) {
		return new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.out.println("Ejecutando evento Boton hacia Generos");
				controladorPanelBorrar.cambiarGenero();
			}
		};
	}
	private ActionListener listenerBotonBorrar(ControladorBorrar controladorPanelBorrar) {
		return new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.out.println("Ejecutando evento Boton BORRAR");
				controladorPanelBorrar.accionadoBotonBorrarPanelBorrar();
			}
		};
	}
	private ActionListener listenerBotonCancelar(ControladorBorrar controladorPanelBorrar) {
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
