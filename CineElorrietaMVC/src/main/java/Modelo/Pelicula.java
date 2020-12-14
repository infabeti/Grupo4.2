package Modelo;

import java.util.Arrays;

import App.Main;

public class Pelicula {
	private String nombre, genero;
	private int codigo, duracion;
	public static ConsultasBBDD consulta = App.Main.consultasBBDD; // Esto puede dar problemas
	
	public Pelicula(String nombre, String genero, int codigo , int duracion) {
		this.nombre = nombre;
		this.genero = genero;
		this.duracion = duracion;
		this.codigo = codigo ;
		
//		consulta.setPeliculas_totales((Pelicula[]) Modelo.pushObject(consulta.getPeliculas_totales(), this));
		
		//Para añadir la peli a la lista total y la de su género correspondiente
		consulta.setPeliculas_totales((Pelicula[]) Modelo.pushObject(consulta.getPeliculas_totales(), this));
		switch(genero.toLowerCase()) {
			case "drama":
				break;
			case "sci-fi":
				consulta.setPelis_Sci_Fi((Pelicula[]) Modelo.pushObject(consulta.getPelis_Sci_Fi(), this));
				break;
			case "terror":
				consulta.setPelis_Terror((Pelicula[]) Modelo.pushObject(consulta.getPelis_Terror(), this));
				break;
			case "comedia":
				consulta.setPelis_Comedia((Pelicula[]) Modelo.pushObject(consulta.getPelis_Comedia(), this));
				break;	
		}
	}
	public Pelicula(String nombre, String genero, int duracion) {
		this.nombre = nombre;
		this.genero = genero;
		this.duracion = duracion;
		//El código de las nuevas pelíuclas será autogenerado (AUTO INCREMENTED)
		this.codigo =consulta.getPeliculas_totales().length+1 ;
		
		//Para añadir la peli a la lista total y la de su género correspondiente
				consulta.setPeliculas_totales((Pelicula[]) Modelo.pushObject(consulta.getPeliculas_totales(), this));
				switch(genero.toLowerCase()) {
					case "drama":
						consulta.setPelis_Drama((Pelicula[]) Modelo.pushObject(consulta.getPelis_Drama(), this));
						break;
					case "sci-fi":
						consulta.setPelis_Sci_Fi((Pelicula[]) Modelo.pushObject(consulta.getPelis_Sci_Fi(), this));
						break;
					case "terror":
						consulta.setPelis_Terror((Pelicula[]) Modelo.pushObject(consulta.getPelis_Terror(), this));
						break;
					case "comedia":
						consulta.setPelis_Comedia((Pelicula[]) Modelo.pushObject(consulta.getPelis_Comedia(), this));
						break;
				
				}
		

	}
	
//	//Permite añadir una película nueva a un array de pelis
//		public static Pelicula[] pushPelicula(Pelicula[] array, Pelicula push) {
//			Pelicula[] longer = Arrays.copyOf(array, array.length + 1);
//		    longer[longer.length - 1] = push;
//		    return longer;
//		}
//		
//		//Permite añadir un array de pelis a otro array de pelis
//		public static Pelicula[] pushAllPeliculas(Pelicula[] array, Pelicula[] push) {
//			Pelicula[] longer = Arrays.copyOf(array, array.length + push.length);
//		    
//		    int cont = 0;
//		    for(Pelicula x : push) {
//			    longer[array.length + cont] = x;
//			    
//			    cont++;
//		    }
//		   
//		    return longer;
//		}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public int getDuracion() {
		return duracion;
	}

	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}
	
	
	

}
