package testControlador;

import static org.junit.Assert.*;
import static org.mockito.Matchers.any;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

import org.junit.Test;

import Controlador.Controlador;
import Controlador.ControladorBienvenida;
import Controlador.ControladorLogin;
import Modelo.Modelo;
import Vista.PanelLogin;
import Vista.Vista;



public class TestLogin {
	private ControladorLogin controladorLogin;
	private Modelo modeloMock = mock(Modelo.class);
	private Vista vistaMock = mock(Vista.class);
	private Controlador controladorMock = mock(Controlador.class);
	
	// Test mostrarPanelPeliculas
	private PanelLogin panelLoginMock = mock(PanelLogin.class); 
	private ControladorLogin spyControladorLogin = spy(new ControladorLogin(modeloMock, vistaMock, controladorMock)); 
	
	@Test
	public void login() {
		ControladorLogin ctrl = new ControladorLogin(modeloMock, vistaMock, controladorMock);
		assertEquals("modelo contructor controlador Bienvenida", ctrl.getModelo().getClass(), modeloMock.getClass());
		assertEquals("vista contructor controlador Bienvenida", ctrl.getVista().getClass(), vistaMock.getClass());
		assertEquals("controlador contructor controlador Bienvenida", ctrl.getControlador().getClass(), controladorMock.getClass());
	}
	@Test
	public void mostrarPanelPeliculas() {
		doReturn(panelLoginMock)
	    	.when(spyControladorLogin)
	    	.makePanelLogin(any( ControladorLogin.class)); 
			
		spyControladorLogin.mostrarPanelLogin();
		verify(vistaMock, times(1)).mostrarPanel(panelLoginMock);
	}
	
	@Test
	public void verificarLogin() {
		controladorLogin = new ControladorLogin(modeloMock, vistaMock, controladorMock);
			
		controladorLogin.accionadoBotonLoginPanelLogin("admin", "admin");
		verify(controladorMock, times(1)).navegarPanelEdicion();
		
		controladorLogin.accionadoBotonLoginPanelLogin("user1", "12345");
		verify(controladorMock, times(1)).navegarPanelGeneros();
		
	}

}
