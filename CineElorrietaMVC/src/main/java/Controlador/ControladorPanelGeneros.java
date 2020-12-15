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
			// Añadir pelis terror
			for(Pelicula peli : modelo.getConsultasBBDD().consultaPeliculas("terror")) {
				this.panelGeneros.comboBoxTerror.addItem(peli.getNombre());
			}
			// Añadir pelis sci-fi
			for(Pelicula peli : modelo.getConsultasBBDD().consultaPeliculas("sci-fi")) {
				this.panelGeneros.comboBoxCienciaFiccion.addItem(peli.getNombre());
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

	public void accionadoBotonDramaPanelGeneros() {
		this.panelGeneros.comboBoxDrama.setEnabled(true);
		this.panelGeneros.comboBoxDrama.setVisible(true);
		this.panelGeneros.btnAnadirDrama.setEnabled(true);
		this.panelGeneros.btnAnadirDrama.setVisible(true);
		///////////////////////////////////////////////////
		this.panelGeneros.comboBoxComedia.setEnabled(false);
		this.panelGeneros.comboBoxComedia.setVisible(false);
		this.panelGeneros.btnAnadirComedia.setEnabled(false);
		this.panelGeneros.btnAnadirComedia.setVisible(false);
		
		this.panelGeneros.comboBoxTerror.setEnabled(false);
		this.panelGeneros.comboBoxTerror.setVisible(false);
		this.panelGeneros.btnAnadirTerror.setEnabled(false);
		this.panelGeneros.btnAnadirTerror.setVisible(false);
		
		this.panelGeneros.comboBoxCienciaFiccion.setEnabled(false);
		this.panelGeneros.comboBoxCienciaFiccion.setVisible(false);
		this.panelGeneros.btnAnadirCienciaFiccion.setEnabled(false);
		this.panelGeneros.btnAnadirCienciaFiccion.setVisible(false);
	}

	public void accionadoBotonComediaPanelGeneros() {
		this.panelGeneros.comboBoxComedia.setEnabled(true);
		this.panelGeneros.comboBoxComedia.setVisible(true);
		this.panelGeneros.btnAnadirComedia.setEnabled(true);
		this.panelGeneros.btnAnadirComedia.setVisible(true);
		///////////////////////////////////////////////////
		this.panelGeneros.comboBoxDrama.setEnabled(false);
		this.panelGeneros.comboBoxDrama.setVisible(false);
		this.panelGeneros.btnAnadirDrama.setEnabled(false);
		this.panelGeneros.btnAnadirDrama.setVisible(false);
		
		this.panelGeneros.comboBoxTerror.setEnabled(false);
		this.panelGeneros.comboBoxTerror.setVisible(false);
		this.panelGeneros.btnAnadirTerror.setEnabled(false);
		this.panelGeneros.btnAnadirTerror.setVisible(false);
		
		this.panelGeneros.comboBoxCienciaFiccion.setEnabled(false);
		this.panelGeneros.comboBoxCienciaFiccion.setVisible(false);
		this.panelGeneros.btnAnadirCienciaFiccion.setEnabled(false);
		this.panelGeneros.btnAnadirCienciaFiccion.setVisible(false);
	}

	public void accionadoBotonTerrorPanelGeneros() {
		this.panelGeneros.comboBoxTerror.setEnabled(true);
		this.panelGeneros.comboBoxTerror.setVisible(true);
		this.panelGeneros.btnAnadirTerror.setEnabled(true);
		this.panelGeneros.btnAnadirTerror.setVisible(true);
		///////////////////////////////////////////////////
		this.panelGeneros.comboBoxDrama.setEnabled(false);
		this.panelGeneros.comboBoxDrama.setVisible(false);
		this.panelGeneros.btnAnadirDrama.setEnabled(false);
		this.panelGeneros.btnAnadirDrama.setVisible(false);
		
		this.panelGeneros.comboBoxComedia.setEnabled(false);
		this.panelGeneros.comboBoxComedia.setVisible(false);
		this.panelGeneros.btnAnadirComedia.setEnabled(false);
		this.panelGeneros.btnAnadirComedia.setVisible(false);
		
		this.panelGeneros.comboBoxCienciaFiccion.setEnabled(false);
		this.panelGeneros.comboBoxCienciaFiccion.setVisible(false);
		this.panelGeneros.btnAnadirCienciaFiccion.setEnabled(false);
		this.panelGeneros.btnAnadirCienciaFiccion.setVisible(false);
	}

	public void accionadoBotonCienciaFiccionPanelGeneros() {
		this.panelGeneros.comboBoxCienciaFiccion.setEnabled(true);
		this.panelGeneros.comboBoxCienciaFiccion.setVisible(true);
		this.panelGeneros.btnAnadirCienciaFiccion.setEnabled(true);
		this.panelGeneros.btnAnadirCienciaFiccion.setVisible(true);
		///////////////////////////////////////////////////
		this.panelGeneros.comboBoxDrama.setEnabled(false);
		this.panelGeneros.comboBoxDrama.setVisible(false);
		this.panelGeneros.btnAnadirDrama.setEnabled(false);
		this.panelGeneros.btnAnadirDrama.setVisible(false);
		
		this.panelGeneros.comboBoxComedia.setEnabled(false);
		this.panelGeneros.comboBoxComedia.setVisible(false);
		this.panelGeneros.btnAnadirComedia.setEnabled(false);
		this.panelGeneros.btnAnadirComedia.setVisible(false);
		
		this.panelGeneros.comboBoxTerror.setEnabled(false);
		this.panelGeneros.comboBoxTerror.setVisible(false);
		this.panelGeneros.btnAnadirTerror.setEnabled(false);
		this.panelGeneros.btnAnadirTerror.setVisible(false);
	}

}
