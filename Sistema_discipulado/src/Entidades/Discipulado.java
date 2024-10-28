package Entidades;

import Enumerados.Especialidad;

public class Discipulado {
    private static int ultimoCodigo;
    private int codigo;
    private String nombre;
    private Especialidad especialidad;
    private int stock;

    // Constructor para alta de Discipulado desde App
    public Discipulado(String nombre, int stock) {
        this.codigo = ++ultimoCodigo;
        this.nombre = nombre;
        this.stock = stock;
    }

    // Constructor para alta de producto desde consulta BD
    public Discipulado(int codigo, String nombre, Especialidad especialidad, int stock) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.especialidad = especialidad;
        this.stock = stock;
    }

    public static int getUltimoCodigo() {
        return ultimoCodigo;
    }

    public static void setUltimoCodigo(int ultimoCodigo) {
        Discipulado.ultimoCodigo = ultimoCodigo;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Especialidad getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(Especialidad especialidad) {
        this.especialidad = especialidad;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }
}
