
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
        
    

        
}
}