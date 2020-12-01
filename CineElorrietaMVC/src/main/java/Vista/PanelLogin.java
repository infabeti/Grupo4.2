package Vista;

import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Color;

public class PanelLogin extends JPanel {
	private JTextField textFieldUsuario;
	private JTextField textFieldPass;

	/**
	 * Create the panel.
	 */
	public PanelLogin() {
		setBackground(new Color(57, 62, 70));
		setLayout(null);
		
		JButton btnContinuar = new JButton("Contiuar");
		btnContinuar.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnContinuar.setBounds(453, 523, 113, 41);
		add(btnContinuar);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnCancelar.setBounds(597, 523, 113, 41);
		add(btnCancelar);
		
		textFieldUsuario = new JTextField();
		textFieldUsuario.setBounds(312, 157, 242, 41);
		add(textFieldUsuario);
		textFieldUsuario.setColumns(10);
		
		textFieldPass = new JTextField();
		textFieldPass.setColumns(10);
		textFieldPass.setBounds(312, 254, 242, 41);
		add(textFieldPass);
		
		JLabel lblUsuario = new JLabel("Usuario:");
		lblUsuario.setForeground(new Color(255, 255, 255));
		lblUsuario.setHorizontalAlignment(SwingConstants.RIGHT);
		lblUsuario.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblUsuario.setBounds(137, 159, 151, 28);
		add(lblUsuario);
		
		JLabel lblPass = new JLabel("Contrase\u00F1a:");
		lblPass.setForeground(new Color(255, 255, 255));
		lblPass.setHorizontalAlignment(SwingConstants.RIGHT);
		lblPass.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblPass.setBounds(137, 267, 151, 28);
		add(lblPass);

	}
}
