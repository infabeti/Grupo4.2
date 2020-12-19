package Vista;

import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JTextArea;

import Controlador.ControladorPanelResumen;
import javax.swing.SwingConstants;

@SuppressWarnings("serial")
public class PanelResumen extends JPanel {
	private JButton btnConfirmar;
	private JButton btnCancelar1;
	private JButton btnCancelar2;
	private ControladorPanelResumen controladorPanelResumen;
	/**
	 * Create the panel.
	 * @param controladorPanelResumen 
	 */
	public PanelResumen(ControladorPanelResumen controladorPanelResumen) {
		this.controladorPanelResumen = controladorPanelResumen;
		setBounds(100, 100, 800, 550);
		setBackground(new Color(57, 62, 70));
		setLayout(null);
		
		btnCancelar1 = new JButton("Cancelar -> Edicion");
		btnCancelar1.setBounds(569, 485, 120, 40);
		add(btnCancelar1);
		
		JLabel lblCuadradoFondo = new JLabel("");
		lblCuadradoFondo.setBackground(new Color(204, 153, 0));
		lblCuadradoFondo.setOpaque(true);
		lblCuadradoFondo.setBounds(689, 444, 111, 106);
		add(lblCuadradoFondo);
		
		btnConfirmar = new JButton("Confirmar");
		btnConfirmar.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnConfirmar.setBounds(430, 485, 120, 40);
		add(btnConfirmar);
		
		btnCancelar2 = new JButton("Cancelar -> Generos");
		btnCancelar2.setBounds(569, 444, 120, 40);
		add(btnCancelar2);
		
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
		
		JLabel lblResumen = new JLabel("Resumen de la cartelera del fin de semana");
		lblResumen.setForeground(Color.WHITE);
		lblResumen.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblResumen.setBounds(59, 60, 590, 39);
		add(lblResumen);
		
		JTextArea textAreaSabado = new JTextArea();
		textAreaSabado.setBounds(106, 157, 186, 259);
		add(textAreaSabado);
		
		JTextArea textAreaDomingo = new JTextArea();
		textAreaDomingo.setBounds(393, 157, 186, 259);
		add(textAreaDomingo);
		
		JLabel lblSabado = new JLabel("Pel\u00EDculas s\u00E1bado");
		lblSabado.setHorizontalTextPosition(SwingConstants.CENTER);
		lblSabado.setHorizontalAlignment(SwingConstants.CENTER);
		lblSabado.setForeground(Color.WHITE);
		lblSabado.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblSabado.setBounds(125, 121, 150, 23);
		add(lblSabado);
		
		JLabel lblDomingo = new JLabel("Pel\u00EDculas domingo");
		lblDomingo.setHorizontalTextPosition(SwingConstants.CENTER);
		lblDomingo.setHorizontalAlignment(SwingConstants.CENTER);
		lblDomingo.setForeground(Color.WHITE);
		lblDomingo.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblDomingo.setBounds(412, 123, 150, 23);
		add(lblDomingo);

		initializeEvents();
	}
	
	private void initializeEvents() {
		this.btnConfirmar.addActionListener(listenerBotonConfirmar(this.controladorPanelResumen));
		this.btnCancelar1.addActionListener(listenerBotonCancelar1(this.controladorPanelResumen));
		this.btnCancelar2.addActionListener(listenerBotonCancelar2(this.controladorPanelResumen));
	}
	
	private ActionListener listenerBotonConfirmar(ControladorPanelResumen controladorPanelResumen) {
		return new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.out.println("Ejecutando evento Boton hacia Generos");
				controladorPanelResumen.accionadoBotonConfirmarPanelResumen();
			}
		};
	}
	private ActionListener listenerBotonCancelar1(ControladorPanelResumen controladorPanelResumen) {
		return new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.out.println("Ejecutando evento Boton hacia Generos");
				controladorPanelResumen.accionadoBotonCancelar1PanelResumen();
			}
		};
	}
	private ActionListener listenerBotonCancelar2(ControladorPanelResumen controladorPanelResumen) {
		return new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.out.println("Ejecutando evento Boton hacia Generos");
				controladorPanelResumen.accionadoBotonCancelar2PanelResumen();
			}
		};
	}
}
