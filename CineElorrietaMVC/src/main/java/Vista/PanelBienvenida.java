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
	private JLabel lblBienvenida;
	private ControladorPanelBienvenida controladorPanelBienvenida;
	
	public PanelBienvenida(ControladorPanelBienvenida controladorPanelBienvenida) {
		this.controladorPanelBienvenida = controladorPanelBienvenida;
		setBounds(100, 100, 800, 550);
		setBackground(new Color(57, 62, 70));
		setLayout(null);
		
		JLabel lblLOGO = new JLabel("LOGO");
		lblLOGO.setIcon(new ImageIcon("C:\\eclipse-workspace\\Grupo4.2\\CineElorrietaMVC\\Imagenes\\LOGO.png"));
		lblLOGO.setBounds(689, 11, 101, 132);
		add(lblLOGO);
		///////////////////////////////////////
		
		
		JLabel lblBienvenida = new JLabel("Bienvenido/a");
		lblBienvenida.setBounds(115, 105, 444, 81);
		lblBienvenida.setForeground(new Color(240, 248, 255));
		lblBienvenida.setHorizontalAlignment(SwingConstants.CENTER);
		lblBienvenida.setFont(new Font("SimSun", Font.BOLD, 70));
		add(lblBienvenida);
		
		JLabel lblAppDiseñada = new JLabel("App dise\u00F1ada para");
		lblAppDiseñada.setBounds(125, 197, 391, 52);
		lblAppDiseñada.setForeground(new Color(240, 248, 255));
		lblAppDiseñada.setHorizontalAlignment(SwingConstants.CENTER);
		lblAppDiseñada.setFont(new Font("SimSun", Font.PLAIN, 45));
		add(lblAppDiseñada);
		
		JLabel lblCineSS = new JLabel("Cine Elorrieta MVC");
		lblCineSS.setBounds(115, 260, 486, 58);
		lblCineSS.setForeground(new Color(255, 211, 105));
		lblCineSS.setHorizontalAlignment(SwingConstants.CENTER);
		lblCineSS.setFont(new Font("SimSun", Font.BOLD, 50));
		add(lblCineSS);
		
		
		JLabel lblNewLabel = new JLabel("A continuaci\u00F3n podr\u00E1s elegir la cartelera del pr\u00F3ximo fin de semana");
		lblNewLabel.setBounds(10, 520, 434, 19);
		lblNewLabel.setForeground(new Color(255, 0, 0));
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		add(lblNewLabel);
		
		JLabel lblFondo = new JLabel("Fondo");
		lblFondo.setIcon(new ImageIcon("C:\\eclipse-workspace\\Grupo4.2\\CineElorrietaMVC\\Imagenes\\Forma.png"));
		lblFondo.setBounds(0, 0, 800, 550);
		add(lblFondo);
		
		///////////////////////////////////////
		initializeEvents();
	}
	
	private void initializeEvents() {
		this.controladorPanelBienvenida.timerBienvenida();
	}
	
}
