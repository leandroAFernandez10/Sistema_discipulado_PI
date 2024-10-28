package Entidades;

import java.time.LocalDate;
import java.util.ArrayList;

import Enumerados.Sexo;
import Utilidades.MensajesConsola;
import Utilidades.MetodosGenerales;

public class Usuario {
	
	public static ArrayList<Usuario> listaUsuarios = new ArrayList<Usuario>();
	public static Usuario usuarioLogueado;
	public static boolean admin = false;
	
	private String usuario;
	private String clave;
	private boolean isAdmin;

	public Usuario (String usuario, String clave) {
		this.usuario = usuario;
		this.clave = clave;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getClave() {
		return clave;
	}

	public void setClave(String clave) {
		this.clave = clave;
	}

	
	public boolean isAdmin() {
		return isAdmin;
	}

	public void setAdmin(boolean isAdmin) {
		this.isAdmin = isAdmin;
	}
	
}
