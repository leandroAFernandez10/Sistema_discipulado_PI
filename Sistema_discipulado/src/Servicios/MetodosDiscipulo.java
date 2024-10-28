package Servicios;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

import Entidades.Discipulo;
import Entidades.Empleado;
import Entidades.Persona;
import Enumerados.Provincia;
import Enumerados.Sexo;
import Utilidades.MensajesConsola;
import Utilidades.MetodosGenerales;

public class MetodosDiscipulo {
	
	public Discipulo altaDiscipulo() {
		Scanner entrada = new Scanner (System.in);
		boolean exito;
		int opcion;
		int dni = MetodosGenerales.datoObligatorioEntero("Ingrese DNI: ");
		String nombres = MetodosGenerales.datoObligatorioString("Ingrese nombre/s: ");
		String apellidos = MetodosGenerales.datoObligatorioString("Ingrese apellido/s: ");
		Discipulo nuevoDiscipulo = new Discipulo (dni, nombres, apellidos);
		opcion = Utilidades.MensajesConsola.opcionSINO("Desea agregar N° de teléfono?");
		if (opcion == 1) {
			System.out.print("Ingrese N° de teléfono del Discipulo: ");
			nuevoDiscipulo.setTelefono(entrada.nextLine());
		}
		opcion = Utilidades.MensajesConsola.opcionSINO("Desea agregar Provincia?");
		if (opcion == 1) {
			nuevoDiscipulo.setProvincia(Provincia.seleccionarProvincia());
		}
		opcion = Utilidades.MensajesConsola.opcionSINO("Desea agregar Localidad?");
		if (opcion == 1) {
			System.out.print("Ingrese localdad del Discipulo: ");
			nuevoDiscipulo.setLocalidad(entrada.nextLine());
		}

		opcion = Utilidades.MensajesConsola.opcionSINO("Desea agregar dirección?");
		if (opcion == 1) {
			System.out.print("Ingrese direccion del Discipulo: ");
			nuevoDiscipulo.setDireccion(entrada.nextLine());
		}
		
		opcion = Utilidades.MensajesConsola.opcionSINO("Desea agregar fecha de nacimiento?");
		if (opcion == 1) {
			nuevoDiscipulo.setFechaNacimiento(Utilidades.Fecha.crearFecha("Ingrese la fecha de nacimiento del Discipulo:"));
		}
		
		opcion = Utilidades.MensajesConsola.opcionSINO("Desea agregar sexo?");
		if (opcion == 1) {
			nuevoDiscipulo.setSexo(Sexo.seleccionarSexo());
		}
		return nuevoDiscipulo;
	}
	
	public void agregarDiscipuloEnLista(Discipulo nuevoDiscipulo) {
		Discipulo.listaDiscipulos.add(nuevoDiscipulo);
	}
	
	public Discipulo buscarDiscipulo(int dni, ArrayList<Discipulo> listaDiscipulos) {
		for (Discipulo elemento: listaDiscipulos) {
			if (elemento.getDni() == dni) {
				return elemento;
			}
		}
		return null;
	}
	
	/*public void bajaDiscipulo () {
		int dniBuscado = MensajesConsola.buscarPorDNI();
		Discipulo buscado = this.buscarDiscipulo(dniBuscado, Discipulo.listaDiscipulos);
		if (buscado != null) {
			int opcion = MensajesConsola.opcionSINO("El Discipulo pasará a estado INACTIVO, desea continuar?");
			if (opcion == 1) {
				buscado.setActivo(false);
			}
		} else {
			MensajesConsola.datoNoEncontrado();
		}
	}*/
	
	public void bajaDiscipulo (Discipulo Discipulo, String tipo) {
		MensajesConsola.estadoPersona(Discipulo,tipo);
		if (Discipulo.isActivo()) {
			int activo = MensajesConsola.opcionSINO("Desea modificar su estado?");
			if (activo == 1) {
				Discipulo.setActivo(false);
				MensajesConsola.cambiosGuardados();
			}
		} else {
			MensajesConsola.operacionNoDisponible();
		}
	}
	
	public Discipulo modificarDiscipulo (Discipulo Discipulo) {
		return (Discipulo) new MetodosPersona().modificarPersona(Discipulo, "Ingrese una opción: ");
	}
	
	public String datosDiscipulo(Discipulo Discipulo) {
		return new MetodosPersona().datosPersona(Discipulo);
	}
	
	public void imprimirDatosDiscipulos(ArrayList<Discipulo> listaDiscipulos) {
		if (listaDiscipulos != null) {
			System.out.println("Listado de Discipulos:");
			for (Discipulo elemento : listaDiscipulos) {
				System.out.println(this.datosDiscipulo(elemento));
				System.out.println("----------------------------");
			}
		}
	}
}
