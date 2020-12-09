package Controlador;

import javax.swing.JComboBox;

import Modelo.*;
import Vista.PanelAnadir;
import Vista.Vista;

public class ControladorPanelAnadir {

	private Modelo modelo;
	private Vista vista;
	private Controlador controlador;
	private PanelAnadir panelAnadir;
	
	public ControladorPanelAnadir(Modelo modelo, Vista vista, Controlador controlador) {
		this.modelo = modelo;
		this.vista = vista;
		this.controlador = controlador;	
	}
	
	@SuppressWarnings("unchecked")
	public void mostrarPanelAnadir() {
		this.panelAnadir = new PanelAnadir(this);
		this.vista.mostrarPanel(this.panelAnadir);
		
		System.out.println(modelo.getConsultasBBDD().consultaPeliculas().length);
		// Añadir pelis drama
		for(Pelicula peli : modelo.getConsultasBBDD().consultaPeliculas("drama")) {
			this.panelAnadir.comboBoxGenero.addItem(peli.getNombre());
		}
	}
	
	public void accionadoBotonAceptarPanelAnadir() {
		this.controlador.navegarPanelResumen();
	}
	public void accionadoBotonCancelarPanelAnadir() {
		this.controlador.navegarPanelResumen();
	}
}
