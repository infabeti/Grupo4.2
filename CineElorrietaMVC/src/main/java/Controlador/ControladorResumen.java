package Controlador;

import Modelo.Modelo;
import Vista.PanelResumen;
import Vista.Vista;

public class ControladorResumen {

	private Modelo modelo;
	private Vista vista;
	private Controlador controlador;
	private PanelResumen panelResumen;
	
	public ControladorResumen(Modelo modelo, Vista vista, Controlador controlador) {
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
	public void accionadoBotonCancelarPanelResumen() {
		this.controlador.navegarPanelGeneros();
	}
}