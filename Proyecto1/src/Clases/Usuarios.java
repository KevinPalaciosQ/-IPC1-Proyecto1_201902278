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

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the contrasena
     */
    public String getContrasena() {
        return contrasena;
    }

    /**
     * @param contrasena the contrasena to set
     */
    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    /**
     * @return the Id
     */
    public int getId() {
        return Id;
    }

    /**
     * @param Id the Id to set
     */
    public void setId(int Id) {
        this.Id = Id;
    }

    /**
     * @return the Tipo
     */
    public int getTipo() {
        return Tipo;
    }

    /**
     * @param Tipo the Tipo to set
     */
    public void setTipo(int Tipo) {
        this.Tipo = Tipo;
    }

    /**
     * @return the carrera
     */
    public String getCarrera() {
        return carrera;
    }

    /**
     * @param carrera the carrera to set
     */
    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    /**
     * @return the facultad
     */
    public String getFacultad() {
        return facultad;
    }

    /**
     * @param facultad the facultad to set
     */
    public void setFacultad(String facultad) {
        this.facultad = facultad;
    }
   
}
