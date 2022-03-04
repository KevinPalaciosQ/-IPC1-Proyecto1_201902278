package ParteGrafica;
//Bibliotecas importadas
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import javax.swing.*;
public class Libros extends JPanel implements ActionListener{
    JPanel Libross;
    JButton registrarlibro;
    JButton  cargamasiva;
    JTextField idLibro;
    JTextField Libro;  
    JTextField Autor;
    JTextField Copias;
    JTextField Tipo;
    static JTable tabla;
      //atributos 
    String contenido = "";
    File archivo;
    FileReader fr;
    BufferedReader br;
    static Object[][] data;
    private JComboBox<String> ComboBox;
    public Libros(){
        JLabel titulo;
        Color oscuro = new Color( 22, 28, 31  );//este es oscuro
        Color ColorJLabel = new Color ( 184, 224, 222 );//Este es el Color que va en el JLabel 
    //Espacio Para llenar id Libro 
        idLibro = new JTextField();
        idLibro.setBounds(105,40,100,25);//Posición x, Posición y, Ancho, Largo
        idLibro.setFont(new Font("Comic Sans MS", Font.ITALIC,14));//Tipo de Letra
        idLibro.setVisible(true);//mostrar espacio
        this.add(idLibro);//añadir a la ventana    
    //Etiqueta ID libro
        titulo = new JLabel("ID Libro ");
        titulo.setBounds(20,40,100,20);//Posición x, Posición y, Ancho, Largo
        titulo.setFont(new Font("Comic Sans MS", Font.ITALIC,18));//Tipo de Letra
        titulo.setForeground(oscuro);//color de texto
        titulo.setVisible(true);//mostrar etiqueta
        this.add(titulo);//añadir a la ventana     
    //Espacio Para llenar Libro 
        Libro = new JTextField();
        Libro.setBounds(105,70,100,25);//Posición x, Posición y, Ancho, Largo
        Libro.setFont(new Font("Comic Sans MS", Font.ITALIC,14));//Tipo de Letra
        Libro.setVisible(true);//mostrar espacio
        this.add(Libro);//añadir a la ventana         
         //Etiqueta Libro
        titulo = new JLabel("Libro ");
        titulo.setBounds(20,70,100,20);//Posición x, Posición y, Ancho, Largo
        titulo.setFont(new Font("Comic Sans MS", Font.ITALIC,18));//Tipo de Letra
        titulo.setForeground(oscuro);//color de texto
        titulo.setVisible(true);//mostrar etiqueta
        this.add(titulo);//añadir a la ventana    
        //Espacio para autor
        Autor = new JTextField();
        Autor.setBounds(105,100,100,25);//Posición x, Posición y, Ancho, Largo
        Autor.setFont(new Font("Comic Sans MS", Font.ITALIC,20));//Tipo de Letra
        Autor.setVisible(true);//mostrar espacio
        this.add(Autor);//añadir a la ventana      
        //Etiqueta Autor
        titulo = new JLabel("Autor");
        titulo.setBounds(20,100,100,20);//Posición x, Posición y, Ancho, Largo
        titulo.setFont(new Font("Comic Sans MS", Font.ITALIC,18));//Tipo de Letra
        titulo.setForeground(oscuro);//color de texto
        titulo.setVisible(true);//mostrar etiqueta
        this.add(titulo);//añadir a la ventana   
        //Espacio Para llenar Copias
        Copias = new JTextField();
        Copias.setBounds(105,130,100,25);//Posición x, Posición y, Ancho, Largo
        Copias.setFont(new Font("Comic Sans MS", Font.ITALIC,20));//Tipo de Letra
        Copias.setVisible(true);//mostrar espacio
        this.add(Copias);//añadir a la ventana       
        //Etiqueta Copias
        titulo = new JLabel("Copias");
        titulo.setBounds(20,130,100,20);//Posición x, Posición y, Ancho, Largo
        titulo.setFont(new Font("Comic Sans MS", Font.ITALIC,18));//Tipo de Letra
        titulo.setForeground(oscuro);//color de texto
        titulo.setVisible(true);//mostrar etiqueta
        this.add(titulo);//añadir a la ventana      
        //Etiqueta Tipo
        titulo = new JLabel("Tipo");
        titulo.setBounds(20,160,100,20);//Posición x, Posición y, Ancho, Largo
        titulo.setFont(new Font("Comic Sans MS", Font.ITALIC,18));//Tipo de Letra
        titulo.setForeground(oscuro);//color de texto
        titulo.setVisible(true);//mostrar etiqueta
        this.add(titulo);//añadir a la ventana       
        //Boton Registrar Libro
        registrarlibro = new JButton("Registrar Libro");
        registrarlibro.setFont(new Font("ARIAL BLACK", Font.BOLD,14));
        registrarlibro.setBounds(50,190,155,30);
        registrarlibro.setVisible(true);
        registrarlibro.addActionListener(this);
        this.add(registrarlibro);    
        //Boton Carga Masiva
        cargamasiva = new JButton("Carga Masiva");
        cargamasiva.setFont(new Font("ARIAL BLACK", Font.BOLD,14));
        cargamasiva.setBounds(1120,580,155,30);
        cargamasiva.setVisible(true);
        cargamasiva.addActionListener(this);
        this.add(cargamasiva);    
        setLayout(null);
        //Comienzo combobox
        ComboBox=new JComboBox<String>();
        ComboBox.setBounds(105,160,100,25);
        ComboBox.setFont(new Font("Comic Sans MS", Font.ITALIC,13));
        add(ComboBox);
        ComboBox.addItem("Libros");
        ComboBox.addItem("Revistas");
        ComboBox.addItem("Electronicos");
        ComboBox.addActionListener(this);   
        //Aquí empieza la tabla 
        String[] e = {"Id Libro","Nombre Libro","Autor","Tipo","Copias","Disponible","Ocupados"}; 
        Object[][]datos ={{"0","Nombre Libro ","Julio Cortazar","Novela","100","10","20"}};
        tabla =new JTable(datos,e);
        JScrollPane diseño = new  JScrollPane(tabla);
        diseño.setBounds(250,10,600,600);
        this.add(diseño);
        //diseño de ventana 
        this.setBackground(ColorJLabel);//Relleno 
        this.setLayout(null);   
         }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource()==cargamasiva) {
            System.out.println("Accediste a carga masiva"); 
            leerArchivos();
            System.out.println(contenido);
            // A partir de acá da error 
           // JsonParser parser = new JsonParser();
            //JsonArray arreglo = parser.parse(contenido).getAsJsonArray();//arreglo json
           // System.out.println("Cantidad de Objetos: " + arreglo.size());//arreglo almacenado
        }
       // throw new UnsupportedOperationException("Not supported yet."); //
    }

    public void leerArchivos(){
        try{
            JFileChooser fc = new JFileChooser();
            int op = fc.showOpenDialog(this);
            if (op == JFileChooser.APPROVE_OPTION) {
                archivo = fc.getSelectedFile();
            }
            // Se hace la lectura
            fr = new FileReader(archivo);//obtener el texto
            br = new BufferedReader(fr);//lee el texto
            String linea;//lee de línea en línea
            while ((linea = br.readLine()) != null) {
                
                contenido += linea;//se agrega texto
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
}
