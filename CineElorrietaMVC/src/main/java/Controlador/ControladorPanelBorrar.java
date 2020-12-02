package Controlador;


import Modelo.Modelo;
import Vista.PanelBorrar;
import Vista.Vista;

public class ControladorPanelBorrar {

	private Modelo modelo;
	private Vista vista;
	private Controlador controlador;
	private PanelBorrar panelBorrar;
	
	public ControladorPanelBorrar(Modelo modelo, Vista vista, Controlador controlador) {
		this.modelo = modelo;
		this.vista = vista;
		this.controlador = controlador;	
	}
	
	public void mostrarPanelBorrar() {
		this.panelBorrar = new PanelBorrar(this);
		this.vista.mostrarPanel(this.panelBorrar);
	}
	
	public void accionadoBotonAceptarPanelBorrar() {
		this.controlador.navegarPanelResumen();
	}
	public void accionadoBotonCancelarPanelBorrar() {
		this.controlador.navegarPanelResumen();
	}
}