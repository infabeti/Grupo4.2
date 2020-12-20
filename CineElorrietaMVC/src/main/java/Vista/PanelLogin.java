package Vista;

import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

import Controlador.ControladorLogin;

import java.awt.Color;

@SuppressWarnings("serial")
public class PanelLogin extends JPanel {
	private JTextField textFieldUsuario;
	private JTextField textFieldPass;
	private JButton btnGeneros;
	private JButton btnEdicion;
	private JButton btnLogin;
	private JButton btnCancelar;
	private ControladorLogin controladorPanelLogin;

	/**
	 * Create the panel.
	 * @param controladorPanelLogin 
	 */
	public PanelLogin(ControladorLogin controladorPanelLogin) {
		this.controladorPanelLogin = controladorPanelLogin;
		setBounds(100, 100, 800, 550);
		setBackground(new Color(57, 62, 70));
		setLayout(null);
		
		JLabel lblCuadradoFondo = new JLabel("");
		lblCuadradoFondo.setOpaque(true);
		lblCuadradoFondo.setBackground(new Color(204, 153, 0));
		lblCuadradoFondo.setBounds(689, 444, 111, 106);
		add(lblCuadradoFondo);
		
		btnCancelar = new JButton("Cancelar");
		btnCancelar.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnCancelar.setBounds(559, 499, 120, 40);
		add(btnCancelar);
		
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
		
		textFieldUsuario = new JTextField();
		textFieldUsuario.setBounds(312, 152, 250, 41);
		add(textFieldUsuario);
		textFieldUsuario.setColumns(10);
		
		textFieldPass = new JPasswordField();
		textFieldPass.setColumns(10);
		textFieldPass.setBounds(312, 204, 250, 41);
		add(textFieldPass);
		
		JLabel lblUsuario = new JLabel("Usuario:");
		lblUsuario.setForeground(new Color(255, 255, 255));
		lblUsuario.setHorizontalAlignment(SwingConstants.RIGHT);
		lblUsuario.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblUsuario.setBounds(137, 154, 151, 28);
		add(lblUsuario);
		
		JLabel lblPass = new JLabel("Contrase\u00F1a:");
		lblPass.setForeground(new Color(255, 255, 255));
		lblPass.setHorizontalAlignment(SwingConstants.RIGHT);
		lblPass.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblPass.setBounds(137, 217, 151, 28);
		add(lblPass);
		
		btnLogin = new JButton("Login");
		btnLogin.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnLogin.setBounds(442, 304, 120, 40);
		add(btnLogin);
		btnLogin.addMouseListener(new java.awt.event.MouseAdapter() {
		    public void mouseEntered(java.awt.event.MouseEvent evt) {
		    	btnLogin.setBackground(Color.GREEN);
		    }

		    public void mouseExited(java.awt.event.MouseEvent evt) {
		    	btnLogin.setBackground(Color.WHITE);
		    	btnLogin.setForeground(Color.BLACK);
		    }
		});
		
		JLabel lblTituloPanel = new JLabel("Login");
		lblTituloPanel.setVerticalAlignment(SwingConstants.TOP);
		lblTituloPanel.setForeground(Color.WHITE);
		lblTituloPanel.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblTituloPanel.setBounds(10, 11, 60, 40);
		add(lblTituloPanel);
		
		JLabel lblBienvenidaLogin = new JLabel("Bienvenido\r\n");
		lblBienvenidaLogin.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblBienvenidaLogin.setForeground(Color.GRAY);
		lblBienvenidaLogin.setBounds(179, 85, 109, 33);
		add(lblBienvenidaLogin);
		
		JLabel lblPorfavorIntroduzca = new JLabel(", Porfavor introduzca un Usuario y Contrase\u00F1a");
		lblPorfavorIntroduzca.setForeground(Color.WHITE);
		lblPorfavorIntroduzca.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblPorfavorIntroduzca.setBounds(278, 87, 284, 33);
		add(lblPorfavorIntroduzca);
		
		initializeEvents();
	}
	
	private void initializeEvents() {
		this.btnLogin.addActionListener(listenerBotonLogin(this.controladorPanelLogin));
		this.btnCancelar.addActionListener(listenerBotonVolver(this.controladorPanelLogin));
	}
	
//	private ActionListener listenerBotonGeneros(ControladorPanelLogin controladorPanelLogin) {
//		return new ActionListener() {
//			public void actionPerformed(ActionEvent arg0) {
//				System.out.println("Ejecutando evento Boton hacia Generos");
//				controladorPanelLogin.accionadoBotonGenerosPanelLogin(textFieldUsuario.getText(), textFieldPass.getText());
//			}
//		};
//	}
	private ActionListener listenerBotonLogin(ControladorLogin controladorPanelLogin) {
		return new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.out.println("Ejecutando evento LOGIN");
				controladorPanelLogin.accionadoBotonLoginPanelLogin(textFieldUsuario.getText(), textFieldPass.getText());
			}
		};
	}
	private ActionListener listenerBotonVolver(ControladorLogin controladorPanelLogin) {
		return new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.out.println("Ejecutando evento Boton Volver en Generos");
				controladorPanelLogin.accionadoBotonVolverPanelLogin();
			}
		};
	}
}
