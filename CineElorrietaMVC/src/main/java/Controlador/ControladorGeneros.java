package Controlador;

import java.util.ArrayList;

import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import Modelo.*;
import Vista.PanelGeneros;
import Vista.Vista;

public class ControladorGeneros {

	private Modelo modelo;
	private Vista vista;
	private Controlador controlador;
	private PanelGeneros panelGeneros;
	
	public ControladorGeneros(Modelo modelo, Vista vista, Controlador controlador) {
		this.setModelo(modelo);
		this.vista = vista;
		this.controlador = controlador;	
	}
	
	
	@SuppressWarnings("unchecked")
	public void mostrarPanelGeneros() {
		this.panelGeneros = new PanelGeneros(this);
		this.vista.mostrarPanel(this.panelGeneros);
		getModelo().getConsultasBBDD().consultaPeliculas();
		
//		// TEXTFIELDS
		for(Pelicula peli : modelo.getCarteleraSabado()) {
			panelGeneros.textAreaSabado.setText(panelGeneros.textAreaSabado.getText()+"\n"+peli.getGenero()+" - "+peli.getNombre());
		}
		for(Pelicula peli : modelo.getCarteleraDomingo()) {
			panelGeneros.textAreaDomingo.setText(panelGeneros.textAreaDomingo.getText()+"\n"+peli.getGenero()+" - "+peli.getNombre());
		}
		
		//System.out.println(modelo.getConsultasBBDD().consultaPeliculas().length);
			// Añadir pelis drama
			for(Pelicula peli : getModelo().getConsultasBBDD().consultaPeliculas("drama")) {
				this.panelGeneros.comboBoxDrama.addItem(peli.getNombre());
			}
			// Añadir pelis comedia
			for(Pelicula peli : getModelo().getConsultasBBDD().consultaPeliculas("comedia")) {
				this.panelGeneros.comboBoxComedia.addItem(peli.getNombre());
			}
			// Añadir pelis terror
			for(Pelicula peli : getModelo().getConsultasBBDD().consultaPeliculas("terror")) {
				this.panelGeneros.comboBoxTerror.addItem(peli.getNombre());
			}
			// Añadir pelis sci-fi
			for(Pelicula peli : getModelo().getConsultasBBDD().consultaPeliculas("sci-fi")) {
				this.panelGeneros.comboBoxCienciaFiccion.addItem(peli.getNombre());
			}
	}
	
	public void addPelicula(JComboBox source) {
		Pelicula added_peli = getModelo().getConsultasBBDD().getPelicula_toAdd(source.getSelectedItem().toString()); // recoge la peli conociendo su nombre

//		this.panelGeneros.textAreaSabado.setText(this.panelGeneros.textAreaSabado.getText()+source.getSelectedItem().toString()+"\n");
		////////////////////////////////////////////////////////
		panelGeneros.lb_seleccione_otro_genero.setVisible(false);
		panelGeneros.lb_genero_repetido.setVisible(false); //Las inicializamos a false y ya se mostrarán si se repite el género
		
		//Manejando el Array
				if(!(getModelo().getCarteleraTotal().length == 0)) {
						if(modelo.getTiempoDisponibleSabado()>=added_peli.getDuracion()) { // SI LA PELÍCULA CABE EN EL SÁBADO
							boolean genero_sabado_repetido = false;							
							for(Pelicula peli : getModelo().getCarteleraSabado()) { // SI NO SE REPITE EL GÉNERO
								
								
								if(peli.getGenero().equals(added_peli.getGenero())) {
									
									

									genero_sabado_repetido = true;
									////////////////////////////////////////////////////////7
									panelGeneros.lb_genero_repetido.setVisible(true);
									panelGeneros.lb_seleccione_otro_genero.setVisible(true);
								}
							}
							
							if(!genero_sabado_repetido) {
								addingPeli(added_peli, "sabado");
							}
							
						}
						else {
							if(getModelo().getTiempoDisponibleDomingo()>=added_peli.getDuracion()) { // SI LA PELÍCULA CABE EN EL DOMINGO
								boolean genero_domingo_repetido = false;
								for(Pelicula peli : getModelo().getCarteleraDomingo()) { // SI NO SE REPITE EL GÉNERO
									if(peli.getGenero().equals(added_peli.getGenero())) {
										genero_domingo_repetido = true;
										////////////////////////////////////////////////////////7
										panelGeneros.lb_genero_repetido.setVisible(true);
										panelGeneros.lb_seleccione_otro_genero.setVisible(true);
									}
								}
								if(!genero_domingo_repetido) 
									addingPeli(added_peli, "domingo");
								}

						}
					
						/////////////////////////////////////////////////////////////////////////
						getModelo().setCarteleraTotal((Pelicula[]) getModelo().pushObject(getModelo().getCarteleraTotal(), added_peli));
						
				}
				else {
					addingPeli(added_peli, "sabado");
					getModelo().setCarteleraTotal((Pelicula[]) getModelo().pushObject(getModelo().getCarteleraTotal(), added_peli));
				}

			}
	public void addingPeli(Pelicula added_peli, String dia) {
		//Calculando tiempo restante
		getModelo().calcularDisponible(added_peli, dia);
		int tiempo_restante;
		String pelis_seleccionadas, str_tiempo_restante;
		JTextField tiempoDia;
		JTextArea programacion;
		Pelicula[] lista_dia;
		
		if(dia.equalsIgnoreCase("sabado")) {
			tiempo_restante = modelo.getTiempoDisponibleSabado();
			pelis_seleccionadas = panelGeneros.textAreaSabado.getText();
			tiempoDia = panelGeneros.tiempoSabado;
			programacion = panelGeneros.textAreaSabado;
			lista_dia = modelo.getCarteleraSabado();
			if (lista_dia.length == 0)
				modelo.setCarteleraSabado((Pelicula[]) modelo.pushObject(new Pelicula[0], added_peli));
			else
				modelo.setCarteleraSabado((Pelicula[]) modelo.pushObject(modelo.getCarteleraSabado(), added_peli));
		}
		else {
			tiempo_restante = getModelo().getTiempoDisponibleDomingo();
			pelis_seleccionadas = panelGeneros.textAreaDomingo.getText();
			tiempoDia = panelGeneros.tiempoDomingo;
			programacion = panelGeneros.textAreaDomingo;
			lista_dia = getModelo().getCarteleraDomingo();
			if (lista_dia.length == 0)
				modelo.setCarteleraDomingo((Pelicula[]) modelo.pushObject(new Pelicula[0], added_peli));
			else
				modelo.setCarteleraDomingo((Pelicula[]) modelo.pushObject(modelo.getCarteleraDomingo(), added_peli));

		}
		//Escribiendo
		str_tiempo_restante = getModelo().secsToHours(tiempo_restante);
		tiempoDia.setText(str_tiempo_restante);  //tiempoDia.getText(str_Tiempo_restante)
		programacion.setText(pelis_seleccionadas+added_peli.getGenero()+": "+added_peli.getNombre()+"\n");

	}
	
	public void accionadoBotonSiguientePanelGeneros() {
		this.controlador.navegarPanelResumen();
	}
	public void accionadoBotonVolverPanelGeneros() {
		limpiarLista("sabado");
		limpiarLista("domingo");
		this.controlador.navegarPanelBienvenida();
		
	}
	
	/*MÉTODOS REFERIDOS A LOS BOTONES PARA MOSTRAR SÓLO LOS ELEMENTOS DE CADA GÉNERO*/
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

	
	/*MÉTODO QUE LIMPIA LAS LISTAS*/
	public void limpiarLista(String dia) {
		if(dia.equalsIgnoreCase("sabado")) {
			modelo.setCarteleraSabado(new Pelicula[0]);
			modelo.setCarteleraTotal(new Pelicula[0]);
			modelo.setCarteleraTotal(modelo.getCarteleraDomingo());
			panelGeneros.textAreaSabado.setText("");
			modelo.setTiempoDisponibleSabado(modelo.getTIEMPO_TOTAL_SABADO());
			panelGeneros.tiempoSabado.setText(getModelo().secsToHours(modelo.getTIEMPO_TOTAL_SABADO()));
		}
		
		if(dia.equalsIgnoreCase("domingo")) {
			modelo.setCarteleraDomingo(new Pelicula[0]);
			modelo.setCarteleraTotal(new Pelicula[0]);
			modelo.setCarteleraTotal(modelo.getCarteleraSabado());
			panelGeneros.textAreaDomingo.setText("");
			modelo.setTiempoDisponibleDomingo(modelo.getTIEMPO_TOTAL_DOMINGO());
			panelGeneros.tiempoDomingo.setText(getModelo().secsToHours(modelo.getTIEMPO_TOTAL_DOMINGO()));
		}
	}
	

	

	
    public void changeButtonStatus(boolean flag) {
    	panelGeneros.btnEdicion.setEnabled(flag);
    	panelGeneros.btnEdicion.setVisible(flag);
    }

	public Modelo getModelo() {
		return modelo;
	}

	public void setModelo(Modelo modelo) {
		this.modelo = modelo;
	}
	
	
}
