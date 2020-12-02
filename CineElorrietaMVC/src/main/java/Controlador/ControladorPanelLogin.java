package Controlador;

import Modelo.Modelo;
import Vista.PanelLogin;
import Vista.Vista;

public class ControladorPanelLogin {

	private Modelo modelo;
	private Vista vista;
	private Controlador controlador;
	private PanelLogin panelLogin;
	
	public ControladorPanelLogin(Modelo modelo, Vista vista, Controlador controlador) {
		this.modelo = modelo;
		this.vista = vista;
		this.controlador = controlador;	
	}
	
	public void mostrarPanelLogin() {
		this.panelLogin = new PanelLogin(this);
		this.vista.mostrarPanel(this.panelLogin);
	}
	
	public void accionadoBotonEdicionPanelLogin() {
		this.controlador.navegarPanelEdicion();
	}
	public void accionadoBotonGenerosPanelLogin() {
		this.controlador.navegarPanelGeneros();
	}
	public void accionadoBotonVolverPanelLogin() {
		this.controlador.navegarPanelBienvenida();
	}
	
}