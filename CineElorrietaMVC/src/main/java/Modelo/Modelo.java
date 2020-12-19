package Modelo;

import java.util.ArrayList;
import java.util.Arrays;


public class Modelo {
	
	private ConsultasBBDD consultasBBDD;
	
	private Pelicula[] carteleraSabado;
	private Pelicula [] carteleraDomingo;
	private Pelicula[] carteleraTotal;
	
	private final int TIEMPO_TOTAL_SABADO=28800; 	
	private final int TIEMPO_TOTAL_DOMINGO=21600; 
	
	private int disponibleSabado = TIEMPO_TOTAL_SABADO;
	private int disponibleDomingo = TIEMPO_TOTAL_DOMINGO;
	
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
	}
