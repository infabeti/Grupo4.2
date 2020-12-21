package testControlador;

//import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.doNothing;
import org.junit.Test;

import Controlador.*;
import Modelo.Modelo;
import Vista.Vista;

public class TestControlador {

	private Modelo modeloMock = mock(Modelo.class);
	private Vista vistaMock = mock(Vista.class);
//	private ControladorProductos controladorProductosMock = mock(ControladorProductos.class);
	private ControladorBienvenida controladorBienvenidaMock = mock(ControladorBienvenida.class); 
	private Controlador spyControlador; 
//	
	// Este test es el más complicado de todos. Por lo que, es normal que nos cueste
	// entenderlo. El primer problema que tenemos es que necesitamos que se cree un
	// objeto ControladorProductos y otro objeto ControladorPeliculas. La creacion de
	// un objeto se invoca mediante "new" y esa ejecución solo se dará si definimos un
	// Spy, en este caso la clase que estamos testeando es Controlador y deberemos de 
	// Definir su Spy. Hasta aqui es lo mismo que hemos hecho en el TestControladorProductos
	// y TestControladorPeliculas. Sin embargo, aqui tenemos otro problema. A parte de 
	// necesitar un método on-line para cada uno de los dos objetos nuevos creados 
	// (ControladorProductos y ControladorPeliculas), también debemos de invocar un método
	// que pertenece a los dos objetos recientemente creados. Esto, es algo que no podriamos
	// testearlo, porque con el spy no hemos permitido que se crearan de verdad, sino que 
	// hemos simulado la ejecución de la creación de dichos objetos. La única solución que nos
	// queda es encapsular la llamada mostrarPanelProductos del objeto creado mediante el Spy de
	// ControladorProductos dentro un metodo que pertenece al Spy (controladorProductosMostrarPanelPeliculas)
	// Y, finalmente al ejecutar navegarPanelProductos podemos verificar que se haya ejecutado 
	// el metodo controladorProductosMostrarPanelPeliculas y de manera indirecta el metodo
	// mostrarPanelProductos que era lo que no podiamos testear. 
//	@Test
//	public void navegarPanelBienvenida() {		
//		spyControlador = spy(new Controlador(modeloMock, vistaMock)); 
//		doReturn(controladorBienvenidaMock)
//			.when(spyControlador)
//			.makeControladorPeliculas(any(Modelo.class), any(Vista.class), any(Controlador.class));
//		doReturn(controladorProductosMock)
//    		.when(spyControlador)
//    		.makeControladorProductos(any(Modelo.class), any(Vista.class), any(Controlador.class)); 
//		
//		spyControlador.navegarPanelProductos();
//		
//		verify(spyControlador, times(1)).controladorProductosMostrarPanelProductos();
//	}
//	
//	// Este test es un refinamiento del anterior. El problema que tenemos en este caso es que
//	// a la hora de crear el Spy the Controlador hemos permitido que se crearan los objetos 
//	// controladorProductos y controladorPeliculas. Por lo que, al invocar el metodo navegarPanelPeliculas
//	// va ir a ese objeto y va a continuar con su ejecución, y, dentro de ese objeto se ejecuta el constructor
//	// de panel peliculas. Dando como resultado, que panel peliculas le pide unos datos a su controladorPeliculas.
//	// Y, estamos ante la situación de que ControladorPeliculas ya lo habiamos emulado con el Spy de Controlador.
//	// Por lo que, nos dirá que no existe el metodo controladorPeliculas.obtenerPeliculas() y dará un error.
//	// La solución que tenemos es decir que cuando llame al metodo encapsulado controladorPeliculasMostrarPanelPeliculas
//	// no haga nada. Si os fijais en el test anterior no hemos hecho el doNothing y hemos permitido que recorriera la vista
//	// de productos como podeis ver en el coverage. Esta no es una practica recomendada, pero no teniamos alternativa.
//	// Porque, al ejecutar el constructor de Controlador usamos el metodo navegarPanelProductos para mostrar
//	// La ventana de bienvenida. Como conclusión, para que no tengamos problemas, cuando mostremos el panel de 
//	// bienvenida no tendremos ninguna interacción con su controlador, y, así lograremos tener un código testeable.
//	@Test
//	public void navegarPanelPeliculas() {	
//		spyControlador = spy(new Controlador(modeloMock, vistaMock)); 
//		doReturn(controladorPeliculasMock)
//			.when(spyControlador)
//			.makeControladorPeliculas(any(Modelo.class), any(Vista.class), any(Controlador.class));
//		doReturn(controladorProductosMock)
//    		.when(spyControlador)
//    		.makeControladorProductos(any(Modelo.class), any(Vista.class), any(Controlador.class)); 
//		doNothing().when(spyControlador).controladorPeliculasMostrarPanelPeliculas();
//		
//		spyControlador.navegarPanelPeliculas();
//		
//		verify(spyControlador, times(1)).controladorPeliculasMostrarPanelPeliculas();
//	}

}
