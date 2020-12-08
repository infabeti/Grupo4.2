package Controlador;

import Modelo.Modelo;
import Modelo.Usuario;
import Vista.PanelLogin;
import Vista.Vista;

public class ControladorPanelLogin {

	private Modelo modelo;
	private Vista vista;
	private Controlador controlador;
	private PanelLogin panelLogin;
	
	public ControladorPanelLogin(Modelo modelo, Vista vista, Controlador controlador) {
		this.modelo = modelo;
		this.vista = vista;
		this.controlador = controlador;	
	}
	
	public void mostrarPanelLogin() {
		this.panelLogin = new PanelLogin(this);
		this.vista.mostrarPanel(this.panelLogin);
	}
	
	public void accionadoBotonEdicionPanelLogin(String usuario_in, String password_in) {
		System.out.println("Entrando a géneros");

		///////////////////////////////////////////
		boolean usuario_existe = false;
		boolean usuario_esAdmin = false;

		Usuario[] listaUsers = modelo.getConsultasBBDD().consulta_lista_usuarios();
		
		for(Usuario usuario: listaUsers){							//recorrer lista
			if(usuario.getUsuario().equals(usuario_in)) {			//usuario existe
				System.out.println("usuarioExiste");
				usuario_existe = true;

				if(usuario.isAdmin()) {								//usuario es admin	
					usuario_esAdmin = true;
					System.out.println("ES admin");
					if(usuario.getPassword().equals(password_in)) {	//Password correcta
						System.out.println("password CORRECTA");
						this.controlador.navegarPanelEdicion();
					}
					else {
						System.out.println("password INCORRECTA");

					}
					
					break;
				}
				
			}
					
		}
		if(!usuario_esAdmin) {
			System.out.println("NO ES admin");
		}
		if(!usuario_existe) {
			System.out.println("el usuario no existe");
		}
	}
	public void accionadoBotonGenerosPanelLogin(String usuario_in, String password_in) {
		System.out.println("Entrando a géneros");

		boolean usuario_existe = false;
		Usuario[] listaUsers = modelo.getConsultasBBDD().consulta_lista_usuarios();
		
		for(Usuario usuario: listaUsers){
			if(usuario.getUsuario().equals(usuario_in)) {
				System.out.println("usuarioExiste");
				usuario_existe = true;
				if(usuario.getPassword().equals(password_in)) {
					System.out.println("password CORRECTA");
					this.controlador.navegarPanelGeneros();
				}
				else {
					System.out.println("password INCORRECTA");

				}
				
				break;
			}
			
		}
		if(!usuario_existe) {
			System.out.println("el usuario no existe");
		}
	}
	public void accionadoBotonVolverPanelLogin() {
		this.controlador.navegarPanelBienvenida();
	}
	
}