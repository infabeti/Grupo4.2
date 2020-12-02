package Controlador;

import Modelo.Modelo;
import Vista.PanelFin;
import Vista.Vista;

public class ControladorPanelFin {

	private Modelo modelo;
	private Vista vista;
	private Controlador controlador;
	private PanelFin panelFin;
	
	public ControladorPanelFin(Modelo modelo, Vista vista, Controlador controlador) {
		this.modelo = modelo;
		this.vista = vista;
		this.controlador = controlador;	
	}
	
	public void mostrarPanelFin() {
		this.panelFin = new PanelFin(this);
		this.vista.mostrarPanel(this.panelFin);
	}
	
	public void accionadoBotonVolverPanelFin() {
		this.controlador.navegarPanelBienvenida();
	}
}
