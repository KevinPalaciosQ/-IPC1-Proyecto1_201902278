
package ParteGrafica;
//Librerias
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import Clases.Usuarios;
//Paquetes 

public class Registro extends JFrame implements ActionListener{
    JLabel titulo, labuser, labcontra;
    JButton boton;
    JTextField usuarios;
    JTextField contraseñas;
    JButton inicio;
    static String usu, contra;
    //COLOR
    Color turquesa = new Color( 24, 108, 105);
    Color ColorJLabel = new Color ( 184, 224, 222 );//Este es el Color que va en el JLabel
    public Registro(){
    //Espacio Usuario
        usuarios = new JTextField();
        usuarios.setBounds(130,100,300,30);
        usuarios.setFont(new Font("Comic Sans MS", Font.ITALIC,20));
        usuarios.setVisible(true);
        this.add(usuarios);
    
    //Espacio Contraseña
        contraseñas = new JPasswordField();//Para que aparezca como *** la contraseña
        contraseñas.setBounds(130,150,300,30);//coordenadas
        contraseñas.setVisible(true);
        contraseñas.addActionListener(this);
        this.add(contraseñas);
        
        
        //Etiqueta de Usuario
        titulo = new JLabel("Usuario");
        //POSICION X, POSICION Y, TAMAÑO X, TAMAÑO Y
        titulo.setBounds(30,100,100,20);
        //TIPOGRAFIA
        titulo.setFont(new Font("Comic Sans MS", Font.ITALIC,18));
        //COLOR A LA LETRA
        titulo.setForeground(turquesa);
        titulo.setVisible(true);//mostrar
        this.add(titulo);//agregar
    
        //Etiqueta Prestar Libro
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
        
        //Diseño de la ventana
        this.setTitle("Registro");//Titulo
        this.setLayout(null);//Sin margenes
        //POSICION X, POSICION Y, TAMAÑO X, TAMAÑO Y
        this.setBounds(500, 150, 480, 375);
        //QUITAR EL CAMBIO DE TAMAÑO
        this.setResizable(false);
        //CERRAR Y TERMINAR EL PROCESO
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //HACER VISIBLE LA VENTANA
        this.setVisible(true);
        this.setBackground(ColorJLabel);
        this.getContentPane().setBackground(ColorJLabel);
        
    //Boton Iniciar Sesión
        inicio = new JButton("Iniciar Sesión");
        inicio.setFont(new Font("ARIAL BLACK", Font.BOLD,14));
        inicio.setBounds(280,190,150,30);
        inicio.setVisible(true);
        inicio.addActionListener(this);
        this.add(inicio);  
        
       
     ////Boton Carga Masiva
     JButton carga= new JButton("Carga Masiva");
        carga.setBounds(330, 300, 120, 25);
        carga .setFont(new Font("ARIAL BLACK", Font.BOLD,10));
        carga .setVisible(true);
        carga .addActionListener(this);
        this.add(carga);    
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String Name = usuarios.getText();
        if (e.getSource()==boton) {
            Usuarios nuevo = new Usuarios(Name);
            titulo.setText(nuevo.getNombre());
            
        }
    }


    }
    
   

