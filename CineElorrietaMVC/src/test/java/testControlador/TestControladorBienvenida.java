package testControlador;

import static org.junit.Assert.*;

import org.junit.Test;
import static org.mockito.Mockito.*;
import Controlador.Controlador;
import Controlador.ControladorBienvenida;
import Controlador.ControladorLogin;
import Controlador.ControladorBienvenida;
import Modelo.Modelo;
import Vista.PanelBienvenida;
import Vista.Vista;

public class TestControladorBienvenida {

	private ControladorBienvenida controladorBienvenida;
	private Modelo modeloMock = mock(Modelo.class);
	private Vista vistaMock = mock(Vista.class);
	private Controlador controladorMock = mock(Controlador.class);
	
	// Test mostrarPanelPeliculas
	private PanelBienvenida panelBienvenidaMock = mock(PanelBienvenida.class); 
	private ControladorBienvenida spyControladorBienvenida = spy(new ControladorBienvenida(modeloMock, vistaMock, controladorMock)); 
	
	   
	
	@Test
	public void bienvenida() {
		ControladorBienvenida ctrl = new ControladorBienvenida(modeloMock, vistaMock, controladorMock);
		assertEquals("modelo contructor controlador Bienvenida", ctrl.getModelo().getClass(), modeloMock.getClass());
		assertEquals("vista contructor controlador Bienvenida", ctrl.getVista().getClass(), vistaMock.getClass());
		assertEquals("controlador contructor controlador Bienvenida", ctrl.getControlador().getClass(), controladorMock.getClass());
	}
	@Test
	public void mostrarPanelPeliculas() {
		doReturn(panelBienvenidaMock)
	    	.when(spyControladorBienvenida)
	    	.makePanelBienvenida(any( ControladorBienvenida.class)); 
			
		spyControladorBienvenida.mostrarPanelBienvenida();
		verify(vistaMock, times(1)).mostrarPanel(panelBienvenidaMock);
	}
	
	// Al ejecutar el método accionadoBottonVolverPanelProductos
	// Se debe llamar el metodo controlador.navegarPanelPeliculas una vez
	@Test
	public void accionadoBottonMostrarPanelPeliculasTest() {
		controladorBienvenida = new ControladorBienvenida(modeloMock, vistaMock, controladorMock);
			
		controladorBienvenida.timerBienvenida();
			
		verify(controladorMock, times(1)).navegarPanelBienvenida();
	}

}
