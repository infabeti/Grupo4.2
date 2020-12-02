package Modelo;

import java.util.Arrays;

import App.Main;

public class Usuario {
	
	private String usuario, password;
	private boolean admin;
	
	public Usuario(String usuario, String password, boolean admin) {
		super();
		this.setUsuario(usuario);
		this.setPassword(password);
		this.admin = admin;
		
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
