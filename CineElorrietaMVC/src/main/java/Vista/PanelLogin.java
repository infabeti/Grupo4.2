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

import Controlador.ControladorPanelLogin;

import java.awt.Color;

@SuppressWarnings("serial")
public class PanelLogin extends JPanel {
	private JTextField textFieldUsuario;
	private JTextField textFieldPass;
	private JButton btnGeneros;
	private JButton btnEdicion;
	private JButton btnLogin;
	private JButton btnCancelar;
	private ControladorPanelLogin controladorPanelLogin;

	/**
	 * Create the panel.
	 * @param controladorPanelLogin 
	 */
	public PanelLogin(ControladorPanelLogin controladorPanelLogin) {
		this.controladorPanelLogin = controladorPanelLogin;
		setBounds(100, 100, 800, 550);
		setBackground(new Color(57, 62, 70));
		setLayout(null);
		
		JLabel lblCuadradoFondo = new JLabel("");
		lblCuadradoFondo.setOpaque(true);
		lblCuadradoFondo.setBackground(new Color(204, 153, 0));
		lblCuadradoFondo.setBounds(689, 444, 111, 106);
		add(lblCuadradoFondo);
		
		btnEdicion = new JButton("Edicion");
		btnEdicion.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnEdicion.setBounds(449, 372, 113, 44);
		add(btnEdicion);
		
		btnGeneros = new JButton("Generos");
		btnGeneros.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnGeneros.setBounds(312, 372, 113, 41);
		add(btnGeneros);
		
		btnCancelar = new JButton("Cancelar");
		btnCancelar.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnCancelar.setBounds(442, 321, 120, 40);
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
		textFieldUsuario.setBounds(312, 157, 250, 41);
		add(textFieldUsuario);
		textFieldUsuario.setColumns(10);
		
		textFieldPass = new JPasswordField();
		textFieldPass.setColumns(10);
		textFieldPass.setBounds(312, 254, 250, 41);
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
		
		btnLogin = new JButton("Login");
		btnLogin.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnLogin.setBounds(312, 321, 120, 40);
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
		lblTituloPanel.setBounds(10, 11, 595, 40);
		add(lblTituloPanel);
		
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
	private ActionListener listenerBotonLogin(ControladorPanelLogin controladorPanelLogin) {
		return new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.out.println("Ejecutando evento LOGIN");
				controladorPanelLogin.accionadoBotonLoginPanelLogin(textFieldUsuario.getText(), textFieldPass.getText());
			}
		};
	}
	private ActionListener listenerBotonVolver(ControladorPanelLogin controladorPanelLogin) {
		return new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.out.println("Ejecutando evento Boton Volver en Generos");
				controladorPanelLogin.accionadoBotonVolverPanelLogin();
			}
		};
	}
}
