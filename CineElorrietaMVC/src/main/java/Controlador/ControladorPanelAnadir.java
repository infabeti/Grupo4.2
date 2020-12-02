package Controlador;


import Modelo.Modelo;
import Vista.PanelAnadir;
import Vista.Vista;

public class ControladorPanelAnadir {

	private Modelo modelo;
	private Vista vista;
	private Controlador controlador;
	private PanelAnadir panelAnadir;
	
	public ControladorPanelAnadir(Modelo modelo, Vista vista, Controlador controlador) {
		this.modelo = modelo;
		this.vista = vista;
		this.controlador = controlador;	
	}
	
	public void mostrarPanelAnadir() {
		this.panelAnadir = new PanelAnadir(this);
		this.vista.mostrarPanel(this.panelAnadir);
	}
	
	public void accionadoBotonAceptarPanelAnadir() {
		this.controlador.navegarPanelResumen();
	}
	public void accionadoBotonCancelarPanelAnadir() {
		this.controlador.navegarPanelResumen();
	}
}
