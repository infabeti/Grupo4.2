package Modelo;

import java.util.Arrays;

import App.Main;

public class ConsultasBBDD {
	//Objeto de esta busqueda

	//Películas totales
	private Pelicula[] peliculas_totales = new Pelicula[0];
	//Drama
	private Pelicula handia,lista_Schindler, cadena_perpetua, mdb;
	//Sci-Fi
	private Pelicula space_odyssey,novia_Frankenstein, planeta_simios, alien;
	//Comedia
	private Pelicula scary_movie,gran_lebowski, vida_brian, aterriza_como_puedas;
	//Terror
	private Pelicula psicosis,el_resplandor, dracula, cisne_negro;
	//Arrays de géneros
	private Pelicula[] pelis_Drama = new Pelicula[0];
	private Pelicula[] pelis_Sci_Fi = new Pelicula[0];
	private Pelicula[] pelis_Comedia = new Pelicula[0];
	private Pelicula[] pelis_Terror = new Pelicula[0];
	
	
	
	public Pelicula getPelicula(int codepeli) {		
		for(Pelicula x : consultaPeliculas()) {
			if(x.getCodigo() == codepeli)
				return x;
		}
		return null;
	}
	
	public Pelicula[] consultaPeliculas(String genero_in) {
		Pelicula[] pelis_genero = null;
		
		for(Pelicula x : consultaPeliculas()) {
			if(x.getGenero().equalsIgnoreCase(genero_in))
				pelis_genero = Pelicula.pushPelicula(pelis_genero, x);
		}
		
		return pelis_genero;
	}
	
	//FUNCION QUE RECIBE UN GENERO Y DEVUELVE UNA LISTA DE PELICULAS 
	public Pelicula[] consultaPeliculas() {
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

		
		//Terror
		psicosis = new Pelicula("Psicosis", "Terror",13, 6540);
		el_resplandor = new Pelicula("El resplandor", "Terror",14, 8760);
		dracula = new Pelicula("Dracula", "Terror",15, 9300);
		cisne_negro = new Pelicula("Cisne negro", "Terror", 6600);
		
		//Añadir pelis totales
		
		
		return getPeliculas_totales();
	}
	
//	public static void main(String[]ar) {
//		
//		ConsultasBBDD bbdd = Main.consultasBBDD;
//		bbdd = new ConsultasBBDD();
//		Pelicula[] pelis = bbdd.consultaPeliculas();
//		System.out.println("LONG "+bbdd.getPeliculas_totales().length);

//		System.out.println(Arrays.toString(bbdd.consultaPeliculas()));
//		for(Pelicula x : pelis)
//			System.out.println("a "+x.getCodigo()+": "+x.getGenero());
//		
//		Pelicula[] pelis1 = {bbdd.alien,bbdd.psicosis};
//		Pelicula peli = bbdd.dracula;
//		
//		pelis1 = pushPelicula(pelis1, peli);
//		for(Pelicula x : pelis1)
//			System.out.println("f "+x.getNombre());	
//	}

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
}