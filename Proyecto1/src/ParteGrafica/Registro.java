
package ParteGrafica;
//JAVA SWING
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import Clases.Usuarios;

public class Registro extends JFrame implements ActionListener{
 JLabel titulo, labuser, labcontra;
    JButton boton;
    JTextField nombre;
    JTextField Contraseña;
    JButton inicio;
    //COLOR
    Color turquesa = new Color( 24, 108, 105);
    public Registro(){
    //Espacio Usuario
        nombre = new JTextField();
        nombre.setBounds(130,100,300,30);
        nombre.setFont(new Font("Comic Sans MS", Font.ITALIC,20));
        nombre.setVisible(true);
        this.add(nombre);
    
    //Espacio Contraseña
        Contraseña = new JTextField();
        Contraseña.setBounds(130,150,300,30);
        Contraseña.setFont(new Font("Comic Sans MS", Font.ITALIC,20));
        Contraseña.setVisible(true);
        this.add(Contraseña);    
       
        //ETIQUETA DE Usuario
        titulo = new JLabel("Usuario");
        //POSICION X, POSICION Y, TAMAÑO X, TAMAÑO Y
        titulo.setBounds(30,100,100,20);
        //TIPOGRAFIA
        titulo.setFont(new Font("Comic Sans MS", Font.ITALIC,18));
        //COLOR A LA LETRA
        titulo.setForeground(turquesa);
        //VISIBILIDAD
        titulo.setVisible(true);
        //AGREGARLO A LA VENTANA
        this.add(titulo);
    
        //ETIQUETA DE CONTRASEÑA
        titulo = new JLabel("Contraseña");
        //POSICION X, POSICION Y, TAMAÑO X, TAMAÑO Y
        titulo.setBounds(30,150,100,20);
        //TIPOGRAFIA
        titulo.setFont(new Font("Comic Sans MS", Font.ITALIC,18));
        //COLOR A LA LETRA
        titulo.setForeground(turquesa);
        //VISIBILIDAD
        titulo.setVisible(true);
        //AGREGARLO A LA VENTANA
        this.add(titulo);    
        
        //DISEÑO DE LA VENTANA
        //TITULO DE LA VENTANA
        this.setTitle("Registro");
        //QUITAR MARGENES
        this.setLayout(null);
        //TAMAÑO DE MI VENTANA
        //POSICION X, POSICION Y, TAMAÑO X, TAMAÑO Y
        this.setBounds(500, 150, 480, 375);
        //QUITAR EL CAMBIO DE TAMAÑO
        this.setResizable(false);
        //CERRAR Y TERMINAR EL PROCESO
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //HACER VISIBLE LA VENTANA
        this.setVisible(true);
        
        
    //BOTON DE INICIO DE SESIÓN
        inicio = new JButton("Iniciar Sesión");
        inicio.setFont(new Font("ARIAL BLACK", Font.BOLD,14));
        inicio.setBounds(280,190,150,30);
        inicio.setVisible(true);
        inicio.addActionListener(this);
        this.add(inicio);  
        
       
     //BOTON Iniciar  CARGA MASIVA
     JButton carga= new JButton("Carga Masiva");
        carga.setBounds(330, 300, 120, 25);
        carga .setFont(new Font("ARIAL BLACK", Font.BOLD,10));
        //carga.setBackground(turquesa);
        carga .setVisible(true);
        carga .addActionListener(this);
        this.add(carga);    
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String Name = nombre.getText();
        if (e.getSource()==boton) {
            Usuarios nuevo = new Usuarios(Name);
            titulo.setText(nuevo.getNombre());
        }
    }
}    

