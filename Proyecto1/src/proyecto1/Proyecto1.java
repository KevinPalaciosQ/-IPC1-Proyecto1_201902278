package proyecto1;
//import ParteGrafica.Libros;
import ParteGrafica.Registro;
import Clases.*;

public class Proyecto1 {
    //Arreglos de la matriz 
    public static ObjetoLibros[] libro  = new ObjetoLibros[100];
    public static ObjetoPrestamos[]  presta = new ObjetoPrestamos[200];
    public static Usuarios [] usuarios = new Usuarios[50];
    public static ObjetoRegistros [] registros = new ObjetoRegistros[100];
    //contador carga masiva
    public static int contadorlibros=0, contadorprestamo=0,cUsuarios=0,cRegistros=0;

    public static void main(String[] args) {
        // TODO code application logic here
       Registro r = new Registro();            
    }
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
    //Retorno nombre de usuario
    public static String retorno(int Id){
        for (int i = 0; i < cUsuarios; i++) {
            if (usuarios[i].getId()==Id) {
                return usuarios[i].getNombre();
            }
            
        }
    return null;
}
    
   //Retornear booleano
    public static boolean verificarusuario(String arreglousuario){
        for (int i = 0; i < cUsuarios; i++) {
            if (usuarios[i].getNombre().equals(arreglousuario)) {
                return true;
            }
            
        }return false;
}
    //Retornar verificar contraseña
    public static boolean verificarcontraseña(String arreglousuario,String contraseña){
        for (int i = 0; i < cUsuarios; i++) {
            if (usuarios[i].getNombre().equals(arreglousuario)) {
                if (usuarios[i].getContrasena().equals(contraseña)) {
                    return true;
                }
            }
        }return false;
    }
    
    //Retornarusuario puede tronar xd
    public static Usuarios retornarusuarios(String usuario){
        for (int i = 0; i < cUsuarios; i++) {
            if (usuarios[i].getNombre().equals(usuario) ) {
                return usuarios[i];
            }
            
        }return null;
    }
    // METODO PARA CONVERTIR MI ARREGLO DE OBJETOS A UN OBJECT[][]
    public static Object[][] convertirDatos(){
        int filas = cUsuarios;
        Object[][] arreglo = new Object[filas][6];
        for (int i = 0; i < filas; i++) {
            arreglo[i][0] = usuarios[i].getId();
            arreglo[i][1] = usuarios[i].getNombre();
            arreglo[i][2] = usuarios[i].getContrasena();
            arreglo[i][3] = usuarios[i].getTipo();
            arreglo[i][4] = usuarios[i].getFacultad();
            arreglo[i][5] = usuarios[i].getCarrera();
        }
        return arreglo;
    }

    public static void crear1(ObjetoLibros nuevolibro){
        if (contadorlibros < libro.length) {
            libro[contadorlibros]=nuevolibro;
            contadorlibros++;
        }
    }
    public static String Retornaribros(int ide){
        for (int i = 0; i < contadorlibros; i++) {
            if (libro[i].getId()==ide) {
                return  libro[i].getTítulo();
                
            }
 
        }return null;
    }
    //aca comienza la tabla 
    public static Object [][]mi(){
        Object[][] Libros = new Object[contadorlibros][7];
        for (int i = 0; i < contadorlibros; i++) {
            if (libro[i]!=null) {
                Libros[i][0] = libro[i].getTítulo();
                Libros[i][1] = libro[i].getId();
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
    //aca comienza la tabla 
    public static Object [][]TablaReportes(){
        Object[][] Reportar = new Object[cRegistros][3];
        for (int i = 0; i < cRegistros; i++) {
            if (registros[i]!=null) {
                Reportar[i][0] = registros[i].getReporteusuario();
                Reportar[i][1] = registros[i].getReportelibro();
                Reportar[i][2] = registros[i].getReporteprestamos();
                
                //fin arreglo
            }
        }
        return Reportar ;
}
   public static void crear3(ObjetoRegistros registro){
        if (cRegistros<registros.length) {
            registros[cRegistros]=registro;
            cRegistros++;
        }
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
            if (presta[i]!=null) {
                Prestamos[i][0]= retorno(presta[i].getIdLibros());
                Prestamos[i][1]= Retornaribros(presta[i].getIdEstudiante());
                Prestamos[i][2]=presta[i].getFechaEntrega();
                Prestamos[i][3]=presta[i].getEstatus();
            }
        }
        return Prestamos;
    }
}
