package Controlador;

import Modelo.Modelo;
import Vista.PanelResumen;
import Vista.Vista;

public class ControladorPanelResumen {

	private Modelo modelo;
	private Vista vista;
	private Controlador controlador;
	private PanelResumen panelResumen;
	
	public ControladorPanelResumen(Modelo modelo, Vista vista, Controlador controlador) {
		this.modelo = modelo;
		this.vista = vista;
		this.controlador = controlador;	
	}
	
	public void mostrarPanelResumen() {
		this.panelResumen = new PanelResumen(this);
		this.vista.mostrarPanel(this.panelResumen);
	}
	
	public void accionadoBotonConfirmarPanelResumen() {
		this.controlador.navegarPanelBienvenida();
	}
	public void accionadoBotonCancelar1PanelResumen() {
		this.controlador.navegarPanelEdicion();
	}
	public void accionadoBotonCancelar2PanelResumen() {
		this.controlador.navegarPanelGeneros();
	}
}