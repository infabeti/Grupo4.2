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
		
		JLabel lblResumen = new JLabel("Resumen de la cartelera de semana");
		lblResumen.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblResumen.setBounds(108, 97, 532, 39);
		add(lblResumen);
		
		btnConfirmar = new JButton("Confirmar");
		btnConfirmar.setBounds(592, 277, 89, 23);
		add(btnConfirmar);
		
		btnCancelar1 = new JButton("Cancelar - Edicion");
		btnCancelar1.setBounds(592, 316, 117, 23);
		add(btnCancelar1);
		
		btnCancelar2 = new JButton("Cancelar - Generos");
		btnCancelar2.setBounds(592, 350, 125, 23);
		add(btnCancelar2);
		
		JTextArea textAreaSabado = new JTextArea();
		textAreaSabado.setBounds(108, 182, 186, 289);
		add(textAreaSabado);
		
		JTextArea textAreaDomingo = new JTextArea();
		textAreaDomingo.setBounds(375, 182, 186, 289);
		add(textAreaDomingo);

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
