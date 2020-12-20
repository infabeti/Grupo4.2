package Vista;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;

public class PanelFin extends JPanel {
	private JButton btnCancelar;
	/**
	 * Create the panel.
	 */
	public PanelFin() {

		setBounds(100, 100, 800, 550);
		setBackground(new Color(57, 62, 70));
		setLayout(null);
		
		btnCancelar = new JButton("Cancelar");
		btnCancelar.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnCancelar.setBounds(567, 485, 120, 40);
		add(btnCancelar);
		
		JLabel lblCuadradoFondo = new JLabel("");
		lblCuadradoFondo.setBackground(new Color(204, 153, 0));
		lblCuadradoFondo.setOpaque(true);
		lblCuadradoFondo.setBounds(689, 444, 111, 106);
		add(lblCuadradoFondo);
		
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
		
		JLabel lblLaCarteleta = new JLabel("La Cartelera se ha actualizado correctamente");
		lblLaCarteleta.setForeground(Color.WHITE);
		lblLaCarteleta.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblLaCarteleta.setBounds(46, 177, 600, 39);
		add(lblLaCarteleta);
		
		JLabel lblGracias = new JLabel("Gracias");
		lblGracias.setForeground(Color.GRAY);
		lblGracias.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblGracias.setBounds(46, 127, 126, 39);
		add(lblGracias);
		
		JLabel lblNewLabel = new JLabel("Creadores de esta app: Markel Cuesta, Unai Santamaria, Aitor Ca\u00F1amero");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel.setForeground(Color.GRAY);
		lblNewLabel.setBounds(0, 428, 689, 14);
		add(lblNewLabel);
	}

}
