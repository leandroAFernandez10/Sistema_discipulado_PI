package Entidades;

import Entidades.Discipulado;
import Entidades.Clase;


public class Asistencia {
    private static int ultimoCodigo;
    private int codigo;
    private Discipulo discipulo;  // Renombrado a camelCase
    private int cantidad;
    private Clase[] clases;  // Renombrado a clases

    public Asistencia(Discipulo discipulo, int cantidad, Clase[] clases) {  // Renombrado a camelCase y clase a Clase
        this.codigo = ++ultimoCodigo;
        this.discipulo = discipulo;
        this.cantidad = cantidad;
        this.clases = clases;
    }

    // Constructor para alta de Venta desde BD
    public Asistencia(int codigo, Discipulo discipulo, int cantidad, Clase[] clases) {  // Renombrado a camelCase y clase a Clase
        this.codigo = codigo;
        this.discipulo = discipulo;
        this.cantidad = cantidad;
        this.clases = clases;
    }

    public static int getUltimoCodigo() {
        return ultimoCodigo;
    }

    public static void setUltimoCodigo(int ultimoCodigo) {
        Asistencia.ultimoCodigo = ultimoCodigo;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public Discipulo getDiscipulo() {  // Renombrado a camelCase
        return discipulo;
    }

    public void setDiscipulo(Discipulo discipulo) {  // Renombrado a camelCase
        this.discipulo = discipulo;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public Clase[] getClases() {  // Renombrado a camelCase y clase a Clase
        return clases;
    }

    public void setClases(Clase[] clases) {  // Renombrado a camelCase y clase a Clase
        this.clases = clases;
    }
}
