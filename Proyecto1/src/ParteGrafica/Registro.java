package ParteGrafica;
//Librerias

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import Clases.Usuarios;
import java.awt.Image;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

//Paquetes 
public class Registro extends JFrame implements ActionListener {

    static JLabel titulo, labuser, labcontra, img, imagen;
    JButton boton;
    JTextField usuarios;
    JTextField contraseñas;
    JButton inicio;

    static String usu, contra;
    //atributos 
    static File documento;
    static FileReader lector;
    static BufferedReader Blector;

    //COLOR
    Color turquesa = new Color(24, 108, 105);
    Color ColorJLabel = new Color(184, 224, 222);//Este es el Color que va en el JLabel

    public Registro() {
        //ICONO DE LA APLICACION
        setIconImage(new ImageIcon(getClass().getResource("logotipo.png")).getImage());
        //Etiqueta de boton
        imagen = new JLabel();
        //POSICION X, POSICION Y, TAMAÑO X, TAMAÑO Y
        imagen.setBounds(0, 10, 409, 640);
        imagen.setIcon(setIcono("src\\ParteGrafica\\digital.png", imagen));
        imagen.setVisible(true);//mostrar
        this.add(imagen);//agregar

        //Espacio Usuario
        usuarios = new JTextField();
        usuarios.setBounds(295, 100, 300, 30);
        usuarios.setFont(new Font("Comic Sans MS", Font.ITALIC, 20));
        usuarios.setVisible(true);
        this.add(usuarios);

        //Espacio Contraseña
        contraseñas = new JPasswordField();//Para que aparezca como *** la contraseña
        contraseñas.setBounds(295, 160, 300, 30);//coordenadas
        contraseñas.setVisible(true);
        contraseñas.addActionListener(this);
        this.add(contraseñas);

        //Etiqueta de Usuario
        titulo = new JLabel("Usuario");
        titulo.setBounds(395, 75, 100, 20);
        titulo.setFont(new Font("Comic Sans MS", Font.ITALIC, 18));//tipo de letra
        titulo.setForeground(turquesa);//color
        titulo.setVisible(true);//mostrar
        this.add(titulo);//agregar

        //Etiqueta Prestar Libro
        titulo = new JLabel("Contraseña");
        titulo.setBounds(380, 135, 100, 20);
        titulo.setFont(new Font("Comic Sans MS", Font.ITALIC, 18));//tipo de letra
        titulo.setForeground(turquesa);//color
        titulo.setVisible(true);//mostrar
        this.add(titulo);//agregar

        

        //Boton Iniciar Sesión
        inicio = new JButton("Iniciar Sesión");
        inicio.setFont(new Font("ARIAL BLACK", Font.BOLD, 14));
        inicio.setBounds(443, 200, 150, 30);
        inicio.setVisible(true);
        inicio.addActionListener(this);
        this.add(inicio);

        ////Boton Carga Masiva
        JButton carga = new JButton("Carga Masiva");
        carga.setBounds(475, 530, 120, 25);
        carga.setFont(new Font("ARIAL BLACK", Font.BOLD, 10));
        carga.setVisible(true);
        carga.addActionListener(this);
        this.add(carga);
        //Diseño de la ventana
        this.setTitle("Registro");//Titulo
        this.setLayout(null);//Sin margenes
        this.setBounds(500, 150, 625, 600);
        this.setResizable(false);//quita cambio tamaño 
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//cerrar
        this.setVisible(true);//visibilidad
        this.setBackground(ColorJLabel);
        this.getContentPane().setBackground(ColorJLabel);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String Name = usuarios.getText();
        if (e.getSource() == inicio) {
            Concatenar a = new Concatenar();
            JOptionPane.showMessageDialog(this, "Bienvenido");
            System.out.println("Bienvenido");
            logeo();
            this.dispose();//
        }
    }

    private Icon setIcono(String path, JLabel boton) {
        ImageIcon icon = new ImageIcon(path);
        int ancho = boton.getWidth();
        int alto = boton.getHeight();
        ImageIcon icono = new ImageIcon(icon.getImage().getScaledInstance(ancho, alto, Image.SCALE_DEFAULT));
        return icono;
    }

    public void logeo() {
        String usuarioss = usuarios.getText();
        String contraseñass = contraseñas.getText();
        if (usuarios.equals("Admin")) {
            if (contraseñas.equals("admin")) {
                JOptionPane.showMessageDialog(this, "Bienvenido Admin");
                this.usuarios.setText("");
                this.contraseñas.setText("");
                this.dispose();
                Concatenar A = new Concatenar();
            } else {
                JOptionPane.showMessageDialog(this, "contraseña incorrecta :c ");
            }
        } else {
            JOptionPane.showMessageDialog(this, "código incorrecto :c ");
        }

        //JOptionPane.showMessageDialog(this, "código y contraseña incorrectos :c ");
    }
}
