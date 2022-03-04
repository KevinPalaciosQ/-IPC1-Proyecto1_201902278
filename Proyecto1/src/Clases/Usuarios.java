package Clases;
public class Usuarios {
    private String nombre;
    private int contrasena;
    public Usuarios(String nombre, int contrasena) {
        this.nombre = nombre;
        this.contrasena = contrasena;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
     public int getContrasena() {
        return contrasena;
    }
    public void setContrasena(int contrasena) {
        this.contrasena = contrasena;
    }
}
