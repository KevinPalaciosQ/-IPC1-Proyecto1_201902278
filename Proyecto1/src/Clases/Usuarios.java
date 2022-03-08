package Clases;
public class Usuarios {
    private String nombre;
    private String contrasena;
    private int Id;
    private int Tipo;
    private String carrera;
    private String facultad;
    public Usuarios( int Id,String nombre, String contrasena, String facultad, String carrera,int Tipo) {
        this.nombre = nombre;
        this.contrasena = contrasena;
        this.Id = Id;
        this.Tipo = Tipo;
        this.carrera = carrera;
        this.facultad = facultad;
    }
    public void Presentarme(){
        System.out.println("---------------------------");
        System.out.println("Hola, me llamo: " + Id);
        System.out.println("Hola, me llamo: " + nombre);
        System.out.println("Mi contraseña es: " + contrasena);
        System.out.println("Mi Facultad es: "+facultad);
        System.out.println("Mi Carrera es: "+carrera);
        System.out.println("Mi Tipo de usuario es: "+Tipo);
        System.out.println("---------------------------");
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getContrasena() {
        return contrasena;
    }
    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }
    public int getId() {
        return Id;
    }
    public void setId(int Id) {
        this.Id = Id;
    }
    public int getTipo() {
        return Tipo;
    }
    public void setTipo(int Tipo) {
        this.Tipo = Tipo;
    }
    public String getCarrera() {
        return carrera;
    }
    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }
    public String getFacultad() {
        return facultad;
    }
    public void setFacultad(String facultad) {
        this.facultad = facultad;
    }  
}
