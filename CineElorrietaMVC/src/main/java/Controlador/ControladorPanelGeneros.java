package Controlador;

import javax.swing.JComboBox;

import Modelo.*;
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
	
	@SuppressWarnings("unchecked")
	public void mostrarPanelGeneros() {
		this.panelGeneros = new PanelGeneros(this);
		this.vista.mostrarPanel(this.panelGeneros);
		
		System.out.println("generosss");
		
		System.out.println(modelo.getConsultasBBDD().consultaPeliculas().length);
		// Añadir pelis drama
		for(Pelicula peli : modelo.getConsultasBBDD().consultaPeliculas("drama")) {
			this.panelGeneros.comboBoxDrama.addItem(peli.getNombre());
		}
		// Añadir pelis comedia
		for(Pelicula peli : modelo.getConsultasBBDD().consultaPeliculas("comedia")) {
			this.panelGeneros.comboBoxComedia.addItem(peli.getNombre());
		}
		// Añadir pelis sci-fi
		for(Pelicula peli : modelo.getConsultasBBDD().consultaPeliculas("sci-fi")) {
			this.panelGeneros.comboBoxCienciaFiccion.addItem(peli.getNombre());
		}
		// Añadir pelis terror
		for(Pelicula peli : modelo.getConsultasBBDD().consultaPeliculas("terror")) {
			this.panelGeneros.comboBoxTerror.addItem(peli.getNombre());
		}
	}
	
	public void addPelicula(JComboBox source) {
		System.out.println(source.getSelectedItem().toString());
		this.panelGeneros.textAreaSabado.setText(this.panelGeneros.textAreaSabado.getText()+source.getSelectedItem().toString()+"\n");
		
	}
	
	public void accionadoBotonSiguientePanelGeneros() {
		this.controlador.navegarPanelPeliculas();
	}
	public void accionadoBotonVolverPanelGeneros() {
		this.controlador.navegarPanelBienvenida();
	}
}
