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

@SuppressWarnings("serial")
public class PanelBienvenida extends JPanel{

	private JButton btnGeneros;
	private JLabel lblBienvenida;
	private ControladorPanelBienvenida controladorPanelBienvenida;
	
	public PanelBienvenida(ControladorPanelBienvenida controladorPanelBienvenida) {
		this.controladorPanelBienvenida = controladorPanelBienvenida;
		
		setLayout(null);
		
//		lblBienvenida = new JLabel("Panel Bienvenida");
//		lblBienvenida.setBounds(58, 35, 115, 14);
//		add(lblBienvenida);
		
		btnGeneros = new JButton("Generos");
		btnGeneros.setBounds(58, 116, 120, 23);
		add(btnGeneros);
		///////////////////////////////////////
		
		
		JLabel lblBienvenida = new JLabel("Bienvenido/a");
		lblBienvenida.setHorizontalAlignment(SwingConstants.CENTER);
		lblBienvenida.setFont(new Font("SimSun", Font.BOLD, 70));
		lblBienvenida.setBounds(167, 116, 450, 83);
		add(lblBienvenida);
		
		JLabel lblAppDiseñada = new JLabel("App dise\u00F1ada para");
		lblAppDiseñada.setHorizontalAlignment(SwingConstants.CENTER);
		lblAppDiseñada.setFont(new Font("SimSun", Font.PLAIN, 45));
		lblAppDiseñada.setBounds(183, 222, 415, 64);
		add(lblAppDiseñada);
		
		JLabel lblCineSS = new JLabel("Cine CSS");
		lblCineSS.setHorizontalAlignment(SwingConstants.CENTER);
		lblCineSS.setFont(new Font("SimSun", Font.BOLD, 50));
		lblCineSS.setBounds(270, 310, 222, 52);
		add(lblCineSS);
		
//		JLabel lblNube = new JLabel("");
//		lblNube.setIcon(new ImageIcon(VBienvenida.class.getResource("/iconos/nube.png")));
//		lblNube.setBounds(335, -15, 450, 245);
//		add(lblNube);
//		
//		JLabel lblLogo = new JLabel("");
//		lblLogo.setIcon(new ImageIcon(VBienvenida.class.getResource("/iconos/cineCSS.png")));
//		lblLogo.setBounds(10, 5, 90, 92);
//		add(lblLogo);
//		
		JLabel lblNewLabel = new JLabel("A continuaci\u00F3n podr\u00E1s elegir la cartelera del pr\u00F3ximo fin de semana");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(0, 483, 629, 28);
		add(lblNewLabel);
		
		///////////////////////////////////////
		initializeEvents();
	}
	
	private void initializeEvents() {
		this.controladorPanelBienvenida.timerBienvenida();
	}
	
}
