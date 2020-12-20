package Controlador;

import Modelo.Modelo;
import Modelo.Pelicula;
import Vista.PanelAnadir;
import Vista.PanelEditar;
import Vista.Vista;

public class ControladorEditar {

	private Modelo modelo;
	private Vista vista;
	private Controlador controlador;
	private PanelEditar panelEditar;
	public ControladorEditar(Modelo modelo, Vista vista, Controlador controlador) {
		this.modelo = modelo;
		this.vista = vista;
		this.controlador = controlador;	
	}
	
	public void cambiarGenero() {
		this.panelEditar.getComboBoxNombre().setEnabled(true);
		this.panelEditar.getComboBoxNombre().removeAllItems();
		System.out.println("cambiando de género");
		for(Pelicula peli : modelo.getConsultasBBDD().consultaPeliculas()) {
			if(peli.getGenero().equalsIgnoreCase(this.panelEditar.getComboBoxGenero().getSelectedItem().toString()))
				this.panelEditar.getComboBoxNombre().addItem(peli.getNombre());
		}
	}
	public void mostrarPanelEditar() {
		this.panelEditar = new PanelEditar(this);
		this.vista.mostrarPanel(this.panelEditar);
				
		String[] generos= {"Drama", "Comedia", "Terror", "Sci-fi"};
		for(String genero : generos) {
			this.panelEditar.getComboBoxGenero().addItem(genero);
			this.panelEditar.getCbCambiarGenero().addItem(genero);
		}
		
	}
	
	public void editarPeli() {
		String titulo = this.panelEditar.getComboBoxNombre().getSelectedItem().toString();
		String tituloNuevo = this.panelEditar.getJtfTitulo().getText();
		String genero = this.panelEditar.getComboBoxGenero().getSelectedItem().toString();
		String generoNuevo = this.panelEditar.getCbCambiarGenero().getSelectedItem().toString();
		int duracionNueva = Integer.parseInt(this.panelEditar.getTfDuracion().getText());
		
		for(Pelicula peli : modelo.getConsultasBBDD().getPeliculas_totales()) {
			if(peli.getNombre().equals(titulo)) {
				peli.setNombre(tituloNuevo);
				peli.setGenero(generoNuevo);
				peli.setDuracion(duracionNueva);
			}
		}
	}
	public void accionadoBotonAceptarPanelEditar() {
		editarPeli();
		this.controlador.navegarPanelResumen();
	}
	public void accionadoBotonCancelarPanelEditar() {
		this.controlador.navegarPanelResumen();
	}

	public PanelEditar makePanelEditar(ControladorEditar controlador) {
		return new PanelEditar(controlador);
		
	}
}