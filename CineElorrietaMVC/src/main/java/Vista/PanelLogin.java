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
		
		btnGeneros = new JButton("Generos");
		btnGeneros.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnGeneros.setBounds(295, 430, 113, 41);
		add(btnGeneros);
		
		btnEdicion = new JButton("Edicion");
		btnEdicion.setBounds(454, 443, 89, 23);
		add(btnEdicion);
		
		btnCancelar = new JButton("Cancelar");
		btnCancelar.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnCancelar.setBounds(592, 430, 113, 41);
		add(btnCancelar);
		
		textFieldUsuario = new JTextField();
		textFieldUsuario.setBounds(312, 157, 242, 41);
		add(textFieldUsuario);
		textFieldUsuario.setColumns(10);
		
		textFieldPass = new JPasswordField();
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
		
		initializeEvents();
	}
	
	private void initializeEvents() {
		this.btnGeneros.addActionListener(listenerBotonGeneros(this.controladorPanelLogin));
		this.btnEdicion.addActionListener(listenerBotonEdicion(this.controladorPanelLogin));
		this.btnCancelar.addActionListener(listenerBotonVolver(this.controladorPanelLogin));
	}
	
	private ActionListener listenerBotonGeneros(ControladorPanelLogin controladorPanelLogin) {
		return new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.out.println("Ejecutando evento Boton hacia Generos");
				controladorPanelLogin.accionadoBotonGenerosPanelLogin(textFieldUsuario.getText(), textFieldPass.getText());
			}
		};
	}
	private ActionListener listenerBotonEdicion(ControladorPanelLogin controladorPanelLogin) {
		return new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.out.println("Ejecutando evento Boton hacia Generos");
				controladorPanelLogin.accionadoBotonEdicionPanelLogin(textFieldUsuario.getText(), textFieldPass.getText());
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
