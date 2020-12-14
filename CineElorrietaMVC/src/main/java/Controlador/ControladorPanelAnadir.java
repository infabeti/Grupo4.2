package Controlador;


import Modelo.Modelo;
import Modelo.Pelicula;
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
	
	
	public void mostrarPanelAnadir() {
		this.panelAnadir = new PanelAnadir(this);
		this.vista.mostrarPanel(this.panelAnadir);
		
		System.out.println("estoy en controlador añadir");
		
		String[] generos= {"Drama", "Comedia", "Terror", "Sci-fi"};
		for(String genero : generos)
			this.panelAnadir.getComboBoxGenero().addItem(genero);
		
		
	}
	
	public void accionadoBotonAceptarPanelAnadir() {
		String titulo = this.panelAnadir.getJtf_titulo().getText();
		String genero = this.panelAnadir.getComboBoxGenero().getSelectedItem().toString();

		this.modelo.pushObject(modelo.getConsultasBBDD().getPeliculas_totales(), new Pelicula(titulo, genero, 0));
		
		this.controlador.navegarPanelResumen();
	}
	public void accionadoBotonCancelarPanelAnadir() {
		this.controlador.navegarPanelResumen();
	}
}
