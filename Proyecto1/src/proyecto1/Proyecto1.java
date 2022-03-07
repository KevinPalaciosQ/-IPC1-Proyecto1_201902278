package proyecto1;
//import ParteGrafica.Libros;
import ParteGrafica.Registro;
import Clases.*;

public class Proyecto1 {
    //Arreglos de la matriz 
    public static ObjetoLibros[] libro  = new ObjetoLibros[100];
    public static ObjetoPrestamos[]  presta = new ObjetoPrestamos[200];
    public static Usuarios [] usuarios = new Usuarios[50];
    //100 prestamos
    //contador carga masiva
    public static int contadorlibros=0, contadorprestamo=0,cUsuarios=0;

    public static void main(String[] args) {
        // TODO code application logic here
       Registro r = new Registro();            
    }
    
    //acá se manipulan datos
    
    
        public static void AgregarUsuario(Usuarios usuario){
        if(cUsuarios < usuarios.length){
            usuarios[cUsuarios] = usuario;
            cUsuarios++;
        }else{
            System.out.println("Ya llegaste al limite de Usuarios");
        }
    }
    
    public static void LeerUsuarios(){
        for (int i = 0; i < cUsuarios; i++) {
            usuarios[i].Presentarme();
        }
    }
    
    // METODO PARA CONVERTIR MI ARREGLO DE OBJETOS A UN OBJECT[][]
    public static Object[][] convertirDatos(){
        // Lo mas importante es identificar cuantos datos tengo, para eso usamos el contador
        // Y cuantas columnas vamos a almacenar, en este caso seran las columnas que queremos visualizar en la tabla
        int filas = cUsuarios;
        Object[][] arreglo = new Object[filas][6];//2-3
        // Con un simple for, podemos crear el objeto y declararle los valores que necesitamos
        for (int i = 0; i < filas; i++) {
            arreglo[i][0] = usuarios[i].getId();//
            arreglo[i][1] = usuarios[i].getNombre();
            arreglo[i][2] = usuarios[i].getContrasena();
            arreglo[i][3] = usuarios[i].getTipo();
            arreglo[i][4] = usuarios[i].getFacultad();
            arreglo[i][5] = usuarios[i].getCarrera();
        }
        return arreglo;
    }
    //si da error detener proceso acá
    public static void crear1(ObjetoLibros nuevolibro){
        if (contadorlibros < libro.length) {
            libro[contadorlibros]=nuevolibro;
            contadorlibros++;
        }
    }
    //aca comienza la tabla 
    public static Object [][]mi(){
        Object[][] Libros = new Object[contadorlibros][7];
        for (int i = 0; i < contadorlibros; i++) {
            if (libro[i]!=null) {
                Libros[i][0] = libro[i].getId();
                Libros[i][1] = libro[i].getTítulo();
                Libros[i][2] = libro[i].getAutor();
                Libros[i][3] = libro[i].getTipo();
                Libros[i][4] = libro[i].getCopias();
                Libros[i][5] = libro[i].getDisponible();
                Libros[i][6] = libro[i].getOcupado();
                //fin arreglo
            }
        }
        return Libros ;
        
}
    //comienzo arreglo prestamos
    public static void crear2(ObjetoPrestamos nuevoprestamo){
        if (contadorprestamo<presta.length) {
            presta[contadorprestamo]=nuevoprestamo;
            contadorprestamo++;
        }
    }
    public static Object[][] Prestamista(){
        Object[][] Prestamos = new Object[contadorprestamo][4];
        for (int i = 0; i < contadorprestamo; i++) {
            
        }
        return Prestamos;
    }
}
