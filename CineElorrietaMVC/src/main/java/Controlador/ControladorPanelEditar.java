package Controlador;

import Modelo.Modelo;
import Vista.PanelEditar;
import Vista.Vista;

public class ControladorPanelEditar {

	private Modelo modelo;
	private Vista vista;
	private Controlador controlador;
	private PanelEditar panelEditar;
	
	public ControladorPanelEditar(Modelo modelo, Vista vista, Controlador controlador) {
		this.modelo = modelo;
		this.vista = vista;
		this.controlador = controlador;	
	}
	
	public void mostrarPanelEditar() {
		this.panelEditar = new PanelEditar(this);
		this.vista.mostrarPanel(this.panelEditar);
	}
	
	public void accionadoBotonAceptarPanelEditar() {
		this.controlador.navegarPanelResumen();
	}
	public void accionadoBotonCancelarPanelEditar() {
		this.controlador.navegarPanelResumen();
	}
}