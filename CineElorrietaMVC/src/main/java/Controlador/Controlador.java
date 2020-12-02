package Controlador;

import Modelo.Modelo;
import Vista.Vista;

public class Controlador {

	private Modelo modelo;
	private Vista vista;
	private ControladorPanelBienvenida controladorPanelBienvenida;
	private ControladorPanelLogin controladorPanelLogin;
	private ControladorPanelGeneros controladorPanelGeneros;
	private ControladorPanelPeliculas controladorPanelPeliculas;
	private ControladorPanelEdicion controladorPanelEdicion;
	private ControladorPanelEditar controladorPanelEditar;
	private ControladorPanelBorrar controladorPanelBorrar;
	private ControladorPanelAnadir controladorPanelAnadir;
	private ControladorPanelResumen controladorPanelResumen;
	private ControladorPanelFin controladorPanelFin;
	
	public Controlador(Modelo modelo, Vista vista) {
		this.modelo = modelo;
		this.vista = vista;
		this.controladorPanelBienvenida = new ControladorPanelBienvenida(this.modelo, this.vista, this);
		this.controladorPanelLogin = new ControladorPanelLogin(this.modelo, this.vista, this);
		this.controladorPanelGeneros = new ControladorPanelGeneros(this.modelo, this.vista, this);
		this.controladorPanelPeliculas = new ControladorPanelPeliculas(this.modelo, this.vista, this);
		this.controladorPanelEdicion = new ControladorPanelEdicion(this.modelo, this.vista, this);
		this.controladorPanelEditar = new ControladorPanelEditar(this.modelo, this.vista, this);
		this.controladorPanelBorrar = new ControladorPanelBorrar(this.modelo, this.vista, this);
		this.controladorPanelAnadir = new ControladorPanelAnadir(this.modelo, this.vista, this);
		this.controladorPanelResumen = new ControladorPanelResumen(this.modelo, this.vista, this);
		this.controladorPanelFin = new ControladorPanelFin(this.modelo, this.vista, this);
		
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
		this.controladorPanelGeneros.mostrarPanelGeneros();
	}
	public void navegarPanelPeliculas() {
		System.out.println("Navegar panel Peliculas");
		this.controladorPanelPeliculas.mostrarPanelPeliculas();
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
	public void navegarPanelFin() {
		System.out.println("Navegar panel Fin");
		this.controladorPanelFin.mostrarPanelFin();
	}
}
