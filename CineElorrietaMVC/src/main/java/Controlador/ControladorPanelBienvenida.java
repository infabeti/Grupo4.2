package Controlador;

import java.util.Timer;
import java.util.TimerTask;

import Modelo.Modelo;
import Vista.PanelBienvenida;
import Vista.Vista;

public class ControladorPanelBienvenida {

	@SuppressWarnings("unused")
	private Modelo modelo;
	private Vista vista;
	private Controlador controlador;
	private PanelBienvenida panelBienvenida;
	
	public ControladorPanelBienvenida(Modelo modelo, Vista vista, Controlador controlador) {
		this.modelo = modelo;
		this.vista = vista;
		this.controlador = controlador;	
	}
	
	public void mostrarPanelBienvenida() {
		this.panelBienvenida = new PanelBienvenida(this);
		this.vista.mostrarPanel(this.panelBienvenida);
	}
	
	public void timerBienvenida() {
		
		Timer cronom=new Timer();
        cronom.schedule(new TimerTask(){
            
	        public void run(){    
	        	System.out.println("Ejecutado timer Generos");
	        	controlador.navegarPanelGeneros();
	        	this.setVisible(false);
	        	this.dispose();
	        }
	
			private void setVisible(boolean b) {
				// TODO Auto-generated method stub
			}
	
			private void dispose() {
				// TODO Auto-generated method stub
			}
		},5000);
	}
}
