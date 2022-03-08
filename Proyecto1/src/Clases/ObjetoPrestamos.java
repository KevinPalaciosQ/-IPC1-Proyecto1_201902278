package Clases;
public class ObjetoPrestamos {
private int IdLibros;
private int IdEstudiante;
private String FechaEntrega;
private String Estatus;
    public ObjetoPrestamos(int IdLibros, int IdEstudiante, String FechaEntrega, String Estatus) {
        this.IdLibros = IdLibros;
        this.IdEstudiante = IdEstudiante;
        this.FechaEntrega = FechaEntrega;
        this.Estatus = Estatus;
    }
    public int getIdLibros() {
        return IdLibros;
    }
        public void setIdLibros(int IdLibros) {
        this.IdLibros = IdLibros;
    }
    public int getIdEstudiante() {
        return IdEstudiante;
    }
    public void setIdEstudiante(int IdEstudiante) {
        this.IdEstudiante = IdEstudiante;
    }
    public String getFechaEntrega() {
        return FechaEntrega;
    }
    public void setFechaEntrega(String FechaEntrega) {
        this.FechaEntrega = FechaEntrega;
    }
    public String getEstatus() {
        return Estatus;
    }
    public void Estatus(String Estatus) {
        this.Estatus = Estatus;
    }
}
