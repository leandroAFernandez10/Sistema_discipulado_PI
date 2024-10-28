package Enumerados;

import java.util.Scanner;

import Utilidades.MetodosGenerales;

public enum Especialidad {
	GENERAL (1, "General"),
	MUJERES (2, "Mujeres"),
	HOMBRES (3, "Hombres"),
	NIÑOS (4, "Niños"),
	JÓVENES (5, "Jóvenes"),
	ADOLESCENTES (6, "Adolescentes");
	
	private int codigo;
	private String nombre;
	
	private Especialidad (int codigo, String nombre){
		this.codigo = codigo;
		this.nombre = nombre;
	}
	
	public int getCodigo () {
		return this.codigo;
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
	public static String mostrarEspecialidad(Especialidad elemento) {
		if (elemento != null) {
			return elemento.getNombre();
		} else {
			return "No existe la especialidad seleccionada.";
		}
	}
	
	public static Especialidad seleccionarEspecialidad () {
		Scanner entrada = new Scanner (System.in);
		String auxOpcion;
		int opcion = 0;
		boolean exito = false;
		System.out.println("Seleccione una Especialidad:");
		do {
			for (Especialidad elemento: Especialidad.values()) {
				System.out.println(elemento.getCodigo() + " - " + elemento.getNombre());
			}
			System.out.print("Ingrese el código: ");
			auxOpcion = entrada.nextLine();
			exito = MetodosGenerales.controlNumeroEntero(auxOpcion);
			if (exito) {
				opcion = Integer.parseInt(auxOpcion);
				if (opcion < 1 || opcion > 5) {
					System.out.println("Código inválido, intente de nuevo.");
					exito = false;
				} else {
					exito = true;
				}
			} else {
				Utilidades.MensajesConsola.verificarDato();
			}
		} while(!exito);
		for (Especialidad elemento : Especialidad.values()) {
            if (elemento.getCodigo() == opcion) {
                return elemento;
            }
        }
		return null;
	}
}
