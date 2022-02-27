
package ParteGrafica;

import javax.swing.JFrame;
import java.awt.*;
import javax.swing.*;
import javax.swing.border.EmptyBorder;


public class Concatenar extends JFrame {
private JPanel Panel;    
 public Concatenar(){
    Color fondo = new Color ( 167, 209, 207 );// este es oscuro
        //Parte del Borde
        
        Panel = new JPanel();
        Panel.setBorder(new EmptyBorder(10,10,10,800));
        setContentPane(Panel);
        Panel.setLayout(null);
        
        JLabel etiqueta = new JLabel (new ImageIcon ("Imagen/LogoIngUsac.png"));
        etiqueta.setBounds(1939,400,1,0);
        Panel.add(etiqueta);
                /*
         //IMAGEN IMPLEMENTADA EN EL PROGRAMA
        Image imag = new ImageIcon("Imagenes/LogoIngUsac.png").getImage();
        ImageIcon imge = new ImageIcon(imag.getScaledInstance(65, 65, Image.SCALE_SMOOTH));
        img = new JLabel(imge);
        img.setLayout(null);
        img.setBounds(3940,400, 200, 90);
        img.setVisible(true);
        this.add(img);
        */
        //Pestañas
        JTabbedPane pp = new JTabbedPane(JTabbedPane.TOP);
        pp.setBounds(10,11,1290,650);
        pp.setBackground(Color.BLACK);
        pp.setForeground(Color.WHITE);
        pp.setFont(new Font("Arial", Font.PLAIN,15));
        Panel.add(pp);
        
        //Panel de Libros
        Libros lb = new Libros();
        pp.addTab("Libros", null, lb,null);   

        //Panel de Prestamos
        Prestamos ab = new Prestamos();
        pp.addTab("Prestamos", null, ab,null);
        
        //Panel de Reportes
        Reportes report = new Reportes();
        pp.addTab("Reportes", null, report ,null);
        
        //Panel de Gráficas
        Graficas graf = new Graficas();
        pp.addTab("Gráficas", null, graf,null);
        
        this.setTitle("Administrador | Biblioteca Usac");
        this.setBounds(20,20,1320,700);
        this.getContentPane().setBackground(fondo);
        this.setLayout(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setVisible(true);
        
        
        //Ventana Proyecto1
       /*
        //Poner Título a la ventana
        this.setTitle("Proyecto1");
        //this.setTitle(null);
        //Para Quitar Margenes
        this.setLayout(null);
        //Tamaño de Ventana
        this.setBounds(100, 100, 1330, 710);//Posición x, Posición y, Ancho, Largo
        //Quita el cambio de tamaño
        this.setResizable(false);
       //Al cerrar se detiene el proceso
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //Mostrar la ventana
        this.setVisible(true);    
*/
        
}
}