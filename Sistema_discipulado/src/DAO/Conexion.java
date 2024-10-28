package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {

	private static final String CONTROLADOR = "com.mysql.cj.jdbc.Driver";
	private static final String URL = "jdbc:mysql://localhost:3306/SistemaDiscipulado";
	private static final String usuario = "admin";
	private static final String clave = "admin";
	
	static {
		try {
			Class.forName(CONTROLADOR);
		}catch(ClassNotFoundException error) {
			error.printStackTrace();
			System.out.println("Error en controlador: " + error.getLocalizedMessage());
		}
	}

	public static Connection conectarBD() throws SQLException {
		Connection conexion = null;
		conexion = DriverManager.getConnection(URL, usuario, clave);
		return conexion;
	}
	
}
