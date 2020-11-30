package Vista;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;

import Controlador.ControladorPanelGeneros;

@SuppressWarnings("serial")
public class PanelGeneros extends JPanel {

	private JButton btnVolver, btnSalir;
	private ControladorPanelGeneros controladorPanelGeneros;
	
	private JTextArea peliculasVistasSabado;
	private JTextField tiempoSabado, tiempoDomingo;
	private JTextArea peliculasVistasDomingo;
	private JLabel lb_genero_repetido, lb_seleccione_otro_genero;
	
	public PanelGeneros(ControladorPanelGeneros controladorPanelGeneros)
	{
		//////////////////////////////////////////////////////////////
		this.controladorPanelGeneros = controladorPanelGeneros;
		
		setLayout(null);
		
		
		////////////////////////////////////////////////////////////////
		
		
		btnSalir = new JButton("Salir");
		btnSalir.setBounds(128, 311, 89, 23);
		btnSalir.setBackground(new Color(0, 0, 0));
		add(btnSalir);
		
		JButton btnDrama = new JButton("Drama");
		btnDrama.setForeground(new Color(255, 255, 255));
		btnDrama.setBackground(new Color(255, 140, 0));
		btnDrama.setBorderPainted(false);
		btnDrama.setBounds(110, 139, 119, 23);
		btnDrama.setToolTipText("");
		add(btnDrama);
		
		JButton btnComedia = new JButton("Comedia");
		btnComedia.setForeground(new Color(255, 248, 220));
		btnComedia.setBackground(new Color(255, 140, 0));
		btnComedia.setBorderPainted(false);
		btnComedia.setBounds(110, 173, 119, 23);
		add(btnComedia);
		
		JButton btnTerror = new JButton("Terror");
		btnTerror.setForeground(new Color(255, 255, 255));
		btnTerror.setBackground(new Color(255, 140, 0));
		btnTerror.setBorderPainted(false);
		btnTerror.setBounds(110, 207, 119, 23);
		add(btnTerror);
		
		JButton btnCienciaFiccion = new JButton("Ciencia Ficcion");
		btnCienciaFiccion.setForeground(new Color(255, 255, 255));
		btnCienciaFiccion.setBackground(new Color(255, 140, 0));
		btnCienciaFiccion.setBorderPainted(false);
		btnCienciaFiccion.setBounds(110, 241, 119, 23);
		add(btnCienciaFiccion);
		
		JLabel mensajeGeneros = new JLabel("Seleccione el genero ");
		mensajeGeneros.setFont(new Font("Arial Black", Font.BOLD, 22));
		mensajeGeneros.setBounds(283, 49, 263, 29);
		add(mensajeGeneros);
		
		JLabel mensajeTiempoSabado = new JLabel("Tiempo restante sabado:");
		mensajeTiempoSabado.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD | Font.ITALIC, 15));
		mensajeTiempoSabado.setBounds(236, 275, 173, 19);
		add(mensajeTiempoSabado);
		
		JLabel mensajeTiempoDomingo = new JLabel("Tiempo restante domingo:");
		mensajeTiempoDomingo.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD | Font.ITALIC, 15));
		mensajeTiempoDomingo.setBounds(227, 298, 186, 19);
		add(mensajeTiempoDomingo);
		
		peliculasVistasSabado = new JTextArea();
		peliculasVistasSabado.setEditable(false);
		peliculasVistasSabado.setBackground(Color.WHITE);
		peliculasVistasSabado.setBounds(266, 140, 216, 81);
		add(peliculasVistasSabado);
		peliculasVistasSabado.setColumns(10);
		
		JLabel mensajePeliculasSabado = new JLabel("Peliculas vistas sabado");
		mensajePeliculasSabado.setFont(new Font("Arial Black", Font.BOLD, 13));
		mensajePeliculasSabado.setBounds(283, 116, 185, 23);
		add(mensajePeliculasSabado);
		
		tiempoSabado = new JTextField();
		tiempoSabado.setForeground(new Color(255, 255, 255));
		tiempoSabado.setCaretColor(new Color(255, 255, 255));
		tiempoSabado.setBackground(new Color(255, 140, 0));
		tiempoSabado.setEditable(false);
		tiempoSabado.setBounds(449, 275, 131, 20);
		add(tiempoSabado);
		tiempoSabado.setColumns(10);
		
		tiempoDomingo = new JTextField();
		tiempoDomingo.setForeground(new Color(255, 255, 255));
		tiempoDomingo.setBackground(new Color(255, 140, 0));
		tiempoDomingo.setEditable(false);
		tiempoDomingo.setColumns(10);
		tiempoDomingo.setBounds(449, 300, 131, 20);
		add(tiempoDomingo);
		
		peliculasVistasDomingo = new JTextArea();
		peliculasVistasDomingo.setEditable(false);
		peliculasVistasDomingo.setColumns(10);
		peliculasVistasDomingo.setBackground(Color.WHITE);
		peliculasVistasDomingo.setBounds(500, 140, 216, 81);
		add(peliculasVistasDomingo);
		
		JLabel mensajePeliculasDomingo = new JLabel("Peliculas vistas domingo");
		mensajePeliculasDomingo.setFont(new Font("Arial Black", Font.BOLD, 13));
		mensajePeliculasDomingo.setBounds(511, 117, 204, 23);
		add(mensajePeliculasDomingo);
		
		JButton btn_limpiar_sabado = new JButton("Limpiar lista");
		btn_limpiar_sabado.setForeground(new Color(255, 255, 255));
		btn_limpiar_sabado.setBackground(new Color(255, 0, 0));
		btn_limpiar_sabado.setBorderPainted(false);
		btn_limpiar_sabado.setBounds(266, 241, 216, 23);
		add(btn_limpiar_sabado);
		
		JButton btn_limpiar_domingo = new JButton("Limpiar lista");
		btn_limpiar_domingo.setBackground(new Color(255, 0, 0));
		btn_limpiar_domingo.setBorderPainted(false);
		btn_limpiar_domingo.setForeground(new Color(255, 255, 255));
		btn_limpiar_domingo.setBounds(500, 241, 216, 23);
		add(btn_limpiar_domingo);
		
		lb_genero_repetido = new JLabel("G\u00E9nero repetido,");
		lb_genero_repetido.setVisible(false);
		lb_genero_repetido.setForeground(Color.RED);
		lb_genero_repetido.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lb_genero_repetido.setBounds(268, 361, 141, 23);
		add(lb_genero_repetido);
		
		lb_seleccione_otro_genero = new JLabel("seleccione otro g\u00E9nero*");
		lb_seleccione_otro_genero.setBorder(new LineBorder(new Color(255, 0, 0), 1, true));
		lb_seleccione_otro_genero.setVerticalAlignment(SwingConstants.BOTTOM);
		lb_seleccione_otro_genero.setVerticalTextPosition(SwingConstants.BOTTOM);
		lb_seleccione_otro_genero.setVisible(false);
		lb_seleccione_otro_genero.setForeground(Color.RED);
		lb_seleccione_otro_genero.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lb_seleccione_otro_genero.setBounds(268, 361, 141, 44);
		add(lb_seleccione_otro_genero);
		
		JButton btn_confirmar = new JButton("Confirmar");
		btn_confirmar.setBackground(new Color(255, 140, 0));
		btn_confirmar.setBorderPainted(false);
		btn_confirmar.setBounds(620, 299, 96, 23);
		add(btn_confirmar);
		
		
////////////////////////////////////////////////////		
		initializeEvents();

	}
	
	private void initializeEvents() {
		this.btnSalir.addActionListener(listenerBotonVolver(this.controladorPanelGeneros));
		//action listener drama
		//action listener comedia
		//action listener sci-fi
		//action listener terror
		//action listener limpiar sábado
		// action listener limpiar domingo
		// action listener confirmar
	}
	
	private ActionListener listenerBotonVolver(ControladorPanelGeneros controladorPanelGeneros) {
		return new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.out.println("Ejecutando evento Boton Volver");
				controladorPanelGeneros.accionadoBottonVolverPanelGeneros();
			}
		};
	}
}
