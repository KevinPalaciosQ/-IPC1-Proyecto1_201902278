
package Clases;
public class ObjetoRegistros {//Aquí va el estado de los libros
    private String Reporteusuario;
    private String Reportelibro;
    private String Reporteprestamos;

    public ObjetoRegistros(String Reporteusuario, String Reportelibro, String Reporteprestamos) {
        this.Reporteusuario = Reporteusuario;
        this.Reportelibro = Reportelibro;
        this.Reporteprestamos = Reporteprestamos;
    }
    public String getReporteusuario() {
        return Reporteusuario;
    }
    public void setReporteusuario(String Reporteusuario) {
        this.Reporteusuario = Reporteusuario;
    }
    public String getReportelibro() {
        return Reportelibro;
    }
    public void setReportelibro(String Reportelibro) {
        this.Reportelibro = Reportelibro;
    }
    public String getReporteprestamos() {
        return Reporteprestamos;
    }
    public void setReporteprestamos(String Reporteprestamos) {
        this.Reporteprestamos = Reporteprestamos;
    }

    

  
    
}
