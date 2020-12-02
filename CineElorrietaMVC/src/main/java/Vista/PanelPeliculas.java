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

public class PanelPeliculas extends JPanel {
	private JButton btnContinuar;
	private JButton btnCancelar;
	private ControladorPanelPeliculas controladorPanelPeliculas;
	/**
	 * Create the panel.
	 * @param controladorPanelPeliculas 
	 */
	public PanelPeliculas(ControladorPanelPeliculas controladorPanelPeliculas) {
		setBackground(new Color(57, 62, 70));
		setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Estas son las peliculas disponibles");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblNewLabel.setBounds(152, 58, 459, 64);
		add(lblNewLabel);
		
		JTextArea textAreaSabado = new JTextArea();
		textAreaSabado.setBounds(286, 206, 116, 256);
		add(textAreaSabado);
		
		JTextArea textAreaDomingo = new JTextArea();
		textAreaDomingo.setBounds(454, 206, 116, 256);
		add(textAreaDomingo);
		
		JLabel lblNewLabelSabado = new JLabel("S\u00E1bado");
		lblNewLabelSabado.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabelSabado.setBounds(286, 159, 117, 36);
		add(lblNewLabelSabado);
		
		JLabel lblNewLabelDomingo = new JLabel("Domingo");
		lblNewLabelDomingo.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabelDomingo.setBounds(454, 159, 117, 36);
		add(lblNewLabelDomingo);
		
		btnContinuar = new JButton("Continuar");
		btnContinuar.setBounds(595, 494, 89, 23);
		add(btnContinuar);
		
		btnCancelar = new JButton("Cancelar");
		btnCancelar.setBounds(701, 494, 89, 23);
		add(btnCancelar);

		initializeEvents();
	}
	
	private void initializeEvents() {
		this.btnContinuar.addActionListener(listenerBotonAceptar(this.controladorPanelPeliculas));
		this.btnCancelar.addActionListener(listenerBotonCancelar(this.controladorPanelPeliculas));
	}
	
	private ActionListener listenerBotonAceptar(ControladorPanelPeliculas controladorPanelPeliculas) {
		return new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.out.println("Ejecutando evento Boton hacia Generos");
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
