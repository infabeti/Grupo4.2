package Vista;

import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextArea;

public class PanelEdicion extends JPanel {

	/**
	 * Create the panel.
	 */
	public PanelEdicion() {
		setBackground(new Color(57, 62, 70));
		setLayout(null);
		
		JButton btnEditar = new JButton("Editar");
		btnEditar.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnEditar.setBounds(35, 173, 127, 53);
		add(btnEditar);
		
		JButton btnAnadir = new JButton("A\u00F1adir");
		btnAnadir.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnAnadir.setBounds(35, 237, 127, 53);
		add(btnAnadir);
		
		JButton btnBorrar = new JButton("Borrar");
		btnBorrar.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnBorrar.setBounds(35, 301, 127, 53);
		add(btnBorrar);
		
		JButton btnContinuar = new JButton("Continuar");
		btnContinuar.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnContinuar.setBounds(382, 517, 139, 46);
		add(btnContinuar);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnCancelar.setBounds(599, 517, 127, 46);
		add(btnCancelar);
		
		JTextArea textAreaNombre = new JTextArea();
		textAreaNombre.setBounds(214, 173, 104, 207);
		add(textAreaNombre);
		
		JTextArea textAreaGenero = new JTextArea();
		textAreaGenero.setBounds(361, 173, 104, 207);
		add(textAreaGenero);
		
		JTextArea textAreaHora = new JTextArea();
		textAreaHora.setBounds(505, 173, 104, 207);
		add(textAreaHora);
		
		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setForeground(new Color(255, 255, 255));
		lblNombre.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNombre.setBounds(214, 127, 104, 25);
		add(lblNombre);
		
		JLabel lblGenero = new JLabel("G\u00E9nero");
		lblGenero.setForeground(Color.WHITE);
		lblGenero.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblGenero.setBounds(361, 127, 104, 25);
		add(lblGenero);
		
		JLabel lblHora = new JLabel("Hora");
		lblHora.setForeground(Color.WHITE);
		lblHora.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblHora.setBounds(505, 127, 104, 25);
		add(lblHora);

	}
}
