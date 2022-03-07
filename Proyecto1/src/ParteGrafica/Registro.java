package ParteGrafica;
//Librerias

import Clases.Usuarios;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.awt.Image;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import proyecto1.*;
//Paquetes 

public class Registro extends JFrame implements ActionListener {

    static JLabel titulo, labuser, labcontra, img, imagen;
    JButton carga;
    JButton boton2;
    JTextField usuarios;
    JPasswordField contraseñas;
    JButton inicio;
    static String usuarioss;
    static String contraseñass;
// ATRIBUTOS
    String contenido = "";
    File archivo;
    FileReader fr;
    BufferedReader br;
    static String usu, contra;

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
        //contraseñas.addActionListener(this);
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
        carga = new JButton("Carga Masiva");
        carga.setBounds(475, 530, 120, 25);
        carga.setFont(new Font("ARIAL BLACK", Font.BOLD, 10));
        carga.setVisible(true);
        carga.addActionListener(this);
        this.add(carga);

        ////Boton Acceder tabla usuarios
        boton2 = new JButton("Acceder Usuarios");
        boton2.setBounds(465, 490, 138, 25);
        boton2.setFont(new Font("ARIAL BLACK", Font.BOLD, 10));
        boton2.setVisible(true);
        boton2.addActionListener(this);
        this.add(boton2);

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

    private Icon setIcono(String path, JLabel boton) {
        ImageIcon icon = new ImageIcon(path);
        int ancho = boton.getWidth();
        int alto = boton.getHeight();
        ImageIcon icono = new ImageIcon(icon.getImage().getScaledInstance(ancho, alto, Image.SCALE_DEFAULT));
        return icono;
    }

    public void iniciarsesion() {
        usuarioss = usuarios.getText();
        contraseñass = contraseñas.getText();
        if (usuarioss.equals("user") || contraseñass.equals("123456")) {
            if (usuarioss.equals("user")) {
                if (contraseñass.equals("123456")) {
                    JOptionPane.showMessageDialog(this, " Bienvenido Admin");
                    this.usuarios.setText("");
                    this.contraseñas.setText("");
                    this.setVisible(false);
                    Concatenar a = new Concatenar();
                }
                else{
                    JOptionPane.showMessageDialog(this,"Contraseña incorrecta");
                }
                
                
            }
            else{
                JOptionPane.showMessageDialog(this,"Usuario incorrecto");
                
            }
            
        }else{
            JOptionPane.showMessageDialog(this,"Usuario y contraseña incorrectos");
        }
    }


    public void leerArchivos() {

        try {

            JFileChooser fc = new JFileChooser();
            int op = fc.showOpenDialog(this);
            if (op == JFileChooser.APPROVE_OPTION) {
                //System.out.println(fc.getSelectedFile());
                archivo = fc.getSelectedFile();
            }

            // HACEMOS LA LECTURA DEL ARCHIVO COMO TAL
            fr = new FileReader(archivo);
            br = new BufferedReader(fr);
            String linea;
            // LEER LINEA POR LINEA
            while ((linea = br.readLine()) != null) {
                // Solo agregamos el contenido a un String
                contenido += linea;
            }
            System.out.println(contenido);
            // JsonParser parser -> Todos los metodos necesarios para interpretar un JSON.
            JsonParser parser = new JsonParser();
            // JsonArray arreglo de objetos JSON.
            Object usuarios = parser.parse(contenido);
            JsonObject objetoo = (JsonObject) usuarios;
            Object objeto1 = objetoo.get("Usuarios");

            JsonArray arreglo = (JsonArray) objeto1;
            //JsonArray arreglo = parser.parse(contenido).getAsJsonArray();
            System.out.println("Cantidad de Objetos: " + arreglo.size());

            // RECORRER MI ARREGLO
            for (int i = 0; i < arreglo.size(); i++) {
                // JsonObject -> Tomar el Objeto del Arreglo
                JsonObject objeto = arreglo.get(i).getAsJsonObject();
                // GUARDAMOS LOS DATOS EN VARIABLEs

                int Id = objeto.get("ID").getAsInt();
                String nombre = objeto.get("Usuario").getAsString();

                String contrasena = objeto.get("Password").getAsString();
                String facultad = objeto.get("Facultad").getAsString();
                String carrera = objeto.get("Carrera").getAsString();
                int Tipo = objeto.get("Tipo").getAsInt();
                // CREAMOS NUESTRO OBJETO PERSONA

                Usuarios nuevo = new Usuarios(Id, nombre, contrasena, facultad, carrera, Tipo);

                // MANDAMOS A LLAMAR NUESTRO METODO QUE AGREGA PERSONAS EN EL ARREGLO
                Proyecto1.AgregarUsuario(nuevo);
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (null != fr) {
                    fr.close();
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == inicio) {
            iniciarsesion();
        }
       
        if (ae.getSource() == carga) {
            // TODO LO QUE ESTE AQUI, HARA EL BOTON1
            System.out.println("Presionaste al Boton 1.");
            leerArchivos();

            Proyecto1.LeerUsuarios();
        } else if (ae.getSource() == boton2) {

            Tabla nueva = new Tabla();

            this.dispose();
        }

       
    }

}

