package testControlador;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;


import org.junit.Test;

import Controlador.Controlador;
import Controlador.ControladorAnadir;
import Controlador.ControladorBienvenida;
import Controlador.ControladorBorrar;
import Controlador.ControladorEdicion;
import Controlador.ControladorEditar;
import Controlador.ControladorResumen;
import Modelo.Modelo;
import Vista.PanelAnadir;
import Vista.PanelBienvenida;
import Vista.PanelBorrar;
import Vista.PanelEdicion;
import Vista.PanelEditar;
import Vista.PanelResumen;
import Vista.Vista;

public class TestControladorEdicion {

	private ControladorEdicion controladorEdicion;
	private Modelo modeloMock = mock(Modelo.class);
	private Vista vistaMock = mock(Vista.class);
	private Controlador controladorMock = mock(Controlador.class);	
	
	// Test mostrarPanelEdicion
	private PanelEdicion panelEdicionMock = mock(PanelEdicion.class);
	private ControladorEdicion spyControladorEdicion = spy(new ControladorEdicion(modeloMock, vistaMock, controladorMock));
	
	private PanelEditar panelEditarMock = mock(PanelEditar.class);
	private ControladorEditar spyControladorEditar = spy(new ControladorEditar(modeloMock, vistaMock, controladorMock));
	
	private PanelAnadir panelAnadirMock = mock(PanelAnadir.class);
	private ControladorAnadir spyControladorAnadir = spy(new ControladorAnadir(modeloMock, vistaMock, controladorMock));
	
	private PanelBorrar panelBorrarMock = mock(PanelBorrar.class);
	private ControladorBorrar spyControladorBorrar = spy(new ControladorBorrar(modeloMock, vistaMock, controladorMock));
	
	private PanelBienvenida panelBienvenidaMock = mock(PanelBienvenida.class);
	private ControladorBienvenida spyControladorBienvenida = spy(new ControladorBienvenida(modeloMock, vistaMock, controladorMock));
	
	private PanelResumen panelResumenMock = mock(PanelResumen.class);
	private ControladorResumen spyControladorResumen = spy(new ControladorResumen(modeloMock, vistaMock, controladorMock));
	
	@Test
	public void edicion() {
		ControladorEdicion ctrl = new ControladorEdicion(modeloMock, vistaMock, controladorMock);
		assertEquals("modelo contructor controlador Bienvenida", ctrl.getModelo().getClass(), modeloMock.getClass());
		assertEquals("vista contructor controlador Bienvenida", ctrl.getVista().getClass(), vistaMock.getClass());
		assertEquals("controlador contructor controlador Bienvenida", ctrl.getControlador().getClass(), controladorMock.getClass());
	}
	
	@Test
	public void mostrarPanelEdicion() {
		doReturn(panelEdicionMock)
			.when(spyControladorEdicion)
			.makePanelEdicion(any (ControladorEdicion.class));
		
		spyControladorEdicion.mostrarPanelEdicion();
		verify(vistaMock, times(1)).mostrarPanel(panelEdicionMock);
	}
	
	@Test
	public void testBotonEditar() {
		doReturn(panelEditarMock)
			.when(spyControladorEditar)
			.makePanelEditar(any (ControladorEditar.class));
		
		spyControladorEditar.mostrarPanelEditar();
		verify(vistaMock, times(1)).mostrarPanel(panelEditarMock);
	
	}
	
	@Test
	public void testBotonAnadir() {
		doReturn(panelAnadirMock)
			.when(spyControladorAnadir)
			.makePanelEditar(any (ControladorAnadir.class));
		
		spyControladorAnadir.mostrarPanelAnadir();
		verify(vistaMock, times(1)).mostrarPanel(panelAnadirMock);
	
	}
	
	@Test
	public void testBotonResumen() {
		doReturn(panelResumenMock)
			.when(spyControladorResumen)
			.makePanelResumen(any (ControladorResumen.class));
		
		spyControladorResumen.mostrarPanelResumen();
		verify(vistaMock, times(1)).mostrarPanel(panelResumenMock);
	
	}
	
	@Test
	public void testBotonBorrar() {
		doReturn(panelBorrarMock)
			.when(spyControladorBorrar)
			.makePanelBorrar(any (ControladorBorrar.class));
		
		spyControladorBorrar.mostrarPanelBorrar();
		verify(vistaMock, times(1)).mostrarPanel(panelBorrarMock);
	
	}
	
	@Test
	public void testBotonBienvenida() {
		doReturn(panelBienvenidaMock)
			.when(spyControladorBienvenida)
			.makePanelBienvenida(any (ControladorBienvenida.class));
		
		spyControladorBienvenida.mostrarPanelBienvenida();
		verify(vistaMock, times(1)).mostrarPanel(panelBienvenidaMock);
	
	}
}
