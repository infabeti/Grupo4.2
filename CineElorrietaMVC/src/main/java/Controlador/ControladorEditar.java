package Controlador;

import javax.swing.JComboBox;

import Modelo.*;
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
//	public int duracionAntigua(JComboBox source) {
//		return getModelo().getConsultasBBDD().getDuracionEditar(source.getSelectedItem().toString());
//	}
	public void mostrarPanelEditar() {
		this.panelEditar = new PanelEditar(this);
		this.vista.mostrarPanel(this.panelEditar);
		getModelo().getConsultasBBDD().consultaPeliculas();
				
		String[] generos= {"Drama", "Comedia", "Terror", "Sci-fi"};
		for(String genero : generos) {
			this.panelEditar.getComboBoxGenero().addItem(genero);
			this.panelEditar.getCbCambiarGenero().addItem(genero);
		}
		
	}
	
	public void editarPeli() {
		String titulo = this.panelEditar.getComboBoxNombre().getSelectedItem().toString();
		String tituloNuevo;
			if (this.panelEditar.getJtfTitulo().getText().equals("")) {
				System.out.println("título nuevo está vacío");
				tituloNuevo = titulo;
			}else {
				tituloNuevo = this.panelEditar.getJtfTitulo().getText();
			}
		String genero = this.panelEditar.getComboBoxGenero().getSelectedItem().toString();
		String generoNuevo = this.panelEditar.getCbCambiarGenero().getSelectedItem().toString();
		
		int duracion = getModelo().getConsultasBBDD().getDuracionEditar(titulo);
		int duracionNueva;
			if (this.panelEditar.getTfDuracion().getText().equals("")) {
				System.out.println("duración nueva está vacía");
				duracionNueva = duracion;
			}else {
				duracionNueva = (Integer.parseInt(this.panelEditar.getTfDuracion().getText()))*60;
			}
		
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
	public Modelo getModelo() {
		return modelo;
	}
	public void setModelo(Modelo modelo) {
		this.modelo = modelo;
	}
}