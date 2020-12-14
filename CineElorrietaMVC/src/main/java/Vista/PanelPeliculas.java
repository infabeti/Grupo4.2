package Vista;

import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextArea;

import Controlador.ControladorPanelPeliculas;

import javax.swing.JButton;

@SuppressWarnings("serial")
public class PanelPeliculas extends JPanel {
	private JButton btnContinuar;
	private JButton btnCancelar;
	private ControladorPanelPeliculas controladorPanelPeliculas;
	/**
	 * Create the panel.
	 * @param controladorPanelPeliculas 
	 */
	public PanelPeliculas(ControladorPanelPeliculas controladorPanelPeliculas) {
		this.controladorPanelPeliculas = controladorPanelPeliculas;
		setBounds(100, 100, 800, 550);
		setBackground(new Color(57, 62, 70));
		setLayout(null);
		
		btnCancelar = new JButton("Cancelar");
		btnCancelar.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnCancelar.setBounds(671, 469, 119, 48);
		add(btnCancelar);
		
		btnContinuar = new JButton("Continuar");
		btnContinuar.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnContinuar.setBounds(504, 469, 119, 48);
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
		
		JLabel lblNewLabel = new JLabel("Estas son las peliculas disponibles");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblNewLabel.setBounds(152, 58, 459, 64);
		add(lblNewLabel);
		
		JTextArea textAreaSabado = new JTextArea();
		textAreaSabado.setBounds(286, 206, 116, 227);
		add(textAreaSabado);
		
		JTextArea textAreaDomingo = new JTextArea();
		textAreaDomingo.setBounds(454, 206, 116, 227);
		add(textAreaDomingo);
		
		JLabel lblNewLabelSabado = new JLabel("S\u00E1bado");
		lblNewLabelSabado.setForeground(Color.WHITE);
		lblNewLabelSabado.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabelSabado.setBounds(286, 159, 117, 36);
		add(lblNewLabelSabado);
		
		JLabel lblNewLabelDomingo = new JLabel("Domingo");
		lblNewLabelDomingo.setForeground(Color.WHITE);
		lblNewLabelDomingo.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabelDomingo.setBounds(454, 159, 117, 36);
		add(lblNewLabelDomingo);

		initializeEvents();
	}
	
	private void initializeEvents() {
		this.btnContinuar.addActionListener(listenerBotonContinuar(this.controladorPanelPeliculas));
		this.btnCancelar.addActionListener(listenerBotonCancelar(this.controladorPanelPeliculas));
	}
	
	private ActionListener listenerBotonContinuar(ControladorPanelPeliculas controladorPanelPeliculas) {
		return new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.out.println("Ejecutando evento Boton hacia Resumen");
				controladorPanelPeliculas.accionadoBotonContinuarPanelPeliculas();
			}
		};
	}
	private ActionListener listenerBotonCancelar(ControladorPanelPeliculas controladorPanelPeliculas) {
		return new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.out.println("Ejecutando evento Boton hacia Generos");
				controladorPanelPeliculas.accionadoBotonCancelarPanelPeliculas();
			}
		};
	}
}
