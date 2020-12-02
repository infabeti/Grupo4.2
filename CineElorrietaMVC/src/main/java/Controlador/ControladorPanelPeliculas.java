package Controlador;

import Modelo.Modelo;
import Vista.PanelPeliculas;
import Vista.Vista;

public class ControladorPanelPeliculas {

	private Modelo modelo;
	private Vista vista;
	private Controlador controlador;
	private PanelPeliculas panelPeliculas;
	
	public ControladorPanelPeliculas(Modelo modelo, Vista vista, Controlador controlador) {
		this.modelo = modelo;
		this.vista = vista;
		this.controlador = controlador;	
	}
	
	public void mostrarPanelPeliculas() {
		this.panelPeliculas = new PanelPeliculas(this);
		this.vista.mostrarPanel(this.panelPeliculas);
	}
	
	public void accionadoBotonContinuarPanelPeliculas() {
		this.controlador.navegarPanelResumen();
	}
	public void accionadoBotonCancelarPanelPeliculas() {
		this.controlador.navegarPanelGeneros();
	}
}
