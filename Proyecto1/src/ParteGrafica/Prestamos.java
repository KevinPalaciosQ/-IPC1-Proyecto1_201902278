package ParteGrafica;

import static ParteGrafica.Libros.tabla;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
  
public class Prestamos extends JPanel implements ActionListener{
    
    JPanel Prestamo;
    JButton registrarlibro ;
    JButton  cargamasiva2;
    JTextField llenarusuario;
    JTextField Libro;  
    JTextField FechadeEntrega;
    JLabel img;
  //atributos 
    String contenido = "";
    File archivo;
    FileReader fr;
    BufferedReader br;
    static Object[][] data;
 //   private JComboBox<String> combo1;
    public Prestamos(){
        JLabel titulo; 
        Color ColorJLabel = new Color ( 184, 224, 222 );//Este es el Color que va en el JLabel
        Color oscuro = new Color( 22, 28, 31  );
      
    
    //Espacio Para llenar usuario 
        llenarusuario = new JTextField();
        llenarusuario.setBounds(150,40,100,25);//Posición x, Posición y, Ancho, Largo
        llenarusuario.setFont(new Font("Comic Sans MS", Font.ITALIC,14));//Tipo de Letra
        llenarusuario.setVisible(true);//mostrar espacio
        this.add(llenarusuario);   
        
        //Etiqueta de usuario
        titulo = new JLabel("Usuario ");
        titulo.setBounds(20,40,100,20);//Posición x, Posición y, Ancho, Largo
        titulo.setFont(new Font("Comic Sans MS", Font.ITALIC,18));//Tipo de Letra
        titulo.setForeground(oscuro);//color de texto
        titulo.setVisible(true);//mostrar etiqueta
        this.add(titulo);//añadir la etiqueta
                
    //Espacio Para llenar Libro 
        Libro = new JTextField();
        Libro.setBounds(150,70,100,25);//Posición x, Posición y, Ancho, Largo
        Libro.setFont(new Font("Comic Sans MS", Font.ITALIC,14));//Tipo de Letra
        Libro.setVisible(true);//mostrar espacio
        this.add(Libro);   
        
        //Etiqueta Libro
        titulo = new JLabel("Libro");
        titulo.setBounds(20,70,100,20);//Posición x, Posición y, Ancho, Largo
        titulo.setFont(new Font("Comic Sans MS", Font.ITALIC,18));//Tipo de Letra
        titulo.setForeground(oscuro);//color de texto
        titulo.setVisible(true);//mostrar etiqueta
        this.add(titulo);//añadir la etiqueta
            
        //Espacio para llenar Fecha de Entrega
        FechadeEntrega = new JTextField();
        FechadeEntrega.setBounds(150,100,100,25);//Posición x, Posición y, Ancho, Largo
        FechadeEntrega.setFont(new Font("Comic Sans MS", Font.ITALIC,20));//Tipo de Letra
        FechadeEntrega.setVisible(true);//mostrar espacio
        this.add(FechadeEntrega);   
        
        //Etiqueta Fecha Entrega
        titulo = new JLabel("Fecha Entrega");
        titulo.setBounds(20,100,130,26);//Posición x, Posición y, Ancho, Largo
        titulo.setFont(new Font("Comic Sans MS", Font.ITALIC,18));//Tipo de Letra
        titulo.setForeground(oscuro);//color de texto
        titulo.setVisible(true);//mostrar etiqueta
        this.add(titulo); //añadir la etiqueta
    
  
        //Boton Prestar Libro
        registrarlibro = new JButton("Prestar Libro");
        registrarlibro.setFont(new Font("ARIAL BLACK", Font.BOLD,12));
        registrarlibro.setBounds(129,135,120,30);
        registrarlibro.setVisible(true);
        registrarlibro.addActionListener(this);
        this.add(registrarlibro);      
    
        //Boton Para segunda carga masiva 
        cargamasiva2 = new JButton("Carga Masiva");
        cargamasiva2.setFont(new Font("ARIAL BLACK", Font.BOLD,14));
        cargamasiva2.setBounds(1120,580,155,30);
        cargamasiva2.setVisible(true);
        cargamasiva2.addActionListener(this);
        this.add(cargamasiva2);  
        //diseño de la pestaña
        Prestamo = new JPanel();
        Prestamo.setBounds(400,220,350,300);
        this.add(Prestamo);
        this.setBackground(ColorJLabel);
        this.setLayout(null);         
         //AQUÍ EMPIEZA LA TABLA
         
        String[] e = {"Nombre Usuario","Libro","Fecha Entrega","Status"}; 
        Object[][]datos ={{"Kevin Palacios","El alquimista","20/01/21","Disponible"}};
        tabla =new JTable(datos,e);
        JScrollPane diseño = new  JScrollPane(tabla);
        diseño.setBounds(270,10,600,600);
        this.add(diseño);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
       // throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
        public void LecturaJson(){
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

