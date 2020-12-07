package testModelo;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;
import org.junit.Test;

import Modelo.ConsultasBBDD;
import Modelo.Modelo;


public class TestModelo {

	private Modelo modelo;
	private ConsultasBBDD consultasBBDDMock = mock(ConsultasBBDD.class);
	private ConsultasBBDD consultasBBDDMock2 = mock(ConsultasBBDD.class);
	
	@Test
	public void constructorModeloTest() {
		modelo = new Modelo(consultasBBDDMock);
		
		assertEquals(modelo.getConsultasBBDD(), consultasBBDDMock);
	}
	
	@Test
	public void setConsultasBBDDTest() {
		modelo = new Modelo(consultasBBDDMock);
		modelo.setConsultasBBDD(consultasBBDDMock2);
		
		assertEquals(modelo.getConsultasBBDD(), consultasBBDDMock2);
	}

}
