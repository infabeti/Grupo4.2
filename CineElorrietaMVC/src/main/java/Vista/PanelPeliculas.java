package Vista;

import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextArea;
import javax.swing.JButton;

public class PanelPeliculas extends JPanel {

	/**
	 * Create the panel.
	 */
	public PanelPeliculas() {
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
		
		JButton btnContinuar = new JButton("Continuar");
		btnContinuar.setBounds(595, 494, 89, 23);
		add(btnContinuar);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.setBounds(701, 494, 89, 23);
		add(btnCancelar);

	}
}
