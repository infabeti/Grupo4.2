package Controlador;

import Modelo.Modelo;
import Vista.Vista;

public class Controlador {

	private Modelo modelo;
	private Vista vista;
	private ControladorBienvenida controladorPanelBienvenida;
	private ControladorLogin controladorPanelLogin;
	private ControladorGeneros controladorPanelGeneros;
	private ControladorEdicion controladorPanelEdicion;
	private ControladorEditar controladorPanelEditar;
	private ControladorBorrar controladorPanelBorrar;
	private ControladorAnadir controladorPanelAnadir;
	private ControladorResumen controladorPanelResumen;
	
	public Controlador(Modelo modelo, Vista vista) {
		this.modelo = modelo;
		this.vista = vista;
		this.controladorPanelBienvenida = new ControladorBienvenida(this.modelo, this.vista, this);
		this.controladorPanelLogin = new ControladorLogin(this.modelo, this.vista, this);
		this.setControladorPanelGeneros(new ControladorGeneros(this.modelo, this.vista, this));
		this.controladorPanelEdicion = new ControladorEdicion(this.modelo, this.vista, this);
		this.controladorPanelEditar = new ControladorEditar(this.modelo, this.vista, this);
		this.controladorPanelBorrar = new ControladorBorrar(this.modelo, this.vista, this);
		this.controladorPanelAnadir = new ControladorAnadir(this.modelo, this.vista, this);
		this.controladorPanelResumen = new ControladorResumen(this.modelo, this.vista, this);
		
		this.navegarPanelBienvenida();
	}
	
	public void navegarPanelBienvenida() {
		System.out.println("Navegar panel Bienvenida");
		this.controladorPanelBienvenida.mostrarPanelBienvenida();
	}
	public void navegarPanelLogin() {
		System.out.println("Navegar panel Login");
		this.controladorPanelLogin.mostrarPanelLogin();
	}
	public void navegarPanelGeneros() {
		System.out.println("Navegar panel Generos");
		this.getControladorPanelGeneros().mostrarPanelGeneros();
	}
	public void navegarPanelEdicion() {
		System.out.println("Navegar panel Edicion");
		this.controladorPanelEdicion.mostrarPanelEdicion();
	}
	public void navegarPanelEditar() {
		System.out.println("Navegar panel Editar");
		this.controladorPanelEditar.mostrarPanelEditar();
	}
	public void navegarPanelBorrar() {
		System.out.println("Navegar panel Borrar");
		this.controladorPanelBorrar.mostrarPanelBorrar();
	}
	public void navegarPanelAnadir() {
		System.out.println("Navegar panel Añadir");
		this.controladorPanelAnadir.mostrarPanelAnadir();
	}
	public void navegarPanelResumen() {
		System.out.println("Navegar panel Resumen");
		this.controladorPanelResumen.mostrarPanelResumen();
	}

	public ControladorGeneros getControladorPanelGeneros() {
		return controladorPanelGeneros;
	}

	public void setControladorPanelGeneros(ControladorGeneros controladorPanelGeneros) {
		this.controladorPanelGeneros = controladorPanelGeneros;
	}

}
