package Vista;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class PanelBorrar extends JPanel {

	/**
	 * Create the panel.
	 */
	public PanelBorrar() {
		setBackground(new Color(57, 62, 70));
		setLayout(null);
		
		JButton btnAceptar = new JButton("Aceptar");
		btnAceptar.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnAceptar.setBounds(444, 527, 113, 41);
		add(btnAceptar);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnCancelar.setBounds(588, 527, 113, 41);
		add(btnCancelar);
		
		JLabel lblTitulo = new JLabel("T\u00EDtulo:");
		lblTitulo.setForeground(new Color(255, 255, 255));
		lblTitulo.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblTitulo.setBounds(89, 216, 90, 61);
		add(lblTitulo);
		
		JComboBox comboBoxTitulo = new JComboBox();
		comboBoxTitulo.setBounds(247, 230, 339, 40);
		add(comboBoxTitulo);
		
		JLabel lblNewLabel = new JLabel("Seleccione el titulo que se desea borrar");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblNewLabel.setBounds(10, 11, 595, 46);
		add(lblNewLabel);

	}

}
