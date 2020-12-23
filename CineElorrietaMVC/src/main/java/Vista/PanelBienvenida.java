package Vista;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

import Controlador.ControladorBienvenida;
import java.awt.Color;

@SuppressWarnings("serial")
public class PanelBienvenida extends JPanel{
	private JLabel lblBienvenida;
	private ControladorBienvenida controladorPanelBienvenida;
	
	public PanelBienvenida(ControladorBienvenida controladorPanelBienvenida) {
		this.controladorPanelBienvenida = controladorPanelBienvenida;
		setBounds(100, 100, 800, 550);
		setBackground(new Color(57, 62, 70));
		setLayout(null);
		
		JLabel lblExplicacion2 = new JLabel("o editar las pel\u00EDculas existentes, as\u00ED c\u00F3mo a\u00F1adir nuevas y borrarlas");
		lblExplicacion2.setHorizontalAlignment(SwingConstants.RIGHT);
		lblExplicacion2.setForeground(Color.RED);
		lblExplicacion2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblExplicacion2.setBounds(4, 523, 444, 19);
		add(lblExplicacion2);
		
		
		JLabel lblExplicacion1 = new JLabel("A continuaci\u00F3n podr\u00E1s elegir la cartelera del pr\u00F3ximo fin de semana");
		lblExplicacion1.setBounds(10, 502, 434, 19);
		lblExplicacion1.setForeground(new Color(255, 0, 0));
		lblExplicacion1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblExplicacion1.setHorizontalAlignment(SwingConstants.RIGHT);
		add(lblExplicacion1);
		
		JLabel lblCuadradoFondo = new JLabel("");
		lblCuadradoFondo.setOpaque(true);
		lblCuadradoFondo.setBackground(new Color(204, 153, 0));
		lblCuadradoFondo.setBounds(689, 444, 111, 106);
		add(lblCuadradoFondo);
		
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
		///////////////////////////////////////
		
		
		JLabel lblBienvenida = new JLabel("Bienvenido/a");
		lblBienvenida.setBounds(115, 105, 525, 81);
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
		
		///////////////////////////////////////
		initializeEvents();
	}
	
	private void initializeEvents() {
		this.controladorPanelBienvenida.timerBienvenida();
	}
	
}
