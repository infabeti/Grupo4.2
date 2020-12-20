package Controlador;

import java.util.Timer;
import java.util.TimerTask;

import Modelo.Modelo;
import Vista.PanelBienvenida;
import Vista.Vista;

public class ControladorBienvenida {

	@SuppressWarnings("unused")
	private Modelo modelo;
	private Vista vista;
	private Controlador controlador;
	private PanelBienvenida panelBienvenida;
	
	public ControladorBienvenida(Modelo modelo, Vista vista, Controlador controlador) {
		this.setModelo(modelo);
		this.setVista(vista);
		this.setControlador(controlador);	
	}
	                                                        
	public void mostrarPanelBienvenida() {                  
		this.panelBienvenida = new PanelBienvenida(this);   
		this.getVista().mostrarPanel(this.panelBienvenida);    
		
		//INICIALIZAMOS DESDE EL PRINCIPIO LAS PELÍCULAS QUE ESTÁN DE SERIE 
		getModelo().getConsultasBBDD().consultaPeliculas();
		
	}
	
	public void timerBienvenida() {
		
		Timer cronom=new Timer();
        cronom.schedule(new TimerTask(){
            
	        public void run(){    
	        	System.out.println("Ejecutado timer hacia Login");
	        	getControlador().navegarPanelLogin();
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

		public PanelBienvenida makePanelBienvenida(ControladorBienvenida controlador) {
			return new PanelBienvenida(controlador);
		
	}

		public Modelo getModelo() {
			return modelo;
		}

		public void setModelo(Modelo modelo) {
			this.modelo = modelo;
		}

		public Vista getVista() {
			return vista;
		}

		public void setVista(Vista vista) {
			this.vista = vista;
		}

		public Controlador getControlador() {
			return controlador;
		}

		public void setControlador(Controlador controlador) {
			this.controlador = controlador;
		}
}
