package Modelo;

import java.util.Arrays;

import App.Main;

public class Usuario {
	
	private String usuario, password;
	
	public Usuario(String usuario, String password) {
		super();
		this.setUsuario(usuario);
		this.setPassword(password);
		
		Main.consultasBBDD.setLista_usuarios((Usuario[]) Modelo.pushObject(Main.consultasBBDD.getLista_usuarios(), this));
	}
	

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}


	
	

}
