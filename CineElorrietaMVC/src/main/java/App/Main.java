package App;
import Controlador.Controlador;
import Modelo.*;
import Vista.Vista;

public class Main {
	
	private static Modelo modelo;
	private static Vista vista;
	@SuppressWarnings("unused")
	private static Controlador controlador;
	public static ConsultasBBDD consultasBBDD;
	
	public static void main(String[] args) {
		consultasBBDD = new ConsultasBBDD();
		
		modelo = new Modelo(consultasBBDD);    
		vista = new Vista();
                
		controlador = new Controlador(modelo, vista);
	}

}
