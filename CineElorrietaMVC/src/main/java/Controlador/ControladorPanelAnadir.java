package Controlador;

import javax.swing.JComboBox;

import Modelo.Modelo;
import Modelo.Pelicula;
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
		
		System.out.println("estoy en controlador añadir");
		
		String[] generos= {"Drama", "Comedia", "Terror", "Sci-fi"};
		for(String genero : generos)
			this.panelAnadir.getComboBoxGenero().addItem(genero);
		
		
		
	}
	
	@SuppressWarnings("static-access")
	public void accionadoBotonAceptarPanelAnadir() {
		String titulo = this.panelAnadir.getJtf_titulo().getText();
		String genero = this.panelAnadir.getComboBoxGenero().getSelectedItem().toString();
		
		Pelicula addedPeli = new Pelicula(titulo, genero, Integer.parseInt(this.panelAnadir.getJtf_codigo().getText()), 0);

		Pelicula[] addingNuevaPeli = (Pelicula[]) this.modelo.pushObject(modelo.getConsultasBBDD().getPeliculas_totales(), addedPeli);
		this.modelo.getConsultasBBDD().setPeliculas_totales(addingNuevaPeli);
		
		System.out.println("Se ha añadido la nueva peli: "+addedPeli.getNombre());
		//System.out.println(this.modelo.getConsultasBBDD().getPelicula(18).getNombre());

		System.out.println(this.modelo.getConsultasBBDD().getPelicula(47).getCodigo());
		this.controlador.navegarPanelResumen();
	}
	public void accionadoBotonCancelarPanelAnadir() {
		this.controlador.navegarPanelResumen();
	}
}
