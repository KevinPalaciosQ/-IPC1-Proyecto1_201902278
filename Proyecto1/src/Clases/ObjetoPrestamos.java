/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author kevin
 */
public class ObjetoPrestamos {
private int IdLibros;
private int IdEstudiante;
private String FechaEntrega;

    public ObjetoPrestamos(int IdLibros, int IdEstudiante, String FechaEntrega) {
        this.IdLibros = IdLibros;
        this.IdEstudiante = IdEstudiante;
        this.FechaEntrega = FechaEntrega;
    }

    /**
     * @return the IdLibros
     */
    public int getIdLibros() {
        return IdLibros;
    }

    /**
     * @param IdLibros the IdLibros to set
     */
    public void setIdLibros(int IdLibros) {
        this.IdLibros = IdLibros;
    }

    /**
     * @return the IdEstudiante
     */
    public int getIdEstudiante() {
        return IdEstudiante;
    }

    /**
     * @param IdEstudiante the IdEstudiante to set
     */
    public void setIdEstudiante(int IdEstudiante) {
        this.IdEstudiante = IdEstudiante;
    }

    /**
     * @return the FechaEntrega
     */
    public String getFechaEntrega() {
        return FechaEntrega;
    }

    /**
     * @param FechaEntrega the FechaEntrega to set
     */
    public void setFechaEntrega(String FechaEntrega) {
        this.FechaEntrega = FechaEntrega;
    }

}
