package Entidades;

public class Clase {
    private static int ultimaClase;
    private int codigo;
    private String tema;
    private int claseAsistencia;
    private int discipuloAsistente;
    private double saldo;

    // Constructor para alta de Movimiento desde app
    public Clase(String tema, int claseAsistencia, int discipuloAsistente) {
        this.codigo = ++ultimaClase;
        this.tema = tema;
        this.claseAsistencia = claseAsistencia;
        this.discipuloAsistente = discipuloAsistente;
        this.saldo = claseAsistencia - discipuloAsistente;
    }

    // Constructor para alta de movimiento desde consulta BD
    public Clase(int codigo, String tema, int claseAsistencia, int discipuloAsistente) {
        this.codigo = codigo;
        this.tema = tema;
        this.claseAsistencia = claseAsistencia;
        this.discipuloAsistente = discipuloAsistente;
        this.saldo = claseAsistencia - discipuloAsistente;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getTema() {
        return tema;
    }

    public void setTema(String tema) {
        this.tema = tema;
    }

    public int getClaseAsistencia() {
        return claseAsistencia;
    }

    public void setClaseAsistencia(int claseAsistencia) {
        this.claseAsistencia = claseAsistencia;
    }

    public int getDiscipuloAsistente() {
        return discipuloAsistente;
    }

    public void setDiscipuloAsistente(int discipuloAsistente) {
        this.discipuloAsistente = discipuloAsistente;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
