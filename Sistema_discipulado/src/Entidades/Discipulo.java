package Entidades;

import java.time.LocalDate;
import java.util.ArrayList;

import Enumerados.Sexo;

public class Discipulo extends Persona{
	
	public static ArrayList<Discipulo> listaDiscipulos = new ArrayList<Discipulo>();
	
	
	public Discipulo (int dni, String nombres, String apellido) {
		super(dni, nombres, apellido);
	}

}
