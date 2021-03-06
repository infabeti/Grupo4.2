package Vista;

import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import Controlador.ControladorResumen;
import javax.swing.SwingConstants;

@SuppressWarnings("serial")
public class PanelResumen extends JPanel {
	private JButton btnConfirmar;
	private JButton btnCancelar;
	private ControladorResumen controladorPanelResumen;
	private JTextArea textAreaSabado, textAreaDomingo;
	/**
	 * Create the panel.
	 * @param controladorPanelResumen 
	 */
	public PanelResumen(ControladorResumen controladorPanelResumen) {
		this.controladorPanelResumen = controladorPanelResumen;
		setBounds(100, 100, 800, 550);
		setBackground(new Color(57, 62, 70));
		setLayout(null);
		
		btnCancelar = new JButton("Cancelar");
		btnCancelar.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnCancelar.setBounds(569, 485, 120, 40);
		add(btnCancelar);
		
		JLabel lblCuadradoFondo = new JLabel("");
		lblCuadradoFondo.setBackground(new Color(204, 153, 0));
		lblCuadradoFondo.setOpaque(true);
		lblCuadradoFondo.setBounds(689, 444, 111, 106);
		add(lblCuadradoFondo);
		
		btnConfirmar = new JButton("Confirmar");
		btnConfirmar.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnConfirmar.setBounds(424, 485, 126, 40);
		add(btnConfirmar);
		
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
		
		JLabel lblResumen = new JLabel("de la cartelera del fin de semana");
		lblResumen.setForeground(Color.WHITE);
		lblResumen.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblResumen.setBounds(210, 33, 437, 39);
		add(lblResumen);
		
		setTextAreaSabado(new JTextArea());
		getTextAreaSabado().setBounds(106, 157, 186, 259);
		add(getTextAreaSabado());
		
		setTextAreaDomingo(new JTextArea());
		getTextAreaDomingo().setBounds(393, 157, 186, 259);
		add(getTextAreaDomingo());
		
		JLabel lblSabado = new JLabel("Pel\u00EDculas s\u00E1bado");
		lblSabado.setHorizontalTextPosition(SwingConstants.LEFT);
		lblSabado.setHorizontalAlignment(SwingConstants.LEFT);
		lblSabado.setForeground(Color.WHITE);
		lblSabado.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblSabado.setBounds(106, 123, 126, 23);
		add(lblSabado);
		
		JLabel lblDomingo = new JLabel("Pel\u00EDculas domingo");
		lblDomingo.setHorizontalTextPosition(SwingConstants.LEFT);
		lblDomingo.setHorizontalAlignment(SwingConstants.LEFT);
		lblDomingo.setForeground(Color.WHITE);
		lblDomingo.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblDomingo.setBounds(393, 123, 132, 23);
		add(lblDomingo);
		
		JLabel lblResumen_2 = new JLabel("Resumen");
		lblResumen_2.setForeground(Color.GRAY);
		lblResumen_2.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblResumen_2.setBounds(78, 33, 126, 39);
		add(lblResumen_2);

		initializeEvents();
	}
	
	private void initializeEvents() {
		this.btnConfirmar.addActionListener(listenerBotonConfirmar(this.controladorPanelResumen));
		this.btnCancelar.addActionListener(listenerBotonCancelar(this.controladorPanelResumen));
	}
	
	private ActionListener listenerBotonConfirmar(ControladorResumen controladorPanelResumen) {
		return new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.out.println("Ejecutando evento FIN del programa");
				controladorPanelResumen.accionadoBotonConfirmarPanelResumen();
			}
		};
	}
	private ActionListener listenerBotonCancelar(ControladorResumen controladorPanelResumen) {
		return new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.out.println("Ejecutando evento Boton hacia Generos");
				controladorPanelResumen.accionadoBotonCancelarPanelResumen();
			}
		};
	}

	public JTextArea getTextAreaSabado() {
		return textAreaSabado;
	}

	public void setTextAreaSabado(JTextArea textAreaSabado) {
		this.textAreaSabado = textAreaSabado;
	}

	public JTextArea getTextAreaDomingo() {
		return textAreaDomingo;
	}

	public void setTextAreaDomingo(JTextArea textAreaDomingo) {
		this.textAreaDomingo = textAreaDomingo;
	}
}
