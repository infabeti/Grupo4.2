package Controlador;

import Modelo.Modelo;
import Modelo.Pelicula;
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
		this.setVista(vista);
		this.setControlador(controlador);	
	}
	
	public void cambiarGenero() {
		this.panelEditar.getComboBoxNombre().setEnabled(true);
		this.panelEditar.getComboBoxNombre().removeAllItems();
		System.out.println("cambiando de género");
		for(Pelicula peli : modelo.getConsultasBBDD().consultaPeliculas()) {
			if(peli.getGenero().equalsIgnoreCase(this.panelEditar.getComboBoxGenero().getSelectedItem().toString())) //si el género es el que recoje del cb
				this.panelEditar.getComboBoxNombre().addItem(peli.getNombre());
		}
		
		if(this.panelEditar.getComboBoxGenero().getItemCount() > 0) {
			int i = this.panelEditar.getComboBoxGenero().getSelectedIndex();
			if(this.panelEditar.getCbCambiarGenero().getItemCount() > 0)
				this.panelEditar.getCbCambiarGenero().setSelectedIndex(i);
		}
		
	}

	public void mostrarPanelEditar() {
		this.panelEditar = new PanelEditar(this);
		this.getVista().mostrarPanel(this.panelEditar);
		//getModelo().getConsultasBBDD().consultaPeliculas();

		String[] generos= {"Drama", "Comedia", "Terror", "Sci-fi"};
		for(String genero : generos) {
			this.panelEditar.getComboBoxGenero().addItem(genero);
			this.panelEditar.getCbCambiarGenero().addItem(genero);
		}
		

		
	}

	public void cambiarPelicula() {
		if(this.panelEditar.getComboBoxNombre().getItemCount() == 0)
			return;
		
		String nombrepeli = this.panelEditar.getComboBoxNombre().getSelectedItem().toString();
		this.panelEditar.getJtfTitulo().setText(nombrepeli);
		
		for(Pelicula peli : this.modelo.getConsultasBBDD().getPeliculas_totales())
			if(peli.getNombre().equals(nombrepeli)) {
				this.panelEditar.getTfDuracion().setText(String.valueOf(peli.getDuracion()/60));
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
		
		int duracion = modelo.getConsultasBBDD().getDuracionEditar(titulo);
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
		this.getControlador().navegarPanelGeneros();
	}
	public void accionadoBotonCancelarPanelEditar() {
		this.getControlador().navegarPanelGeneros();
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

	public Vista getVista() {
		return vista;
	}

	public void setVista(Vista vista) {
		this.vista = vista;
	}

	public Controlador getControlador() {
		return controlador;
	}

	public void setControlador(Controlador controlador) {
		this.controlador = controlador;
	}

	public PanelEditar makePanelEdicion(ControladorEditar controlador) {
		return new PanelEditar(controlador);
	}
} 