package Vista;

import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

import Controlador.ControladorEdicion;


import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Color;
import javax.swing.JTextArea;
import javax.swing.JTextPane;

@SuppressWarnings("serial")
public class PanelEdicion extends JPanel {
	private JButton btnEditar;
	private JButton btnAnadir;
	private JButton btnBorrar;
	private JButton btnContinuar;
	private JButton btnCancelar;
	private ControladorEdicion controladorPanelEdicion;

	public PanelEdicion(ControladorEdicion controladorPanelEdicion) {
		this.controladorPanelEdicion = controladorPanelEdicion;
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
		
		btnContinuar = new JButton("Continuar");
		btnContinuar.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnContinuar.setBounds(430, 485, 120, 40);
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
		btnEditar.setBounds(89, 80, 127, 53);
		add(btnEditar);
		
		btnAnadir = new JButton("A\u00F1adir");
		btnAnadir.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnAnadir.setBounds(89, 210, 127, 53);
		add(btnAnadir);
		
		btnBorrar = new JButton("Borrar");
		btnBorrar.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnBorrar.setBounds(89, 340, 127, 53);
		add(btnBorrar);
		
		JLabel lblTituloPanel = new JLabel("Edici\u00F3n\r\n");
		lblTituloPanel.setVerticalAlignment(SwingConstants.TOP);
		lblTituloPanel.setHorizontalAlignment(SwingConstants.LEFT);
		lblTituloPanel.setForeground(Color.WHITE);
		lblTituloPanel.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblTituloPanel.setBounds(10, 11, 279, 40);
		add(lblTituloPanel);
		
		JTextPane txtpnEditar = new JTextPane();
		txtpnEditar.setForeground(Color.WHITE);
		txtpnEditar.setText("Mediante este bot\u00F3n, se mostrar\u00E1 una nueva ventana en la que ser\u00E1n editables tanto el nombre de una pel\u00EDcula como su g\u00E9nero, esta funcionalidad est\u00E1 pensada para aquellos casos en los que se haya cometido una errata a la hora de introducir un largometraje al sistema.");
		txtpnEditar.setBackground(new Color(57, 62, 70));
		txtpnEditar.setEditable(false);
		txtpnEditar.setBounds(284, 65, 301, 98);
		add(txtpnEditar);
		
		JLabel lblLinea1 = new JLabel("");
		lblLinea1.setBackground(Color.WHITE);
		lblLinea1.setOpaque(true);
		lblLinea1.setBounds(10, 170, 669, 5);
		add(lblLinea1);
		
		JLabel lblLinea2 = new JLabel("");
		lblLinea2.setOpaque(true);
		lblLinea2.setBackground(Color.WHITE);
		lblLinea2.setBounds(10, 300, 669, 5);
		add(lblLinea2);
		
		JTextPane txtpnAnadir = new JTextPane();
		txtpnAnadir.setText("Mediante este bot\u00F3n, nos aparecer\u00E1 una nueva ventana en la que podemos introducir pel\u00EDculas nuevas, introduciendo el nombre, la duraci\u00F3n y el g\u00E9nero de una o m\u00E1s pel\u00EDculas nuevas.");
		txtpnAnadir.setForeground(Color.WHITE);
		txtpnAnadir.setEditable(false);
		txtpnAnadir.setBackground(new Color(57, 62, 70));
		txtpnAnadir.setBounds(284, 210, 301, 74);
		add(txtpnAnadir);
		
		JTextPane txtpnBorrar = new JTextPane();
		txtpnBorrar.setText("Mediante este bot\u00F3n, se mostrar\u00E1 una nueva ventana en la que se podr\u00E1n elegir uno o varios t\u00EDtulos para su borrado.");
		txtpnBorrar.setForeground(Color.WHITE);
		txtpnBorrar.setEditable(false);
		txtpnBorrar.setBackground(new Color(57, 62, 70));
		txtpnBorrar.setBounds(284, 340, 301, 74);
		add(txtpnBorrar);
		
		initializeEvents();
	}
	
	private void initializeEvents() {
		this.btnEditar.addActionListener(listenerBotonEditar(this.controladorPanelEdicion));
		this.btnAnadir.addActionListener(listenerBotonAnadir(this.controladorPanelEdicion));
		this.btnBorrar.addActionListener(listenerBotonBorrar(this.controladorPanelEdicion));
		this.btnContinuar.addActionListener(listenerBotonContinuar(this.controladorPanelEdicion));
		this.btnCancelar.addActionListener(listenerBotonCancelar(this.controladorPanelEdicion));
	}
	
	private ActionListener listenerBotonEditar(ControladorEdicion controladorPanelEdicion) {
		return new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.out.println("Ejecutando evento Boton Editar");
				controladorPanelEdicion.accionadoBotonEditarPanelEdicion();
			}
		};
	}
	private ActionListener listenerBotonAnadir(ControladorEdicion controladorPanelEdicion) {
		return new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.out.println("Ejecutando evento Boton Añadir");
				controladorPanelEdicion.accionadoBotonAnadirPanelEdicion();
			}
		};
	}
	private ActionListener listenerBotonBorrar(ControladorEdicion controladorPanelEdicion) {
		return new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.out.println("Ejecutando evento Boton Borrar");
				controladorPanelEdicion.accionadoBotonBorrarPanelEdicion();
			}
		};
	}
	private ActionListener listenerBotonContinuar(ControladorEdicion controladorPanelEdicion) {
		return new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.out.println("Ejecutando evento Boton Continuar");
				controladorPanelEdicion.accionadoBotonContinuarPanelEdicion();
			}
		};
	}
	private ActionListener listenerBotonCancelar(ControladorEdicion controladorPanelEdicion) {
		return new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.out.println("Ejecutando evento Boton Cancelar");
				controladorPanelEdicion.accionadoBotonCancelarPanelEdicion();
			}
		};
	}
}
