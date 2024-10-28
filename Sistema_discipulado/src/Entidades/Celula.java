package Entidades;

import java.time.LocalDate;
import java.util.ArrayList;

public class Celula {
    public static ArrayList<Clase> listaClases = new ArrayList<>();
    private Timonel timonel;
    private LocalDate fechaApertura;
    private LocalDate fechaCierre;
    private int legajo;
    private double salario;

    public Celula(Timonel timonel, LocalDate fechaApertura, int legajo, double salario) {
        this.timonel = timonel;
        this.fechaApertura = fechaApertura;
        this.fechaCierre = null;
        this.legajo = legajo;
        this.salario = salario;
    }

    public LocalDate getFechaApertura() {  // Método renombrado
        return fechaApertura;
    }

    public void setFechaApertura(LocalDate fechaApertura) {  // Método renombrado
        this.fechaApertura = fechaApertura;
    }

    public LocalDate getFechaCierre() {  // Método renombrado
        return fechaCierre;
    }

    public void setFechaCierre(LocalDate fechaCierre) {  // Método renombrado
        this.fechaCierre = fechaCierre;
    }

    public int getLegajo() {
        return legajo;
    }

    public void setLegajo(int legajo) {
        this.legajo = legajo;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
