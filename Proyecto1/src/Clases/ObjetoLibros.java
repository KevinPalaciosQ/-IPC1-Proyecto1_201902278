package Clases;
public class ObjetoLibros {
private int Id;
private String Título;
private String Autor;
private int Tipo;
private int Copias;
private int Ocupado;
private int Disponible;
//constructor
    public ObjetoLibros(int Id, String Título, String Autor, int Tipo, int Copias, int Ocupado,int Disponible) {
        this.Id = Id;
        this.Título = Título;
        this.Autor = Autor;
        this.Tipo = Tipo;
        this.Copias = Copias;
        this.Ocupado = Ocupado;
        this.Disponible= Disponible;
    }
    public int getId() {
        return Id;
    }
    public void setId(int Id) {
        this.Id = Id;
    }
    public String getTítulo() {
        return Título;
    }
    public void setTítulo(String Título) {
        this.Título = Título;
    }

    public String getAutor() {
        return Autor;
    }
    public void setAutor(String Autor) {
        this.Autor = Autor;
    }
    public int getTipo() {
        return Tipo;
    }
    public void setTipo(int Tipo) {
        this.Tipo = Tipo;
    }
    public int getCopias() {
        return Copias;
    }
    public void setCopias(int Copias) {
        this.Copias = Copias;
    }
    public int getOcupado() {
        return Ocupado;
    }
    public void setOcupado(int Ocupado) {
        this.Ocupado = Ocupado;
    }
    public int getDisponible() {
        return Disponible;
    }
    public void setDisponible(int Disponible) {
        this.Disponible = Disponible;
    }
}
