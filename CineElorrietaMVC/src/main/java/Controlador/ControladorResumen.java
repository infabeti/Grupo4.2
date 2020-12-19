package Controlador;

import Modelo.Modelo;
import Modelo.Pelicula;
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
		
		// TEXTFIELDS
		for(Pelicula peli : modelo.getCarteleraSabado()) {
			panelResumen.getTextAreaSabado().setText(panelResumen.getTextAreaSabado().getText()+"\n"+peli.getGenero()+" - "+peli.getNombre());
		}
		for(Pelicula peli : modelo.getCarteleraDomingo()) {
			panelResumen.getTextAreaDomingo().setText(panelResumen.getTextAreaDomingo().getText()+"\n"+peli.getGenero()+" - "+peli.getNombre());
		}
	}
	
	public void accionadoBotonConfirmarPanelResumen() {
		controlador.getControladorPanelGeneros().limpiarLista("sabado");
		controlador.getControladorPanelGeneros().limpiarLista("domingo");
		this.controlador.navegarPanelBienvenida();
	}
	public void accionadoBotonCancelarPanelResumen() {
		this.controlador.navegarPanelGeneros();
	}
}