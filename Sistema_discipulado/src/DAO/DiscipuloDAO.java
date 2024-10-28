package DAO;

import java.sql.Connection;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.ArrayList;
import Entidades.Discipulo;

public class DiscipuloDAO {

    // Método para listar todas los Discipulos
    public static ArrayList<Discipulo> listarDiscipulos() {
        ArrayList<Discipulo> listaDiscipulos = new ArrayList<>();
        String consultaSQL = "SELECT * FROM Discipulo";
        ResultSet resultado = null;

        try {
            Connection conexion = Conexion.conectarBD();
            Statement stmt = conexion.createStatement();
            resultado = stmt.executeQuery(consultaSQL);

            while (resultado.next()) {
                int id = resultado.getInt("idDiscipulo");
                int dni = resultado.getInt("dniDiscipulo");
                boolean activo = resultado.getBoolean("activoDiscipulo");
                String nombres = resultado.getString("nombresDiscipulo");
                String apellidos = resultado.getString("apellidosDiscipulo");
                String telefono = resultado.getString("telefonoDiscipulo");
                String direccion = resultado.getString("direccionDiscipulo");
                String provincia = resultado.getString("provinciaDiscipulo");
                String localidad = resultado.getString("localidadDiscipulo");
                String sexo = resultado.getString("sexoDiscipulo");
                Date auxFecha = resultado.getDate("fechaNacimientoDiscipulo");
                LocalDate fechaNacimiento = auxFecha.toLocalDate();
                int idCtaCte = resultado.getInt("idCtaCteDiscipulo");

                Discipulo nuevoDiscipulo = new Discipulo(dni, nombres, apellidos);
                listaDiscipulos.add(nuevoDiscipulo);
            }

        } catch (SQLException error) {
            System.out.println("Error en conexion: " + error.getMessage());

        } finally {
            try {
                if (resultado != null) {
                    resultado.close();
                }
                if (stmt != null) {
                    stmt.close();
                }
                if (conexion != null) {
                    conexion.close();
                }
            } catch (SQLException e) {
                System.out.println("Error cerrando recursos: " + e.getMessage());
            }
        }

        return listaDiscipulos;
    }
}
