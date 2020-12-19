package Controlador;

import java.util.ArrayList;

import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JTextArea;
import javax.swing.JTextField;

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
	public static final int TIEMPO_TOTAL_SABADO=28800; 	//te cambio el nombre porque las constantes se suelen poner en mayúscula, luego para verlo es útil :)
	public static final int TIEMPO_TOTAL_DOMINGO=21600; //te cambio el nombre porque las constantes se suelen poner en mayúscula, luego para verlo es útil :)
	public static ArrayList<Pelicula> totales_seleccionadas = new ArrayList<Pelicula>();
	public static ArrayList<Pelicula> sabado_seleccionadas = new ArrayList<Pelicula>();
	public static ArrayList<Pelicula> domingo_seleccionadas = new ArrayList<Pelicula>();
	private static int disponible_sabado = TIEMPO_TOTAL_SABADO;  	//Se inicializa con su máximo valor
	private static int disponible_domingo = TIEMPO_TOTAL_DOMINGO;	//Se inicializa con su máximo valor
	
	@SuppressWarnings("unchecked")
	public void mostrarPanelGeneros() {
		this.panelGeneros = new PanelGeneros(this);
		this.vista.mostrarPanel(this.panelGeneros);
		
		modelo.getConsultasBBDD().consultaPeliculas();
		
		System.out.println("generosss");
		
		//System.out.println(modelo.getConsultasBBDD().consultaPeliculas().length);
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
		Pelicula added_peli = modelo.getConsultasBBDD().getPelicula_toAdd(source.getSelectedItem().toString());
		System.out.println(source.getSelectedItem().toString());

//		this.panelGeneros.textAreaSabado.setText(this.panelGeneros.textAreaSabado.getText()+source.getSelectedItem().toString()+"\n");
		////////////////////////////////////////////////////////
		PanelGeneros.lb_seleccione_otro_genero.setVisible(false);
		PanelGeneros.lb_genero_repetido.setVisible(false); //Las inicializamos a false y ya se mostrarán si se repite el género
		
		//Manejando el Array
				if(!ControladorPanelGeneros.totales_seleccionadas.isEmpty()) {
						if(ControladorPanelGeneros.getDisponible_sabado()>=added_peli.getDuracion()) { // SI LA PELÍCULA CABE EN EL SÁBADO
							genero_sabado_repetido = false;
							for(Pelicula peli : ControladorPanelGeneros.sabado_seleccionadas) { // SI NO SE REPITE EL GÉNERO

								if(peli.getGenero().equals(added_peli.getGenero())) {
									genero_sabado_repetido = true;
									////////////////////////////////////////////////////////7
									PanelGeneros.lb_genero_repetido.setVisible(true);
									PanelGeneros.lb_seleccione_otro_genero.setVisible(true);
								}
							}
							
							if(!genero_sabado_repetido) {
								addingPeli(added_peli,"sabado");
							}
							
						}
						else {
							if(ControladorPanelGeneros.getDisponible_domingo()>=added_peli.getDuracion()) { // SI LA PELÍCULA CABE EN EL DOMINGO
								genero_domingo_repetido = false;
								for(Pelicula peli : ControladorPanelGeneros.domingo_seleccionadas) { // SI NO SE REPITE EL GÉNERO
									if(peli.getGenero().equals(added_peli.getGenero())) {
										genero_domingo_repetido = true;
										////////////////////////////////////////////////////////7
										PanelGeneros.lb_genero_repetido.setVisible(true);
										PanelGeneros.lb_seleccione_otro_genero.setVisible(true);
									}
								}
								if(!genero_domingo_repetido) 
									addingPeli(added_peli,"domingo");
							}

						}
					
						/////////////////////////////////////////////////////////////////////////
						ControladorPanelGeneros.totales_seleccionadas.add(added_peli);
						
				}
				else {
					addingPeli(added_peli,"sabado");
					ControladorPanelGeneros.totales_seleccionadas.add(added_peli);		
				}

			}
	public static void addingPeli(Pelicula added_peli, String dia) {
		//Calculando tiempo restante
		ControladorPanelGeneros.calcularDisponible(added_peli, dia);
		int tiempo_restante;
		String pelis_seleccionadas, str_tiempo_restante;
		JTextField tiempoDia;
		JTextArea programacion;
		ArrayList<Pelicula> lista_dia;
		
		if(dia.equalsIgnoreCase("sabado")) {
			tiempo_restante = ControladorPanelGeneros.getDisponible_sabado();
			pelis_seleccionadas = PanelGeneros.textAreaSabado.getText();
			tiempoDia = PanelGeneros.tiempoSabado;
			programacion = PanelGeneros.textAreaSabado;
			lista_dia = ControladorPanelGeneros.sabado_seleccionadas;
		}
		else {
			tiempo_restante = ControladorPanelGeneros.getDisponible_domingo();
			pelis_seleccionadas = PanelGeneros.textAreaDomingo.getText();
			tiempoDia = PanelGeneros.tiempoDomingo;
			programacion = PanelGeneros.textAreaDomingo;
			lista_dia = ControladorPanelGeneros.domingo_seleccionadas;
		}
		//Escribiendo
		str_tiempo_restante = secsToHours(tiempo_restante);
		tiempoDia.setText(str_tiempo_restante);  //tiempoDia.getText(str_Tiempo_restante)
		programacion.setText(pelis_seleccionadas+added_peli.getGenero()+": "+added_peli.getNombre()+"\n");
		lista_dia.add(added_peli);

	}
	
	public void accionadoBotonSiguientePanelGeneros() {
		this.controlador.navegarPanelResumen();
	}
	public void accionadoBotonVolverPanelGeneros() {
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
	
	/*MÉTODOS REFERIDOS AL TIEMPO*/
	public static void calcularDisponible(Pelicula pelicula, String dia) {
		if(dia.equalsIgnoreCase("sabado")) {
			setDisponible_sabado((disponible_sabado-pelicula.getDuracion()));
			}
		else if (dia.equalsIgnoreCase("domingo")) {
			setDisponible_domingo((disponible_domingo-pelicula.getDuracion()));
			}
	}
	
	public static int getDisponible_sabado() {
		return disponible_sabado;
	}
	
	public static void setDisponible_sabado(int disponible_sabado) {
		ControladorPanelGeneros.disponible_sabado = disponible_sabado;
	}
	
	public static int getDisponible_domingo() {
		return disponible_domingo;
	}

	public static void setDisponible_domingo(int disponible_domingo) {
		ControladorPanelGeneros.disponible_domingo = disponible_domingo;
	}
	
	/*MÉTODO QUE LIMPIA LAS LISTAS*/
	public static void limpiarLista(String dia) {
		if(dia.equalsIgnoreCase("sabado")) {
			sabado_seleccionadas.clear();
			totales_seleccionadas.clear();
			totales_seleccionadas.addAll(domingo_seleccionadas);
			PanelGeneros.textAreaSabado.setText("");
			disponible_sabado=TIEMPO_TOTAL_SABADO;
			PanelGeneros.tiempoSabado.setText(ControladorPanelGeneros.secsToHours(TIEMPO_TOTAL_SABADO));
		}
		
		if(dia.equalsIgnoreCase("domingo")) {
			domingo_seleccionadas.clear();
			totales_seleccionadas.clear();
			totales_seleccionadas.addAll(sabado_seleccionadas);
			PanelGeneros.textAreaDomingo.setText("");
			disponible_domingo=TIEMPO_TOTAL_DOMINGO;
			PanelGeneros.tiempoDomingo.setText(ControladorPanelGeneros.secsToHours(TIEMPO_TOTAL_DOMINGO));
		}
	}
	
	/*MÉTODO QUE PASA LOS SEGUNDOS A HORAS*/
	public static String secsToHours(int segundos){
		int horas = (int) Math.floor(segundos/3600);
		int parte_entera = (int)segundos/3600;
		//Utilizando el teorema del resto:
		int minutos = (int) Math.round((((segundos/3600d)-parte_entera)*60));
		return horas+" horas, "+minutos+" minutos.";
	}
	
	/*MÉTODOS REFERIDOS A LAS PELÍCULAS*/
	public static boolean genero_sabado_repetido;
	public static boolean genero_domingo_repetido; //Saco estas variables puesto que necesito que sean de alcance público para evaluarlas
	
    public static void changeButtonStatus(boolean flag) {
    	PanelGeneros.btnEdicion.setEnabled(flag);
    	PanelGeneros.btnEdicion.setVisible(flag);
    }
	
	
}
