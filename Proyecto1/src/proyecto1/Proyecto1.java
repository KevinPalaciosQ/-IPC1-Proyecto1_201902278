package proyecto1;
//import ParteGrafica.Libros;
import ParteGrafica.Registro;
import Clases.*;

public class Proyecto1 {
    //Arreglos de la matriz 
    public static ObjetoLibros[] libro  = new ObjetoLibros[100]; 
    //contador carga masiva
    public static int contadorlibros=0;

    public static void main(String[] args) {
        // TODO code application logic here
       Registro r = new Registro();

      
      
    }
    //acá se manipulan datos
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
                Libros[i][4] = libro[i].getDisponible();
                Libros[i][5] = libro[i].getOcupado();
            }
        }
        return Libros ;
        
}
}
