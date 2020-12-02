package Controlador;

import Modelo.Modelo;
import Vista.PanelGeneros;
import Vista.Vista;

public class ControladorPanelGeneros {

	private Modelo modelo;
	private Vista vista;
	private Controlador controlador;
	private PanelGeneros panelGeneros;
	
	public ControladorPanelGeneros(Modelo modelo, Vista vista, Controlador controlador) {
		this.modelo = modelo;
		this.vista = vista;
		this.controlador = controlador;	
	}
	
	public void mostrarPanelGeneros() {
		this.panelGeneros = new PanelGeneros(this);
		this.vista.mostrarPanel(this.panelGeneros);
	}
	
	public void accionadoBotonSiguientePanelGeneros() {
		this.controlador.navegarPanelPeliculas();
	}
	public void accionadoBotonVolverPanelGeneros() {
		this.controlador.navegarPanelBienvenida();
	}
}
