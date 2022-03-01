
package ParteGrafica;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.table.DefaultTableCellRenderer;
//import Proyecto1.proyecto1;
/**
 *
 * @author kevin
 */
public class Libros extends JPanel implements ActionListener{
    JPanel Libross;
    JButton registrarlibro;
    JButton  cargamasiva;
    JTextField idLibro;
    JTextField Libro;  
    JTextField Autor;
    JTextField Copias;
    JTextField Tipo;
    static JTable tablac;
    static Object[][] datos;
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
        ComboBox=new JComboBox<String>();
        ComboBox.setBounds(105,160,100,25);
        ComboBox.setFont(new Font("Comic Sans MS", Font.ITALIC,13));
        add(ComboBox);
        ComboBox.addItem("Libros");
        ComboBox.addItem("Revistas");
        ComboBox.addItem("Electronicos");
        ComboBox.addActionListener(this);   
        
        Libross = new JPanel();
        Libross.setBounds(400,220,350,300);
        Libross.setBackground(null);
        this.add(Libross);
        
        this.setBackground(ColorJLabel);//Relleno 
        this.setLayout(null);   
        /*
     //TABLA
        String [] encabezado = {"Código","Nombre","NIT","Correo","Género"};
        datos = proyecto1.convertirDClientes();
        tablac = new JTable(datos,encabezado);
        JScrollPane sp= new JScrollPane(tablac);
        sp.setBounds(20, 10, 800, 600);
        //CENTRAR LOS DATOS DE LA TABLA
        DefaultTableCellRenderer renderc = new DefaultTableCellRenderer();
        renderc.setHorizontalAlignment(SwingConstants.CENTER);
        tablac.getColumnModel().getColumn(0).setCellRenderer(renderc);
        tablac.getColumnModel().getColumn(1).setCellRenderer(renderc);
        tablac.getColumnModel().getColumn(2).setCellRenderer(renderc);
        tablac.getColumnModel().getColumn(3).setCellRenderer(renderc);
        tablac.getColumnModel().getColumn(4).setCellRenderer(renderc);
        tablac.getTableHeader().setFont(new Font("Century Gothic", Font.PLAIN,15));
        tablac.getTableHeader().setBackground(azul);
        tablac.getTableHeader().setForeground(Color.WHITE);
        tablac.setEnabled(false);
        tablac.setFont(new Font("Century Gothic", Font.PLAIN,12));
        this.add(sp);    
        */
    }

    @Override
    public void actionPerformed(ActionEvent e) {
       // throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

  

}
