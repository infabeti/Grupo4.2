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
	@SuppressWarnings("deprecation")
	@Test
	public void testConsultaPeli() {
		Pelicula peli = mock(Pelicula.class);
//		Pelicula pelireal = new Pelicula(null, null, 0,0);
		Pelicula.consulta = consultas; // la consulta que utiliza en el constructor de Pelicula para añadirla a la lista de pelis totales

		peli = mock(Pelicula.class);

		consultas.setPeliculas_totales((Pelicula[]) Modelo.pushObject(consultas.getPeliculas_totales(), peli));
		
		assertEquals ("null consultaPeli", null, consultas.getPelicula(peli.getCodigo()-1)); // Le introduzco un código que no existe
		
		
		when(peli.getCodigo()).thenReturn(0);

		
		assertEquals("mock consultaPeli", peli, consultas.getPelicula(0));

	}
	
	@Test
	public void testConsultaPeliculasGenero() {
		Pelicula[] pelisgenero = new Pelicula[4];
		
		handia = mock(Pelicula.class);
//		when(handia.getAttribute("genero")).thenReturn(null);

		
		lista_Schindler = mock(Pelicula.class);
		lista_Schindler.setGenero("drama");
		
		cadena_perpetua = mock(Pelicula.class);
		cadena_perpetua.setGenero("drama");

		mdb = mock(Pelicula.class);
		mdb.setGenero("drama");

		pelisgenero[0] = handia;
		pelisgenero[1] = lista_Schindler;
		pelisgenero[2] = cadena_perpetua;
		pelisgenero[3] = mdb;
		
		consultas.setPeliculas_totales((Pelicula[]) Modelo.pushAllObjects(consultas.getPeliculas_totales(), pelisgenero));
		
		System.out.println(consultas.getPeliculas_totales().length);
//		for(Pelicula x : pelisgenero)
//			System.out.println(x.getGenero());
//		
//		for(Pelicula x : consultas.getPeliculas_totales())
//			System.out.println(x.getGenero());
//		consultas = App.Main.consultasBBDD;

		assertArrayEquals("testconsultaPeliculasGenero", pelisgenero, consultas.consultaPeliculas("drama"));
		
	}
	
	@Test
	public void testCosultaUsuarios() {
		Usuario.consulta = consultas; // la consulta que utiliza en el constructor de Pelicula para añadirla a la lista de pelis totales

		Usuario[] lista_users = new Usuario[2];
		
		Usuario user1 = mock(Usuario.class);
		Usuario user2 = mock(Usuario.class);
		
		lista_users[0] = user1;
		lista_users[1] = user2;
		
		
		assertArrayEquals("mock consultaUsuarios", lista_users, consultas.consulta_lista_usuarios());

	}

}
