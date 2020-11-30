package Vista;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JComboBox;
import java.awt.Color;
import javax.swing.SwingConstants;

public class PanelEditar extends JPanel {

	/**
	 * Create the panel.
	 */
	public PanelEditar() {
		setBackground(new Color(57, 62, 70));
		setLayout(null);
		
		JButton btnAceptar = new JButton("Aceptar");
		btnAceptar.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnAceptar.setBounds(453, 523, 113, 41);
		add(btnAceptar);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnCancelar.setBounds(597, 523, 113, 41);
		add(btnCancelar);
		
		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setForeground(new Color(255, 255, 255));
		lblNombre.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNombre.setBounds(209, 198, 90, 61);
		add(lblNombre);
		
		JLabel lblGenero = new JLabel("Gen\u00E9ro");
		lblGenero.setForeground(new Color(255, 255, 255));
		lblGenero.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblGenero.setBounds(405, 198, 90, 61);
		add(lblGenero);
		
		JComboBox comboBoxNombre = new JComboBox();
		comboBoxNombre.setBounds(209, 285, 101, 27);
		add(comboBoxNombre);
		
		JComboBox comboBoxGenero = new JComboBox();
		comboBoxGenero.setBounds(405, 285, 101, 27);
		add(comboBoxGenero);
		
		JLabel lblEditar = new JLabel("se mostrar\u00E1 una nueva ventana en la que ser\u00E1n editables tanto el nombre de una pel\u00EDcula como su g\u00E9nero\r\n");
		lblEditar.setHorizontalAlignment(SwingConstants.LEFT);
		lblEditar.setVerticalAlignment(SwingConstants.TOP);
		lblEditar.setForeground(new Color(255, 255, 255));
		lblEditar.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblEditar.setBounds(10, 11, 700, 130);
		add(lblEditar);

	}
}
