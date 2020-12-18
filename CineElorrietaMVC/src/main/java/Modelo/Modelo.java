package Modelo;

import java.util.ArrayList;
import java.util.Arrays;


public class Modelo {
	
	private ConsultasBBDD consultasBBDD;
	
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
	
	//PUSH INT para crear arrays de objetos
		public static int[] pushInt(int[] array, int push) {
			int[] longer = Arrays.copyOf(array, array.length + 1);
		    longer[longer.length - 1] = push;
		    return longer;
		}
		
	//POP OBJ PARA BORRAR UN OBJETO DE UN ARRAY
		public static void removeObjElement(Object[] arr, int removedIdx) {
			System.arraycopy(arr, removedIdx + 1, arr, removedIdx, arr.length - 1 - removedIdx);
		}
	}
