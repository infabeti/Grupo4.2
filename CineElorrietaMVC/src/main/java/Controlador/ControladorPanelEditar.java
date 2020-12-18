package Controlador;

import Modelo.Modelo;
import Modelo.Pelicula;
import Vista.PanelAnadir;
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
	
	public void cambiarGenero() {
		this.panelEditar.comboBoxNombre.setEnabled(true);
		this.panelEditar.comboBoxNombre.removeAllItems();
		System.out.println("cambiando de género");
		for(Pelicula peli : modelo.getConsultasBBDD().consultaPeliculas()) {
			if(peli.getGenero().equalsIgnoreCase(this.panelEditar.comboBoxGenero.getSelectedItem().toString()))
				this.panelEditar.comboBoxNombre.addItem(peli.getNombre());
		}
	}
	public void mostrarPanelEditar() {
		this.panelEditar = new PanelEditar(this);
		this.vista.mostrarPanel(this.panelEditar);
				
		String[] generos= {"Drama", "Comedia", "Terror", "Sci-fi"};
		for(String genero : generos)
			this.panelEditar.comboBoxGenero.addItem(genero);
		
		
	}
	
	public void accionadoBotonAceptarPanelEditar() {
		this.controlador.navegarPanelResumen();
	}
	public void accionadoBotonCancelarPanelEditar() {
		this.controlador.navegarPanelResumen();
	}
}