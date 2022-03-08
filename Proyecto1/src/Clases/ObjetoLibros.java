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
    public ObjetoLibros( String Título,int Id, String Autor, int Tipo, int Copias, int Disponible,int Ocupado) {
        this.Título = Título;
        this.Id = Id;
        
        this.Autor = Autor;
        this.Tipo = Tipo;
        this.Copias = Copias;
        this.Disponible= Disponible;
        this.Ocupado = Ocupado;
    }
        public void Mostrarme(){
        System.out.println("---------------------------");
        System.out.println("Hola, Mi Título es: " + Título);
        System.out.println("Hola, mi Id es: " + Id);
        System.out.println("Mi Autor: " + Autor);
        System.out.println("Mi Tipo es: "+Tipo);
        System.out.println("Mi cantidad de copias es: "+Copias);
        System.out.println("Mi Tipo estado es: "+Disponible);
        System.out.println("Mi Tipo estado es: "+Ocupado);
        System.out.println("---------------------------");
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
    public int getDisponible() {
        return Disponible;
    }
    public void setDisponible(int Disponible) {
        this.Disponible = Disponible;
    }
    public int getOcupado() {
        return Ocupado;
    }
    public void setOcupado(int Ocupado) {
        this.Ocupado = Ocupado;
    }
    
}
