package Controlador;

import Modelo.Modelo;
import Vista.PanelEdicion;
import Vista.Vista;

public class ControladorEdicion {

	private Modelo modelo;
	private Vista vista;
	private Controlador controlador;
	private PanelEdicion panelEdicion;
	
	public ControladorEdicion(Modelo modelo, Vista vista, Controlador controlador) {
		this.modelo = modelo;
		this.vista = vista;
		this.controlador = controlador;	
	}
	
	public void mostrarPanelEdicion() {
		this.panelEdicion = new PanelEdicion(this);
		this.vista.mostrarPanel(this.panelEdicion);
		
	}
	
	
	public void accionadoBotonEditarPanelEdicion() {
		this.controlador.navegarPanelEditar();
	}
	public void accionadoBotonAnadirPanelEdicion() {
		this.controlador.navegarPanelAnadir();
	}
	public void accionadoBotonBorrarPanelEdicion() {
		this.controlador.navegarPanelBorrar();
	}
	public void accionadoBotonContinuarPanelEdicion() {
		this.controlador.navegarPanelResumen();
	}
	public void accionadoBotonCancelarPanelEdicion() {
		this.controlador.navegarPanelBienvenida();
	}
}