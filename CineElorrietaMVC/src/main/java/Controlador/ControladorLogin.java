package Controlador;

import Modelo.Modelo;
import Modelo.Usuario;
import Vista.PanelGeneros;
import Vista.PanelLogin;
import Vista.Vista;
import Controlador.ControladorGeneros;

public class ControladorLogin {

	private Modelo modelo;
	private Vista vista;
	private Controlador controlador;
	private PanelLogin panelLogin;
	
	public ControladorLogin(Modelo modelo, Vista vista, Controlador controlador) {
		this.setModelo(modelo);
		this.setVista(vista);
		this.setControlador(controlador);	
	}
	
	public void mostrarPanelLogin() {
		this.panelLogin = new PanelLogin(this);
		this.getVista().mostrarPanel(this.panelLogin);
	}
	public void accionadoBotonLoginPanelLogin(String usuario_in, String password_in) {
		System.out.println("Ejecutando login en controlador, usuario y contraseña recibidos");

		///////////////////////////////////////////
		boolean usuario_existe = false;
		boolean usuario_esAdmin = false;

		Usuario[] listaUsers = getModelo().getConsultasBBDD().consulta_lista_usuarios();
		
		for(Usuario usuario: listaUsers){							//recorrer lista
			if(usuario.getUsuario().equals(usuario_in)) {			//usuario existe
				System.out.println("usuarioExiste");
				usuario_existe = true;

				if(usuario.isAdmin()) {					//usuario es admin	
					usuario_esAdmin = true;
					System.out.println("ES admin");
					if(usuario.getPassword().equals(password_in)) {	//Password correcta
						System.out.println("password CORRECTA");
						this.habilitarBotonEdicionEnGeneros();
						this.getControlador().navegarPanelEdicion();
					}
					else {
						System.out.println("password INCORRECTA");

					}
					
					break;
				}
				
				else if(!usuario_esAdmin) { // Si no es admin
					if(usuario.getPassword().equals(password_in)) {	//Password correcta
						System.out.println("NO ES admin");
						this.deshabilitarBotonEdicionEnGeneros();
						this.getControlador().navegarPanelGeneros();
					}
					
				}
				
			}
					
		}
		if(!usuario_existe) {
			System.out.println("el usuario no existe");
		}
		
		
		
	}
//	public void accionadoBotonGenerosPanelLogin(String usuario_in, String password_in) {
//		System.out.println("Entrando a géneros");
//
//		boolean usuario_existe = false;
//		Usuario[] listaUsers = modelo.getConsultasBBDD().consulta_lista_usuarios();
//		
//		for(Usuario usuario: listaUsers){
//			if(usuario.getUsuario().equals(usuario_in)) {
//				System.out.println("usuarioExiste");
//				usuario_existe = true;
//				if(usuario.getPassword().equals(password_in)) {
//					System.out.println("password CORRECTA");
//					this.controlador.navegarPanelGeneros();
//				}
//				else {
//					System.out.println("password INCORRECTA");
//
//				}
//				
//				break;
//			}
//			
//		}
//		if(!usuario_existe) {
//			System.out.println("el usuario no existe");
//		}
//	}
	public void accionadoBotonVolverPanelLogin() {
		this.getControlador().navegarPanelBienvenida();
	}
	public void habilitarBotonEdicionEnGeneros() {
		new PanelGeneros(new ControladorGeneros(getModelo(), getVista(), getControlador())).btnEdicion.setEnabled(true);
		new PanelGeneros(new ControladorGeneros(getModelo(), getVista(), getControlador())).btnEdicion.setVisible(true);
	}
	public void deshabilitarBotonEdicionEnGeneros() {
		new PanelGeneros(new ControladorGeneros(getModelo(), getVista(), getControlador())).btnEdicion.setEnabled(false);
		new PanelGeneros(new ControladorGeneros(getModelo(), getVista(), getControlador())).btnEdicion.setVisible(false);
	}

	public PanelLogin makePanelLogin(ControladorLogin controlador) {
		return new PanelLogin(controlador);
		
	}

	public Modelo getModelo() {
		return modelo;
	}

	public void setModelo(Modelo modelo) {
		this.modelo = modelo;
	}

	public Vista getVista() {
		return vista;
	}

	public void setVista(Vista vista) {
		this.vista = vista;
	}

	public Controlador getControlador() {
		return controlador;
	}

	public void setControlador(Controlador controlador) {
		this.controlador = controlador;
	}
	
}