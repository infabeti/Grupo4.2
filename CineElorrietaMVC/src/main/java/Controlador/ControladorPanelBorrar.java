package Controlador;



import java.util.Arrays;

import Modelo.Modelo;
import Modelo.Pelicula;
import Vista.PanelBorrar;
import Vista.Vista;

public class ControladorPanelBorrar {

	private Modelo modelo;
	private Vista vista;
	private Controlador controlador;
	private PanelBorrar panelBorrar;
	
	public ControladorPanelBorrar(Modelo modelo, Vista vista, Controlador controlador) {
		this.modelo = modelo;
		this.vista = vista;
		this.controlador = controlador;	
	}
	
	public void mostrarPanelBorrar() {
		this.panelBorrar = new PanelBorrar(this);
		this.vista.mostrarPanel(this.panelBorrar);
		
		String[] generos= {"Drama", "Comedia", "Terror", "Sci-fi"};
		for(String genero : generos)
			this.panelBorrar.comboBoxGenero().addItem(genero);
		
	}
	public void cambiarGenero() {
		this.panelBorrar.getComboBoxTitulo().setEnabled(true);
		this.panelBorrar.getComboBoxTitulo().removeAllItems();
		System.out.println("cambiando de género");
		for(Pelicula peli : modelo.getConsultasBBDD().consultaPeliculas()) {
			if(peli.getGenero().equalsIgnoreCase(this.panelBorrar.comboBoxGenero().getSelectedItem().toString()))
				this.panelBorrar.getComboBoxTitulo().addItem(peli.getNombre());
		}
	
	}
	
	public void accionadoBotonAceptarPanelBorrar() {
		
		Object[] ar = {1,2,3};

		modelo.removeObjElement(ar, 1);
		
		System.out.println(Arrays.toString(ar));
		
		this.controlador.navegarPanelResumen();
	}
	public void accionadoBotonCancelarPanelBorrar() {
		this.controlador.navegarPanelResumen();
	}
}