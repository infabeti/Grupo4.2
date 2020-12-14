package Vista;

import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

import Controlador.ControladorPanelEdicion;


import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Color;
import javax.swing.JTextArea;

@SuppressWarnings("serial")
public class PanelEdicion extends JPanel {
	private JButton btnEditar;
	private JButton btnAnadir;
	private JButton btnBorrar;
	private JButton btnContinuar;
	private JButton btnCancelar;
	private ControladorPanelEdicion controladorPanelEdicion;

	public PanelEdicion(ControladorPanelEdicion controladorPanelEdicion) {
		this.controladorPanelEdicion = controladorPanelEdicion;
		setBounds(100, 100, 800, 550);
		setBackground(new Color(57, 62, 70));
		setLayout(null);
		
		btnCancelar = new JButton("Cancelar");
		btnCancelar.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnCancelar.setBounds(569, 485, 120, 41);
		add(btnCancelar);
		
		btnContinuar = new JButton("Continuar");
		btnContinuar.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnContinuar.setBounds(430, 485, 120, 41);
		add(btnContinuar);
		
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
		
		btnEditar = new JButton("Editar");
		btnEditar.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnEditar.setBounds(35, 173, 127, 53);
		add(btnEditar);
		
		btnAnadir = new JButton("A\u00F1adir");
		btnAnadir.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnAnadir.setBounds(35, 237, 127, 53);
		add(btnAnadir);
		
		btnBorrar = new JButton("Borrar");
		btnBorrar.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnBorrar.setBounds(35, 301, 127, 53);
		add(btnBorrar);
		
		JTextArea textAreaNombre = new JTextArea();
		textAreaNombre.setBounds(214, 173, 104, 207);
		add(textAreaNombre);
		
		JTextArea textAreaGenero = new JTextArea();
		textAreaGenero.setBounds(361, 173, 104, 207);
		add(textAreaGenero);
		
		JTextArea textAreaHora = new JTextArea();
		textAreaHora.setBounds(505, 173, 104, 207);
		add(textAreaHora);
		
		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setForeground(new Color(255, 255, 255));
		lblNombre.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNombre.setBounds(214, 127, 104, 25);
		add(lblNombre);
		
		JLabel lblGenero = new JLabel("G\u00E9nero");
		lblGenero.setForeground(Color.WHITE);
		lblGenero.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblGenero.setBounds(361, 127, 104, 25);
		add(lblGenero);
		
		JLabel lblHora = new JLabel("Hora");
		lblHora.setForeground(Color.WHITE);
		lblHora.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblHora.setBounds(505, 127, 104, 25);
		add(lblHora);
		
		initializeEvents();
	}
	
	private void initializeEvents() {
		this.btnEditar.addActionListener(listenerBotonEditar(this.controladorPanelEdicion));
		this.btnAnadir.addActionListener(listenerBotonAnadir(this.controladorPanelEdicion));
		this.btnBorrar.addActionListener(listenerBotonBorrar(this.controladorPanelEdicion));
		this.btnContinuar.addActionListener(listenerBotonContinuar(this.controladorPanelEdicion));
		this.btnCancelar.addActionListener(listenerBotonCancelar(this.controladorPanelEdicion));
	}
	
	private ActionListener listenerBotonEditar(ControladorPanelEdicion controladorPanelEdicion) {
		return new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.out.println("Ejecutando evento Boton Editar");
				controladorPanelEdicion.accionadoBotonEditarPanelEdicion();
			}
		};
	}
	private ActionListener listenerBotonAnadir(ControladorPanelEdicion controladorPanelEdicion) {
		return new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.out.println("Ejecutando evento Boton Añadir");
				controladorPanelEdicion.accionadoBotonAnadirPanelEdicion();
			}
		};
	}
	private ActionListener listenerBotonBorrar(ControladorPanelEdicion controladorPanelEdicion) {
		return new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.out.println("Ejecutando evento Boton Borrar");
				controladorPanelEdicion.accionadoBotonBorrarPanelEdicion();
			}
		};
	}
	private ActionListener listenerBotonContinuar(ControladorPanelEdicion controladorPanelEdicion) {
		return new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.out.println("Ejecutando evento Boton Continuar");
				controladorPanelEdicion.accionadoBotonContinuarPanelEdicion();
			}
		};
	}
	private ActionListener listenerBotonCancelar(ControladorPanelEdicion controladorPanelEdicion) {
		return new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.out.println("Ejecutando evento Boton Cancelar");
				controladorPanelEdicion.accionadoBotonCancelarPanelEdicion();
			}
		};
	}
}
