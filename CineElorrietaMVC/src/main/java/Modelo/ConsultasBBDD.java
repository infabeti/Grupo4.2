package Modelo;

import java.util.Arrays;

import App.Main;

public class ConsultasBBDD {
	
//	public static void main(String[]ar) {
////		App.Main.setModelo(new Modelo(App.Main.consultasBBDD)); // creando el modelo para simulacion
//		
//		App.Main.main(null); // simular main
////		System.out.println(App.Main.getModelo().getConsultasBBDD());
//		ConsultasBBDD consulta = Pelicula.consulta; // simular main, arreglar
//		
//		consulta.consultaPeliculas();
//		
//		System.out.println(consulta.peliculas_totales.length);
//		
//		for(Pelicula x : consulta.peliculas_totales){
//			System.out.println(x.getCodigo());
//		}
//	}
	
	///////////////////////////////////////////////////////////////////////////////////////////
	//PELICULAS
	//////////////////////////////////////////////////////////////////////////////////////////
	//Pel�culas totales
	private Pelicula[] peliculas_totales = new Pelicula[0];
	
	//spy hacer new y acceder a m�todos
	// reflection situaciones l�mites
	// instanciar array de pel�culas con un constructor / un setter para acceder a sus m�todos
	
	// ARRAY PELIS UNITARIAS
	
	
	//Drama
	private Pelicula handia,lista_Schindler, cadena_perpetua, mdb;
	private Pelicula[] pelis_Drama = new Pelicula[0];

	//Sci-Fi
	private Pelicula space_odyssey,novia_Frankenstein, planeta_simios, alien;
	private Pelicula[] pelis_Sci_Fi = new Pelicula[0];

	//Comedia
	private Pelicula scary_movie,gran_lebowski, vida_brian, aterriza_como_puedas;
	private Pelicula[] pelis_Comedia = new Pelicula[0];

	//Terror
	private Pelicula psicosis,el_resplandor, dracula, cisne_negro;
	private Pelicula[] pelis_Terror = new Pelicula[0];

	///////////////////////////////////////////////////
	//USUARIOS
	private Usuario[] lista_usuarios = new Usuario[0];
	
	
	public Pelicula getPelicula(int codepeli) {
		if(peliculas_totales.length == 0)
			consultaPeliculas();
		
		for(Pelicula x : peliculas_totales) {
			if(x.getCodigo() == codepeli) // SPY
				return x;
		}
		return null;
	}
	
	public Pelicula[] consultaPeliculas(String genero_in) {
		Pelicula[] pelis_genero = new Pelicula[0];
		
		if(peliculas_totales.length == 0)
			consultaPeliculas();
		
		for(Pelicula x : getPeliculas_totales()) {
			if(x.getGenero().equalsIgnoreCase(genero_in))
				pelis_genero = (Pelicula[]) Modelo.pushObject(pelis_genero, x);
		}
		
		return pelis_genero;
	}
	
	//FUNCION QUE RECIBE UN GENERO Y DEVUELVE UNA LISTA DE PELICULAS 
	public Pelicula[] consultaPeliculas() {
		//Pelicula[] reset = new Pelicula[0];
		//setPeliculas_totales(reset);
		
		//Drama
		handia = new Pelicula("Handia", "Drama", 1, 6960);
		
		lista_Schindler = new Pelicula("La lista de Schindler", "Drama", 2, 11820);
		
		cadena_perpetua = new Pelicula("Cadena Perpetua", "Drama", 3, 8520);
		
		mdb = new Pelicula("Million Dollar Baby", "Drama", 4, 7980);
		

		//Sci-Fi
		space_odyssey = new Pelicula("2001: Odisea en el espacio", "Sci-Fi",5,  8520);
		
		novia_Frankenstein = new Pelicula("La novia de Frankenstein", "Sci-Fi",6, 4500);
		
		planeta_simios = new Pelicula("El planeta de los simios", "Sci-Fi",7, 6900);
		
		alien = new Pelicula("Alien, el octavo pasajero", "Sci-Fi",8, 7020);
		
		//Comedia
		scary_movie = new Pelicula("Scary movie", "Comedia",9, 5400);
		
		gran_lebowski = new Pelicula("El gran Lebowsky", "Comedia",10, 7140);
		
		vida_brian = new Pelicula("La vida de Brian", "Comedia",11, 5640);
		
		aterriza_como_puedas = new Pelicula("Aterriza como puedas", "Comedia",12, 5280);
		setPelis_Comedia((Pelicula[]) Modelo.pushObject(getPelis_Comedia(), aterriza_como_puedas));
		
		//Terror
		psicosis = new Pelicula("Psicosis", "Terror",13, 6540);
		
		el_resplandor = new Pelicula("El resplandor", "Terror",14, 8760);
		
		dracula = new Pelicula("Dracula", "Terror",15, 9300);
		setPelis_Terror((Pelicula[]) Modelo.pushObject(getPelis_Terror(), dracula));
		
		cisne_negro = new Pelicula("Cisne negro", "Terror", 6600);
		
				
		System.out.println(peliculas_totales.length);
		return getPeliculas_totales();
	}
	

	public Pelicula[] getPelis_Drama() {
		return pelis_Drama;
	}

	public void setPelis_Drama(Pelicula[] pelis_Drama) {
		this.pelis_Drama = pelis_Drama;
	}

	public Pelicula[] getPelis_Terror() {
		return pelis_Terror;
	}

	public void setPelis_Terror(Pelicula[] pelis_Terror) {
		this.pelis_Terror = pelis_Terror;
	}

	public Pelicula[] getPelis_Comedia() {
		return pelis_Comedia;
	}

	public void setPelis_Comedia(Pelicula[] pelis_Comedia) {
		this.pelis_Comedia = pelis_Comedia;
	}

	public Pelicula[] getPelis_Sci_Fi() {
		return pelis_Sci_Fi;
	}

	public void setPelis_Sci_Fi(Pelicula[] pelis_Sci_Fi) {
		this.pelis_Sci_Fi = pelis_Sci_Fi;
	}

	public Pelicula[] getPeliculas_totales() {
		return peliculas_totales;
	}

	public void setPeliculas_totales(Pelicula[] peliculas_totales) {
		this.peliculas_totales = peliculas_totales;
	}
///////////////////////////////////////////////////////////////////////////////////////////
//USUARIOS
//////////////////////////////////////////////////////////////////////////////////////////
	static {
		System.out.println("bbdd");
	}
	public Usuario[] consulta_lista_usuarios(){
		System.out.println("lista_usuarios");
		Usuario[] reset = new Usuario[0];
		setLista_usuarios(reset);
		//Aqu� se crean los usuarios, de momento solo tend�amos el usuario admin
		Usuario admin = new Usuario("admin", "admin" ,true);
		Usuario user1 = new Usuario("user1", "12345", false);
		
		return getLista_usuarios();
	}

	public Usuario[] getLista_usuarios() {
		return lista_usuarios;
	}

	public void setLista_usuarios(Usuario[] lista_usuarios) {
		this.lista_usuarios = lista_usuarios;
	}
}