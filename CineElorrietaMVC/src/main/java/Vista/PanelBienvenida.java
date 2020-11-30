package Vista;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

import Controlador.ControladorPanelBienvenida;
import java.awt.Color;

@SuppressWarnings("serial")
public class PanelBienvenida extends JPanel{

	private JButton btnGeneros;
	private JLabel lblBienvenida;
	private ControladorPanelBienvenida controladorPanelBienvenida;
	
	public PanelBienvenida(ControladorPanelBienvenida controladorPanelBienvenida) {
		setBackground(new Color(57, 62, 70));
		this.controladorPanelBienvenida = controladorPanelBienvenida;
		
		setLayout(null);
		
//		lblBienvenida = new JLabel("Panel Bienvenida");
//		lblBienvenida.setBounds(58, 35, 115, 14);
//		add(lblBienvenida);
		
		btnGeneros = new JButton("Generos");
		btnGeneros.setBounds(10, 23, 120, 23);
		add(btnGeneros);
		///////////////////////////////////////
		
		
		JLabel lblBienvenida = new JLabel("Bienvenido/a");
		lblBienvenida.setForeground(new Color(240, 248, 255));
		lblBienvenida.setHorizontalAlignment(SwingConstants.CENTER);
		lblBienvenida.setFont(new Font("SimSun", Font.BOLD, 70));
		lblBienvenida.setBounds(167, 116, 450, 83);
		add(lblBienvenida);
		
		JLabel lblAppDiseñada = new JLabel("App dise\u00F1ada para");
		lblAppDiseñada.setForeground(new Color(240, 248, 255));
		lblAppDiseñada.setHorizontalAlignment(SwingConstants.CENTER);
		lblAppDiseñada.setFont(new Font("SimSun", Font.PLAIN, 45));
		lblAppDiseñada.setBounds(183, 222, 415, 64);
		add(lblAppDiseñada);
		
		JLabel lblCineSS = new JLabel("Cine Elorrieta MVC");
		lblCineSS.setForeground(new Color(244, 164, 96));
		lblCineSS.setHorizontalAlignment(SwingConstants.CENTER);
		lblCineSS.setFont(new Font("SimSun", Font.BOLD, 50));
		lblCineSS.setBounds(131, 310, 498, 52);
		add(lblCineSS);
		
		
		JLabel lblNewLabel = new JLabel("A continuaci\u00F3n podr\u00E1s elegir la cartelera del pr\u00F3ximo fin de semana");
		lblNewLabel.setForeground(new Color(255, 0, 0));
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel.setBounds(167, 529, 536, 28);
		add(lblNewLabel);
		
		///////////////////////////////////////
		initializeEvents();
	}
	
	private void initializeEvents() {
		this.btnGeneros.addActionListener(listenerBotonGeneros(this.controladorPanelBienvenida));
	}
	
	private ActionListener listenerBotonGeneros(ControladorPanelBienvenida controladorPanelBienvenida) {
		return new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.out.println("Ejecutando evento Boton Generos");
				controladorPanelBienvenida.accionadoBottonMostrarPanelGeneros();
			}
		};
	}
}
