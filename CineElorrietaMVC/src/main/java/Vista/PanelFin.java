package Vista;

import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;

public class PanelFin extends JPanel {

	/**
	 * Create the panel.
	 */
	public PanelFin() {
		setBackground(new Color(57, 62, 70));
		setLayout(null);
		
		JLabel lblCarteleraActualizada = new JLabel("La cartelera se ha actualiado");
		lblCarteleraActualizada.setFont(new Font("Tahoma", Font.PLAIN, 36));
		lblCarteleraActualizada.setBounds(144, 234, 530, 100);
		add(lblCarteleraActualizada);
		
		JButton btnNewButton = new JButton("Volver");
		btnNewButton.setBounds(680, 496, 89, 23);
		add(btnNewButton);

	}

}
