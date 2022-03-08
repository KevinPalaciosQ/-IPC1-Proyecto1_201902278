
package ParteGrafica;

import javax.swing.*;
import proyecto1.Proyecto1;

// EN ESTE CASO, NO QUEREMOS ACCIONES SOLO MOSTRAR INFORMACION
public class Tabla extends JFrame {
    
    public Tabla(){        
        Object[][] datos = Proyecto1.convertirDatos();
        // Creamos un arreglo donde tenga los encabezados
        String[] columnas = {"Id","Usuario","Contraseña","Tipo","Facultad","Carrera     "};
        JTable t = new JTable(datos, columnas);
        
        JScrollPane sp = new JScrollPane(t);
        // Como usamos un Layout(null); debemos de agregarle el tamaño a cada componente que estemos utilizando
        sp.setBounds(10, 10, 550, 450);
        sp.setVisible(true);
        sp.setEnabled (false);
        t.getTableHeader().setReorderingAllowed(false);
        // Por ultimo agregamos el ScrollPane que tiene dentro la tabla.
        this.add(sp);
        
        // PROPIEDADES DE LA VENTANA
        this.setTitle("Tabla de Usuarios");
        this.setBounds(100,100,600,500);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setVisible(true);
    }
    

}
