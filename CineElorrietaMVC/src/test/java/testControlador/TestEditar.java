package testControlador;

import static org.junit.Assert.*;
import static org.mockito.Matchers.any;
import static org.mockito.Mockito.*;


import org.junit.Test;

import Controlador.Controlador;
import Controlador.ControladorEdicion;
import Controlador.ControladorEditar;
import Controlador.ControladorResumen;
import Modelo.Modelo;
import Vista.PanelEditar;
import Vista.PanelResumen;
import Vista.Vista;

public class TestEditar {
	private Modelo modeloMock = mock(Modelo.class);
	private Vista vistaMock = mock(Vista.class);
	private Controlador controladorMock = mock(Controlador.class);	
	
	private PanelEditar panelEditarMock = mock(PanelEditar.class);
	private ControladorEditar spyControladorEditar = spy(new ControladorEditar(modeloMock, vistaMock, controladorMock));
	
	private PanelResumen panelResumenMock = mock(PanelResumen.class);
	private ControladorResumen spyControladorResumen = spy(new ControladorResumen(modeloMock, vistaMock, controladorMock));

	@Test
	public void construcotEditar() {
		ControladorEditar ctrl = new ControladorEditar(modeloMock, vistaMock, controladorMock);
		assertEquals("modelo contructor controlador Bienvenida", ctrl.getModelo().getClass(), modeloMock.getClass());
		assertEquals("vista contructor controlador Bienvenida", ctrl.getVista().getClass(), vistaMock.getClass());
		assertEquals("controlador contructor controlador Bienvenida", ctrl.getControlador().getClass(), controladorMock.getClass());
	}

	@Test
	public void testMostrarPanelEditar() {
		doReturn(panelEditarMock)
		.when(spyControladorEditar)
		.makePanelEditar(any (ControladorEditar.class));
	
		spyControladorEditar.mostrarPanelEditar();
		//verify(vistaMock, times(1)).mostrarPanel(panelEditarMock);
	}
	
	@Test
	public void testCambiarGenero() {
		ControladorEditar ctrl = new ControladorEditar(modeloMock, vistaMock, controladorMock);
		doReturn(new PanelEditar(spyControladorEditar))
		.when(spyControladorEditar)
		.makePanelEdicion(any (ControladorEditar.class));
	
		spyControladorEditar.cambiarGenero();
		//verify(vistaMock, times(1)).mostrarPanel(panelEditarMock);
	}
	
	@Test
	public void testBotonAceptarPanelEditar() {
		doReturn(panelResumenMock)
		.when(spyControladorResumen)
		.makePanelResumen(any (ControladorResumen.class));
	
		spyControladorResumen.mostrarPanelResumen();
		//verify(vistaMock, times(1)).mostrarPanel(panelEditarMock);
	}
	
	@Test
	public void testBotonCancelarPanelEditar() {
		doReturn(panelResumenMock)
		.when(spyControladorResumen)
		.makePanelResumen(any (ControladorResumen.class));
	
		spyControladorResumen.mostrarPanelResumen();;
		//verify(vistaMock, times(1)).mostrarPanel(panelEditarMock);
	}
	
	

	
}
