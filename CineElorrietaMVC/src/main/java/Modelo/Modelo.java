package Modelo;

import java.util.ArrayList;
import java.util.Arrays;


public class Modelo {
	
	private ConsultasBBDD consultasBBDD;
	
	private Pelicula[] carteleraSabado = new Pelicula[0];
	private Pelicula [] carteleraDomingo = new Pelicula[0];
	private Pelicula[] carteleraTotal = new Pelicula[0];
	
	private final int TIEMPO_TOTAL_SABADO=28800; 	
	private final int TIEMPO_TOTAL_DOMINGO=21600; 
	
	public int tiempoDisponibleSabado = getTIEMPO_TOTAL_SABADO();
	public int tiempoDisponibleDomingo = getTIEMPO_TOTAL_DOMINGO();
	
	public Modelo(ConsultasBBDD consultasBBDD) {
		this.setConsultasBBDD(consultasBBDD);
	}
	
	public ConsultasBBDD getConsultasBBDD() {
		return this.consultasBBDD;
	}
	
	public void setConsultasBBDD(ConsultasBBDD consultasBBDD) {
		this.consultasBBDD = consultasBBDD;
	}
	
	
	//PUSH OBJECT para crear arrays de objetos
	public static Object[] pushObject(Object[] array, Object push) {
		Object[] longer = Arrays.copyOf(array, array.length + 1);
	    longer[longer.length - 1] = push;
	    return longer;
	}
	
	//PUSH ARRAY OBJECT
	public static Object[] pushAllObjects(Object[] array, Object[] push) {
		Object[] longer = Arrays.copyOf(array, array.length + push.length);
	    
	    int cont = 0;
	    for(Object x : push) {
		    longer[array.length + cont] = x;
		    
		    cont++;
	    }
			
	    return longer;
	}
	
	// CARTELERA
	
	
	//PUSH INT para crear arrays de objetos
		public static int[] pushInt(int[] array, int push) {
			int[] longer = Arrays.copyOf(array, array.length + 1);
		    longer[longer.length - 1] = push;
		    return longer;
		}
		
	//POP OBJ PARA BORRAR UN OBJETO DE UN ARRAY
		public static Pelicula[] removePeliElement(Pelicula[] arr, int index) {
			Pelicula[] arr_new = new Pelicula[arr.length-1];
			int j=index;
	        for(int i=0, k=0;i<arr.length;i++){
	            if(i!=j){
	                arr_new[k]=arr[i];
	                k++;
	            }
	        }
	        
	        return arr_new;
		}
		
		/*MÉTODOS REFERIDOS AL TIEMPO*/
		public void calcularDisponible(Pelicula pelicula, String dia) {
			if(dia.equalsIgnoreCase("sabado")) {
				setTiempoDisponibleSabado((tiempoDisponibleSabado-pelicula.getDuracion()));
				}
			else if (dia.equalsIgnoreCase("domingo")) {
				setTiempoDisponibleDomingo((tiempoDisponibleDomingo-pelicula.getDuracion()));
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

		public Pelicula[] getCarteleraTotal() {
			return carteleraTotal;
		}

		public void setCarteleraTotal(Pelicula[] carteleraTotal) {
			this.carteleraTotal = carteleraTotal;
		}

		public int getTiempoDisponibleSabado() {
			return tiempoDisponibleSabado;
		}

		public void setTiempoDisponibleSabado(int tiempoDisponibleSabado) {
			this.tiempoDisponibleSabado = tiempoDisponibleSabado;
		}

		public int getTiempoDisponibleDomingo() {
			return tiempoDisponibleDomingo;
		}

		public void setTiempoDisponibleDomingo(int tiempoDisponibleDomingo) {
			this.tiempoDisponibleDomingo = tiempoDisponibleDomingo;
		}

		public Pelicula[] getCarteleraSabado() {
			return carteleraSabado;
		}

		public void setCarteleraSabado(Pelicula[] carteleraSabado) {
			this.carteleraSabado = carteleraSabado;
		}

		public Pelicula [] getCarteleraDomingo() {
			return carteleraDomingo;
		}

		public void setCarteleraDomingo(Pelicula [] carteleraDomingo) {
			this.carteleraDomingo = carteleraDomingo;
		}

		public int getTIEMPO_TOTAL_SABADO() {
			return TIEMPO_TOTAL_SABADO;
		}

		public int getTIEMPO_TOTAL_DOMINGO() {
			return TIEMPO_TOTAL_DOMINGO;
		}
	}
