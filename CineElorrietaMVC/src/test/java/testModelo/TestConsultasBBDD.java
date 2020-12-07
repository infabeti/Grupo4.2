package testModelo;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;
import org.junit.Test;

import App.Main;
import Modelo.ConsultasBBDD;
import Modelo.Modelo;
import Modelo.Pelicula;
import Modelo.Usuario;

public class TestConsultasBBDD {

	private ConsultasBBDD consultas = new ConsultasBBDD();

	///////////////////////////////////////////////////////////////////////////////////////////
	//PELICULAS
	//////////////////////////////////////////////////////////////////////////////////////////
	//Películas totales
	private Pelicula[] peliculas_totales;
	
	//Drama
	private Pelicula handia,lista_Schindler, cadena_perpetua, mdb;
	private Pelicula[] pelis_Drama;

	//Sci-Fi
	private Pelicula space_odyssey,novia_Frankenstein, planeta_simios, alien;
	private Pelicula[] pelis_Sci_Fi;

	//Comedia
	private Pelicula scary_movie,gran_lebowski, vida_brian, aterriza_como_puedas;
	private Pelicula[] pelis_Comedia;

	//Terror
	private Pelicula psicosis,el_resplandor, dracula, cisne_negro;
	private Pelicula[] pelis_Terror;

	///////////////////////////////////////////////////
	//USUARIOS
	private Usuario[] lista_usuarios = new Usuario[0];
	
	
	// SE DEBEN TESTEAR GETTERS Y SETTERS?
	@Test
	public void testGetPelicula() {
		Pelicula peli = mock(Pelicula.class);
		Pelicula.consulta = consultas; // la consulta que utiliza en el constructor de Pelicula para añadirla a la lista de pelis totales

//		handia = new Pelicula(null, null, 0, 0);
		peli = mock(Pelicula.class);

		consultas.setPeliculas_totales((Pelicula[]) Modelo.pushObject(consultas.getPeliculas_totales(), peli));
		
		assertEquals("Testeando consultaPeli", peli, consultas.getPelicula(peli.getCodigo()));

	}

}
