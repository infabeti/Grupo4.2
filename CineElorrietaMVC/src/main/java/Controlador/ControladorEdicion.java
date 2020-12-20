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
		this.setModelo(modelo);
		this.setVista(vista);
		this.setControlador(controlador);	
	}
	
	public void mostrarPanelEdicion() {
		this.panelEdicion = new PanelEdicion(this);
		this.getVista().mostrarPanel(this.panelEdicion);
		
	}
	
	
	public void accionadoBotonEditarPanelEdicion() {
		this.getControlador().navegarPanelEditar();
	}
	public void accionadoBotonAnadirPanelEdicion() {
		this.getControlador().navegarPanelAnadir();
	}
	public void accionadoBotonBorrarPanelEdicion() {
		this.getControlador().navegarPanelBorrar();
	}
	public void accionadoBotonContinuarPanelEdicion() {
		this.getControlador().navegarPanelResumen();
	}
	public void accionadoBotonCancelarPanelEdicion() {
		this.getControlador().navegarPanelBienvenida();
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

	public PanelEdicion makePanelEdicion(ControladorEdicion controlador) {
		return new PanelEdicion(controlador);
		
	}
}