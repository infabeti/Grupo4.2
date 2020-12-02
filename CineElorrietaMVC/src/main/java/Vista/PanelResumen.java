package Vista;

import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JTextArea;

public class PanelResumen extends JPanel {

	/**
	 * Create the panel.
	 */
	public PanelResumen() {
		setBackground(new Color(57, 62, 70));
		setLayout(null);
		
		JLabel lblResumen = new JLabel("Resumen de la cartelera de semana");
		lblResumen.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblResumen.setBounds(108, 97, 532, 39);
		add(lblResumen);
		
		JButton btnConfirmar = new JButton("Confirmar");
		btnConfirmar.setBounds(604, 501, 89, 23);
		add(btnConfirmar);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.setBounds(702, 501, 89, 23);
		add(btnCancelar);
		
		JTextArea textAreaSabado = new JTextArea();
		textAreaSabado.setBounds(108, 182, 186, 289);
		add(textAreaSabado);
		
		JTextArea textAreaDomingo = new JTextArea();
		textAreaDomingo.setBounds(375, 182, 186, 289);
		add(textAreaDomingo);

	}

}
