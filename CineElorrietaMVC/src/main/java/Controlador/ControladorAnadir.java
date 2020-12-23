package Controlador;

import java.util.Arrays;

import javax.swing.JComboBox;

import Modelo.Modelo;
import Modelo.Pelicula;
import Modelo.*;
import Vista.PanelAnadir;
import Vista.Vista;

public class ControladorAnadir {

	private Modelo modelo;
	private Vista vista;
	private Controlador controlador;
	private PanelAnadir panelAnadir;
	
	public ControladorAnadir(Modelo modelo, Vista vista, Controlador controlador) {
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
		int tiempo = (Integer.parseInt(this.panelAnadir.getJtf_duracion().getText()))*60;
		Pelicula addedPeli = new Pelicula(titulo, genero, tiempo);

	
		
		System.out.println("Se ha añadido la nueva peli: "+addedPeli.getNombre());
		for(Pelicula peli : this.modelo.getConsultasBBDD().getPeliculas_totales())
			System.out.println(peli.getNombre()+" - ");
			//System.out.println(this.modelo.getConsultasBBDD().getPelicula(18).getNombre());

		//System.out.println(this.modelo.getConsultasBBDD().getPelicula(47).getCodigo());
		this.controlador.navegarPanelGeneros();
	}
	public void accionadoBotonCancelarPanelAnadir() {
		this.controlador.navegarPanelGeneros();
	}


	public PanelAnadir makePanelEditar(ControladorAnadir controlador) {
		return new PanelAnadir(controlador);
		
	}
}
